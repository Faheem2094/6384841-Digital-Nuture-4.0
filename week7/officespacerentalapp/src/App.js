import './App.css';
import officeImage from './office.jpg';

function App() {
  const heading = "Office Space";

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "WeWork", Rent: 75000, Address: "Bengaluru" },
    { Name: "Regus", Rent: 58000, Address: "Hyderabad" }
  ];

  return (
    <div className="App">
      <h1>{heading}, at Affordable Range</h1>

      {officeList.map((office) => (
        <div key={office.Name} style={{ marginBottom: '40px' }}>
          <img
            src={officeImage}
            alt="Office Space"
            width="25%"
            height="25%"
          />
          <h2>Name: {office.Name}</h2>
          <h3 style={{ color: office.Rent <= 60000 ? 'red' : 'green' }}>
            Rent: Rs. {office.Rent}
          </h3>
          <h3>Address: {office.Address}</h3>
        </div>
      ))}
    </div>
  );
}

export default App;