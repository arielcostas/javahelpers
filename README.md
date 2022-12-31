# Java helpers

Tiny library of utilities for Java.

[![License](https://img.shields.io/badge/License-BSD_3--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)
[![Unit testing](https://github.com/arielcostas/javahelpers/actions/workflows/testing.yml/badge.svg)](https://github.com/arielcostas/javahelpers/actions/workflows/testing.yml)
[![Maven Central](https://img.shields.io/maven-central/v/dev.costas/javahelpers?style=for-the-badge)](https://search.maven.org/artifact/dev.costas/javahelpers)
[![Test Coverage](https://api.codeclimate.com/v1/badges/716e3c8a27b8dd466faa/test_coverage)](https://codeclimate.com/github/arielcostas/javahelpers/test_coverage)
[![Maintainability](https://api.codeclimate.com/v1/badges/716e3c8a27b8dd466faa/maintainability)](https://codeclimate.com/github/arielcostas/javahelpers/maintainability)

## Current utilities

- **Base64Util**: Encode / decode strings in Base64.
- **HexUtil**: Encode / decode strings in hexadecimal.
- **Range**: Generate integer ranges.

## Install via Maven

```xml
<dependencies>
	<!-- ... -->
	<dependency>
		<groupId>dev.costas</groupId>
		<artifactId>javahelpers</artifactId>
		<version>VERSION</version>
	</dependency>
</dependencies>
```

## Install via Gradle

### Using Groovy DSL

```groovy
dependencies {
	implementation 'dev.costas:javahelpers:VERSION'
}
```

### Using Kotlin DSL

```kotlin
dependencies {
	implementation("dev.costas:javahelpers:VERSION")
}
```

## License

This project is licensed under the BSD 3-Clause License - see the [LICENSE](LICENSE) file for details.
