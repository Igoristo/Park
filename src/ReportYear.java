import java.util.ArrayList;

public class ReportYear {
    public void printReportYear(ArrayList<YearlyReport> fileYear) {
        if (fileYear.isEmpty()) System.out.println("Файл не загружен.");
        else {
            int maxExpend = 0;
            int maxProfit = 0;
            for (YearlyReport yearlyReport : fileYear) {
                if (maxProfit < yearlyReport.amount && !yearlyReport.isExpense) {
                    maxProfit = yearlyReport.amount;
                }
                if (maxExpend < yearlyReport.amount && yearlyReport.isExpense) {
                    maxExpend = yearlyReport.amount;
                }
            }
            System.out.println("Наибольшая прибыль составила - " + maxProfit);
            System.out.println("Максимальная трата составила - " + maxExpend);
        }
    }
}
