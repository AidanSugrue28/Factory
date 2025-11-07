public class Factory {

    //scope is the whole class
    public int yearFounded = 1856;
    public String factoryName = "gift Factory";
    public boolean isOpen = true;

    public static void main(String[] args) {
        System.out.println("Welcome to Aidan's Factory");
        new Factory(); // need this to play everything under

    }
    //constructor - type of method that always has the same name as the class and doesn't have void
    // it allows us to make a factory
    public Factory(){
        isOpen = false;
        // scope for manager is only in the constructor so you can only use it in this class
        String manager = "MRosa";
        factoryInfo();
    }


    public void factoryInfo() {
        System.out.println("year founded" + yearFounded); // the quotes turn the variable into what you actually want to print
        System.out.println("factory name" + factoryName);
        System.out.println("is open" + isOpen);
        factoryInfo();

    }

}
