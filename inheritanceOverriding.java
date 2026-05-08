public class inheritanceOverriding {
    public static void main (String args[]){

        child c1 = new child();
        c1.dosomth();

        parent p1 = new child();
        p1.dosomth();

    }
    
}
class parent {
    void dosomth(){
        System.out.println("doing somethind in parent class");
    }
}

class child extends parent{
    //  method overriding
    // child class provides its own version.
    // same method name , same parameters , different implementation , same or wider access modifier . 
    // **cannot override final method.
    void dosomth(){
        System.out.println("doing somethind in parent's child class");
    }
}


