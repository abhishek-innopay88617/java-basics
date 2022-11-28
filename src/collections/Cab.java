package collections;

public interface Cab {
    public void bookCab();
}
class Test{
    public static void main(String[] args) {
       Cab cab=()->System.out.println("OLA BOOKED");
       cab.bookCab();
    }
}
