function ListofPlayers() {

    const players = [
        { name: "Virat", score: 98 },
        { name: "Rohit", score: 82 },
        { name: "Gill", score: 45 },
        { name: "Rahul", score: 75 },
        { name: "Pant", score: 67 },
        { name: "Hardik", score: 100 },
        { name: "Jadeja", score: 50 },
        { name: "Ashwin", score: 72 },
        { name: "Shami", score: 40 },
        { name: "Bumrah", score: 88 },
        { name: "Siraj", score: 65 }
    ];

    const lowScorePlayers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

            <h2>Players with Score Below 70</h2>

            {lowScorePlayers.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}
        </div>
    );
}

export default ListofPlayers;