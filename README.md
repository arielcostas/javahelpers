# Java helpers

Tiny library of utilities for Java.

## Current utilities

- **Base64Util**: Encode / decode strings in Base64.
- **HexUtil**: Encode / decode strings in hexadecimal.
- **Range**: Generate integer ranges.

## Install via Maven

1. Add costas.dev repository

    ```xml
    <repositories>
        <repository>
            <id>costasdev</id>
            <name>Ariel Costas' Maven repo</name>
            <url>https://maven.costas.dev/main</url>
        </repository>
    </repositories>
    ```

2. Add dependency

    ```xml
    <dependencies>
        <dependency>
            <groupId>dev.costas</groupId>
            <artifactId>javahelpers</artifactId>
            <version>VERSION</version>
        </dependency>
    </dependencies>
    ```

## Install via Gradle

### Using Groovy DSL

1. Add costas.dev repository

    ```groovy
    repositories {
        maven {
            url "https://maven.costas.dev/main"
        }
    }
    ```

2. Add dependency

    ```groovy
    dependencies {
        implementation 'dev.costas:java-helpers:0.1.0'
    }
    ```

### Using Kotlin DSL

1. Add costas.dev repository

    ```kotlin
    repositories {
        maven {
            url = uri("https://maven.costas.dev/main")
        }
    }
    ```

2. Add dependency

    ```kotlin
    dependencies {
        implementation("dev.costas:java-helpers:VERSION")
    }
    ```

## License

This project is licensed under the BSD 3-Clause License - see the [LICENSE](LICENSE) file for details.