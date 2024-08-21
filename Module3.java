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

// chapter 3: 

// throw

// The <b>throw </b>keyword allows you to manually generate exceptions from your methods. Some of the numerous available exception types include the IndexOutOfBoundsException, IllegalArgumentException, ArithmeticException, and so on.

// For example, we can throw an ArithmeticException in our method when the parameter is 0.

public class Program {

    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42, 0));
    }

}

// The <b>throws </b>statement in the method definition defines the type of Exception(s) the method can throw.

// Next, the <b>throw </b>keyword throws the corresponding exception, along with a custom message.

// If we call the div method with the second parameter equal to 0, it will throw an ArithmeticException with the message "Division by Zero".

// Multiple exceptions can be defined in the throws statement using a comma-separated list.

// Exception Handling

// A single try block can contain multiple catch blocks that handle different exceptions separately.

// Example:

try {
  //some code
} catch (ExceptionType1 e1) {
  //Catch block
} catch (ExceptionType2 e2) {
  //Catch block
} catch (ExceptionType3 e3) {
  //Catch block
} 

// All catch blocks should be ordered from most specific to most general.

// Following the specific exceptions, you can use the Exception type to handle all other exceptions as the last catch.

// chapter 3 Finished.

// chapter 4:

// PRACTICE EXERCISE
// Multiple Exceptions

// You need to write a divider program which will operate with integers,

// The program you are given should take two integers as input and execute the division, but we need to handle two exceptions:

// 1. the divider shouldn't be zero

// 2. both inputs should be integers.

// Complete the program to handle them. For the first exception, the program should output "Error: division by zero", and for the second one, "Error: wrong value type".

// Sample Input

// 1
// b

// Sample Output

// Error: wrong value type

// Use ArithmeticException for first exception and InputMismatchException for the second one.

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    try {
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        /*
	        1. Error: division by zero
	        2. Error: wrong value type
	        */
	        //your code goes here
	    } catch() {
	        
	    } catch(){
	        
	    }
	}
}

// my gemini solution: (next time do it yourself)

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for input with clear instructions
            System.out.println("Enter two integers to be divided (avoid dividing by zero):");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            // Check for division by zero before performing the calculation
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            double result = (double) num1 / num2; // Use double for potentially non-integer results
            System.out.println("The result of the division is: " + result);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter only integers.");
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage()); // Print specific error message
        } finally {
            scanner.close(); // Always close the Scanner resource
        }
    }
}

//my final changes with it:
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            int result = num1 / num2;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Error: wrong value type");
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
        }
    }
}

// chapter 4 Finished.

// chapter 5:

// Threads

// Java is a multi-threaded programming language. This means that our program can make optimal use of available resources by running two or more components concurrently, with each component handling a different task.

// You can subdivide specific operations within a single application into individual threads that all run in parallel.

// The following diagram shows the life-cycle of a thread.

import java.io.File;

import javax.imageio.ImageIO;

String imagePath = "./image5.jpg";
BufferedImage myPicture = ImageIO.read(new File(imagePath));

// There are two ways to create a thread.

// 1. Extend the Thread class

// Inherit from the <b>Thread </b>class, override its run() method, and write the functionality of the thread in the run() method.

// Then you create a new object of your class and call it's <b>start()</b> method to run the thread.

// Example:

class Loader extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Loader obj = new Loader();
        obj.start();
    }
}

// As you can see, our Loader class extends the Thread class and overrides its run() method.

// When we create the obj object and call its start() method, the run() method statements execute on a different thread.

// Every Java thread is prioritized to help the operating system determine the order in which to schedule threads. The priorities range from 1 to 10, with each thread defaulting to priority 5. You can set the thread priority with the <b>setPriority()</b> method.

// Threads

// The other way of creating Threads is implementing the Runnable interface.

// Implement the run() method. Then, create a new Thread object, pass the Runnable class to its constructor, and start the Thread by calling the start() method.

// Example:

class Loader implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Thread t = new Thread(new Loader());
        t.start();
    }
}

// The Thread.sleep() method pauses a Thread for a specified period of time. For example, calling Thread.sleep(1000); pauses the thread for one second. Keep in mind that Thread.sleep() throws an InterruptedException, so be sure to surround it with a try/catch block.

// It may seem that implementing the Runnable interface is a bit more complex than extending from the Thread class. However, implementing the Runnable interface is the preferred way to start a Thread, because it enables you to extend from another class, as well.

// chapter 5 Finished.