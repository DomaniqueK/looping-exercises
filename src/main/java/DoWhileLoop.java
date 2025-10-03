public class DoWhileLoop {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        do {
            sum += count;
            count++;
            System.out.println("I love Java");
        } while (count <= 5);
    }
}
