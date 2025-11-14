public class Airplane {
    ///  instance variables:
    /// 1. used in the whole class
    /// 2. located at the top of the class
    /// 3. have public in front of them
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDecker;
    public int length;

    //constructor
    public Airplane(){
        capacity = 250;
        name = "Jacob6";
        model = "Boeing 737";
        isDoubleDecker = false;
        length = 175;
    }
    //constructor w parameter
    public Airplane(int pCapacity){
        capacity = pCapacity;
        name = "Jacob6";
        model = "Boeing 737";
        isDoubleDecker = false;
        length = 175;
    }
    public void printInfo(){
        System.out.println(capacity);
        System.out.println(name);
        System.out.println(model);
        System.out.println(isDoubleDecker);
        System.out.println(length);


    }
}


