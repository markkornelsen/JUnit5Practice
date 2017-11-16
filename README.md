# JUnit5Practice

Documentation: <http://junit.org/junit5/docs/current/user-guide/>

Other examples on github: <https://github.com/pszerszen/junit5-examples>

## Setup

#### Eclipse Oxygen
- 	**Download:** <http://www.eclipse.org/downloads/packages/release/Oxygen/1A>
- add JUnit5 library to build path, right-click project, choose ```build path | Add Libraries```
- run it just like you would normally using ```run as | JUnit Test```

#### Console Launcher
- **Download:** <https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.0.1/>
- to run, specify directories containing the test classes as well as the classes under test, something like this:
```java -jar junit-platform-console-standalone-1.0.1.jar  --class-path target/test-classes:target/classes --scan-class-path```
- *note the colon (:) used to separate the directories containing the test classes and the classes under tests*

#### Maven
- The surefire plug-in configured in the pom file allows maven to run JUnit5 tests with ```mvn clean test```

## New Annotations

- @Disabled instead of @Ignore
- @BeforeEach/@BeforeAll instead of @BeforeClass
- public scoping no longer required for test classes and methods

## Why should I use it?

- @Nested
- @Parameter tests
- *(not working yet)* @Dynamic tests
- *(not working yet)* assertAll()