1. Create a Maven Project
2. Get latest version of following dependencies
	---For Cucumber---
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-java</artifactId>
		<version>6.6.1</version>
	</dependency>
		<!-- https://mvnrepository.com/artifact/junit/junit -->
	---For Junit Test and Test Runner @RunWith---
	<dependency>
		<groupId>junit</groupId>
		<artifactId>junit</artifactId>
		<version>4.13</version>
		<scope>test</scope>
	</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
	---For Junit Test Runner -> @Cucumber options to glue feature into stepdefinition---
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-junit</artifactId>
		<version>6.6.1</version>
		<scope>test</scope>
	</dependency>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
	---For selenium---
	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>3.141.59</version>
	</dependency>
3. Install Eclipse Cucumber Plugin (Natural/ Cucumber)
4. Download latest version of driver (in Mac, had to run "xattr -d com.apple.quarantine chromedriver" in chrome path to allow launch
5. Create Feature file
6. Create Corresponding Step Definition
7. Create test Runner to glue Feature with Step Definition
8. Run TestRunner as Junit test
