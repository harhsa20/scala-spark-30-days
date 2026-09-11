# Day 3 - Spark Setup and First Application

## Overview

Day 3 focuses on setting up an Apache Spark project using Scala and sbt and creating basic Spark applications.

## Topics Covered

- Apache Spark setup
- sbt project configuration
- Spark Core
- Spark SQL
- SparkSession
- SparkContext
- Driver
- Executor
- Cluster Manager
- Local mode
- Reading text files
- Spark partitions

## Project Structure

```text
Day-03-Spark-Setup/
│
├── README.md
├── build.sbt
│
├── project/
│   └── build.properties
│
└── src/
    └── main/
        ├── resources/
        │   └── sample.txt
        │
        └── scala/
            ├── SparkSessionExample.scala
            ├── SparkContextExample.scala
            └── TextFileReader.scala
