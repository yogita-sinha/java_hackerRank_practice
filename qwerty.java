public class qwerty {
    public static void main(String args[]){

        //creation , usage , destruction
     //Student si= new Student();
        // 1] memory allocated in heap 
        // constructor called 
        // object initialized
        
        //2] object  usage
        //calling methods/funcn
        // parameterized constructor
        
        //3] object destruction
        //arrow operator -> null -> no value
        // garbage collection -> automatic memory management-> remove unused objects from heap memory -> free memory
        // STUDENT sc = new STUDENT();
        // STUDENT sc2 = sc;
        // System.out.println(sc2);
        //both will point in one box 
 
        Student s1 = new Student();
        s1.name = "John";
       
        Student s2 = s1; // s2 will point to the same object as s1
        

        s1.func1(10, 20);
        s2.func2(30, 40);
    }
      static  class Student {
            String name;
            
            
            void func1(int a, int b) {
                System.out.println("2 parameters int");
                System.out.println(a + b);
            }
            void func2(int a, int b) {
                System.out.println("object ka naam");
                System.out.println(a + b);
            }
        }
    }
    

