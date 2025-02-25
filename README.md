# Sieve of Atkin

This project implements the Sieve of Atkin algorithm in Java to find all prime numbers up to a given limit.

## Description

The Sieve of Atkin is a modern algorithm for finding all prime numbers up to a specified integer. It is an optimized version of the ancient Sieve of Eratosthenes. This implementation prints all prime numbers up to a limit specified in the code.

## Usage

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, Visual Studio Code).
3. Run the `SieveOfAtkins` class.

The `limit` variable in the `main` method specifies the upper bound for finding prime numbers. You can change this value to find primes up to a different limit.

```java
public static void main(String[] args) {
    int limit = 100; // Change this value to set a different limit
    sieveOfAtkins(limit);
}