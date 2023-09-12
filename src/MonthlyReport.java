public class MonthlyReport {
    public String itemName;
    public boolean isExpense;
    public int quantity;
    public int unitPrice;
    public int month;

    public MonthlyReport(String itemName, Boolean isExpense, int quantity, int unitPrice, int mounth) {
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.month = mounth;
    }
}


