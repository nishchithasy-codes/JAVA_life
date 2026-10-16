package inheritance;
public class vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    public vehicle(){//default constructor in inheritance must be there.
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }


    vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void StartEngine(){
        System.out.println("Engine Starting of %s : %s\n".formatted(name,model));
    }

    void StopEngine(){
        System.out.println("Engine Stopped of %s : %s\n".formatted(name,model));
    }



}
