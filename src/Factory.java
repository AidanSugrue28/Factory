public class Factory {
    //scope is whole class
    public int yearfounded = 3005;
    public String factoryName = "airplane factory";
    public boolean isOpen = false;


    public static void main(String[] args) {
        System.out.println("welcome to Aidan's factory");
        new Factory();

    }
    //constructor
    //1. is a method
    //2. has same name as class
    //3. has no void


    //constructor is a very special type of method which has the exact same name as the class
    public Factory(){
        isOpen = false;
        //scope for manager is only in the contructory
        String manager = "WonderWoman";
        factoryinfo();

        //call factoryInfo();

        //type varName = value
        //object of type airplane
        Airplane plane1 = new Airplane();
        plane1.name = "jeff";
        System.out.println(plane1.name);
        plane1.isDoubleDecker = false;
        System.out.println(plane1.isDoubleDecker);
        plane1.capacity = 1;
        System.out.println(plane1.capacity);
        plane1.length = 10;
        System.out.println(plane1.length);
        plane1.model = "invisiblePlane";
        System.out.println(plane1.model);
        Airplane plane2 = new Airplane();
        plane2.capacity = 10;
        System.out.println(plane2.capacity);
        Airplane plane3 = new Airplane();
        plane3.capacity = 5;
        plane3.isDoubleDecker = true;
        plane3.model = "coolPlane";
        plane3.length = 20;
        plane3.name = "Aidan Plane";

        Airplane plane5 = new Airplane(232);
        System.out.println(plane5.capacity);
        plane5.printInfo();
    }

    public void factoryinfo(){

        System.out.println(yearfounded);
        System.out.println(factoryName);
        System.out.println(isOpen);
        System.out.println();

    }

    //todo: make method called printInfo() that prints the airplanes instance variables
}