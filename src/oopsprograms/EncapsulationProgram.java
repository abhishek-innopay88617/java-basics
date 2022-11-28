package oopsprograms;

public class EncapsulationProgram {
    private int page = 10;

    public void setPage(int x) {
        this.page = x;
    }

    public int getPage() {
        return page;
    }


    public static void main(String[]args){
        EncapsulationProgram ep=new EncapsulationProgram();
        ep.setPage(10);
        System.out.println("pages are:"+ep.getPage());

    }
}
