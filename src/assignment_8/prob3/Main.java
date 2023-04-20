package assignment_8.prob3;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Marketing>marketingList=new ArrayList<>();
    public static void add(Marketing m){
        marketingList.add(m);
    }
    public static void remove(Marketing m){
        marketingList.remove(m);
    }

    public static List<Marketing>listMoreThan1000(List<Marketing>list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        Marketing m1=new Marketing("Tanvir","Laptop", 500000);
        Marketing m2=new Marketing("Rana","Desktop", 100000);
        Marketing m3=new Marketing("Reza","Monitor", 80000);
        Marketing m4=new Marketing("Moynul","Ram", 120000);
        Marketing m5=new Marketing("Fahim","Mousepad", 1000);
        add(m1);
        add(m2);
        add(m3);
        add(m4);
        add(m5);
        System.out.println("Size of the list: "+marketingList.size());
        System.out.println("Contents of the marketing list:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing.toString());
        }
        remove(m2);
        System.out.println("After Remove, Size of the list: "+marketingList.size());
        System.out.println("After Remove, Contents of the marketing list:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing.toString());
        }


        marketingList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return Double.compare(m1.getSalesAmount(), m2.getSalesAmount());
            }

        });

        // Display the contents in the sorted list
        System.out.println("Contents of the sorted marketing list based on sales amount:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing.toString());
        }


       List<Marketing> filteredList = listMoreThan1000(marketingList);
       filteredList.sort(new Comparator<Marketing>() {
           @Override
           public int compare(Marketing m1, Marketing m2) {
               return m1.getEmployeeName().compareTo(m2.getEmployeeName());
           }

       });

        // Display the contents in the sorted list
        System.out.println("Contents of the sorted marketing list based on Employee Name:");
        for (Marketing marketing : filteredList) {
            System.out.println(marketing.toString());
        }
    }
}
