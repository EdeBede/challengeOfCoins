First task is about writing a program which calculates a minimum number of coins needed to make a change 
  (given from the main method or the test class). Code sample in module Coins.
  
Second task is a bit trickier. Two types of users can have several levels of access to a database.
The code is working at the moment. For understanding the logic, you can take a look on the unit tests
as well. 
Now consider the following situation: We want to add some new types of users, and new user rights. Can we do
that easily? Or somethingseems to be wrong? It is because the program in current state violates a design principle. 
Correct it! While doing so, don't break the logic (the unit test should be working). Code is located in module UserRights.
