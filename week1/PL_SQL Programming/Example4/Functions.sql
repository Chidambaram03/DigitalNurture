CREATE OR REPLACE FUNCTION CalculateAge(
    p_dob DATE
)
RETURN NUMBER
IS
    v_age NUMBER;
BEGIN

    v_age :=
        FLOOR(
            MONTHS_BETWEEN(
                SYSDATE,
                p_dob
            ) / 12
        );

    RETURN v_age;

END;
/
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount   NUMBER,
    p_interest_rate NUMBER,
    p_years         NUMBER
)
RETURN NUMBER
IS
    v_monthly_rate NUMBER;
    v_months NUMBER;
    v_emi NUMBER;
BEGIN

    v_monthly_rate :=
        (p_interest_rate / 12) / 100;

    v_months :=
        p_years * 12;

    v_emi :=
        p_loan_amount *
        v_monthly_rate *
        POWER(
            1 + v_monthly_rate,
            v_months
        ) /
        (
            POWER(
                1 + v_monthly_rate,
                v_months
            ) - 1
        );

    RETURN ROUND(v_emi, 2);

END;
/
CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_account_id NUMBER,
    p_amount     NUMBER
)
RETURN BOOLEAN
IS
    v_balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_account_id;

    RETURN v_balance >= p_amount;

EXCEPTION

    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;

    WHEN OTHERS THEN
        RETURN FALSE;

END;
/
DECLARE
    v_age NUMBER;
BEGIN

    v_age :=
        CalculateAge(
            TO_DATE(
                '1990-07-20',
                'YYYY-MM-DD'
            )
        );

    DBMS_OUTPUT.PUT_LINE(
        'Age: ' || v_age
    );

END;
/
DECLARE
    v_installment NUMBER;
BEGIN

    v_installment :=
        CalculateMonthlyInstallment(
            500000,
            8,
            5
        );

    DBMS_OUTPUT.PUT_LINE(
        'Monthly Installment: '
        || v_installment
    );

END;
/
DECLARE
    v_result BOOLEAN;
BEGIN

    v_result :=
        HasSufficientBalance(
            1,
            500
        );

    IF v_result THEN
        DBMS_OUTPUT.PUT_LINE(
            'Sufficient Balance'
        );
    ELSE
        DBMS_OUTPUT.PUT_LINE(
            'Insufficient Balance'
        );
    END IF;

END;
/