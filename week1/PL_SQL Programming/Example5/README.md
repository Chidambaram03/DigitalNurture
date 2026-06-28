# Exercise 5 - Triggers

## Scenario 1 - UpdateCustomerLastModified

Trigger:
- UpdateCustomerLastModified

Purpose:
- Automatically updates LastModified whenever a customer record changes.

Type:
- BEFORE UPDATE Trigger

---

## Scenario 2 - LogTransaction

Trigger:
- LogTransaction

Purpose:
- Stores transaction details in AuditLog whenever a transaction is inserted.

Type:
- AFTER INSERT Trigger

---

## Scenario 3 - CheckTransactionRules

Trigger:
- CheckTransactionRules

Business Rules:
- Deposits must be positive.
- Withdrawals cannot exceed account balance.

Type:
- BEFORE INSERT Trigger

---

Concepts Used

- BEFORE Trigger
- AFTER Trigger
- :NEW Pseudorecord
- RAISE_APPLICATION_ERROR
- Audit Logging
- Business Rule Validation