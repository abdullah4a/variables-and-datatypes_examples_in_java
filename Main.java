import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Datatype problems
 */
public class Main {
    public static void main(String[] args) {
        int int_var;/*Declaring Variable*/
//        System.out.println("int_var = " + int_var); /*this line will give Error as variable was not initialized*/
        int_var = 15; /*Initialization of variable*/
        System.out.println("Initialization int_var = " + int_var);
//        Declare a Variable of general type
        var temp = 94;
        /*1.    Write a Java program to convert temperature from Fahrenheit to Celsius degree.*/
        System.out.println("Temperature is " + temp + " F, Now Converted temperature is : " + temperatureConverter(temp));

        /*2.    Write a Java program that takes a number in inches, converts it to meters.*/
        System.out.println("we have " + temp + " inches, Now Converted the into meters : " + inchToMeterConverter(temp));

        /*3.    Write a Java program that gives back maximum and minimum value of integer.*/
        System.out.println(intMaxMinRange());

        /*4.    Non-Primitive datatype Class Based*/
        Employee empOne = new Employee("Abdullah");
        empOne.setSalary(30000);
        empOne.printEmp();

        /*5. Non-Primitive datatype String Based*/
        DefaultToString defaultToString = new DefaultToString();
        System.out.println(defaultToString);

        /*6.    Write a Java program that gives back maximum and minimum value of integer.*/
        arrayExample();
        /*8.    Java overflow and underflow example*/
        overUnderFlowExample();
        /*9.    Example 1: Display uppercase alphabet using for loop*/
        charExample();
        /*10.   Calculate the sum of natural nums based on user choice*/
        sumExample(A.m);
        /*11.   program to check Given input is character or not*/
        System.out.println(charOrNot('4') ? "Is Character" : "Not a Character");
        /*12.   Java program to print the characters using ascii code*/
        char letter1 = '9';
        System.out.println(letter1);  // prints 9
        char letter2 = 65;
        System.out.println(letter2);  // prints A
        /*13.   print a character using utf-16, which starts for \u0000 to \uffff */
        char letter = '\u0039';
        System.out.println(letter);/* will going to print 9*/
        /*14.   Java Program to take user Input*/
        takeUserInput();
    }

    /*1.    Write a Java program to convert temperature from Fahrenheit to Celsius degree.*/
    private static double temperatureConverter(double input) {
        return ((5 * (input - 32.0)) / 9.0);
    }

    /*2.    Write a Java program that takes a number in inches, converts it to meters.*/
    private static double inchToMeterConverter(int inches) {
        return (inches * 0.0254);
    }

    /*3.    Write a Java program that gives back maximum and minimum value of integer.*/
    private static String intMaxMinRange() {
        return "Maximum Value of integer is: " + Integer.MAX_VALUE + "\nMinimum Value of Integer is: " + Integer.MIN_VALUE;
    }

    /*6.    Write a Java program that gives back maximum and minimum value of integer.*/
    private static void arrayExample() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Abdullah ");
        arrayList.add("Iqbal");
        arrayList.forEach(System.out::print);
    }

    /*8.    Java overflow and underflow example*/
    private static void overUnderFlowExample() {
        int overflowExample = 2147483647;
        System.out.println("Overflow: " + (overflowExample + 1));

        //roll over effect to upper limit in underflow
        int underflowExample = -2147483648;
        System.out.println("Underflow: " + (underflowExample - 1));
    }

    /*9.    Example 1: Display uppercase alphabet using for loop*/
    private static void charExample() {
        char varChar;
        for (varChar = 'A'; varChar <= 'Z'; ++varChar) {
            System.out.print(varChar + " ");
        }
    }

    /*10.   Calculate the sum of natural nums based on user choice*/
    private static void sumExample(int choice) {
        int sum = 0;
        for (int loopVar = 1; loopVar <= choice; ++loopVar) {
            sum += loopVar;
        }
        System.out.println("\nSum = " + sum);
    }

    /*11.   program to check Given input is character or not*/
    private static boolean charOrNot(char input) {
        return Character.isAlphabetic(input);
    }

    /*14.   Java Program to take user Input*/

    private static void takeUserInput() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            System.out.println("You entered " + number);
            input.close();
        } catch (InputMismatchException es) {
            throw new RuntimeException("Invalid Input", es);
        }
    }
}

/**
 * 7.    Example to understand the types of variables in java
 */
class A {
    static int m = 100;//static variable

    void method() {
        int n = 90;//local variable
    }

    public static void main(String[] args) {
        int data = 50;//instance variable
    }
}

/**
 * 4.   Non-Primitive datatype Class Based
 */
class Employee {
    public String name;
    private double salary;

    public Employee(String empName) {
        name = empName;
    }

    public void setSalary(double empSal) {
        salary = empSal;
    }

    public void printEmp() {
        System.out.println("name  : " + name);
        System.out.println("salary :" + salary);
    }
}

/**
 * 5.   Non-Primitive datatype String Based
 */

class DefaultToString {
    @Override
    public String toString() {
        return "This Class is Non-Primitive Datatype: String Based";
    }
}
/**
 * 15.   Java Program to take user Input and convert it into different types
 */
class NewInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Boolean ");

        // reads the big integer
        boolean value1 = input.nextBoolean();
        System.out.println("Using nextBoolean(): " + value1);

        System.out.print("Enter a big decimal: ");

        // reads the big decimal
        BigDecimal value2 = input.nextBigDecimal();
        System.out.println("Using nextBigDecimal(): " + value2);
        System.out.print("Enter Byte: ");
        byte byteVal = input.nextByte();
        System.out.println("Using nextByte(): " + byteVal);
        /*Object Declaration*/
        Object newString="Here is Object type String Let's see it";
        System.out.println(newString);
    }
}
