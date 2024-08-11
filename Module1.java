//Module1:
//Chapter1:

//Object-Orientation
//Java uses Object-Oriented Programming (OOP), a programming style that is intended to make thinking about programming closer to thinking about the real world.

//In OOP, each object is an independent unit with a unique identity, just as objects in the real world are.
//An apple is an object; so is a mug. Each has its unique identity. It's possible to have two mugs that look identical, but they are still separate, unique objects.

//Objects also have characteristics, which are used to describe them.
//For example, a car can be red or blue, a mug can be full or empty, and so on. These characteristics are also called attributes. An attribute describes the current state of an object.
//In the real world, each object behaves in its own way. The car moves, the phone rings, and so on.
//The same applies to objects: behavior is specific to the object's type.

//In summary, in object oriented programming, each object has three dimensions: identity, attributes, and behavior.
//Attributes describe the object's current state, and what the object is capable of doing is demonstrated through the object's behavior.

// Classes

// A class describes what the object will be, but is separate from the object itself.

// In other words, classes can be described as blueprints, descriptions, or definitions for an object. You can use the same class as a blueprint for creating multiple objects. The first step is to define the class, which then becomes a blueprint for object creation.

// Each class has a name, and each is used to define attributes and behavior.

// Some examples of attributes and behavior:

import java.io.File;

import javax.imageio.ImageIO;

String imagePath = "./image1.jpg";
BufferedImage myPicture = ImageIO.read(new File(imagePath));

//In other words, an object is an instance of a class.

// chapter 1 Finished.

//chapter 2:
// Creating Classes

// In order to create your own custom objects, you must first create the corresponding classes. This is accomplished by right clicking on the src folder in Eclipse and selecting Create->New->Class. Give your class a name and click Finish to add the new class to your project:

String imagePath2 = "./image2.jpg";
BufferedImage myPicture = ImageIO.read(new File(imagePath2));

//As you can see, Eclipse has already added the initial code for the class. Now let's create a simple method in our new class in Animal.java

public class Animal {
  void bark() {
    System.out.println("Woof-Woof");
  }
}

//We declared a bark() method in our Animal class. Now, in order to use the class and it's methods, we need to declare an object of that class.

//Creating Objects

// Let's head over to our main and create a new object of our class.
// MyClass.java

public class Animal {
    void bark() {
        System.out.println("Woof-Woof");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Animal dog = new Animal();
        dog.bark();
    }
}

// Now, dog is an object of type Animal. Thus we can call its bark() method, using the name of the object and a dot.
// The dot notation is used to access the object's attributes and methods.
//You have just created your first object!

// chapter 2 Finished.

//chapter 3:
// PRACTICE EXERCISE
// Creating Classes & Objects
// Create a program to show loading message to your application users.
// Define a class Loading which has one public method called LoadingMessage(), which should print "Loading" when called.
// Create an object named loading and call that method.

//Don't forget to use new keyword while creating an object.

public class Main {
   public static void main(String[] args) {
       
       //create a Loading object with the same name
       
       
       loading.LoadingMessage();
   }
}

class Loading {
     //complete the class, add LoadingMessage() method
     
}

// my Solution:

public class Main {
   public static void main(String[] args) {
       Loading loading = new Loading();
       loading.LoadingMessage();
   }
}

class Loading {
    void LoadingMessage(){
        System.out.println("Loading");
    }
}

// chapter 3 Finished.

//chapter 4:
//Defining Attributes
// A class has attributes and methods. The attributes are basically variables within a class.
// Let's create a class called Vehicle, with its corresponding attributes and methods.

public class Vehicle {
  int maxSpeed;
  int wheels;
  String color;
  double fuelCapacity;  

  void horn() {
    System.out.println("Beep!");
  }  
}
//maxSpeed, wheels, color, and fuelCapacity are the attributes of our Vehicle class, and horn() is the only method.You can define as many attributes and methods as necessary.

// Creating Objects

// Next, we can create multiple objects of our Vehicle class, and use the dot syntax to access their attributes and methods.

public class Vehicle {
    int maxSpeed;
    int wheels;
    String color;
    double fuelCapacity;  
    
    void horn() {
        System.out.println("Beep!");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.color = "red";
        v2.horn();
    }
}

// Run the code and see how it works!

// chapter 4 Finished.

// chapter 5:
// PRACTICE EXERCISE
// Class Attributes

// You are the administrator of a hotel and must create customer information cards for your new customers. On the card, you must note the customer’s first and last name, age, and room number. 
// The program you are given takes a guest's data (first name, last name, age, and room number) as input.
// Complete the class by adding corresponding attributes so that the saveCustomerInfo() method works correctly. Also assign taken data values to attributes of created object.

// Sample Input
// John
// Smith
// 35
// 204
// Sample Output
// First name: John
// Second name: Smith
// Age: 35
// Room number: 204

// Be attentive to set correct data types for attributes.

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       Customer customer = new Customer();
       //set customer's data to object here
      
      
       customer.saveCustomerInfo();
   }
}

class Customer {
   //add all necessary attributes here
   
  
   public void saveCustomerInfo() {
       System.out.println("First name: " + firstName);
       System.out.println("Second name: " + secondName);
       System.out.println("Age: " + age);
       System.out.println("Room number: " + roomNumber);
   }
}

//my solution:
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       Customer customer = new Customer();
       customer.firstName = firstName;
       customer.secondName = secondName;
       customer.age = age;
       customer.roomNumber = roomNumber;
       customer.saveCustomerInfo();
   }
}

class Customer {
   String firstName;
   String secondName;
   int age;
   int roomNumber;  
   public void saveCustomerInfo() {
       System.out.println("First name: " + firstName);
       System.out.println("Second name: " + secondName);
       System.out.println("Age: " + age);
       System.out.println("Room number: " + roomNumber);
   }
}

// chapter 5 Finished.

// chapter 6:
// Access Modifiers

// Now let's discuss the public keyword in front of the main method.
public static void main(String[ ] args)

// public is an access modifier, meaning that it is used to set the level of access. You can use access modifiers for classes, attributes, and methods.
// For classes, the available modifiers are public or default (left blank), as described below:
// public: The class is accessible by any other class.
// default: The class is accessible only by classes in the same package.
// The following choices are available for attributes and methods:
// default: A variable or method declared with no access control modifier is available to any other class in the same package.
// public: Accessible from any other class.
// protected: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass (Subclasses and superclasses are covered in upcoming lessons).
// private: Accessible only within the declared class itself.

// Example:

public class Vehicle {
  private int maxSpeed;
  private int wheels;
  private String color;
  private double fuelCapacity;

  public void horn() {
    System.out.println("Beep!");
  }
}

// It's a best practice to keep the variables within a class private. The variables are accessible and modified using Getters and Setters. Tap Continue to learn about Getters and Setters.

// chapter 6 Finished.

// chapter 7:
// PRACTICE EXERCISE
// Access Modifiers

// You're a tour manager and you need to have a list of countries along with its capitals.
// You're given a program which creates Country object and you should output the name and the capital, but something goes wrong.

// Task
// Change the access modifiers of the Country class fields in order to perform the required output.
// Use public access modifier to provide access to any other classes.

public class Program
{
	public static void main(String[] args) {
	    Country c = new Country();
	    c.name = "France";
	    c.capital = "Paris";
	    System.out.println("Country:  " + c.name);
	    System.out.println("Capital:  " + c.capital);
}
	
	
}
class Country{
    //change the code below
    private String name;
    protected String capital;
}

// my solution:

public class Program
{
	public static void main(String[] args) {
	    Country c = new Country();
	    c.name = "France";
	    c.capital = "Paris";
	    System.out.println("Country:  " + c.name);
	    System.out.println("Capital:  " + c.capital);
}
	
	
}
class Country{
    //change the code below
    public String name;
    public String capital;
}

//chapter 7 Finished.

// chapter 8:

// Getters & Setters

// Getters and Setters are used to effectively protect your data, particularly when creating classes. For each variable, the get method returns its value, while the set method sets the value.

// Getters start with get, followed by the variable name, with the first letter of the variable name capitalized.

// Setters start with set, followed by the variable name, with the first letter of the variable name capitalized.

// Example:
public class Vehicle {
  private String color;

  // Getter
  public String getColor() {
    return color;
  }

 // Setter
  public void setColor(String c) {
    this.color = c;
  }
}
// The getter method returns the value of the attribute.
// The setter method takes a parameter and assigns it to the attribute.
// The keyword this is used to refer to the current object. Basically, this.color is the color attribute of the current object.

// Once our getter and setter have been defined, we can use it in our main:
public class Vehicle {
    private String color;
    
    // Getter
    public String getColor() {
        return color; // same if we return this.color;
    }
    
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
}

class Program {
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        v1.setColor("Red");
        System.out.println(v1.getColor());
    }
}

// Getters and setters allow us to have control over the values. You may, for example, validate the given value in the setter before actually setting the value.
// Getters and setters are fundamental building blocks for encapsulation, which will be covered in the next module.
// Getters and setters are fundamental building blocks for encapsulation, which will be covered in the next module.

// chapter 8 Finished.

// chapter 9:

// PRACTICE EXERCISE
// Getters and Setters

// The program you are given receives name and age of student as input.

// Complete the program to set the values for the corresponding attributes of the Student class and prints out the final result. If the age is <0, program should output "Invalid age" and assign a 0 value to the age attribute.

// Sample Input

// Olivia
// -2

// Sample Output
// Invalid age
// Name: Olivia
// Age: 0

// Explanation

// -2 is invalid value for age attribute, that's why "Invalid age" and "Age: 0" is printed. Setter and Getter should handle this.

// You need to handle the conditions inside the Getter and the Setter.

import java.util.Scanner;

class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String name = read.nextLine();
       int age = read.nextInt();
       Student student = new Student();
       student.name = name;
       
       //set the age via Setter
       
       
       System.out.println("Name: " + student.name);
       System.out.println("Age: " + student.getAge());
   }
}

class Student {

   public String name;
   private int age;
   
   public int getAge() {
       //complete Getter
       
   }
   public void setAge(int age) {
       //complete Setter
       
   }
}

// my solution:
import java.util.Scanner;

class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String name = read.nextLine();
       int age = read.nextInt();
       Student student = new Student();
       student.name = name;
       student.setAge(age);     
       System.out.println("Name: " + student.name);
       System.out.println("Age: " + student.getAge());
   }
}

class Student {

   public String name;
   private int age;
   
   public int getAge() {
       return this.age;
       
   }
   public void setAge(int age) {
       if(age < 0 ){
           this.age = 0;
           System.out.println("Invalid age");
       } else  {
           this.age = age;
       }
       
   }
}

// chapter 9 Finished.

// chapter 10:
// Constructors

// Constructors are special methods invoked when an object is created and are used to initialize them. 

// A constructor can be used to provide initial values for object attributes.

// - A constructor name must be same as its class name.

// - A constructor must have no explicit return type.

// Example of a constructor:

public class Vehicle {
  private String color;
  Vehicle() {
     color = "Red";
  }
}

// The Vehicle() method is the constructor of our class, so whenever an object of that class is created, the color attribute will be set to "Red".

// A constructor can also take parameters to initialize attributes.
public class Vehicle {
  private String color;
  Vehicle(String c) {
    color = c;
  }
}
// You can think of constructors as methods that will set up your class by default, so you don’t need to repeat the same code every time.

// Using Constructors

// The constructor is called when you create an object using the new keyword.

// Example:

public class MyClass {
  public static void main(String[ ] args) {
    Vehicle v = new Vehicle("Blue");
  }
}

// This will call the constructor, which will set the color attribute to "Blue".

//Constructors

// A single class can have multiple constructors with different numbers of parameters.

// The setter methods inside the constructors can be used to set the attribute values.

// Example:

public class Vehicle {
  private String color;

  Vehicle() {
    this.setColor("Red");
  }
  Vehicle(String c) {
    this.setColor(c);
  }

  // Setter
  public void setColor(String c) {
    this.color = c;
  }
}
// The class above has two constructors, one without any parameters setting the color attribute to a default value of "Red", and another constructor that accepts a parameter and assigns it to the attribute.

// Now, we can use the constructors to create objects of our class.
public class Vehicle {
    private String color;
    
    Vehicle() {
        this.setColor("Red");
    }
    Vehicle(String c) {
        this.setColor(c);
    }
    
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
    
    // Getter
    public String getColor() {
        return color;
    }
}

public class Program {
    public static void main(String[] args) {        
        //color will be "Red"
        Vehicle v1 = new Vehicle();
        
        //color will be "Green"
        Vehicle v2 = new Vehicle("Green"); 
        
        System.out.println(v2.getColor());
    }
}

// Java automatically provides a default constructor, so all classes have a constructor, whether one is specifically defined or not.

// chapter 10 Finished.

// chapter 11 :
// PRACTICE EXERCISE
// Constructors

// Your friend is a cashier at a movie theater. He knows that you are an awesome java developer so he asked you to help him out and create a program that gets movie title, row, and seat information and prints out a new ticket.
// Complete the existing code by adding a constructor to Ticket class so that it can be correctly initialized.

// Sample Input
// Jaws
// 5
// 1

// Sample Output
// Movie: Jaws
// Row: 5
// Seat: 1
// You can figure out the constructor parameters by looking at the types of data that is being inputted.

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String movie = read.nextLine();
       int row = read.nextInt();
       int seat = read.nextInt();
       Ticket ticket = new Ticket(movie, row, seat);
       System.out.println("Movie: " + ticket.getMovie());
       System.out.println("Row: " + ticket.getRow());
       System.out.println("Seat: " + ticket.getSeat());
   }
}

class Ticket {
   private String movie;
   private int row;
   private int seat;

   //complete the constructor
   public Ticket() {
       
   }

   public String getMovie() {
       return movie;
   }

   public int getRow() {
       return row;
   }

   public int getSeat() {
       return seat;
   }
}

// My Solution:

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String movie = read.nextLine();
       int row = read.nextInt();
       int seat = read.nextInt();
       Ticket ticket = new Ticket(movie, row, seat);
       System.out.println("Movie: " + ticket.getMovie());
       System.out.println("Row: " + ticket.getRow());
       System.out.println("Seat: " + ticket.getSeat());
   }
}

class Ticket {
   private String movie;
   private int row;
   private int seat;

   public Ticket(String movie, int row, int seat) {
       this.movie = movie;
       this.row = row;
       this.seat = seat;
       
   }

   public String getMovie() {
       return movie;
   }

   public int getRow() {
       return row;
   }

   public int getSeat() {
       return seat;
   }
}

// chapter 11 Finished.

// chapter 12:
// Value Types

// Value types are the basic types, and include byte, short, int, long, float, double, boolean, and char.

// These data types store the values assigned to them in the corresponding memory locations.

// So, when you pass them to a method, you basically operate on the variable's value, rather than on the variable itself.

// Example:
public class MyClass {
        public static void main(String[ ] args) {
            int x = 5;
            addOneTo(x);
            System.out.println(x);       
        }

        static void addOneTo(int num) {
            num = num + 1;
        }
}

// output: 5 (still it is 5)
// The method from the example above takes the value of its parameter, which is why the original variable is not affected and 5 remains as its value.


// Reference Types

// A reference type stores a reference (or address) to the memory location where the corresponding data is stored.
// When you create an object using the constructor, you create a reference variable.
// For example, consider having a Person class defined:

public class MyClass {
    public static void main(String[ ] args) {
        Person j; //initialisation
        j = new Person("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
  }
    
    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
}

public class Person {
    private String name;
    private int age;
    
    Person (String n) {
        this.name = n;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int a) {
        this.age = a;
    }
}

// output : 21 (value changes)

// The method celebrateBirthday takes a Person object as its parameter, and increments its attribute.

// Because j is a reference type, the method affects the object itself, and is able to change the actual value of its attribute.

// Arrays and Strings are also reference data types.

// chapter 12 Finished.

//chapter 13:
//The Math Class

// The JDK defines a number of useful classes, one of them being the Math class, which provides predefined methods for mathematical operations.

// You do not need to create an object of the Math class to use it. To access it, just type in Math. and the corresponding method.

// Math.abs() returns the absolute value of its parameter.

public class Program {
    public static void main(String[] args) {
        int a = Math.abs(10); 
        System.out.println(a);
        
        int b = Math.abs(-20);
        System.out.println(b);
    }
}

//Math.ceil() rounds a floating point value up to the nearest integer value. The rounded value is returned as a double.

public class Program {
    public static void main(String[] args) {

        double c = Math.ceil(10.01f);
        System.out.println(c);
    }
}

// Similarly, Math.floor() rounds a floating point value down to the nearest integer value.
public class Program {
    public static void main(String[] args) {

        double c = Math.floor(10.01f);
        System.out.println(c);
    }
}

// Math.max() returns the largest of its parameters.
public class Program {
    public static void main(String[] args) {

        int c = Math.max(10, 20);
        System.out.println(c);
    }
}

// Conversely, Math.min() returns the smallest parameter.

//Math.pow() takes two parameters and returns the first parameter raised to the power of the second parameter.

public class Program {
    public static void main(String[] args) {

        double c = Math.pow(10, 2);
        System.out.println(c);
    }
}

// There are a number of other methods available in the Math class, including: sqrt() for square root, sin() for sine, cos() for cosine, and others.

// chapter 13 Finished.

// chapter 14:
// PRACTICE EXERCISE

// Write a program to take numbers as input a return the first number raised to the power of the second number.
// Sample Input
// 2
// 4
// Sample Output
// 16.0
// i
// Use Math.pow() method.

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int num1 = read.nextInt();
       int num2 = read.nextInt();

       //your code goes here
       
   }
}

// My solution:
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int num1 = read.nextInt();
       int num2 = read.nextInt();
       double power = Math.pow(num1, num2 );
       System.out.println(power);
   }
}

// chapter 14 Finished.

// chapter 15:
// Static

// When you declare a variable or a method as static, it belongs to the class, rather than to a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects.

// Example:

public class Counter {
  public static int COUNT=0;
  Counter() {
    COUNT++;
  }
}

// The COUNT variable will be shared by all objects of that class.

// Now, we can create objects of our Counter class in main, and access the static variable.

public class Counter {
    public static int COUNT=0;
    Counter() {
        COUNT++;
    }
}

public class MyClass {
    public static void main(String[ ] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
    }
}

// The output is 2, because the COUNT variable is static and gets incremented by one each time a new object of the Counter class is created. In the code above, we created 2 objects.

// You can also access the static variable using any object of that class, such as c1.COUNT.

// It’s a common practice to use upper case when naming a static variable, although not mandatory.

// The same concept applies to static methods.

public class Vehicle {
  public static void horn() {
    System.out.println("Beep");
  }
}

// Now, the horn method can be called without creating an object:

public class Vehicle {
    public static void horn() {
        System.out.println("Beep");
    }
}

public class MyClass {
    public static void main(String[ ] args) {
        Vehicle.horn();
    }
}

// Another example of static methods are those of the Math class, which is why you can call them without creating a Math object.

// Also, the main method must always be static.

// Chapter 15 Finished.

// chapter 16:

// final

// Use the final keyword to mark a variable constant, so that it can be assigned only once.

// Example:

class MyClass {
    public static final double PI = 3.14; 
    public static void main(String[ ] args) {
        System.out.println(PI);
    }
}
// PI is now a constant. Any attempt to assign it a value will cause an error.

// Methods and classes can also be marked final. This serves to restrict methods so that they can't be overridden and classes so that they can't be subclassed.

// These concepts will be covered in the next module.

// chapter 16 Finished.