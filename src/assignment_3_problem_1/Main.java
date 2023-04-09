package assignment_3_problem_1;

public class Main {
    public static void main(String [] args)
    {
        Address cust1BillAdd=new Address("1000 E","Chicago","Chicago","52437");
        Address cust1ShippAdd=new Address("1000 E","Daven","Chicago","52437");
        Address cust2BillAdd=new Address("1000 N","Fairfield","Iowa","52557");
        Address cust2ShippAdd=new Address("1000 N","Burlington","Chicago","52556");
        Address cust3BillAdd=new Address("1000 W","Chicago","Chicago","52437");
        Address cust3ShippAdd=new Address("1000 W","Chicago","Chicago","52437");


        Customer customer1=new Customer("Moynul","Islam","1222-3445");
        customer1.setBillingAddress(cust1BillAdd);
        customer1.setShippingAddress(cust1ShippAdd);
        Customer customer2=new Customer("Kafi","Ahmed","1222-3446");
        customer2.setBillingAddress(cust2BillAdd);
        customer2.setShippingAddress(cust2ShippAdd);
        Customer customer3=new Customer("Rana","Khan","1222-3447");
        customer3.setBillingAddress(cust3BillAdd);
        customer3.setShippingAddress(cust3ShippAdd);
        //System.out.println(cust1BillAdd.toString());

        Customer[] customers=new Customer[3];
        customers[0]=customer1;
        customers[1]=customer2;
        customers[2]=customer3;

        for(int i=0;i<customers.length;i++)
        {
            //System.out.println(customers[i].getBillingAddress().getCity());
            String city=customers[i].getBillingAddress().getCity();
            if(city.equals(Customer.billAddress))
            {
                System.out.println(customers[i]);
            }

        }

    }
}
