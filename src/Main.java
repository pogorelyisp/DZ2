public class Main {
    public static void main(String[] args) {

        int account = 100;            // Счет клиента
        int deposit = 1200;         // Сумма пополнения
        int bonus = (deposit/100);  // Расчет бонусных рублей
        int finalaccount = (account + deposit);  // Счет клиента после пополнения

        if (deposit < 1000) {
            System.out.println("Итоговый счет " + finalaccount);
        } else {
            System.out.println("Итоговый счет " + (finalaccount + bonus));
            System.out.println("Вы получили дополнительные бонусы " + bonus);
        }








    }
}