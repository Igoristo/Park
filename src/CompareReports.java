import java.util.ArrayList;

public class CompareReports {

    public void printCompare(ArrayList<YearlyReport> fileYear, ArrayList<MonthlyReport> fileMonth) {

        int profitMonth1 = 0;
        int profitMonth2 = 0;
        int profitMonth3 = 0;
        int expendMonth1 = 0;
        int expendMonth2 = 0;
        int expendMonth3 = 0;

        if (fileYear.isEmpty()) {
            System.out.println("Файл за год не загружен.");
        } else if (fileMonth.isEmpty()) {
            System.out.println("Файл за месяц не загружен.");
        } else {
            for (MonthlyReport value : fileMonth) {
                if (value.month == 1 && !value.isExpense) {
                    profitMonth1 += value.quantity * value.unitPrice;
                }
            }
            for (MonthlyReport value : fileMonth) {
                if (value.month == 2 && !value.isExpense) {
                    profitMonth2 += value.quantity * value.unitPrice;
                }
            }
            for (MonthlyReport value : fileMonth) {
                if (value.month == 3 && !value.isExpense) {
                    profitMonth3 += value.quantity * value.unitPrice;
                }
            }
            for (MonthlyReport value : fileMonth) {
                if (value.month == 1 && value.isExpense) {
                    expendMonth1 += value.quantity * value.unitPrice;
                }
            }
            for (MonthlyReport value : fileMonth) {
                if (value.month == 2 && value.isExpense) {
                    expendMonth2 += value.quantity * value.unitPrice;
                }
            }
            for (MonthlyReport value : fileMonth) {
                if (value.month == 3 && value.isExpense) {
                    expendMonth3 += value.quantity * value.unitPrice;
                }
            }
            for (YearlyReport value : fileYear) {
                if (value.month == 1 && !value.isExpense) {
                    if (profitMonth1 == value.amount) {
                        System.out.println("Прибыль за Январь сходится.");
                    } else System.out.println("Прибыль за Январь разная.");
                }
                if (value.month == 1 && value.isExpense) {
                    if (expendMonth1 == value.amount) {
                        System.out.println("Расход за Январь сходится.");
                    } else System.out.println("Расход за Январь разный.");
                }
                if (value.month == 2 && !value.isExpense) {
                    if (profitMonth2 == value.amount) {
                        System.out.println("Прибыль за Январь сходится.");
                    } else System.out.println("Прибыль за Январь разная.");
                }
                if (value.month == 2 && value.isExpense) {
                    if (expendMonth2 == value.amount) {
                        System.out.println("Расход за Февраль сходится.");
                    } else System.out.println("Расход за Февраль разный.");
                }
                if (value.month == 3 && !value.isExpense) {
                    if (profitMonth3 == value.amount) {
                        System.out.println("Прибыль за Март сходится.");
                    } else System.out.println("Прибыль за Март разная.");
                }
                if (value.month == 3 && value.isExpense) {
                    if (expendMonth3 == value.amount) {
                        System.out.println("Расход за Март сходится.");
                    } else System.out.println("Расход за Март разный.");
                }
            }
        }
    }
}
