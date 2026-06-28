# Exercise 2 - Error Handling

## Scenario 1 - SafeTransferFunds

Transfers funds between accounts.

Error Handling:
- Insufficient balance
- Invalid account
- Any unexpected database error

Actions:
- Rollback transaction
- Display error message

---

## Scenario 2 - UpdateSalary

Updates employee salary by a percentage.

Error Handling:
- Employee ID not found
- Database exceptions

Actions:
- Rollback transaction
- Display error message

---

## Scenario 3 - AddNewCustomer

Adds a new customer record.

Error Handling:
- Duplicate CustomerID
- Other database errors

Actions:
- Prevent insertion
- Rollback transaction
- Display error message