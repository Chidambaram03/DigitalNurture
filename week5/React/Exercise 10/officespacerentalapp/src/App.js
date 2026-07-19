import "./App.css";

function App() {

  const office = {
    name: "DBS",
    rent: 50000,
    address: "Chennai"
  };

  const officeList = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai"
    },
    {
      name: "Regus",
      rent: 75000,
      address: "Bangalore"
    },
    {
      name: "WeWork",
      rent: 65000,
      address: "Hyderabad"
    }
  ];

  return (
      <div className="App">

        <h1>Office Space Rental App</h1>

        <img
            src="/office.jpg"
            alt="Office Space"
            width="500"
        />

        <h2>Featured Office</h2>

        <p>
          <strong>Name:</strong> {office.name}
        </p>

        <p
            style={{
              color: office.rent < 60000 ? "red" : "green"
            }}
        >
          <strong>Rent:</strong> Rs. {office.rent}
        </p>

        <p>
          <strong>Address:</strong> {office.address}
        </p>

        <hr />

        <h2>Available Office Spaces</h2>

        {
          officeList.map((item, index) => (
              <div key={index} className="box">

                <h3>{item.name}</h3>

                <p
                    style={{
                      color: item.rent < 60000 ? "red" : "green"
                    }}
                >
                  Rent: Rs. {item.rent}
                </p>

                <p>
                  Address: {item.address}
                </p>

              </div>
          ))
        }

      </div>
  );
}

export default App;