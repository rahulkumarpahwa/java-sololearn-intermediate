// Module 3 
//Chapter 1:

// Exceptions

// An exception is a problem that occurs during program execution. Exceptions cause abnormal termination of the program.

// Exception handling is a powerful mechanism that handles runtime errors to maintain normal application flow.

// An exception can occur for many different reasons. Some examples:

// - A user has entered invalid data.

// - A file that needs to be opened cannot be found.

// - A network connection has been lost in the middle of communications.

// - Insufficient memory and other issues related to physical resources.

// As you can see, exceptions are caused by user error, programmer error, or physical resource issues. However, a well-written program should handle all possible exceptions.

// Exception Handling

// Exceptions can be caught using a combination of the try and catch keywords.

// A try/catch block is placed around the code that might generate an exception.

// Syntax:

try {
  //some code
} catch (Exception e) {
  //some code to handle errors
}

// A <b>catch </b>statement involves declaring the type of exception you are trying to catch. If an exception occurs in the <b>try </b>block, the catch block that follows the try is checked. If the type of exception that occurred is listed in a catch block, the exception is passed to the catch block much as an argument is passed into a method parameter.

// The Exception type can be used to catch all possible exceptions.

// The example below demonstrates exception handling when trying to access an array index that does not exist:

public class MyClass {
    public static void main(String[ ] args) {
        try {
            int a[ ] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}

// Without the try/catch block this code should crash the program, as a[5] does not exist.

// Notice the (Exception e) statement in the catch block - it is used to catch all possible Exceptions.

// chapter 1 Finished.

// chapter 2: 

// PRACTICE EXERCISE
// Exception Handling

// An online electronics store has 5 product categories - PCs, Notebooks, Tablets, Phones, and Аccessories.

// The program you are given declares an array and stores that types into it.

// Write a program to take N number as input and output the element of the array with N index. If the index is out of range, program should output "Wrong Option".

// Sample Input

// 5

// Sample Output

// Wrong Option

// Use the Exception type to catch all possible exceptions.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    
	    String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
	    
	    //complete the code
	    try {
	        
	    } catch() {
	        
	    }
	}
}

// my solution :
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    
	    String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
	    
	    //complete the code
	    try {
	        System.out.println(categories[choice]);
	    } catch(Exception e) {
	        System.out.println("Wrong Option");
	    }
	}
}

// chapter 2 Finished.