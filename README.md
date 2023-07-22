# JavaApplications

This repository contains my Java projects, which includes an Email Application, a Student Database Application, and a Bank Application. Here are the details for each project:

# Project 1: Email Application 

This project is a Java application developed as part of an IT Support Administrator task. It simulates the process of creating email accounts for new hires in a company.

## Features 

The application has the following functionalities:

- **Email Generation**: Creates a new email for each user following this syntax: `firstname.lastname@department.company.com`.
- **Department Determination**: Determines the department of the user (sales, development, accounting). If the department is not specified, this section is left blank in the email.
- **Password Generation**: Generates a random string to be used as the initial password for the email account.
- **Set Methods**: Allows the modification of the user's password, the mailbox capacity and the option to define an alternate email address.
- **Get Methods**: Retrieves and displays the user's name, email, and mailbox capacity.

## How to Use

Generally, the user will need to input the new hire's first name, last name, and department, and the application will generate the email address and password accordingly.


# Project 2: Student Database Application


This is a Java application that has been developed to manage student enrollments and balance for a university. As a database administrator, this tool will aid you in efficiently handling student data.

## Features

The application has the following functionalities:

- **Student Addition**: Asks the user for the number of new students to be added to the database. The user is prompted to enter the name and year for each student.
- **Unique ID Generation**: Assigns each student a unique 5-digit ID, with the first number corresponding to their grade level.
- **Course Enrollment**: Allows a student to enroll in various courses, including:
  - History 101
  - Mathematics 101
  - English 101
  - Chemistry 101
  - Computer Science 101
- **Tuition Management**: Tracks each course enrollment cost at a standard of $600 per course. Students can view their balance and make payments towards their tuition.
- **Student Status**: Displays the student's name, ID, enrolled courses, and remaining balance.

## How to Use

 Generally, the user will input student data, and the application will manage ID generation, course enrollment, and tuition billing.



# Project 3: Bank Application



This is a Java application created for handling new customer bank account requests. As a back-end developer, you will find this application helpful in managing bank accounts efficiently.

## Features

The application offers the following functionalities:

- **CSV Reader**: Reads a .csv file of names, social security numbers, account types, and initial deposits.
- **Account Management**: Uses a data structure to hold all these accounts.
- **Savings and Checking Accounts** Both accounts share the following properties:
  - `deposit()`
  - `withdraw()`
  - `transfer()`
  - `showInfo()`

     They also have an 11-digit account number,(generated with the following process: starting with number  1 or 2 depending on Savings or Checking, the last two digits of SSN, a unique 5-digit number, and a random 3-digit number )
- **Safety Deposit Box**: Savings account holders are provided with a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code.
- **Debit Card**: Checking account holders are assigned a Debit Card with a 12-digit number and a 4-digit PIN.
- **Interest Rate Interface**: Both account types use an interface that determines the base interest rate. Savings accounts use 0.25 points less than the base rate, while checking accounts use 15% of the base rate.
- **showInfo Method**: This reveals relevant account information as well as information specific to the Checking account or Savings account.

## How to Use

Detailed instructions on how to use this application will follow. 
Generally, the application reads a .csv file to create new bank accounts and manages these accounts according to the specified rules.



## Contribute

Contributions, issues, and feature requests are welcome. Feel free to check the [issues page](https://github.com/ermand-de/JavaApplications/issues) if you want to contribute.

## License

[MIT](link-to-license)
