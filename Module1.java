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