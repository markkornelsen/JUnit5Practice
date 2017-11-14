#!/bin/bash

echo "## maven clean install"
mvn clean install -U

echo "## run junit5 against all tests in target/test-classes"
java -jar junit-platform-console-standalone-1.0.1.jar  --class-path target/test-classes --scan-class-path
