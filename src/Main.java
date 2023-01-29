public class Main {
    public static void main(String[] args) {

        int currentBalance = 300;
        int refill = 1100;

        if (currentBalance + refill > 1000) {
            System.out.println("Итоговая сумма после пополнения: " + (currentBalance + refill + (refill / 100)));
        } else {
            System.out.println("Итоговая сумма после пополнения: " + (currentBalance + refill));
        }

    }
}