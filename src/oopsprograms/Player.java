package oopsprograms;

interface Player {
    public void play();
    public void score();
}
class FootBall implements Player{
   public void play(){
        System.out.println("player is playing football");

    }
    public void score(){
       System.out.println("score is counted interms of goals secured");
    }
}
class MainForPlayer{
    public static void main(String[]args){
        FootBall f=new FootBall();
        f.play();
        f.score();
    }
}