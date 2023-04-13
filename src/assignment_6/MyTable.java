package assignment_6;

public class MyTable {
    private Entry[] entries;

    public MyTable() {
        entries = new Entry[26];
    }

    //returns the String that is matched with char c in the table
    public String get(char c){
        for (Entry e : entries) {
            if (e != null && e.ch == c) {
                return e.str;
            }
        }
        return null;
    }
    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        int asciiValue = (int) c;
        Entry e = new Entry(c,s);
        entries[asciiValue-97] = e;
    }
    //returns a String consisting of nicely formatted display
    //of the contents of the table
    @Override
    public String toString() {
        String str="";
        for(Entry e : entries) {
            if(e!=null) {
                str += e+"\n";
            }
        }
        return str;
    }


    private class Entry {
        char ch;
        String str;
        Entry(char ch, String str){
            this.ch=ch;
            this.str=str;
        }
        //returns a String of the form "ch->str"
        @Override
        public String toString() {
            return ch+"->"+str;
        }
    }

}
