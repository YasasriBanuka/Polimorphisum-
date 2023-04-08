

public class Vehicle {
    void drive (){
        System.out.println(" Drive speed limit 100kmph");
    }
}
class car extends Vehicle{
    @Override
    void drive() {
        System.out.println("Drive speed Limit 150kmph");
    }
}
class RunProgramme{
    public static void main(String[] args) {
        Vehicle c= new car();
        Vehicle v = new Vehicle();
        c.drive();
        v.drive();
    }
}