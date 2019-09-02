# Calculator
Files scanner module which calculates basic Math operations

# Installation
Required Maven installed locally. Then just import this project to IDE and all dependencies should be installed automatically

# How does it works?
First you are required to prepare script file with all Math operations you want to perform.
Each operation statement should have separate line. After all operations, apply initial value.
Do not forget about file extension. Default is ``*.txt``

Here is example how file should look like:

``` 
add 6
subtract 2
multiply 5
multiply -2
divide 4
divide -5
apply 50
```
For more examples look into ``/src/test/java/testFiles/``

# Possible operations

	* add
	* subtract
	* multiply
	* divide (NOTE: Do not divide by 0, otherwise an IllegalArgumentException will be thrown)
	* apply
	
# Testing
 If JUnit is already installed at your local machine, then feel free to test Calculator.
 In order to run tests, the simplest solution would be going to ``/src/test/java/com.calculator/CalculatorTest.java``, right click class file and ``Run As -> JUnit Test``
 
# Author
Created by Ernest Ziemkowski
