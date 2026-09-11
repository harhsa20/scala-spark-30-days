# Day 2 - Scala Collections

## Overview

Day 2 focuses on processing data using Scala collections without Apache Spark.

## Topics Covered

- `List`
- `Vector`
- `Map`
- `map`
- `filter`
- `flatMap`
- `reduce`
- `for`-comprehension
- Data processing using Scala collections

## Exercises

### 1. Sales Processing

**File:** `SalesProcessor.scala`

Demonstrates:

- `map`
- `filter`
- `flatMap`
- `reduce`

### 2. Customer Records

**File:** `CustomerRecords.scala`

Uses `Vector` to store customer records and demonstrates indexed access.

### 3. Product Data

**File:** `ProductData.scala`

Uses `Map` to store product prices and quantities.

### 4. Customer Orders

**File:** `CustomerOrders.scala`

Uses a `for`-comprehension to combine customer and order data based on customer ID.

### 5. Daily Sales Summary

**File:** `DailySalesSummary.scala`

Processes sales data and generates a daily sales summary using Scala collections.

## Project Structure

```text
Day-02-Scala-Collections/
│
├── README.md
├── build.sbt
│
├── project/
│   └── build.properties
│
└── src/
    └── main/
        └── scala/
            ├── SalesProcessor.scala
            ├── CustomerRecords.scala
            ├── ProductData.scala
            ├── CustomerOrders.scala
            └── DailySalesSummary.scala
```

## How to Run

Check Scala version:

```bash
scala -version
```

Compile the project:

```bash
sbt compile
```

Run a specific application:

```bash
sbt "runMain SalesProcessor"
```

```bash
sbt "runMain CustomerRecords"
```

```bash
sbt "runMain ProductData"
```

```bash
sbt "runMain CustomerOrders"
```

```bash
sbt "runMain DailySalesSummary"
```

## Technologies

- Scala 2.12.18
- sbt 1.12.15
- Ubuntu / WSL
- Git
- GitHub

## Key Learning

Day 2 demonstrates how Scala collections can be used to transform, filter, combine, and aggregate data without using Apache Spark.
