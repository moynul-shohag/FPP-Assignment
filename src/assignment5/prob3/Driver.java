package assignment5.prob3;

public class Driver {
    public static void main(String[]args){
        Figure[] figures={new UpwardHat(),new UpwardHat(),new DownwardHat(),new FaceMaker(),new Vertical()};
        for(Figure f:figures){
            f.getFigure();
        }
    }
}
