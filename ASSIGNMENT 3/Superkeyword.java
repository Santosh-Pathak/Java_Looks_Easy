class vehicle {
    int speed = 180;
    void message()
    {
        System.out.println("This is Vehicle Class");
    }
}

class Car extends vehicle {
    int speed = 120;

    // void display() {
    //     System.out.println("Maximmum Speed " + super.speed);
    // }
    
    void message()
    {
        System.out.println("This is Car class");
    }
    void display()
    {
        message();
        super.message();
    }
}

public class Superkeyword {
    public static void main(String[] args) {
        Car c = new Car();
        // c.display();
        c.display();
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println("Implemented By: SANTOSH PATHAK\t Class Roll No. 60\t CSE4(G)");
        System.out.println("***************************************************************");
       
    }
}
