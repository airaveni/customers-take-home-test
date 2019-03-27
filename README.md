# Customers - Take Home Test

This project is the answer to a test to demonstrate how to structure components in a small program.

The test:
We have some customer records in a text file (customers.txt) -- one customer per line, JSON lines formatted. We want to invite any customer within 100km of our Dublin office(Starbucks, Saint Stephen's Green, Dublin , Ireland) for some food and drinks on us. Write a program that will read the full list of customers and output the names and user ids of matching customers (within 100km), sorted by User ID (ascending).

The GPS coordinates for our Dublin office are 53.339428, -6.257664.
You can find the Customer list here: https://s3.amazonaws.com/intercom-take-home-test/customers.txt

# How to run this project

## Step 1) Make sure you have all the Prerequisites

#### Java SE Development Kit 8 (1.8.0) or newer 
Run this command in your terminal to see what version you have setup
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
* This will use Maven to download the required dependencies, and build an executable jar file in the newly created "target" folder

## Step 4) Run the project 
You can now execute the project by navigating inside the target folder and running this command
`java -jar target/customers-1.0.0.jar`

Your output should look something like this
```
Starting CustomersApplication v1.0.0 on xxxx with PID 11111 (/home/user/Documents/test/customers-master/target/customers-1.0.0.jar started by user in /home/user/Documents/test/customers-master)
No active profile set, falling back to default profiles: default
Started CustomersApplication in 0.682 seconds (JVM running for 0.978)
Getting List of customers within 70.0km Range of (latitude: 53.339428, longitude: -6.257664)
Reading Customer data from https://s3.amazonaws.com/intercom-take-home-test/customers.txt
Total customers read from file 32, of which 16 are within a 100.0km Range.

List of customers in range:
user_id: 4, name: Ian Kehoe
user_id: 5, name: Nora Dempsey
user_id: 6, name: Theresa Enright
user_id: 8, name: Eoin Ahearn
user_id: 11, name: Richard Finnegan
user_id: 12, name: Christina McArdle
user_id: 13, name: Olive Ahearn
user_id: 15, name: Michael Ahearn
user_id: 17, name: Patricia Cahill
user_id: 23, name: Eoin Gallagher
user_id: 24, name: Rose Enright
user_id: 26, name: Stephen McArdle
user_id: 29, name: Oliver Ahearn
user_id: 30, name: Nick Enright
user_id: 31, name: Alan Behan
user_id: 39, name: Lisa Ahearn


Process finished with exit code 0

```
If you do not see the desired output(a list of Customers within 100km of the target location) more details on what caused the error will be displayed in the output

#### Alternatively you can add arguments to the command to change the range in km to search within and the input URL. 

Examples:
* This command will use search within 70km instead of the default 100km

`java -jar target/customers-1.0.0.jar 70`

* This command will use "www.someURL.com/cust.txt" as the input URL and 70km as the range to search within instead of the defaults

`java -jar target/customers-0.0.1-SNAPSHOT.jar 70 www.someURL.com/cust.txt `
