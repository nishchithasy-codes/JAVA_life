package encapsulation_in_java;
public class Student{
    //Attributes
    public int id;
    public String name;
    public int nos; // number of subjects
    private String gf;
    private int age;

    //Default constructor and by default set attr values to garbage values
    public Student(){
        System.out.println("Student Default constructor called.");
    }

    //Parameterised constructor
    public Student(int id, int age, String name, int nos, String gf){
        System.out.println("Student parametrised constructor called.");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }
    //copy constructor
    public Student(Student srcobj){  //source object of A
        System.out.println("Student copy constructor called.");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
        this.gf = srcobj.gf;
    }
    //Methods or behaviours
    public void study(){
        System.out.println(name + " studying.");
    }
    public void sleep(){
        System.out.println(name + " sleeping.");
    }
    public void bunk(){
        System.out.println(name + " bunking.");
    }

   public void gfChatting(){
        System.out.println(name + " Chatting!");
    }

    public String getgf(){
        return this.gf;
    }
    public void setAge(int a){
        if(age<100){
            this.age = a;
        }
        return ;
    }

    public int getAge(){
        return this.age;
    }
}