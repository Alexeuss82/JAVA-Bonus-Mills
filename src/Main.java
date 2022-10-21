public class Main {
    public static void main(String[] args) {
        int amountTicket = 10_000;
        int oneBonusMill = 20;
        int ticketBonusMills = amountTicket / oneBonusMill;
        System.out.println("Вам начислено " + ticketBonusMills + " бонусных милль!");
    }
}