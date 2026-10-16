package inheritance;

public class motorCycle extends vehicle{
    public String handleBarStyle;
    public String suspensionType;

    motorCycle(String name, String model, int noOfTyres, String handleBarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
        super.StartEngine();
    }
    
    public void wheeling(){
        System.out.println("MotorCycle is doing wheeling! "+ name);
    }
    

}
