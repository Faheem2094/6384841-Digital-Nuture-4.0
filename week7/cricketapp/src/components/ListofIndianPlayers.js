import React from 'react';

function ListofIndianPlayers({ players }) {
  return (
    <div>
      {players.map((player) => (
        <li key={player}>Mr. {player}</li>
      ))}
    </div>
  );
}

export default ListofIndianPlayers;