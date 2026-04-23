class Student {
    String name;
    int roll;

    // Constructor
    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

class constructor {
    public static void main(String[] args) {
        
        Student s1 = new Student("Yogita", 101);
        s1.display();
    }
}