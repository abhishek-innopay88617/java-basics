package oopsprograms;

class PolymorphismBike {
    void run() {
        System.out.println("running");
    }
}
    class  Pulser extends PolymorphismBike {
        void run() {
            System.out.println("maximum speed is 150kmph");
        }
    }
    class Main{
    public static void main(String[]args)
    {
        PolymorphismBike pb=new PolymorphismBike();
        pb.run();
        Pulser p=new Pulser();
        p.run();


    }
}
