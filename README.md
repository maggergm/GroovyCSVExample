# GroovyCSVExample
A useful Groovy script to read and analyze a CSV file

# GroovyCSVExample

A useful Groovy script to read and analyze a CSV file.

## Getting Started

This project contains a Groovy script that reads a CSV file and outputs basic statistics such as the number of rows, columns, and the content of the first few rows.

### Prerequisites

- [Groovy](https://groovy-lang.org/download.html) installed on your machine.

### Running the Script

1. Ensure you have the Groovy dependency for CSV parsing. This script uses OpenCSV. You can include it using the `@Grab` annotation as shown in the script.
2. Provide a CSV file to analyze.

To run the script, navigate to the project directory and execute:

```sh
groovy analyze_csv.groovy path/to/your/file.csv

Example Output 

Number of rows: 100
Number of columns: 5
First few rows:
id, name, age, country, occupation
1, Alice, 30, USA, Engineer
2, Bob, 25, Canada, Designer
3, Charlie, 35, UK, Teacher
4, Dana, 40, Australia, Manager
5, Eve, 28, Germany, Scientist


EXAPMLE 

