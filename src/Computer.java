public class Computer {
    public int pixelNumber;
    public String computerName;
    public boolean isOpen;


    public Computer(){
        pixelNumber = 2000;
        computerName = "Mike";
        isOpen = true;
    }
    public Computer(int qpixelNumber,String qComputerName, Boolean qIsOpen){
        pixelNumber = qpixelNumber;
        computerName = qComputerName;
        isOpen = qIsOpen;
    }
    public void printInfo(){
        System.out.println(pixelNumber);
        System.out.println(computerName);
        System.out.println(isOpen);
    }
}
