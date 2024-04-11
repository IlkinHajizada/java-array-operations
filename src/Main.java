public class Main {
    public static void main(String[] args) {

        Array array = new Array(2);
        array.insert(5);
        array.insert(56);
        array.insert(564);
        array.removeAt(1);
        int a = array.indexOf(5);
        array.print();
        System.out.println(a);

    }
}