// You are using Java
class Adder{
    public int add(int a, int b){
        return a+b;
    }
    public long add(long a, long b){
        return a+b;
    }
    public static void main(String []args){
        Adder ad = new Adder();
        System.out.println(ad.add(5, 10));
        System.out.println(ad.add(5l, 100l));
    }
}
