import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList a = new ArrayList();
        a.add(1);
        a.add("hi");
        a.add(null);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,3.9);
        System.out.println(a);
    }
}
