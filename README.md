# n-prime-numbers

A simple program to read a positive integer N and draw a table showing the first N prime numbers on the first row and column. Every other cell in the table is the product of the prime numbers in the first row and first column corresponding to that cell

e.g. if the input number is 4, the table will be:

          2     3     5     7 

    2     4     6    10    14 

    3     6     9    15    21 

    5    10    15    25    35 

    7    14    21    35    49 


## Build

```
git clone https://github.com/nikhildesai/n-prime-numbers.git

cd n-prime-numbers

mvn clean install (Pre-reqs: JDK 1.8, Maven)
```

## Run

```
java -jar <path to jar file>

Enter a number: 4

          2     3     5     7 

    2     4     6    10    14 

    3     6     9    15    21 

    5    10    15    25    35 

    7    14    21    35    49 

```
