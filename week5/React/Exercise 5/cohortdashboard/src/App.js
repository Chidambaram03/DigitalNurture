import CohortDetails from "./CohortDetails";

function App() {

  return (

      <div>

        <h1 style={{ textAlign: "center" }}>
          Cognizant Academy Dashboard
        </h1>

        <CohortDetails
            name="React"
            startedOn="10-Jan-2026"
            status="ongoing"
            coach="Anand"
            trainer="Rahul"
        />

        <CohortDetails
            name="Angular"
            startedOn="15-Dec-2025"
            status="completed"
            coach="Priya"
            trainer="John"
        />

        <CohortDetails
            name="Spring Boot"
            startedOn="20-Feb-2026"
            status="ongoing"
            coach="Vijay"
            trainer="David"
        />

        <CohortDetails
            name="Java FSE"
            startedOn="01-Nov-2025"
            status="completed"
            coach="Kumar"
            trainer="Peter"
        />

      </div>

  );
}

export default App;