#!/usr/bin/env bash

target="target/classes/"

cp="."
for i in `ls lib/*.jar`;
	do cp=$cp":$i";
	done;
echo $cp
javac -Xlint:deprecation -Xlint:unchecked  -d $target -classpath $cp $(find src -name *.java)

cp=$cp":"$target

java -cp $cp org.perso.tuto_hibernate.cours_$1.main.Main
