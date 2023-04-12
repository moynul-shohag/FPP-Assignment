package assignment5.prob1;

public class Main {
    public static void main(String[]args){
    Shape [] sh=new Shape[5];
        Rectangle ra=new Rectangle("Red",4,5);
        Circle c=new Circle("Green",5);
        Circle c1=new Circle("Green",5);
        Square sq=new Square("Balck",6);
        Square sq1=new Square("Balck",6);

        sh[0]=ra;
        sh[1]=c;
        sh[2]=c1;
        sh[3]=sq;
        sh[4]=sq1;
    printTotal(sh);
    }

    public static void printTotal(Shape[] shapes)
    {
        double totalArea=0;
        double totalPerimeter=0;
        /*
        for (Shape s:shapes){
            System.out.println("Area of "+s.getClass().getSimpleName() +" is:"+s.calculateArea()+"\t\t\t\t\tPerimeter of " + s.getClass().getSimpleName()+ " is: "+s.calculatePerimeter());
        }*/

        for (Shape sh:shapes){
            totalArea+=sh.calculateArea();
            totalPerimeter+=sh.calculatePerimeter();

        }
        System.out.println("Total Area: "+ totalArea);
        System.out.println("Total Perimeter: "+ totalPerimeter);
    }
}
