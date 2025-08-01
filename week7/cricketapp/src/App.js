import './App.css';
import ListofPlayers from './components/ListofPlayers';
import ScoreBelow70 from './components/ScoreBelow70';
import OddPlayers from './components/OddPlayers';
import EvenPlayers from './components/EvenPlayers';
import ListofIndianPlayers from './components/ListofIndianPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = true; // Change this to false to see the other components

  const players = [
    { name: 'Jack', score: 50 }, { name: 'Michael', score: 70 },
    { name: 'John', score: 40 }, { name: 'Ann', score: 61 },
    { name: 'Elisabeth', score: 61 }, { name: 'Sachin', score: 95 },
    { name: 'Dhoni', score: 100 }, { name: 'Virat', score: 84 },
    { name: 'Jadeja', score: 64 }, { name: 'Raina', score: 75 },
    { name: 'Rohit', score: 80 }
  ];

  const indianTeamWithNames = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6'];


  if (flag) {
    return (
      <div className="App">
        <h1>List of Players</h1>
        <ListofPlayers />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div className="App">
        <h1>Odd Players</h1>
        <OddPlayers players={indianTeamWithNames} />
        <hr />
        <h1>Even Players</h1>
        <EvenPlayers players={indianTeamWithNames} />
        <hr />
        <h1>List of Indian Players Merged:</h1>
        <ListofIndianPlayers players={IndianPlayers} />
      </div>
    );
  }
}

export default App;