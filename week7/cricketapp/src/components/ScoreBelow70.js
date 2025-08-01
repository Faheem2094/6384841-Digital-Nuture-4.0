import React from 'react';

function ScoreBelow70({ players }) {
  const playersBelow70 = players.filter(player => player.score <= 70);

  return (
    <div>
      {playersBelow70.map((player) => (
         <li key={player.name}>Mr. {player.name}<span> {player.score}</span></li>
      ))}
    </div>
  );
}

export default ScoreBelow70;