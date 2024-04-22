public class Main {
    public static void main(String[] args) {
        
        int account = 0;            // Счет клиента
        int SumPopoln = 1200;         // Сумма пополнения
        int Bonus = (SumPopoln/100);  // Расчет бонусных рублей
        int Endaccount = (account + SumPopoln);  // Счет клиента после пополнения

        if (SumPopoln < 1000) {
            System.out.println("Итоговый счет " + Endaccount);
        } else {
            System.out.println("Итоговый счет " + (Endaccount + Bonus));
            System.out.println("Вы получили дополнительные бонусы " + Bonus);
        }



        //System.out.println("Итоговый счет " + Endaccount);




    }
}