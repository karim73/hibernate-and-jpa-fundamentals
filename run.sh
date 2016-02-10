#!/usr/bin/env bash


target="target/classes/"

# cp="."
# for i in `ls libs/Hibernate_5.0.4.Final/*.jar`;
#	do cp=$cp":$i";
#	done;

cp=".:libs/Hibernate_5.0.4.Final/mysql-connector-java-5.1.29-bin.jar"

javac -Xlint:deprecation -Xlint:unchecked  -d $target -classpath $cp $(find cours_$1/src -name *.java)

cp=$cp":"$target

java -cp $cp org.perso.cours_$1.main.Main