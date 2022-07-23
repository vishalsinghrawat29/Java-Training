//Main.main(..)
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Rahul";
        // e1.company -- not allowed
        Employee e2 = new Employee();
        e2.name = "Sam";

        // Employee.company = "Oracle"; --> not allowed because final make it constant
        System.out.println(Employee.company);

        Employee.count =20;
        System.out.println(Employee.count);


        Employee.myFirstStaticMethod();



    }
}
class Employee{
    public String name;    //It will vary for each employee object
    public static final String company ="Internshala";   //It belongs to class not to object
    public static int count = 0;    //class variable

    public static void myFirstStaticMethod(){ //class method
        System.out.println("My First static method");
        System.out.println(count);
        // System.out.println(name); //error -- non static variable
        // test(); // not allowed
        test1(); //allowed
    }
    public void test(){
        //..your code..
    }
    public static void test1(){

    }

}
/*
1. static variables
    * Use ClassName.variableName to access the variables
        DO NOT use objects to access static variables
    * It belongs to the Class not the object. So they are called CLASS VARIABLES

2. static methods
    * Use ClassName.methodName() to invoke the static method
        DO NOT use objects to call a static method
    * It belongs to the Class not the object. So they are called CLASS METHODS
    * static method can only access static class variables.
    * static method can only invoke a static class methods.
 */