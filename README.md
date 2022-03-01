
Option 1: Setup through command line:

1. Clone or download and unzip repository content

2. Download and copy testing framework jars to downloaded repository directory:
https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
https://search.maven.org/remotecontent?filepath=junit/junit/4.13.2/junit-4.13.2.jar

3. Open command line and navigate to downloaded repository

4. Compile from command line:
Unix:
javac -classpath junit-4.13.2.jar *.java

5. Run test from command line:
Unix:
java -cp junit-4.13.2.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore GraphTest
