import java.util.Scanner;
import java.util.jar.Attributes.Name;

class student {
    String name;
    int roll;
    String fname, mname;
    int stdId;
    int age;
    String address;

    // INITIALIzATIO OF OBJECTS
    student(String name, int roll, String fname, String mname, int stdId, int age, String address) {
        this.name = name;
        this.roll = roll;
        this.fname = fname;
        this.mname = mname;
        this.age = age;
        this.stdId = stdId;
        this.address = address;

    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Roll No : " + roll);
        System.out.println("Student Student Id : " + stdId);
        System.out.println("Student Age : " + age);
        System.out.println("Student Address : " + address);
        System.out.println("Student Father's Name : " + fname);
        System.out.println("Student Mother's Name : " + mname);
    }

}

public class studentInfo {
    public static void main(String[] args) {
        System.out.print("Enter the Number of Students : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        student[] arr;
        // Allocating memory for n object of type student
        arr = new student[n];
        // VARIABLE FOR DATA
        String name="";
        int roll=0;
        String fname="", mname="";
        int stdId=0;
        int age=0;
        String address="";
        System.out.println("*************************ENTER STUDENT INFORMATION******************************");
        for (int i = 0; i < n; i++) {
            System.out.println("INFORMATION OF STUDENT - " + (i + 1));
            System.out.print("Enter Student Student Id : ");
            stdId = sc.nextInt();
            System.out.print("Enter Student Name : ");
            name = sc.nextLine();
            System.out.print("Enter Student Roll No : ");
            roll = sc.nextInt();
            System.out.print("Enter Student Age : ");
            age = sc.nextInt();
            System.out.print("Enter Student Address : ");
            address = sc.nextLine();
            System.out.print("Enter Student Father's Name : ");
            fname = sc.nextLine();
            System.out.print("Enter Student Mother's Name : ");
            mname = sc.nextLine();
            arr[i] = new student(name, roll, fname, mname, stdId, age, address);
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("INFORMATION OF STUDENT " + (i + 1));
            arr[i].display();
        }
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
       
        sc.close();
    }
}
