# Java helpers

Pequeña biblioteca de utilidades para Java.

[![License](https://img.shields.io/badge/License-BSD_3--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)
[![Unit testing](https://github.com/arielcostas/javahelpers/actions/workflows/testing.yml/badge.svg)](https://github.com/arielcostas/javahelpers/actions/workflows/testing.yml)
[![Test Coverage](https://api.codeclimate.com/v1/badges/716e3c8a27b8dd466faa/test_coverage)](https://codeclimate.com/github/arielcostas/javahelpers/test_coverage)
[![Maintainability](https://api.codeclimate.com/v1/badges/716e3c8a27b8dd466faa/maintainability)](https://codeclimate.com/github/arielcostas/javahelpers/maintainability)

## Utilidades actuales

- **Base64Util**: Codificar / decodificar cadenas en Base64
- **HexUtil**: Codificar / decodificar cadenas en hexadecimal
- **Range**: Generar rangos de números enteros

## Instalar con Maven

1. Añadir repositorio de costas.dev

    ```xml
    <repositories>
        <repository>
            <id>costasdev</id>
            <name>Ariel Costas' Maven repo</name>
            <url>https://maven.costas.dev/main</url>
        </repository>
    </repositories>
    ```

2. Añadir dependencia

    ```xml
    <dependencies>
        <dependency>
            <groupId>dev.costas</groupId>
            <artifactId>javahelpers</artifactId>
            <version>VERSION</version>
        </dependency>
    </dependencies>
    ```

## Instalar con Gradle

### Usando DSL Groovy

1. Añadir repositorio de costas.dev

    ```groovy
    repositories {
        maven {
            url 'https://maven.costas.dev/main'
        }
    }
    ```

2. Agregar dependencia

    ```groovy
    dependencies {
        implementation 'dev.costas:java-helpers:0.1.0'
    }
    ```

### Usando DSL Kotlin

1. Añadir repositorio de costas.dev

    ```kotlin
    repositories {
        maven {
            url = uri("https://maven.costas.dev/main")
        }
    }
    ```

2. Agregar dependencia

    ```kotlin
    dependencies {
        implementation("dev.costas:java-helpers:VERSION")
    }
    ```

## Licencia

Este proyecto está bajo la licencia BSD de 3 cláusulas. Consulta el archivo [LICENSE](LICENSE) para obtener más
información.