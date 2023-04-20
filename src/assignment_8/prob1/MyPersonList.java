package assignment_8.prob1;
import java.util.Arrays;
public class MyPersonList {
    private final int INITIAL_LENGTH=4;
    private Person[] personsArray;

    private int size;

    public MyPersonList(){
        personsArray=new Person[INITIAL_LENGTH];
        size=0;
    }
    public void add(Person p){
        if(p==null)return;
        if(size== personsArray.length){
        resize();
        }
        personsArray[size++]=p;
    }

    public Person get(int index){
        if(index<0||index>=size) {
            return null;
        }
        return  personsArray[index];
    }

    public boolean find(String lastName){
        if(lastName==null)return false;
        for(Person p:personsArray){
            String lName=p.getLastName();
            return lName.equals(lastName);
        }
        return false;
    }

    public void insert(Person p,int index){
        if(index>size||index<0)return;
        if(index== personsArray.length||size+1> personsArray.length){
            resize();
        }
        Person[] temp=new Person[personsArray.length+1];
        System.arraycopy(personsArray,0,temp,0,index);
        temp[index]=p;
        System.arraycopy(personsArray,index,temp,index+1,personsArray.length-index);
        personsArray=temp;
        size++;
    }

    public boolean remove(String lastName){
        if(size == 0) return false;
        if(lastName==null) return false;
        int index = -1;
        for(int i = 0; i < size; ++i ){
            String lName=personsArray[i].getLastName();
            if(lName.equals(lastName)){
                index = i;
                break;
            }
        }
        if(index==-1) return false;
        Person[] temp = new Person[personsArray.length];
        System.arraycopy(personsArray,0,temp,0,index);
        System.arraycopy(personsArray,index+1,temp,index,personsArray.length-(index+1));
        personsArray = temp;
        --size;
        return true;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return(size==0);
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(personsArray, size);
        return temp;
    }
    public void resize(){
        System.out.println("resizing");
        int len= personsArray.length;
        int newLen=len*2;
        Person []temp=new Person[newLen];
        System.arraycopy(personsArray,0,temp,0,len);
        personsArray=temp;
    }

    public static void main(String[] args) {
        MyPersonList mpl=new MyPersonList();
        Person p1=new Person("Islam","Moynul",38);
        Person p2=new Person("Khan","Reza",42);
        Person p3=new Person("Ahmed","Tanvir",33);
        mpl.add(p1);
        mpl.add(p2);
        mpl.add(p3);
        System.out.println(Arrays.toString(mpl.personsArray));
        System.out.println(mpl.find("Islam"));
        mpl.remove("Khan");
        System.out.println(Arrays.toString(mpl.personsArray));
        Person p4=new Person("Khan","Reza",42);
        mpl.insert(p4,1);
        System.out.println(Arrays.toString(mpl.personsArray));
    }
}
