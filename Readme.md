BDD automation with TestNG-Cucumber framework written in Java selenium using Page Object Model
Table of Content
Description
Architecture
PreRequisite
Run-Command
Report
Description
This project contains Inteigral-ott.net popcorn API verification and validation TestCases.

Architecture
This is a Maven project developed using Java Selenium and TestNG.
- Maven take cares of dependency jars and plugins.
- TestNG Provides parallel run option.
- Selenium provides API's for WebEelements
- Cucumber provides BDD approch


PreRequisite
Java 8

Report
The framework will generate 2 test reports

TestNG ExtentReport
Path : project.dir/reports/ExtentReportResult.html

TestNG default Report
path : project.dir/target/surefire-reports/index.html

To run the test on Non-Prod
mvn clean install -Denv=nonprod -DthreadCount=2 -DBrowser=chrome -Dtestng.dtd.http=true


To run the test on Pre-Prod
mvn clean install -Denv=preprod -DthreadCount=2 -DBrowser=chrome -Dtestng.dtd.http=true

** threadCount is used for parallel running. And we have to set this count in TestNG.xml file. As of now ThreadCount=3.

** As of now this code will run only on Chrome with nonprod.

Report
The framework will generate 2 test reports

