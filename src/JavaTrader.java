public class JavaTrader {
    public static void main(String[] args) {

        Aandelen amazon = new Aandelen();
        Aandelen oracle = new Aandelen();
        amazon.getAmount();
        amazon.getSymbol();
        amazon.getTotalCost();
        amazon.koop(100);
        oracle.koop(200);
        oracle.koop(200);

        System.out.println("Symbool = " + amazon.getSymbol() + " Aantal = " + amazon.getAmount() + " Totale kosten = " + amazon.getTotalCost());



        System.out.println("Symbool = " + oracle.getSymbol() + " Aantal = " + oracle.getAmount() + " Totale kosten = " + oracle.getTotalCost());
    }
}
