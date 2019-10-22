public class Aandelen {
        private String symbol = "AMZN";
        private int amount;
        private double totalCost;

    public String getSymbol() {
        return symbol;
    }

   public int getAmount() {
        return amount;
    }

    public double getTotalCost() {
        return totalCost;
    }

    private void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    private void setAmount(int amount) {
        this.amount = amount;
    }

    private void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public void koop (int amountIn){
        int amount = getAmount();
        double totalCost = getTotalCost();
        amount += amountIn;
        setAmount(amount);
        double tradingCosts = amountIn * 1919.65;
        totalCost += tradingCosts;
        setTotalCost(totalCost);
        System.out.println("Transactie: " + amountIn + " " + getSymbol() + " Kosten: " + totalCost );


    }

    @Override
    public String toString() {
        return "Aandelen: Symbool=" + this.getSymbol() + ", aantal=" + this.getAmount() + ", kosten= " + this.getTotalCost();
    }
}
