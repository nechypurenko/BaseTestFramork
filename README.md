# Test Setup Documentation

## Introduction
This document describes how to set up the test environment for our automation framework, which uses Java, Selenide, and Selenoid for running UI tests.

## Prerequisites
- **JDK**: 11 or higher
- **Maven**: 3.x or higher
- **Selenide**: 5.x

## Setting Up Dependencies
To add Selenide to your project, add the following to your `pom.xml` file:

```xml
<dependencies>
        <dependency>
            <groupId>com.codeborne</groupId>
            <artifactId>selenide</artifactId>
            <version>7.7.0</version>
        </dependency>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.11.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.12.1</version>
        </dependency>
    </dependencies>
```

## Running Tests
```bash
mvn clean test
```
