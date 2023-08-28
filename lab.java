// import java.util.Scanner;
// public class lab {
//     public static void main(String[] args) {
//         char operator;
//     int num1,num2,result;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the num1");
//     num1=sc.nextInt();
//     System.out.println("enter the num2");
//     num2=sc.nextInt();
//     System.out.println("Choose an operator: +, -, *, or /");
//     operator = sc.next().charAt(0);
//     switch (operator) {

//         // performs addition between numbers
//         case '+':
//           result = num1 + num2;
//           System.out.println(num1 + " + " + num2 + " = " + result);
//           break;
  
//         // performs subtraction between numbers
//         case '-':
//           result = num1 - num2;
//           System.out.println(num1 + " - " + num2 + " = " + result);
//           break;
  
//         // performs multiplication between numbers
//         case '*':
//           result = num1 * num2;
//           System.out.println(num1 + " * " + num2 + " = " + result);
//           break;
  
//         // performs division between numbers
//         case '/':                                                
//           result = num1 / num2;
//           System.out.println(num1 + " / " + num2 + " = " + result);
//           break;
  
//         default:
//           System.out.println("Invalid operator!");
//           break;
//       }
  

//     }
// }
    
    
// }
// public class lab {

//     public static void main(String[] args) {

//         int low = 20, high = 50;

//         while (low < high) {
//             boolean flag = false;

//             for(int i = 2; i <= low/2; ++i) {
//                 // condition for nonprime number
//                 if(low % i == 0) {
//                     flag = true;
//                     break;
//                 }
//             }

//             if (!flag && low != 0 && low != 1)
//                 System.out.print(low + " ");

//             ++low;
//         }
//     }
// }


// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ lab work date:-9-08-2023  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@^@

// 1. find the factorial of a number


// import java.util.Scanner;
// public class lab{
//     public static void main(String[] args) {
//         int i,fact=1,n;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the num");
//         n=sc.nextInt();
//         for(i=1;i<=n;i++)
//         {
//             fact=fact*i;
//         }
//         System.out.println("factorial of number" + fact);
//     }
// }

// 2. programm to check the year is a leap year or not

// import java.util.Scanner;
// class lab{
//     public static void main(String[] args) {
//         int year;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a year");
//         year=sc.nextInt();
//         if(year%400==0)
//         {
//             System.out.println("the year is a leap year"+ year);
//         }
//         else if(year%100==0)
//         {
//             System.out.println("the year is not a leap year");
//         }
//         else if(year%4==0)
//         {
//             System.out.println("the year is a leap year");
//         }
//         else
//         {
//             System.out.println("the year is not a leap year");
//         }
//     }
// }

// 3. programm to reverse a number

// import java.util.Scanner;
// class lab{
//     public static void main(String[] args) {
//         int n,reverse =0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a number to reverse");
//         n=sc.nextInt();
//         int org = n;

       
//         for(int i=0;n>0;i++)
//         {
//              int rem=n%10;
//             reverse=reverse*10+(rem);
//             n=n/10;
//         }
//         System.out.println("the reverse number is"+org+"is"+ reverse);
//     }
// }


// 4. calculate the sum of all natural number in a given range

// import java.util.Scanner;
// class lab{
// public static void main(String[] args) {
//     int start,end,sum=0;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the start and end value");
//     start=sc.nextInt();
//     end=sc.nextInt();
//     for( int i=start;i<end;i++)
//     {
//         sum=sum+i;
//     }
//     System.out.println("sum of the numbers"+ sum);
// }
// }


// 5. calculate the sqrt of a number

// import java.util.Scanner;

// class Lab {
//     public static void main(String[] args) {
//         int a, b, c;
//         double root1, root2;
//         Scanner Sc = new Scanner(System.in);
//         System.out.println("Enter the values of a, b, c:");
//         a = Sc.nextInt();
//         b = Sc.nextInt();
//         c = Sc.nextInt();
//         double determinant = b * b - 4 * a * c;
//         double realPart, imaginaryPart; // Declare the variables here

//         if (determinant > 0) {
//             root1 = (-b + Math.sqrt(determinant)) / (2 * a);
//             root2 = (-b - Math.sqrt(determinant)) / (2 * a);
//             System.out.println("Root 1: " + root1);
//             System.out.println("Root 2: " + root2);
//         } else if (determinant == 0) {
//             double root = -b / (2 * a);
//             System.out.println("Root: " + root);
//         } else {
//             realPart = -b / (2 * a);
//             imaginaryPart = Math.sqrt(-determinant) / (2 * a);
//             System.out.println("Root 1 (real part): " + realPart + " + " + imaginaryPart + "i");
//             System.out.println("Root 2 (real part): " + realPart + " - " + imaginaryPart + "i");
//         }

//         Sc.close(); // Close the Scanner when done to free resources.
//     }
// }

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ lab work date:-15-08-2023  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@^@

//7. matrix multiplication//

// import java.util.Scanner;
// class Lab{
//     public static void main(String[] args) {
//         int a[][]=new int[3][3];
//         int b[][]=new int[3][3];
//         int c[][]=new int[3][3];
//         Scanner Sc=new Scanner(System.in);
//         System.out.println("enter values for matrix a");
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 a[i][j]= Sc.nextInt();
//             }
//         }
//         System.out.println("enter values for matrix b");
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 b[i][j]= Sc.nextInt();
//             }
//         }
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 c[i][j]= 0;
//                 for(int k=0;k<3;k++)
//                 {
//                     c[i][j]+=a[i][k]*b[k][j];
//                 }
//             }
//         }
//         System.out.println("Resulting matrix c:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(c[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//     }
// }

//8. matrix addition

// import java.util.Scanner;
// class Lab{
//     public static void main(String[] args) {
//         int a[][]=new int[3][3];
//         int b[][]=new int[3][3];
//         int c[][]=new int[3][3];
//         Scanner Sc=new Scanner(System.in);
//         System.out.println("enter values for matrix a");
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 a[i][j]= Sc.nextInt();
//             }
//         }
//         System.out.println("enter values for matrix b");
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 b[i][j]= Sc.nextInt();
//             }
//         }
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 c[i][j]= 0;
//                 for(int k=0;k<3;k++)
//                 {
//                     c[i][j]=a[i][j]+b[i][j];
//                 }
//             }
//         }
//         System.out.println("Resulting matrix c:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(c[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//     }
// }

//9. matrix transpose

// import java.util.Scanner;
// class Lab{
//     public static void main(String[] args) {
//         int a[][]=new int[3][3];
//         int b[][]=new int[3][3];
//         int c[][]=new int[3][3];
//         Scanner Sc=new Scanner(System.in);
//         System.out.println("enter values for matrix a");
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 a[i][j]= Sc.nextInt();
//             }
//         }
//         System.out.println("Resulting matrix c:");
//         for (int j = 0; j < 3; j++) {
//             for (int i = 0; i < 3; i++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//     }
// }

//10.matrix substraction       

// import java.util.Scanner;
// class Lab{
//     public static void main(String[] args) {
//         int a[][]=new int[3][3];
//         int b[][]=new int[3][3];
//         int c[][]=new int[3][3];
//         Scanner Sc=new Scanner(System.in);
//         System.out.println("enter values for matrix a");
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 a[i][j]= Sc.nextInt();
//             }
//         }
//         System.out.println("enter values for matrix b");
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 b[i][j]= Sc.nextInt();
//             }
//         }
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 c[i][j]= 0;
//                 for(int k=0;k<3;k++)
//                 {
//                     c[i][j]=a[i][j]-b[i][j];
//                 }
//             }
//         }
//         System.out.println("Resulting matrix c:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(c[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//     }
// }

// 11.write a programm to calculate the standard deviation of 5 values

// import java.util.Scanner;
// class lab{
//     public static void main(String[] args) {
//         int a[]=new int[5];
//         int sum=0;
//         int n=5;
//         Scanner sc=new Scanner (System.in);
//         System.out.println("enter 5 values");
//         for( int i=0;i<5;i++)
//         {
//             sum=sum+a[i];
//             a[i]=sc.nextInt();

//         }
//         int mean=sum/n;
//        double  variance=0.0;
//        for(int i=0;i<n;i++)
//        {
//         variance+=Math.pow(a[i]-mean,2);
//        }
//        variance/=n;
//        System.out.println("Values:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(a[i] + " ");
//         }
//         System.out.println("\nMean: " + mean);
//         System.out.println("Variance: " + variance);
//     }
// }

//12.fibonccai series

// import java.util.Scanner;

// class Lab {
//     public static void main(String[] args) {
//         int i, n, t1 = 0, t2 = 1;
//         int nextTerm;
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of terms:");
//         n = sc.nextInt();
        
//         System.out.print("The Fibonacci series: ");
//         for (i = 1; i <= n; i++) {
//             System.out.print(t1 + " ");
//             nextTerm = t1 + t2;
//             t1 = t2;
//             t2 = nextTerm;
//         }
//         sc.close();
//     }
// }

// ******factorial of a number using recursion******

// import java.util.Scanner;
// public class lab {

//     public static int factorial(int n) {
//         if (n == 0 || n == 1) 
//         {
//             return 1;
//         } 
//         else 
//         {
//             return n * factorial(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         int number; // Change this to the desired number
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         number=sc.nextInt();
        
//         int result = factorial(number);
//         System.out.println("Factorial of " + number + " is " + result);
//     }
// }

////////////////////DefaultConstructor/////////////////////////////////////

// class DefaultConstructor {
//     DefaultConstructor() {
//         System.out.println("This is the default constructor.");
//     }

//     public static void main(String[] args) {
//         DefaultConstructor obj = new DefaultConstructor();
//  }
// }

////////////////////// ParameterizedConstructor/////////////////////////

// class ParameterizedConstructor {
//     String name;

//     ParameterizedConstructor(String n) {
//         name = n;
//         System.out.println("Parameterized constructor called with name: " + name);
//     }

//     public static void main(String[] args) {
//         ParameterizedConstructor obj = new ParameterizedConstructor("John");
//     }
// }

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ConstructorOverloading @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

// class ConstructorOverloading {
//     String name;
//     int age;

//     ConstructorOverloading() {
//         name = "Unknown";
//         age = 0;
//     }

//     ConstructorOverloading(String n) {
//         name = n;
//         age = 0;
//     }

//     ConstructorOverloading(String n, int a) {
//         name = n;
//         age = a;
//     }

//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }

//     public static void main(String[] args) {
//         ConstructorOverloading obj1 = new ConstructorOverloading();
//         ConstructorOverloading obj2 = new ConstructorOverloading("Alice");
//         ConstructorOverloading obj3 = new ConstructorOverloading("Bob", 25);

//         obj1.display();
//         obj2.display();
//         obj3.display();
//     }
// }

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Copy Constructor ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

// class CopyConstructor {
//     String name;

//     CopyConstructor(String n) {
//         name = n;
//     }

//     CopyConstructor(CopyConstructor original) {
//         name = original.name;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//     }

//     public static void main(String[] args) {
//         CopyConstructor obj1 = new CopyConstructor("Original");
//         CopyConstructor obj2 = new CopyConstructor(obj1);

//         obj1.display();
//         obj2.display();
//     }
// }

/////////////////////////// singe inheritance /////////////////////////

// class Employee{  
//  float salary=40000;  
// }  
// class Programmer extends Employee{  
//  int bonus=10000;  
//  public static void main(String args[]){  
//    Programmer p=new Programmer();  
//    System.out.println("Programmer salary is:"+p.salary);  
//    System.out.println("Bonus of Programmer is:"+p.bonus);  
// }  
// }  


//////////////////// mulitilevel inheritance /////////////////////////

// class Shape {
//    public void display() {
//       System.out.println("Inside display");
//    }
// }
// class Rectangle extends Shape {
//    public void area() {
//       System.out.println("Inside area");
//    }
// }
// class Cube extends Rectangle {
//    public void volume() {
//       System.out.println("Inside volume");
//    }
// }
// public class lab {
//    public static void main(String[] arguments) {
//       Cube cube = new Cube();
//       cube.display();
//       cube.area();
//       cube.volume();
//    }
// }s

// ////////////////////////Hirarchical inheritance//////////////////////

// class Animal {
//     public void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Cat extends Animal {
//     public void meow() {
//         System.out.println("Cat is meowing");
//     }
// }

// class Dog extends Animal {
//     public void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         Cat c = new Cat();
//         c.eat(); 
//         c.meow(); 

//         Dog d = new Dog();
//         d.eat(); 
//         d.bark(); 
//     }
// }

// ******************************* interface ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

// interface Drawable {
//     void draw(); // An abstract method without a body
// }

// // Implement the interface in a class named "Circle"
// class Circle implements Drawable {
//     public void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// // Implement the interface in a class named "Rectangle"
// class Rectangle implements Drawable {
//     public void draw() {
//         System.out.println("Drawing a rectangle");
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         Circle circle = new Circle();
//         Rectangle rectangle = new Rectangle();

//         // Polymorphic behavior: Using the interface reference to call the draw() method
//         Drawable drawable1 = circle;
//         Drawable drawable2 = rectangle;

//         drawable1.draw(); // Output: Drawing a circle
//         drawable2.draw(); // Output: Drawing a rectangle
//     }
// }





