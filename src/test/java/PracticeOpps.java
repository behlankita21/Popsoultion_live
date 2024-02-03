public class PracticeOpps {
    public void m1() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        PracticeOpps po = new PracticeOpps();
        po.m1();
    }
}

class base extends PracticeOpps {
    public void m2() {
        System.out.println("Data");
    }
}

class Test {
    public static void main(String[] args) {
        base b = new base();
        b.m1(); // inherited from PracticeOpps
        b.m2();
    }
}
