// Module 2

// chapter 1:

// Encapsulation

// There are 4 core concepts in OOP: encapsulation, inheritance, polymorphism, and abstraction.

// The idea behind encapsulation is to ensure that implementation details are not visible to users. The variables of one class will be hidden from the other classes, accessible only through the methods of the current class. This is called data hiding.

// To achieve encapsulation in Java, declare the class' variables as private and provide public setter and getter methods to modify and view the variables' values.

// For example:

class BankAccount {
  private double balance=0;
  public void deposit(double x) {
    if(x > 0) {
      balance += x;
    }
  }
}

// This implementation hides the balance variable, enabling access to it only through the deposit method, which validates the amount to be deposited before modifying the variable.

// In summary, encapsulation provides the following benefits:

// - Control of the way data is accessed or modified

// - More flexible and easily changed code

// - Ability to change one part of the code without affecting other parts

// chapter 1 Finished.

// chapter 2:

// PRACTICE EXERCISE

// Encapsulation
// You need a program to manage admissions for an art school. Pupils can be admitted to the school if they are over 6 years of age. You're given a program which declares a Pupil class.
// Task

// Complete the setAge method of the Pupil class. If the value of parameter a is over 6, assign it to age attribute and output "Welcome", Output "Sorry' otherwise.

// Sample Input
// 7
// Sample Output
// Welcome


import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     int a = read.nextInt();
     
     Pupil pupil =  new Pupil();
            pupil.setAge(a);
 }
}

class Pupil{
    private int age;
    
    //complete setter method
    public void  setAge(int a){
       
    }
    
    public int getAge(){
        return age;
    }
}


// my solution:

import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     int a = read.nextInt();
     
     Pupil pupil =  new Pupil();
            pupil.setAge(a);
 }
}

class Pupil{
    private int age;
    public void  setAge(int a){
       if(a>6){
           this.age = a;
           System.out.println("Welcome");
       } else {
           System.out.println("Sorry");
       }
    }
    
    public int getAge(){
        return age;
    }
}


// chapter 2 Finished.

// chapter 3:

// Inheritance

// Inheritance is the process that enables one class to acquire the properties (methods and variables) of another. With inheritance, the information is placed in a more manageable, hierarchical order.

// The class inheriting the properties of another is the subclass (also called derived class, or child class); the class whose properties are inherited is the superclass (base class, or parent class).

// To inherit from a class, use the extends keyword.

// This example shows how to have the class Dog to inherit from the class Animal.


class Dog extends Animal {
 // some code
}

// Here, Dog is the subclass, and Animal is the superclass.

// When one class is inherited from another class, it inherits all of the superclass' non-private variables and methods.

// Example:

 class Animal {
  protected int legs;
  public void eat() {
    System.out.println("Animal eats");
  }
}

class Dog extends Animal {
  Dog() {
    legs = 4;
  }
}

// As you can see, the Dog class inherits the legs variable from the Animal class.

// We can now declare a Dog object and call the eat method of its superclass:

class Animal {
    protected int legs;
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    Dog() {
        legs = 4; // same as this.legs = 4;
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Dog d = new Dog();
        d.eat();
    }
}

// Recall the protected access modifier, which makes the members visible only to the subclasses and class's own methods.

// Inheritance

// Constructors are not member methods, and so are not inherited by subclasses.

// However, the constructor of the superclass is called when the subclass is instantiated.

// Example:

class A {
    public A() {
        System.out.println("New A");
    }
}
class B extends A {
    public B() {
        System.out.println("New B");
    }
}

class Program {
    public static void main(String[ ] args) {
        B obj = new B();
    }
}

// OUTPUT

// New A
// New B

// You can access the superclass from the subclass using the super keyword.
// For example, super.var accesses the var member of the superclass. If we need to change the super.var, we need to access it inside the constructor of the sub class and can't do outside.

// chapter 3 Finished.

// chapter 4:

// PRACTICE EXERCISE
// Inheritance

// You are developing your own photo editing application.

// The standard free version allows you to draw and write text on a photo. The Pro subscription has 2 more features -  the ability to use effects and the ability to change resolution.

// Complete/fix the given code to inherit Pro class from Standard class and successfully execute all the given method calls.

// Be attentive to access modifiers.

//be attentive to access modifiers
class Standard {
   protected void draw() {
       System.out.println("Drawing");
   }

   private void write() {
       System.out.println("Writing");
   }
}
//fix the class
class Pro{

   protected void useEffects() {
       System.out.println("Using Effects");
   }

   protected void changeResolution() {
       System.out.println("Changing Resolution");
   }
}

public class Main {
   public static void main(String[] args) {
       Standard standard1 = new Standard();
       Pro pro1 = new Pro();
       
       //standard version
       standard1.draw();
       standard1.write();
       
       //Pro version
       pro1.draw();
       pro1.write();
       pro1.useEffects();
       pro1.changeResolution();
   }
}


// My Solution :

//be attentive to access modifiers
class Standard {
   protected void draw() {
       System.out.println("Drawing");
   }

   protected void write() {
       System.out.println("Writing");
   }
}

class Pro extends Standard{

   protected void useEffects() {
       System.out.println("Using Effects");
   }

   protected void changeResolution() {
       System.out.println("Changing Resolution");
   }
}

public class Main {
   public static void main(String[] args) {
       Standard standard1 = new Standard();
       Pro pro1 = new Pro();
       
       //standard version
       standard1.draw();
       standard1.write();
       
       //Pro version
       pro1.draw();
       pro1.write();
       pro1.useEffects();
       pro1.changeResolution();
   }
}

// chapter 4 Finished.

// chapter 5: 
// Polymorphism

// Polymorphism, which refers to the idea of "having many forms", occurs when there is a hierarchy of classes related to each other through inheritance.

// A call to a member method will cause a different implementation to be executed, depending on the type of the object invoking the method.

// Here is an example: Dog and Cat are classes that inherit from the Animal class. Each class has its own implementation of the makeSound() method.

class Animal {
  public void makeSound() {
    System.out.println("Grr...");
  }
}
class Cat extends Animal {
  public void makeSound() {
    System.out.println("Meow");
  }
}
class Dog extends Animal {
  public void makeSound() {
    System.out.println("Woof");
  }
}

// As all Cat and Dog objects are Animal objects, we can do the following in main:

public static void main(String[ ] args) {
  Animal a = new Dog();
  Animal b = new Cat();
}

// We've created two reference variables of type Animal, and pointed them to the Cat and Dog objects.

// Now, we can call the makeSound() methods.

class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Program {
    public static void main(String args[ ]) {
        Animal a = new Dog();
        Animal b = new Cat();
        
        a.makeSound();
        b.makeSound();
    }
}


// As the reference variable a contains a Dog object, the makeSound() method of the Dog class will be called.

// The same applies to the b variable.

// This demonstrates that you can use the Animal variable without actually knowing that it contains an object of the subclass.

// This is very useful when you have multiple subclasses of the superclass.

// chapter 5 Finished.

// chapter 6: 
// PRACTICE EXERCISE
// Polymorphism

// Vehicles can be classified according to what energy source powers them. The program you are given has 3 vehicle classes: Vehicle, ElectricVehicle and HybridVehicle.

// ElectricVehicle and HybridVehicle classes are inherited from Vehicle class.

// Complete the program by reimplementing method resource() in inherited classes, so that the given calls work correctly.

// The subclass can implement a parent class method based on its requirement.

class Main {
   public static void main(String[] args) {
       
       Vehicle vehicle = new Vehicle();
       Vehicle electric = new ElVehicle();
       Vehicle hybrid = new HybridVehicle();
       
       //calls
       vehicle.start();
       vehicle.resource();
       electric.start();
       electric.resource();
       hybrid.start();
       hybrid.resource();
   }
}
class Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElVehicle extends Vehicle{
    /*reimplement resource() method 
    to output "I use electricity"*/
    
}

class HybridVehicle extends Vehicle{
    /*reimplement resource() method 
    to output "I use both petrol and electricity"*/
    
}


// my solution :

class Main {
   public static void main(String[] args) {
       
       Vehicle vehicle = new Vehicle();
       Vehicle electric = new ElVehicle();
       Vehicle hybrid = new HybridVehicle();
       
       //calls
       vehicle.start();
       vehicle.resource();
       electric.start();
       electric.resource();
       hybrid.start();
       hybrid.resource();
   }
}
class Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElVehicle extends Vehicle{
    public void resource(){
        System.out.println("I use electricity");
    }
    
}

class HybridVehicle extends Vehicle{
    public void resource(){
        System.out.println("I use both petrol and electricity");
    }    
}

// chapter 6 Finished.

// chapter 7:

// Method Overriding

// As we saw in the previous lesson, a subclass can define a behavior that's specific to the subclass type, meaning that a subclass can implement a parent class method based on its requirement.

// This feature is known as method overriding.

// Example:

class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Program {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}

// In the code above, the Cat class overrides the makeSound() method of its superclass Animal.

// Rules for Method Overriding:

// - Should have the same return type and arguments

// - The access level cannot be more restrictive than the overridden method's access level (Example: If the superclass method is declared public, the overriding method in the sub class can be neither private nor protected)

// - A method declared final or static cannot be overridden

// - If a method cannot be inherited, it cannot be overridden

// - Constructors cannot be overridden

// Method overriding is also known as runtime polymorphism. Example: 
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.sound(); // Outputs: Dog barks
    }
}

// explanation :  In this example, the sound method of the Dog class overrides the sound method of the Animal class. The actual method that gets called is determined at runtime based on the object type (Dog in this case) rather than the reference type (Animal).


// Method Overloading

// When methods have the same name, but different parameters, it is known as method overloading.

// This can be very useful when you need the same method functionality for different types of parameters.

// The following example illustrates a method that returns the maximum of its two parameters.

int max(int a, int b) {
  if(a > b) {
    return a;
  }
  else {
    return b;
  }
}

// The method shown above will only work for parameters of type integer.

// However, we might want to use it for doubles, as well. For that, you need to overload the max method:

class Program {
    static double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {        
        System.out.println(max(8, 17));
        System.out.println(max(3.14, 7.68));
    }

}

// Now, our max method will also work with doubles.

// An overloaded method must have a different argument list; the parameters should differ in their type, number, or both.

// Another name for method overloading is compile-time polymorphism.

// chapter 7 Finished.

// chapter 8:

// PRACTICE EXERCISE
// Overloading

// Complete and overload the doubleTheValue() method to calculate the double the value of the a and b variables.

// Be attentive to value types of parameters while overloading.


public class Main {
    public static void main(String[] args) {
        
        int a = 5;
        double b = 10.2;
        
        System.out.println(doubleTheValue(a));
        System.out.println(doubleTheValue(b));
                
    }
    //complete the method for integer value type
    public static int doubleTheValue() {
        
    }
    //overload the method for double value type
    public static double doubleTheValue() {
        
    }
}


// my solution : 
public class Main {
    public static void main(String[] args) {
        
        int a = 5;
        double b = 10.2;
        
        System.out.println(doubleTheValue(a));
        System.out.println(doubleTheValue(b));
                
    }
    //complete the method for integer value type
    public static int doubleTheValue(int a) {
        return a * 2;
        
    }
    //overload the method for double value type
    public static double doubleTheValue(double a) {
        return a * 2;
    }
}

 // chapter 8 Finished.

 // chapter 9:

 // Abstraction

// Data abstraction provides the outside world with only essential information, in a process of representing essential features without including implementation details.

// A good real-world example is a book. When you hear the term book, you don't know the exact specifics, such as the page count, the color, or the size, but you understand the idea, or abstraction, of a book.

// The concept of abstraction is that we focus on essential qualities, rather than the specific characteristics of one particular example.

// In Java, abstraction is achieved using abstract classes and interfaces.

// An abstract class is defined using the abstract keyword.

// - If a class is declared abstract it cannot be instantiated (you cannot create objects of that type).

// - To use an abstract class, you have to inherit it from another class.

// - Any class that contains an abstract method should be defined as abstract.


// An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon): abstract void walk();

// Abstract Class

// For example, we can define our Animal class as abstract:

abstract class Animal {
  int legs = 0;
  abstract void makeSound();
}

// The makeSound() method is also abstract, as it has no implementation in the superclass.

// We can inherit from the Animal class and define the makeSound() method for the subclass:


abstract class Animal {
    int legs = 0;
    abstract void makeSound();
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Program {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}

// Every Animal makes a sound, but each has a different way to do it. That's why we define an abstract class Animal, and leave the implementation of how they make sounds to the subclasses.

// This is used when there is no meaningful definition for the method in the superclass.

// chapter 9 Finished.

// chapter 10:

// PRACTICE EXERCISE
// Abstract Classes

// A board game company creates new board games every year. While all the games have different rules, they also are all similar in that they each have a name and a play() method.

// We need to create 3 different games - Monopoly, Chess and Battleships. In the play() method Monopoly should print “Buy all property.”, Battleships - “Sink all ships.”, and Chess - “Kill the enemy king.”

// Complete the code by implementing the getName() and play() methods inherited from abstract Game class.
// To give a name to games just return the name string inside the getName() function.

class Main {
   public static void main(String[] args) {
       //do not touch this code
       Monopoly monopoly = new Monopoly();
       Chess chess = new Chess();
       Battleships battleships = new Battleships();
       
       monopoly.play();
       chess.play();
       battleships.play();
   }
}

abstract class Game {
   abstract String getName();
   abstract void play();
}

class Monopoly extends Game {

   //give "Monopoly" name to game
   String getName() {
       
   }

   // play method should print "Buy all property."
   void play() {
       
   }
}

class Chess extends Game {

   //give "Chess" name to game
   String getName() {
       
   }

   // play method should print "Kill the enemy king."
   void play() {
       
   }
}

class Battleships extends Game {

   //give "Battleships" name to game
   String getName() {
       
   }

   // play method should print "Sink all ships."
   void play() {
       
   }
}

// my solution : 
class Main {
   public static void main(String[] args) {
       //do not touch this code
       Monopoly monopoly = new Monopoly();
       Chess chess = new Chess();
       Battleships battleships = new Battleships();
       
       monopoly.play();
       chess.play();
       battleships.play();
   }
}

abstract class Game {
   abstract String getName();
   abstract void play();
}

class Monopoly extends Game {

   //give "Monopoly" name to game
   String getName() {
       return "Monopoly";
   }

   // play method should print "Buy all property."
   void play() {
       System.out.println("Buy all property.");
   }
}

class Chess extends Game {

   //give "Chess" name to game
   String getName() {
      return "Chess";
       
   }

   // play method should print "Kill the enemy king."
   void play() {
        System.out.println("Kill the enemy king.");
   }
}

class Battleships extends Game {

   //give "Battleships" name to game
   String getName() {
       return "Battleships";
   }

   // play method should print "Sink all ships."
   void play() {
       System.out.println("Sink all ships.");
   }
}

// chapter 10 Finished.

// chapter 11:

// Interfaces

// An interface is a completely abstract class that contains only abstract methods.

// Some specifications for interfaces:

// - Defined using the interface keyword.

// - May contain only static final variables.

// - Cannot contain a constructor because interfaces cannot be instantiated.

// - Interfaces can extend other interfaces.

// - A class can implement any number of interfaces.

// An example of a simple interface:

interface Animal {
  public void eat();
  public void makeSound();
}

// Interfaces have the following properties:

// - An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.

// - Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.

// - Methods in an interface are implicitly public.

// A class can inherit from just one superclass, but can implement multiple interfaces!

// Interfaces

// Use the implements keyword to use an interface with your class.

interface Animal {
    public void eat();
    public void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
    public void eat() {
        System.out.println("omnomnom");
    }
}

public class Program {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}


// When you implement an interface, you need to override all of its methods.

// chapter 11 Finished.

// chapter 12:

// PRACTICE EXERCISE
// Interfaces

// You love all animals, and have a dog and a cat as pets.

// The program you are given defines an abstract class Animal, and has Dog & Cat classes inherited from it.

// Implement the Swimmer and Player interface and override their methods swim() and play(), so that the given method calls output the following messages:

// swim():

// Dog => "Dog is swimming"

// Cat => "Cat is swimming"

// play():

// Dog => "Dog is playing"

// Cat => "Cat is playing"

// You can implement multiple interfaces - by writing their names alternately separated by commas.

// Implement the Swimmer and Player interfaces only for Animal class, then override the swim() and play() methods in inherited classes.


class Main {
   public static void main(String[] args) {
       Animal dog = new Dog();
       Animal cat = new Cat();
       
       dog.swim();
       dog.play();
       cat.swim();
       cat.play();

   }
}

interface Swimmer {
   void swim();
}

interface Player {
   void play();
}

//implement the Swimmer and the Player interfaces
abstract class Animal{
}


class Dog extends Animal {
    //Override the swim() and the play() methods
    
   }


class Cat extends Animal {
    //Override the swim() and the play() methods
    
}

// my Solution:

class Main {
   public static void main(String[] args) {
       Animal dog = new Dog();
       Animal cat = new Cat();
       
       dog.swim();
       dog.play();
       cat.swim();
       cat.play();

   }
}

interface Swimmer {
   void swim();
}

interface Player {
   void play();
}

//implement the Swimmer and the Player interfaces
abstract class Animal implements Swimmer, Player {
}


class Dog extends Animal {
    public void swim(){
    System.out.println("Dog is swimming");

    }

    public void play(){
     System.out.println("Dog is playing");  
    }
    
}

class Cat extends Animal {
    //Override the swim() and the play() methods
    public void swim(){
    System.out.println("Cat is swimming");

    }

    public void play(){
     System.out.println("Cat is playing");  
    }
     
   
}

// chapter 12 Finished.

// chapter 13: 

// Type Casting

// Assigning a value of one type to a variable of another type is known as Type Casting.

// To cast a value to a specific type, place the type in parentheses and position it in front of the value.

// Example:

public class Program {
    public static void main(String[] args) {
        double a = 42.571;
        int b = (int) a;
        System.out.println(b);
    }
}

// The code above is casting the value 3.14 to an integer, with 3 as the resulting value.

// Another example:

public class Program {
    public static void main(String[] args) {
        double a = 42.571;
        int b = (int) a;
        System.out.println(b);
    }
}

// Java supports automatic type casting of integers to floating points, since there is no loss of precision.

// On the other hand, type casting is mandatory when assigning floating point values to integer variables.

// chapter 13 Finished.

// chapter 14:

// PRACTICE EXERCISE
// Casting

// Computers understand only numbers, so every character has a numeric representation.

// The program you are given takes a character as input. Write a program to output its numeric value.

// Sample Input

// a

// Sample Output

// 97

// Use cast to assign value of character to an integer.

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       char a = read.next().charAt(0);
       
       //your code goes here
       
    }   
}

//my solution :

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       char a = read.next().charAt(0);
       int b = (int) a;
       System.out.println(b);
       
    }   
}

// chapter 14 Finished.

// chapter 15: 

// Type Casting

// For classes, there are two types of casting.

// Upcasting

// You can cast an instance of a subclass to its superclass.

// Consider the following example, assuming that Cat is a subclass of Animal. 

Animal a = new Cat();

// Java automatically upcasted the Cat type variable to the Animal type.

// Downcasting

// Casting an object of a superclass to its subclass is called downcasting.

// Example:

Animal a = new Cat();
((Cat)a).makeSound();

// This will try to cast the variable a to the Cat type and call its makeSound() method.

// Why is upcasting automatic, downcasting manual? Well, upcasting can never fail. But if you have a group of different Animals and want to downcast them all to a Cat, then there's a chance that some of these Animals are actually Dogs, so the process fails.

// chapter 15 Finished.

// chapter 16:

// Anonymous Classes

// Anonymous classes are a way to extend the existing classes on the fly.

// For example, consider having a class Machine:

class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}

// When creating the Machine object, we can change the start method on the fly.

class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class Program {
    public static void main(String[ ] args) {
        Machine m = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        m.start();
    }
}

// After the constructor call, we have opened the curly braces and have overridden the start method's implementation on the fly.

// The @Override annotation is used to make your code easier to understand, because it makes it more obvious when methods are overridden.

// Anonymous Classes

// The modification is applicable only to the current object, and not the class itself. So if we create another object of that class, the start method's implementation will be the one defined in the class.

class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

class Program {
    public static void main(String[ ] args) {
        Machine m1 = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        Machine m2 = new Machine();
        m2.start();
    }
}

// output :

// Starting...

// chapter 16 Finished.

// chapter 17 
// PRACTICE EXERCISE
// Anonymous Classes

// You are a store manager.

// You are offering a 10% discount on all items in the store. Today, you have had a total of two customers. To the first, you honored the 10% discount on all purchased items. The second customer, however, purchased a lot of items and you want to give him a bigger discount -- 20% -- to show your appreciation.

// Complete the program by creating two Purchase objects - 1 for the regular customer, and 1 for a special one, and override the totalAmount() method for the special customer on the fly to set the proper 20% discount.

// Method calls are already given.

public class Main
{
	public static void main(String[] args) {
        
       Purchase customer = new Purchase();
       Purchase specialCustomer = new Purchase(){
           //your code goes here
           
           }

        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
        
    };    
       
}


class Purchase {
    int price;
    
    public int totalAmount(int price) {
        return price - (price*10)/100;
    }
}

// my solution :

public class Main
{
	public static void main(String[] args) {
        
       Purchase customer = new Purchase();
       Purchase specialCustomer = new Purchase(){
          @Override public int totalAmount(int price) {
        return price - (price*20)/100;
            }
        };

        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
    };   
}

class Purchase {
    int price;
    
    public int totalAmount(int price) {
        return price - (price*10)/100;
    }
}

// chapter 17 Finished.