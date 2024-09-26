# Personal Account Management System

## Overview

This Java project simulates a personal account management system, allowing users to create a personal account, deposit and withdraw money, and track their transaction history. The main classes include `PersonalAccount`, `Amount`, and `TransactionType`.

### Classes

#### 1. **PersonalAccount**

Represents a personal bank account with the following attributes:

- **accountNumber**: An `int` representing the account number.
- **accountHolder**: A `String` representing the name of the account holder.
- **balance**: A `double` representing the current account balance (initialized to 0.0).
- **transactions**: An `ArrayList<Amount>` to store a history of all deposit and withdrawal transactions.

**Methods**:

- **PersonalAccount(int accountNumber, String accountHolder)**:  
  Constructor to initialize the account number and account holder's name. The balance is set to 0.0 by default, and an empty transaction list is created.

- **deposit(double amount)**:  
  Deposits money into the account. Adds the amount to the balance and logs the transaction in the `transactions` list. If the deposit amount is less than or equal to 0, an error message is printed.

- **withdraw(double amount)**:  
  Withdraws money from the account. Decreases the balance by the specified amount and logs the transaction in the `transactions` list. Withdrawal is allowed only if the balance is sufficient and the withdrawal amount is greater than 0.

- **printTransactionHistory()**:  
  Prints the account's transaction history, including all deposits and withdrawals.

- **getBalance()**:  
  Returns the current account balance.

- **getAccountNumber()**:  
  Returns the account number.

- **getAccountHolder()**:  
  Returns the name of the account holder.

#### 2. **Amount**

Represents an amount of money for a transaction. Each `Amount` object records the transaction type and the amount involved.

- **amount**: A `double` representing the monetary amount of the transaction.
- **transactionType**: A `TransactionType` enum value indicating whether the transaction was a deposit or a withdrawal.

**Methods**:

- **Amount(double amount, TransactionType transactionType)**:  
  Constructor to create an `Amount` object with the specified monetary value and transaction type.

- **getAmount()**:  
  Returns the monetary value of the transaction.

- **getTransactionType()**:  
  Returns the type of the transaction (DEPOSIT or WITHDRAWAL).

- **displayTransaction()**:  
  Prints the details of the transaction, showing the type (deposit or withdrawal) and the amount.

#### 3. **TransactionType (Enum)**

An enumeration that defines the two types of transactions:  
- **DEPOSIT**: Represents a deposit transaction.
- **WITHDRAWAL**: Represents a withdrawal transaction.

## UML Diagram
Below is a UML diagram of the system created using Mermaid syntax:
<img width="423" alt="Снимок экрана 2024-09-26 в 14 51 50" src="https://github.com/user-attachments/assets/4cc181fe-27f5-4673-884a-6878a8ab890b">
