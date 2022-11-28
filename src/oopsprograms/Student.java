package oopsprograms;

abstract public class Student {
    abstract void study();
    abstract void work();
}
class Ram extends Student{
    void study(){
        System.out.println("ram is studying");

    }
    void work(){
        System.out.println("ram is working along with study");
    }
}
class MainForStudent{
    public static void main(String[]args)
    { Ram r=new Ram();
        r.study();
        r.work();

    }
}
