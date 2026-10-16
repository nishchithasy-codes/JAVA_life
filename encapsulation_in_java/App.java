package encapsulation_in_java;
public class App{
    public static void main(String[] args){
    /*   Student A = new Student();
        A.id = 111;
        A.name = "Vamshi";
        A.age = 18;
        A.nos = 5;
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);

        A.bunk();
        A.sleep();
        A.study();*/

        //parameterised const call
        Student A = new Student(1,18,"appu",6,"Tina");
        /*System.out.println("Name: "+A.name);
        System.out.println("ID: "+A.id);
        System.out.println("Age: "+A.age);
        System.out.println("Number of subjects: "+A.nos);

        A.bunk();
        A.sleep();
        A.study();*/

        //copy constr
        Student B = new Student(A);
        System.out.println("Name: "+B.name);
        System.out.println("ID: "+B.id);
        //System.out.println("Age: "+B.age);
        System.out.println("Number of subjects: "+B.nos);
        System.out.println("Girlfriend: "+B.getgf());
        B.sleep();   
        B.gfChatting(); 
        
        
        A.setAge(67);
        System.out.println("The age will be: "+A.getAge());
    }
}