import React, { useState } from 'react';
import './App.css';
import UserGreeting from './components/UserGreeting';
import GuestGreeting from './components/GuestGreeting';
import LoginButton from './components/LoginButton';
import LogoutButton from './components/LogoutButton';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  return (
    <div className="App">
     
      {isLoggedIn
        ? (
          <>
            <UserGreeting />
            <LogoutButton onClick={handleLogoutClick} />
          </>
        )
        : (
          <>
            <GuestGreeting />
            <LoginButton onClick={handleLoginClick} />
          </>
        )
      }
    </div>
  );
}

export default App;