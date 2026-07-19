import { useState } from "react";

function CurrencyConvertor() {

    const [amount, setAmount] = useState("");
    const [currency, setCurrency] = useState("");

    function handleSubmit() {

        const result = amount * 80;

        alert("Converting to " + currency + " Amount is " + result);
    }

    return (

        <div>

            <h1 style={{ color: "green" }}>
                Currency Convertor!!!
            </h1>

            <table>

                <tbody>

                <tr>
                    <td>Amount:</td>

                    <td>
                        <input
                            type="number"
                            value={amount}
                            onChange={(e) => setAmount(e.target.value)}
                        />
                    </td>
                </tr>

                <tr>
                    <td>Currency:</td>

                    <td>
                        <input
                            type="text"
                            value={currency}
                            onChange={(e) => setCurrency(e.target.value)}
                        />
                    </td>
                </tr>

                <tr>

                    <td></td>

                    <td>
                        <button onClick={handleSubmit}>
                            Submit
                        </button>
                    </td>

                </tr>

                </tbody>

            </table>

        </div>
    );
}

export default CurrencyConvertor;