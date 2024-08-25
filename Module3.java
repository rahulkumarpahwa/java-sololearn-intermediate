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

// chapter 6:

// PRACTICE EXERCISE
// Threads

// We are writing a registration program for our app. At first it should welcome the users, then ask the users to enter their names.

// But program you are given executes this sequence in reverse order.

// Complete the program by extending the Thread class for Welcome and Name classes, then setting priorities for their run methods so that the program outputs the messages in the correct order.

// Use setPriority(number) method on the objects - obj.setPriority(number). The higher the number, the higher the priority.

class Main {
    public static void main(String[ ] args) {
        Name name = new Name();
        //set priority
        
        
        Welcome welcome = new Welcome();
        //set priority
        
        
        name.start();
        welcome.start();
    }
}

//extend the Thread class
class Welcome{
    public void run() {
        System.out.println("Welcome!");
    }
}

//extend the Thread class
class Name{
    public void run() {
        System.out.println("Please enter your name");
    }
}

//my solution :

class Main {
    public static void main(String[ ] args) {
        Name name = new Name();
        name.setPriority(5);
        
        
        Welcome welcome = new Welcome();
         welcome.setPriority(9);
        
        
        name.start();
        welcome.start();
    }
}

//extend the Thread class
class Welcome extends Thread{
    public void run() {
        System.out.println("Welcome!");
    }
}

//extend the Thread class
class Name extends Thread{
    public void run() {
        System.out.println("Please enter your name");
    }
}

// chapter 6 Finished.

// chapter 7:

// Types of Exceptions

// There are two exception types, checked and unchecked (also called runtime). The main difference is that checked exceptions are checked when compiled, while unchecked exceptions are checked at runtime.

// As mentioned in our previous lesson, Thread.sleep() throws an InterruptedException. This is an example of a checked exception. Your code will not compile until you've handled the exception.

import java.io.File;

import javax.imageio.ImageIO;

String imagePath = "./image6.jpg";
BufferedImage myPicture = ImageIO.read(new File(imagePath));


public class MyClass {
  public static void main(String[ ] args) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      //some code
    }
  }
}

// We have seen examples of unchecked exceptions, which are checked at runtime, in previous lessons.

// Example (when attempting to divide by 0):

public class MyClass {
    public static void main(String[ ] args) {
        int value = 7;
        value = value / 0;
    }
}

// OUTPUT

// Exception in thread "main" java.lang.ArithmeticException: / by zero 	at MyClass.main(MyClass.java:5)

// It is good to know the Types of Exceptions because they can help you debug your code faster.

// chapter 7 Finished.

// chapter 8:
// ArrayList

// The Java API provides special classes to store and manipulate groups of objects.

// One such class is the ArrayList. Standard Java arrays are of a fixed length, which means that after they are created, they cannot expand or shrink.

// On the other hand, ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.

// When objects are removed, the ArrayList may shrink in size. Note that the ArrayList class is in the java.util package, so it's necessary to import it before using it.

// Create an ArrayList as you would any object.

import java.util.ArrayList;
//...
ArrayList colors = new ArrayList();

// You can optionally specify a capacity and type of objects the ArrayList will hold:

ArrayList<String> colors = new ArrayList<String>(10);

// The code above defines an ArrayList of Strings with 10 as its initial size.
// ArrayLists store objects. Thus, the type specified must be a class type. You cannot pass, for example, int as the objects' type. Instead, use the special class types that correspond to the desired value type, such as Integer for int, Double for double, and so on.

// ArrayList

// The ArrayList class provides a number of useful methods for manipulating its objects.

// The <b>add()</b> method adds new objects to the ArrayList. Conversely, the remove() method removes objects from the ArrayList.

// Example:

import java.util.ArrayList;

public class MyClass {
    public static void main(String[ ] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");
        
        System.out.println(colors);
    }
}

// Other useful methods include the following:

// - <b>contains()</b>: Returns true if the list contains the specified element

// - <b>get(int index)</b>: Returns the element at the specified position in the list

// - <b>size()</b>: Returns the number of elements in the list

// - <b>clear()</b>: Removes all of the elements from the list

// Note: As with arrays, the indexing starts with 0.

// chapter 8 Finished.

// chapter 9: 
// PRACTICE EXERCISE
// ArrayList

// The program you are given declares an even nums ArrayList.

// Write a program to take numbers as input and add them an ArrayList while the size of the ArrayList isn't equal to 3.

// Then calculate and output the average of all values in integers.

// Sample Input

// 5

// 2

// 4

// Sample Output

// 3

// Use <b>evennums.size()</b> in while loop condition.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> evennums = new ArrayList<Integer>();
        
        while(evennums.size()<3){
            int num = scanner.nextInt();
            //your code goes here
            
        }
        
        //calculate and output the average integer value
        
    }
}

// my solution :

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> evennums = new ArrayList<Integer>();
        
        while(evennums.size()<3){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            evennums.add(num1);
            evennums.add(num2);
            evennums.add(num3);
        }
        
        int avg = (evennums.get(0) + evennums.get(1) + evennums.get(2))/3;
        System.out.println(avg);

        
    }
}

// chapter 9 Finished.

// chapter 10:

// LinkedList

// The LinkedList is very similar in syntax to the ArrayList.

// You can easily change an ArrayList to a LinkedList by changing the object type.

import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        System.out.println(c);
    }
}

//Note :  You cannot specify an initial capacity for the LinkedList.

// LinkedList vs. ArrayList

// The most notable difference between the LinkedList and the ArrayList is in the way they store objects.

// The ArrayList is better for storing and accessing data, as it is very similar to a normal array.

// The LinkedList is better for manipulating data, such as making numerous inserts and deletes.

// In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it. It's called a LinkedList because each element contains a link to the neighboring element.

// image 7 check:
import java.io.File;

import javax.imageio.ImageIO;

String imagePath = "./image7.jpg";
BufferedImage myPicture = ImageIO.read(new File(imagePath));


// You can use the enhanced for-loop to iterate over its elements.

import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        
        for(String s: c) {
            System.out.println(s);
        }
    }
}

//output: 
// Red
// Blue
// Orange 

// Summary:

// - Use an ArrayList when you need rapid access to your data.

// - Use a LinkedList when you need to make a large number of inserts and/or deletes.

// chapter 10 Finished.

// chapter 11:

// PRACTICE EXERCISE
// LinkedLists

// The program you are given declares LinkedList "words".

// Write a program to take words as input and add them to LinkedList untill its size isn't equal to 5, then output only those words whose length is more than 4 characters.

// Sample Input

// Java

// practice

// is

// makes

// perfect

// Sample Output

// practice

// makes

// perfect

// length() method returns the number of characters in a string.

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        
        LinkedList<String> words = new LinkedList<String>();
        
        
        while(words.size()<5){
            String word = scanner.nextLine();
            //add the word to LinkedList
            
        }
        
        //your code goes here
        
    }
}

// my solution :

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        
        LinkedList<String> words = new LinkedList<String>();
        
        
        while(words.size()<5){
            String word1 = scanner.nextLine();
            String word2 = scanner.nextLine();
            String word3 = scanner.nextLine();
            String word4 = scanner.nextLine();
            String word5 = scanner.nextLine();
            
            words.add(word1);
            words.add(word2);
            words.add(word3);
            words.add(word4);
            words.add(word5);
        }
        
        for(String str : words){
            if(str.length() > 4){
                System.out.println(str);
            }
        }
        
    }
}

// chapter 11 finished.

// chapter 12:

// HashMap

// Arrays and Lists store elements as ordered collections, with each element given an integer index.

// HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value). 

// The put, remove, and get methods are used to add, delete, and access values in the HashMap.

// Example:

import java.util.HashMap;

public class MyClass {
    public static void main(String[ ] args) {
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        System.out.println(points.get("Dave")); 
    }
}

//output :
//42

// We have created a HashMap with Strings as its keys and Integers as its values.
// Use the get method and the corresponding key to access the HashMap elements.

// HashMap

// A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.

// The HashMap class provides <b>containsKey </b>and <b>containsValue </b>methods that determine the presence of a specified key or value.

// If you try to get a value that is not present in your map, it returns the value of null.

// null is a special type that represents the absence of a value.

// chapter 12 Finished.

// chapter 13:

// PRACTICE EXERCISE
// HashMap

// The program you are given defines and outputs HashMap, where the names of employees are stored as keys, and their ages as values.

// It also takes N number from user as age limit. Write code to delete all the employees whom age is less than N number.

// The line of code for the output of HashMap object is already provided.

// Sample Input

// 25

// Sample Output

// {Robert=32, John=28}

// Hint

// Use get() method to access values in the HashMap and remove() to delete them.

// nameArr is an array of given HashMap keys and created for iteration.

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);
        
        
        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);
        
        int ageLimit = scanner.nextInt();
        
        for (String emp : nameArr){
            //your code goes here
            
        }
        
        System.out.println(ages);
    }
}

//my solution :
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);
        
        
        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);
        
        int ageLimit = scanner.nextInt();
        
        for (String emp : nameArr){
            if( ages.get(emp) < ageLimit ){
                ages.remove(emp);
            }
            
        }
        
        System.out.println(ages);
    }
}


// chapter 13 Finished.

// chapter 14:

// Sets

// A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction. (means when we say a data structure "models the mathematical set abstraction," it means it's designed to work with collections of unique items, just like a mathematical set.)

// One of the implementations of the Set is the HashSet class.

// Example:

import java.util.HashSet;

public class MyClass {
    public static void main(String[ ] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
    }
}

// You can use the <b>size()</b> method to get the number of elements in the HashSet.

// LinkedHashSet

// The HashSet class does not automatically retain the order of the elements as they're added. To order the elements, use a LinkedHashSet, which maintains a linked list of the set's elements in the order in which they were inserted.

// What is hashing?

// A hash table stores information through a mechanism called hashing, in which a key's informational content is used to determine a unique value called a hash code.

// So, basically, each element in the HashSet is associated with its unique hash code.

// You've learned about the various collection types that are available in Java, including Lists, Maps, and Sets. The choice of which one to use is specific to the data you need to store and manipulate.


// chapter 14 Finished.