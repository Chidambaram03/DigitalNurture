import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const score = (props.total / props.goal).toFixed(2);

    return (
        <div className="container">
            <h1>Student Details:</h1>

            <p className="name">
                <b>Name:</b> {props.name}
            </p>

            <p className="school">
                <b>School:</b> {props.school}
            </p>

            <p className="total">
                <b>Total:</b> {props.total} Marks
            </p>

            <p className="score">
                <b>Score:</b> {score}%
            </p>
        </div>
    );
}

export default CalculateScore;