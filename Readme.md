
## Table of Content
- [Description](#description)
- [Architecture](#architecture)
- [PreRequisite](#prerequisite)
- [Run-Command](#run-command)
- [Report](#report)

## Description
   This project is created just to demonstrate the BDD automation framework skills with TestNG-Cucumber framework written in Java selenium using Page Object Model. This framework can be used for achieving crossbrowser, parallel run and failed scenarios run. Users can add cucumber feature files and stepdefs and can start writing the test.
## Architecture
    This is a Maven project developed using Java Selenium and TestNG.
- Maven take cares of dependency jars and plugins.
- TestNG Provides parallel run option.
- Selenium provides API's for WebEelements
- Cucumber provides BDD approach
  
## PreRequisite
  Java 8
  chromedriver (version should be same as the system browser version currently this project contains v101.)
  geekodriver(Firefox driver)( version should be same as the system browser)
  
## Run-Command
  1. To run the Test on Non-Prod<br/>
      mvn clean install -Denv=nonprod -DBrowser=chrome -Dtestng.dtd.http=true <br/>
      
  2.  To run the test on Pre-Prod<br/>
      mvn clean install -Denv=preprod -DBrowser=chrome -Dtestng.dtd.http=true<br/>
      
      ** threadCount is used for parallel running. And we have to set this count in TestNG.xml file. As of now ThreadCount=3.
      ** As of now this code will run only on Chrome with nonprod.
      ** If we don't provide the Browser value then by default chrome will be selected.
      ** For parallel run with multi user, we can provide the threadcount value in TestNG.xml file present in project folder
      
## Report
   The framework will generate 4 types of test reports with screenshot and error details of failed scenarios.<br/>
   1.  ExtentReport <br/>
      Path :project.dir/reports/ExtentReportResult.html<br/>
      <br/>
      
      **The below reports provide screenshot with error details for the failed scenarios.
      
   2. Spark Report <br/>
      Path :project.dir/test-output/spark/SparkReport.html<br/>
      <br/>
      
   3. Extent pdf Report <br/>
      Path :project.dir/test-output/PdfReport/ExtentPDFReport.pdf<br/>
      <br/>
      
   4. Cucumber Report : This report provide screenshot with error details for the failed scenarios<br/>
      path : project.dir/target/cucumber-reports.html
