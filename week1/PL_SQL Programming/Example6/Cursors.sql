DECLARE

    CURSOR GenerateMonthlyStatements IS

        SELECT c.CustomerID,
               c.Name,
               t.TransactionID,
               t.TransactionDate,
               t.Amount,
               t.TransactionType

        FROM Customers c
        JOIN Accounts a
             ON c.CustomerID = a.CustomerID
        JOIN Transactions t
             ON a.AccountID = t.AccountID

        WHERE EXTRACT(MONTH FROM t.TransactionDate)
              = EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM t.TransactionDate)
              = EXTRACT(YEAR FROM SYSDATE);

BEGIN

    FOR rec IN GenerateMonthlyStatements LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Customer: ' || rec.Name ||
            ' | Transaction ID: ' || rec.TransactionID ||
            ' | Amount: ' || rec.Amount ||
            ' | Type: ' || rec.TransactionType
        );

    END LOOP;

END;
/
DECLARE

    CURSOR ApplyAnnualFee IS
        SELECT AccountID, Balance
        FROM Accounts
        FOR UPDATE;

    v_fee NUMBER := 100;

BEGIN

    FOR acc IN ApplyAnnualFee LOOP

        UPDATE Accounts
        SET Balance = Balance - v_fee
        WHERE CURRENT OF ApplyAnnualFee;

        DBMS_OUTPUT.PUT_LINE(
            'Annual Fee Applied to Account ID: '
            || acc.AccountID
        );

    END LOOP;

    COMMIT;

END;
/
DECLARE

    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID,
               InterestRate
        FROM Loans
        FOR UPDATE;

BEGIN

    FOR loan_rec IN UpdateLoanInterestRates LOOP

        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE CURRENT OF UpdateLoanInterestRates;

        DBMS_OUTPUT.PUT_LINE(
            'Updated Interest Rate for Loan ID: '
            || loan_rec.LoanID
        );

    END LOOP;

    COMMIT;

END;
/