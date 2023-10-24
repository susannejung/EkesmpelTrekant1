public class Main {
    public static void main(String[] args) {
        Trekant t1=new Trekant();
        t1.setG(5);
        t1.setH(10);
        System.out.println(t1);
        System.out.println("Arealet er "+t1.getAreal());

        Trekant t2=new Trekant(4,7);
        System.out.println(t2);
        System.out.println("Arealet er "+t2.getAreal());
    }
}