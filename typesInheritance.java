// 1. Single Inheritance
// only one parent class and one child class
// child class inherits from single parent class

// 2. Multilevel Inheritance
// one parent class and one child class and one grandchild class
// dadaji -> papa -> child.


// 3. Hierarchical Inheritance
// one parent class and multiple child classes
// more than one child class inherits from single parent class
// more than one derived class inherits from a single base class
// dadaji -> papa, mama, chacha, bhai,bua

// 4. Multiple Inheritance
// one child class inherits from more than one parent class
// parent1 -> child <- parent2
//one class can have more than 1 superclass , and can inherit features from all parent classes.
// *** (multiple inheritance is not supported in java through classes but it is supported through interfaces.)

// 5.hybrid Inheritance
// combination of two or more types of inheritance
//grandparent -> parent -> child
// parent -> child1, child2, child3


public class typesInheritance {
    public static void main(String[] args) {

        System.out.println();
        
        System.out.println("Single Inheritance");
        System.out.println();

        child c1 = new child();
        c1.dosomething1();
        c1.dosomething2();

        System.out.println();
        System.out.println();

        System.out.println("Multilevel Inheritance");
        System.out.println();

        child2 c2 = new child2();
        c2.dosomething3();
        c2.dosomething4();
        c2.dosomething5();

        System.out.println();
        System.out.println();

        System.out.println("Hierarchical Inheritance");
        System.out.println();

        child3 c3 = new child3();
        c3.dosomething6();
        c3.dosomething7();

        child4 c4 = new child4();
        c4.dosomething8();

        System.out.println();
        System.out.println();

        // child5 c5 = new child5();
        // c5.dosomething9();
        // c5.dosomething10();
        // c5.dosomething11();
    }
}
//single inheritance
class parent1{
    void dosomething1(){
        System.out.println("parent1 doing something");
    }
}

class child extends parent1{
    void dosomething2(){
        System.out.println("child1 doing something");
    }
}

//multilevel inheritance
class grandparent1{
    void dosomething3(){
        System.out.println("grandparent1 doing something");
    }
}

class parent2 extends grandparent1{
    void dosomething4(){
        System.out.println("parent2 doing something");
    }
}

class child2 extends parent2{
    void dosomething5(){
        System.out.println("child2 doing something");
    }
}

//hierarchical inheritance
class parent3{
    void dosomething6(){
        System.out.println("parent3 doing something");
    }
}

class child3 extends parent3{
    void dosomething7(){
        System.out.println("child3 doing something");
    }
}

class child4 extends parent3{
    void dosomething8(){
        System.out.println("child4 doing something");
    }
}


class parent4{
    void dosomething9(){
        System.out.println("parent4 doing something");
    }
}

class parent5{
    void dosomething10(){
        System.out.println("parent5 doing something");
    }
}

// class child5 extends parent4, parent5{ 
//     //diamond problem -> when a class inherits from two classes which have a common parent class then it creates ambiguity
//     //because the child class will not know which parent class's method to call.
//     // multiple inheritance is not supported in java through classes but it is supported through interfaces.
//     void dosomething11(){
//         System.out.println("child5 doing something");
//     }   
// }