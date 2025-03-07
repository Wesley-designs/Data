public class Main {
    public static void main(String[] args) {
        Data a = new Data();
        a.repopulate();
        System.out.println(a.get2D());
        System.out.println(a);
        System.out.println(a.countIncreasingCols());
    }
}