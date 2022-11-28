package oopsprograms;
class One{
    public void display(){
        System.out.println("one is display method");
    }
}
//inheritance
class Two extends One{
    @Override
    public void display(){
        System.out.println("two class overridden method");
    }
    public int add(int x,int y){
        return x+y;
    }
    //overload
    public double add(double x,double y){
        return x+y;
    }
}
//encapsulation
class EncapTest{
    private  String name;

    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
}
//abstraction
abstract class TwoWheeler {
    public abstract void run();
}
class Honda extends TwoWheeler{
    public void run(){
        System.out.println("bike is running..");
    }
}
public class MainClass {
    public static void main(String[]args){
        One o=new One();   //obj of one class
        o.display();
        Two t=new Two();  //obj of two class
        t.display();
        System.out.println(t.add(1,3));  //calling the add method
        System.out.println(t.add(1.5,1.5));  //call to add overridden method
        EncapTest en=new EncapTest();    //obj of EncapTest class
        en.setName("ram");
        en.getName();
        TwoWheeler tw=new Honda();
        tw.run();

    }
}
