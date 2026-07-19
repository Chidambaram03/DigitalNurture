import { useState } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function App() {

  const [loggedIn, setLoggedIn] = useState(false);

  return (
      <div style={{ margin: "20px" }}>

        <h1>Ticket Booking App</h1>

        {
          loggedIn ?
              <button onClick={() => setLoggedIn(false)}>
                Logout
              </button>
              :
              <button onClick={() => setLoggedIn(true)}>
                Login
              </button>
        }

        <hr />

        {
          loggedIn ? <UserPage /> : <GuestPage />
        }

      </div>
  );
}

export default App;