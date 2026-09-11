# Day 4 — RDD Creation and Transformations

## Objective

Learn the fundamentals of Apache Spark RDDs, including RDD creation, transformations, actions, sales processing, and partitions.

## Topics Covered

- Creating RDDs from Scala collections
- Creating RDDs from text files
- RDD transformations
- `map`
- `filter`
- `flatMap`
- `reduce`
- Calculating total sales using RDDs
- RDD partitions
- Spark default parallelism

## Project Structure

```text
Day-04-RDD/
├── README.md
├── .gitignore
├── build.sbt
├── project/
│   └── build.properties
└── src/
    └── main/
        ├── resources/
        │   └── transactions.txt
        └── scala/
            ├── RDDFromCollection.scala
            ├── RDDTransformations.scala
            ├── SalesRDD.scala
            └── RDDPartitions.scala
