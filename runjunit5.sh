#!/bin/bash

mvn clean install -U

echo "## run junit5 against all tests in target/test-classes."
echo "## the runner also needs the location of the files under test, so specified target/class for this."
java -jar junit-platform-console-standalone-1.0.1.jar  --class-path target/test-classes:target/classes --scan-class-path
