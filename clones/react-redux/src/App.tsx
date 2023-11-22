import Counter from './components/Counter';


// Store
interface CounterState {
  value: number;
}

interface UserState {
  isSignedIn: boolean;
}

// Actions 
const increment = { type: "INCREMENT", payload: 1};
const decrement = { type: "DECREMENT", payload: 1};

const App = () => {
  return (
    <div>
      <h2>Redux Complete Tutorial</h2>
    </div>  
  );
};

export default App;