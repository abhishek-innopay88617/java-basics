package AllOppsInOne;


public class First{
    public void disp() {
        System.out.println("inside first inside disp");
    }

} //inheritance
class Second extends First{
    @Override
    public void disp(){
        System.out.println("Second class extending to First class");
    }
}
//encapsulation
class A{
    private String name;
    public void setName(String s){
        name=s;
    }
    public String getName(){
        return name;
    }

}
//Abstraction
abstract class Demo{
    abstract void work();
}
class Child extends Demo{
    void work(){
        System.out.println("proving body for child class");
    }
}
//polymorphism
class Bike{
    public void run(){
        System.out.println("running");
    }
}
class Pulser extends Bike{
    public void run(){
        System.out.println("max speed is 150kmph");
    }
}
class AllOneProgram {
    public static void main(String[]args){
        System.out.println("---------inheritance pgm-----");
        First f=new First();
        f.disp();
        Second s=new Second();
        s.disp();
        System.out.println("---------encapsulation pgm-----");
        A a=new A();
        a.setName("ramya");
        System.out.println("name is private so accessed using setters and getters:"+a.getName());
        System.out.println("---------abstraction pgm-----");
        Child c=new Child();   //
        c.work();
        System.out.println("---------polymorphism pgm-----");
        Bike b=new Bike();
        b.run();
        Pulser p=new Pulser();
        p.run();

    }
}