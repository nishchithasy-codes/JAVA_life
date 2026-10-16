package abstraction_in_java;

abstract class Bird{
    abstract void fly(); //Both are templates for its sub classes
    abstract void eat();
}

class sparrow extends Bird{
    //@Override //With this java find the mistake gives up an error immediately if we write like flly instead of fly
    void fly(){ //implementation of fly which is aabstraction.
        System.out.println("Sparrow is flying.");
    }
    @Override
    void eat(){ //implementation of eat which is a abstraction.
        System.out.println("sparrow is eating");
    }
}

class crow extends Bird{
    void fly(){
        System.out.println("Crow is flying. ");
    }
    void eat(){
        System.out.println("Crow is eating.");
    }
}
public class Main {
    public static void main(String[] args){
        //Bird b = new Bird();    //Bird is a abstract class it can be used in by creating a subclass not in main
        
        Bird b = new sparrow();
        b.eat();    
        b.fly();

        b= new crow();
        b.eat();
        b.fly();
    }
}
//Always keep interface and implementation separate because if we modify the implementation also the interface stays the same only.

