import React, { useState } from 'react';

function CurrencyConvertor() {
  const [inr, setInr] = useState('');
  const [eur, setEur] = useState(0);

  const handleSubmit = () => {
    const conversionRate = 0.011; 
    const result = parseFloat(inr) * conversionRate;

    if (!isNaN(result)) {
        setEur(result.toFixed(2));
    } else {
        setEur(0);
    }
  };

  return (
    <div>
      <h2>Currency Converter</h2>
      <h4>Convert INR to EURO</h4>
      <input
        type="number"
        placeholder="Enter INR"
        value={inr}
        onChange={(e) => setInr(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      <h3>{eur} EUR</h3>
    </div>
  );
}

export default CurrencyConvertor;