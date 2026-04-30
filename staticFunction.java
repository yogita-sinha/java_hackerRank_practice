public class staticFunction {

    public static void main(String args[]){


         Student s1 = new Student (11694,"Stuti");
         outer s2 = new outer ();
         outer.display();
         outer.inner s3 = new outer.inner();
         outer.inner.display();
         outer.inner.innerKeinner s4 = new outer.inner.innerKeinner(); 
         outer.inner.innerKeinner.display();  

    }
    
}

class outer {
    static class inner {

        static void display() {
        System.out.println("inside outer class");
    }

        static class innerKeinner {

            static void display() {
            System.out.println("inner ke inner wali function");
    }

        
            
        }
    }
    static void display() {
        System.out.println("inside static function");
    }
}

class Student {
   
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("the id is " + id);
        System.out.println("the name is " + name);
    }
}
