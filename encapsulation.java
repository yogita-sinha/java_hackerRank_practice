import java.util.Scanner;

public class encapsulation {
    public static void main(String args[]) {

       bankAccount balance = new bankAccount(5); 
       balance.display();

       balance.setMember(10);
       balance.display();
 }


}

class bankAccount {
    private int member;
   

    bankAccount(int member) {
        this.member = member;
        System.out.println("inside constructor");
    }

    void setMember(int member) {
        if(member > 0) {
        this.member = member;
        }
        else {
            System.out.println("enter valid member");
        }
    }

    int getMember(){
        return member;
    }

    void display() {
        System.out.println("the member is " + member);
    }
}

