import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore Name={"Skitor"}
        School={"Cognizant Academy"}
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
