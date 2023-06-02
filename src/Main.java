public class Main {
    public static void main(String[] args) {
        int ticket = 1489; //стоимость билета
        int mile = 20; //шаг начисления бонусных миль
        int bonus = ticket / mile; //количество бонусных миль

        System.out.println("Начислено миль " + bonus);
    }
}