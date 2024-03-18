public class Student {
    String name; 
    int age;
    String address;

    public Student(String studentName, int studentAge, String studentAddress) {
        name = studentName;
        age = studentAge;
        address = studentAddress;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Shakeel Sheikh", 30, "CDAC Kharghar");
        student1.displayInfo();
    }
}
