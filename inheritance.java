import java.util.Scanner;
public class inheritance {

    //parent child analogy  -> inheritance
    //except private features, all features of parent class are inherited by child class.
    //child class parent class k variable ko aise use karega jaise vo uske apne ho.
    //object nahi hota h.
    //jis class ko inherit kiya jara hai usko parent class ya super class kehte h.
    //jis class par inherit kiya jara hai usko child class ya subclass kehte h.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        animal a1 = new animal();

        // a1.name = "dmfjfb";
        // a1.legcount = 4;

        // a1.eat(); 
        // a1.sleep();

        dog d1 = new dog();
        d1.name = "mickey";
        d1.legcount = 4;
        d1.eat();
        d1.sleep();
        d1.bark();

        System.out.println("name of dog is "+d1.name);
        System.out.println("leg count of dog is "+d1.legcount);
        
    }
    
}

class dog extends animal { // dog class animal class ko inherit kar rahi h
    //animal class ke sare features dog class me aa gaye h.



    // animal a ; 
    // dog(){
    //     a = new animal();
    // }ye bhi ek tarika h inheritance ka


    // String name;
    // int legcount;

    void bark(){
        System.out.println("woof");
    }

//     void eat(){
//         System.out.println("eating");
//  }

//     void sleep(){
//         System.out.println("sleeping");
//     }
}

class cat extends animal { // cat class animal class ko inherit kar rahi h
    //animal class ke sare features cat class me aa gaye h.
    
    // String name;
    // int legcount;

    void meow(){
        System.out.println("meow");
    }

//     void eat(){
//         System.out.println("eating");
//  }

//     void sleep(){
//         System.out.println("sleeping");
//     }

    void scratch(){
        System.out.println("scratching");
    }
}

class animal {
    String name;
    int legcount;

    void eat(){
        System.out.println("eating");
    }

    void sleep(){
        System.out.println("sleeping");
    }
}
