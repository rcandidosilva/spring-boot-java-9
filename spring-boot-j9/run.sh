#!/usr/bin/env bash

export CURRENT=.

jlink --module-path $JAVA_HOME/jmods \
    --verbose --add-modules java.sql,java.naming,java.management,java.instrument,java.security.jgss,java.xml.bind \
    --compress 2 --no-header-files \
    --output target/jdk-9-minimal-osx --no-man-pages

./target/jdk-9-minimal-osx/bin/java -jar $CURRENT/target/spring-boot-j9-1.0.0-exec.jar
