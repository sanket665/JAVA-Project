
/*

  Compiler :
            1.	A Compiler takes the entire program in one go.
            2.	It generates an intermediate machine code.
            3.	It is best suited for production environment.
            4.	Used for C, C++, C#, Scala, Java etc.

  Interpreter :
               1. An interpreter takes a single line of code at a time.
               2. It never produces any intermediate machine code.
               3. It is best suited for a software development environment.
               4. Used for Python, PHP, Ruby etc.              
                
*/ 


import java.util.Scanner;
 
public class Student

{
  String name;
  int roll;
  float marks;
  
  public void accept(){
     Scanner in = new Scanner(System.in);
     System.out.print("Enter student name:");    
     name = in.nextLine();
     System.out.print("Enter roll number:");
     roll = in.nextlnt();
     System.out.print("Enter marks:");
     marks = in.nextFloat();
    
  }
  public void display(){
    System.out.println("Name:" + name);
    System.out.println("Roll number:" + roll);
    System.out.println("Marks:" + marks);
    
  }

  public static void main(String args[]){
    Student obj = new Student();
    obj.accept();
    obj.display();

  }
  
}
