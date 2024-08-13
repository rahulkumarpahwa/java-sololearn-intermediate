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