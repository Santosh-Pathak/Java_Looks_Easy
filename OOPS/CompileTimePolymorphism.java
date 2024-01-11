class Students
{
    String name;
    int roll;

    public void printInfo(String name)
    {
        System.out.println(name);
    }
    
    public void printInfo(int roll)
    {
        System.out.println(roll);
    }
    
    public void printInfo(String name,int roll)
    {
        System.out.println("Name  = "+name + " Roll. no=  "+roll);
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        
        Students s1= new Students();
        s1.printInfo("Darpan");
        s1.printInfo(17);
        s1.printInfo("Darpan",17);
    }
}
