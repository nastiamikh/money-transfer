public class Main {
    public static void main(String[] args) {
        int deposit = 2_000_000_000;
        int transfer =147483648;
        int balance = deposit + transfer;
        System.out.println(balance);
    }
}
