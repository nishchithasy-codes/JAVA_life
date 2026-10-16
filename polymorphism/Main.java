package polymorphism;
public class Main {
    public static void main(String[] args){
        /*Calculator c = new Calculator();
        System.out.println(c.add(1,1));             //METHOD OVER LOADING
        System.out.println(c.add(1,1,1));
        System.out.println(c.add(1,1,1,1));*/

        circle c = new circle();
        doDrawingStuff(c);

        rect r = new rect();
        doDrawingStuff(r);

        shape s = new shape();
        doDrawingStuff(s);
    }

    public static void doDrawingStuff(shape s){
        s.draw();
    }

}
