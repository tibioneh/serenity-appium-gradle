Run all tests: gradlew clean test -Dproperties=ios.properties
-> the aggregate task is done automatically

Run single test: gradlew clean test --tests SomeTest (or tests.SomeTest)
    
Run tests by tags: gradlew clean alpha

Note: a separate gradle task needs to be created for each set of tags (Gradle/Serenity bug)

To specify the properties file: "-Dproperties=ios.properties"
(The default .properties file used is "serenity.properties")

Report can be found in /target/site/serenity/index.html