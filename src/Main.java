public class Main {
    public static void main(String[] args) {
        //входные данные
        int account = 228;
        int amount = 1099;

        //логика

        //int bonus = amount>1000 ? amount/100 : 0;

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус за пополнение счета: " + bonus);
        System.out.println("Итоговый счет: " + (bonus + amount + account));


    }
}
