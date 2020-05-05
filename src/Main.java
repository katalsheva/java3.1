public class Main {

    public static void main(String[] args) {

        float initial = 500;
        float amount = 1100;
        int balance = (int) (initial + amount + (amount*0.01));
        int bonus = (int) (amount*0.01);

        if (amount < 1000)
        { balance = (int) (initial + amount);
        bonus = 0;
        }

        System.out.println(balance);
        System.out.println(bonus);
    }
}