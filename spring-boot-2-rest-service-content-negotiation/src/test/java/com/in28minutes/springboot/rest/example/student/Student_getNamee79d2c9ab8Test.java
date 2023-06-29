Ensure that your test files do not contain any illegal characters. Also, make sure that each test class is in its own file and the file name should match the class name. 

If you're still facing issues, you might want to try cleaning and rebuilding your project. If you're using Maven, you can do this with the following commands:

```
mvn clean
mvn install
```

If you're using Gradle, you can use the following commands:

```
gradle clean
gradle build