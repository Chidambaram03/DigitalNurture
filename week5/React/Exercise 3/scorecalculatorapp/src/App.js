import CalculateScore from "./Components/CalculateScore";

function App() {
    return (
        <div>
            <CalculateScore
                name="Chidambaram"
                school="GlazeBrooke Public school"
                total={284}
                goal={300}
            />
        </div>
    );
}

export default App;