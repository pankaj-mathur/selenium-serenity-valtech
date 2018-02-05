
# demo_serenity-jbehave

# Introduction
This framework is build using Serenity, JBehave, Java, WebDriver, maven
Purpose was to automate acceptance test in BDD approach


# Feature
1. Test are written in BDD
2. JBhave story fils eare created
3. This framework supports multiple OS and browser
4. For demo purpose I have added plugin for IE
5. This can be executed from command prompt, Eclipse or anf CI tool
6. We get a detailed serenity report that can be viewed in browser
7. We can track Epic, Requirement , Stories


# Pre-requisite
1. JAVA and maven installed and setup
2. Sometime browser version can create conflict in execution of these tests, that can be resolved. But for demo purpose i will suggest take latest IE or Firefox.

# How to execute - from command prompt
1. Check out this source code
2. Open comand prompt and go to the root of the repository and execute below for test to be executed is chrome (prefer chrome)
mvn integration-test -Dwebdriver.chrome.driver=chromedriver.exe -Dwebdriver.driver=chrome -Dwebdriver.base.url= serenity:aggregate -Dit.test=AcceptanceTestSuite

Or For IE use below command
mvn integration-test -Dwebdriver.ie.driver=IEDriverServer.exe -Dwebdriver.driver=iexplorer -Dwebdriver.base.url= serenity:aggregate -Dit.test=AcceptanceTestSuite

Or For Firefox use below command
mvn integration-test -Dwebdriver.base.url= serenity:aggregate -Dit.test=AcceptanceTestSuite


# Notes
All the BDD have not been automated, as my purpose was to prove automation 
1. create hotel entry -- Implemented
2. create customer entry -- Implemented
3. delete customer entry -- Implemented
4. delete a customer entry -- Not Implemented
5. For multiple entry or multiplerecord creation for hotelor customer we can use same test with multiplerecord i.e Example data
6. field validation for hotel creation form -- Not Implemented
7. field validation for customer form -- Not Implemented
8. search functionality -- Not Implemented


# How to view execution report

* Once execution is successful. Navigate to the root folder of the framework.
* Navigate to /target/site/serenity/index.html
* This reportcan be viewed in any browser.
* This report can be integrated with any CI tool.
