import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Remote remote = new Television; -- interface
        List<String> nameList = new ArrayList();
        nameList.add("Sam");    //0
        nameList.add("Rahul");  //1
        nameList.add("Mohit");  //2
        nameList.add("Tony");   //3
        nameList.add("Sam");    //4

        System.out.println(nameList.get(2));

        //print all values
        for (String name : nameList){
            System.out.println(name);
        }

        nameList.remove(1);  // remove the element "Rahul"
        //print all values
        for (String name : nameList){
            System.out.println(name);
        }

        nameList.add(1, "Petter"); // Add "Petter" at index 1
        //print all values
        for (String name : nameList){
            System.out.println(name);
        }

        nameList.set(1,"Rahul"); // Replace element ar index 1 by "Rahul"
        //print all values
        for (String name : nameList){
            System.out.println(name);
        }

        nameList.remove("Mohit"); // Remove object of "Mohit"
        //print all values
        for (String name : nameList){
            System.out.println(name);
        }
    }
}



/*
    List: Interface
    ArrayList: Class that implements interface List

    class ArrayList implements List (
        ...
    }

    List Properties:
        1. They can store only objects
        2. It cannot store primitive data type i.e. you can't store int, float, char etc.
        3. Elements are present in sequence i.e. they are indexed. Index starts from 8,1,2,3...n
        4. It can contain duplicate elements
 */