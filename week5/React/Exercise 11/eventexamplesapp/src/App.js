import { useState } from "react";
import CurrencyConvertor from "./Components/CurrencyConvertor";

function App() {

    const [count, setCount] = useState(5);

    function incrementValue() {
        setCount(count + 1);
    }

    function sayHello() {
        alert("Hello! Member1");
    }

    function increment() {
        incrementValue();
        sayHello();
    }

    function decrement() {
        setCount(count - 1);
    }

    function sayWelcome(msg) {
        alert(msg);
    }

    function clickMe() {
        alert("I was clicked");
    }

    return (
        <div style={{ margin: "20px" }}>

            <h3>{count}</h3>

            <button onClick={increment}>Increment</button>
            <br />

            <button onClick={decrement}>Decrement</button>
            <br />

            <button onClick={() => sayWelcome("welcome")}>
                Say welcome
            </button>
            <br />

            <button onClick={clickMe}>
                Click on me
            </button>

            <CurrencyConvertor />

        </div>
    );
}

export default App;