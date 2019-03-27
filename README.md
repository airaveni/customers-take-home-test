# Customers - Take Home Test

This porject is the answer to a test to demonstrate how to structure components in a small program.

The test:
We have some customer records in a text file (customers.txt) -- one customer per line, JSON lines formatted. We want to invite any customer within 100km of our Dublin office(Starbucks, Saint Stephen's Green, Dublin , Ireland) for some food and drinks on us. Write a program that will read the full list of customers and output the names and user ids of matching customers (within 100km), sorted by User ID (ascending).

The GPS coordinates for our Dublin office are 53.339428, -6.257664.
You can find the Customer list here: https://s3.amazonaws.com/intercom-take-home-test/customers.txt

# How to run this project

## Step 1) Make sure you have all the Prerequisites

#### Java SE Development Kit 8 (1.8.0) or newer 
Run this command in your termanal to see what version you have setup 
```
javac -version
```
#### Maven 3.0 or newer 
Run this command in your terminal to see what version you have setup 
```
mvn -version
```
## Step 2) Download the project

#### Here you have 2 options 
* Download the .zip file and extract it
* Clone the project using git 

## Step 3) Build the project 

* Once you have unzipped / cloned the project, using your terminal navigate to its root folder (the once containing the "README.md" file)
* Now run this command:  `mvn clean install` 
* This will use Maven to download the required dependancies, and build an executable jar file in the newly created "target" folder

## Step 4) Run the project 
You can now execute the project by navigating inside the target folder and running this command
`java -jar target/customers-0.0.1-SNAPSHOT.jar`

Your output should look something like this
```
Starting CustomersApplication v0.0.1-SNAPSHOT on xxxx with PID 11111 (/home/user/Documents/test/customers-master/target/customers-0.0.1-SNAPSHOT.jar started by user in /home/user/Documents/test/customers-master)
No active profile set, falling back to default profiles: default
Started CustomersApplication in 0.682 seconds (JVM running for 0.978)
Getting List of customers within 70.0km Range of (latitude: 53.339428, longitude: -6.257664)
Reading Customer data from www.someURL.com/cust.txt

```
If you do not see the desired outpit(a list of Customers within 100km of the target location) more details on what caused the error will be displayed in the output

#### Alternatively you can add arguments to the command to change the URL of the input text file. 

Examples:
* This command will use "www.someURL.com/cust.txt" as the input URL instead of the default
`java -jar target/customers-0.0.1-SNAPSHOT.jar www.someURL.com/cust.txt`

* This command will use "www.someURL.com/cust.txt" as the input URL and 70km as the range to serch within instead of the defaults
`java -jar target/customers-0.0.1-SNAPSHOT.jar www.someURL.com/cust.txt 70`
