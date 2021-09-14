public class Main {
    public static void main(String[] args) {
        int ticketPrice = 14750;
        int bonusAmount = 20;
        int bonusMilesAccrued = ticketPrice / bonusAmount;
        System.out.println("Вам начислено: " + bonusMilesAccrued + " бонусных миль");

    }
}
