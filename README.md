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
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.29.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-api</artifactId>
            <version>4.29.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>4.29.0</version>
        </dependency>
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
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.9.3</version>
        </dependency>
    </dependencies><dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.29.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-api</artifactId>
            <version>4.29.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>4.29.0</version>
        </dependency>
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
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.9.3</version>
        </dependency>
    </dependencies>
```

## Running Tests
```bash
mvn clean test
```
