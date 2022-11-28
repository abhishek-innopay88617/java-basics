package basicsjava;

public class ForContinue {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            if (i == 6) {
                System.out.println(" is not displayed");
                continue;

            }
            System.out.println(i);

        }
    }
}
