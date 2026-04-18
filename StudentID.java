import java.util.Scanner;
public class StudentID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading inputs line by line
        String erp = sc.nextLine();
        String age = sc.nextLine();
        String name = sc.nextLine();
        String address = sc.nextLine();

        // Printing in the standardized format
        System.out.println("ERP: " + erp);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        sc.close();
    }
}


