package inheritance;

public class car extends vehicle{
    public int noOfDoors;
    public String TransmissionType;

    car(String name, String model, int noOfTyres, int noOfDoors, String TransmissionType){
        super(name, model, noOfTyres);//should be in first line of constructor because it is a parent class constructor.  
        this.noOfDoors = noOfDoors;
        this.TransmissionType = TransmissionType;
        super.StartEngine();
    }

    public void StartAC(){
        System.out.println("AC started of "+ name);
    }
    
}
