## Project: University Personnel Payroll Monitoring System

### Overview

This project is a programming assignment for the **BBM104 Introduction to Programming Laboratory II** course at Hacettepe University. The goal of this assignment is to develop a system that monitors the payroll of various personnel in a university setting using object-oriented programming principles, specifically focusing on inheritance.

### Project Goals

- **Inheritance and Object-Oriented Design**:
  - Utilize inheritance to model different types of university personnel (Academicians, Officers, Employees, Security).
  - Implement a system that calculates the salary of personnel based on their role, working hours, and other factors such as additional course fees or overwork salary.

### Files and Input

- **personnel.txt**:
  - Contains information about the personnel, including their name, registration number, position, and the year they started working at the university.
  
- **monitoring.txt**:
  - Contains the weekly working hours of personnel identified by their registration number.

### Personnel Categories

The personnel in the university are categorized into the following groups:

1. **Academicians**:
   - Includes Faculty Members and Research Assistants.
   - Faculty Members may earn additional course fees.
2. **Officers**:
   - Eligible for base salary, special service benefits, and overwork salary.
3. **Employees**:
   - Can be either Part-time or Full-time (Workers or Chiefs).
   - Their salaries are based on the number of working hours or days.
4. **Security Personnel**:
   - Paid based on working hours, including additional transportation and food allowances.

### Salary Calculation Rules

- **Base Salary**: The base salary is fixed for Academicians and Officers.
- **Severance Pay**: Calculated based on the number of years worked at the university.
- **Overwork Salary**: Applicable to Officers, Workers, and Chiefs, with caps on the number of paid overwork hours.

### Output

The system will generate output files named after the registration numbers of personnel, e.g., `F5632.txt`. Each file contains details such as the personnel's name, position, and total calculated salary.

### Setup and Execution

1. **Clone the repository**:
    ```bash
    git clone https://github.com/EfeAydinalp/PayrollMonitoringSystem
    cd PayrollMonitoringSystem
    ```

2. **Compile the Java files**:
    ```bash
    javac Main.java
    ```

3. **Run the program**:
    ```bash
    java Main personnel.txt monitoring.txt
    ```

4. **Check the output**:
   - The output will be generated in text files corresponding to the registration numbers of the personnel.
