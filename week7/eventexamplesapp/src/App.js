import React, { useState } from 'react';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor'; 

function App() {
  const [count, setCount] = useState(0);

  const handleDecrement = () => {
    setCount(prevCount => prevCount - 1);
  };

  const handleIncrement = () => {
    setCount(prevCount => prevCount + 1); 
  };

  const sayHello = () => {
    alert("Hello! You increased the counter."); 
  };

  const combinedIncrementHandler = () => {
    handleIncrement();
    sayHello();
  };

  const handleWelcome = (message) => {
    alert(message);
  };

  const handleSyntheticClick = (event) => {
    
    console.log(event); 
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h1>Event Handling Examples</h1>

      <h2>Counter: {count}</h2>
      <button onClick={combinedIncrementHandler}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>
      <hr />

      <button onClick={() => handleWelcome('Welcome')}>Say Welcome</button>
      <hr />

      <button onClick={handleSyntheticClick}>Click for Synthetic Event</button>
      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;