import java.util.*;
public class arrayOfObject {
    public static void main(String args[]){

        int a = 34;
        int b[] = new int[5]; //array of primitive data type

        Student s = new Student ("muskan",3);
        Student arr[] = new Student [5]; //pointer , does not create object, it is an array of reference variable 

        b[0] = 34;//displaying array of primitive data type
        b[1] = 45;      
        b[2] = 56;
        b[3] = 67;
        b[4] = 78;
        arr[0] = new Student ("stuti", 3);
        arr[1] = new Student ("tanyya", 3);
        arr[2] = new Student ("sneha", 3);
        arr[3] = new Student ("priya", 3);
        arr[4] = new Student ("ritika", 3);

        for(int val : b){
            System.out.print(val+" ");//displaying array of primitive data type
        }
        System.out.println();

        for(Student stu : arr){
            stu.display();//displaying array of objects
        }

        for(int i=0; i<5; i++){
          //object is in array
          //
          arr[i].display();
        }

    }
}
//step 1: create a class
class Student{
    //properties
    String name;
    int sem;

    //constructor
    Student(String name, int sem){
        this.name=name;
        this.sem=sem;
    }

    void display(){
        System.out.println(name+" "+sem);
    }
}
