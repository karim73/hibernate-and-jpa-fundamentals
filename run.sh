#!/usr/bin/env bash


target="target/classes/cours_$1/"
cp="."
for i in `ls libs/Hibernate\ 5.0.4.Final/*.jar`;
	do cp=$cp":$i";
	done;


javac -Xlint:deprecation -Xlint:unchecked  -d $target -classpath $cp $(find cours_$1/src -name *.java)

echo "javac -Xlint:deprecation -Xlint:unchecked  -d $target -classpath $cp $(find cours_$1/src -name *.java)"

cp=$cp":"$target

java -cp $cp org.perso.cours_$1.main.Main

