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