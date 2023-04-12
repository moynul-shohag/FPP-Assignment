package assignment5.prob5;

public class Main {
    public static void main(String [] args)
    {
        Computer com=new Computer("Lenovo","Core-i9",16,2.8);
        System.out.println(com.toString());
        System.out.println(com.hashCode());
        Computer com1=new Computer("Dell","Core-i9",16,2.8);
        Computer com2=new Computer("Dell","Core-i9",16,2.8);

        System.out.println(com1.equals(com2));
        System.out.println(com2.equals(com1));


        System.out.println(com1.hashCode());
        System.out.println(com2.hashCode());
        System.out.println(com1.hashCode()==com2.hashCode());


        //System.out.println(this.hashCode());
    }
}
