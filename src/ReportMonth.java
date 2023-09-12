import java.util.ArrayList;

public class ReportMonth {
    public void printReportMonth(ArrayList<MonthlyReport> fileMonth) {
        if (fileMonth.isEmpty()) System.out.println("Файл не загружен.");
        else {
            System.out.println("Прибыль");
            System.out.println("Январь.");
            for (MonthlyReport value : fileMonth) {
                if (value.month == 1 && !value.isExpense) {
                    System.out.println(value.itemName + " " + value.quantity * value.unitPrice);
                }
            }
            System.out.println("Февраль.");
            for (MonthlyReport value : fileMonth) {
                if (value.month == 2 && !value.isExpense) {
                    System.out.println(value.itemName + " " + value.quantity * value.unitPrice);
                }
            }
            System.out.println("Март.");
            for (MonthlyReport value : fileMonth) {
                if (value.month == 3 && !value.isExpense) {
                    System.out.println(value.itemName + " " + value.quantity * value.unitPrice);
                }
            }
            System.out.println("Расход");
            System.out.println("Январь.");
            for (MonthlyReport value : fileMonth) {
                if (value.month == 1 && value.isExpense) {
                    System.out.println(value.itemName + " " + value.quantity * value.unitPrice);
                }
            }
            System.out.println("Февраль.");
            for (MonthlyReport value : fileMonth) {
                if (value.month == 2 && value.isExpense) {
                    System.out.println(value.itemName + " " + value.quantity * value.unitPrice);
                }
            }
            System.out.println("Март.");
            for (MonthlyReport value : fileMonth) {
                if (value.month == 3 && value.isExpense) {
                    System.out.println(value.itemName + " " + value.quantity * value.unitPrice);
                }
            }
        }
    }
}
