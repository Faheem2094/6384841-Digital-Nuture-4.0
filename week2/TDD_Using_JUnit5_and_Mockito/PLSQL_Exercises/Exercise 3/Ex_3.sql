BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Accounts CASCADE CONSTRAINTS';
  EXECUTE IMMEDIATE 'DROP TABLE Employees CASCADE CONSTRAINTS';
EXCEPTION
  WHEN OTHERS THEN
    NULL;
END;
/

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    LastModified DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER,
    Department VARCHAR2(50),
    HireDate DATE
);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (1, 1, 'Savings', 1000, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (2, 1, 'Checking', 3000, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (3, 2, 'Savings', 5000, SYSDATE);

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (1, 'Alice', 'Manager', 70000, 'HR', TO_DATE('2015-06-01','YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (2, 'Bob', 'Developer', 60000, 'IT', TO_DATE('2017-03-20','YYYY-MM-DD'));

COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR acc IN (
    SELECT AccountID, Balance 
    FROM Accounts 
    WHERE AccountType = 'Savings'
  ) LOOP
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
    WHERE AccountID = acc.AccountID;

    DBMS_OUTPUT.PUT_LINE('Interest added to Account ID: ' || acc.AccountID);
  END LOOP;
  COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  deptName IN VARCHAR2,
  bonusPercent IN NUMBER
) IS
BEGIN
  FOR emp IN (
    SELECT EmployeeID, Name FROM Employees WHERE Department = deptName
  ) LOOP
    UPDATE Employees
    SET Salary = Salary + (Salary * bonusPercent / 100)
    WHERE EmployeeID = emp.EmployeeID;

    DBMS_OUTPUT.PUT_LINE('Bonus added to Employee: ' || emp.Name);
  END LOOP;
  COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE TransferFunds (
  fromAccountID IN NUMBER,
  toAccountID IN NUMBER,
  amount IN NUMBER
) IS
  fromBalance NUMBER;
BEGIN
  SELECT Balance INTO fromBalance FROM Accounts WHERE AccountID = fromAccountID;

  IF fromBalance < amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  END IF;

  UPDATE Accounts
  SET Balance = Balance - amount,
      LastModified = SYSDATE
  WHERE AccountID = fromAccountID;

  UPDATE Accounts
  SET Balance = Balance + amount,
      LastModified = SYSDATE
  WHERE AccountID = toAccountID;

  DBMS_OUTPUT.PUT_LINE('Transferred ' || amount || ' from Account ' || fromAccountID || ' to Account ' || toAccountID);

  COMMIT;
END;
/

BEGIN
  ProcessMonthlyInterest;
  UpdateEmployeeBonus('IT', 10);
  TransferFunds(1, 2, 500);
END;
/
