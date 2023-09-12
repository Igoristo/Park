import java.util.ArrayList;

public class Transaction {
    MonthlyReport monthlyReport;
    YearlyReport yearlyReport;
    ArrayList<MonthlyReport> fileMonth = new ArrayList<>();
    ArrayList<YearlyReport> fileYear = new ArrayList<>();
    FileReader fileReader = new FileReader();

    public void scanFileMonth() {
        for (int month = 1; month <= 3; month++) {
            String fileName = "m.20210" + month + ".csv";
            ArrayList<String> lines = fileReader.readFileContents(fileName);
            for (int j = 1; j < lines.size(); j++) {
                String[] cutLine = lines.get(j).split(",");
                String itemName = cutLine[0];
                boolean isExpense = Boolean.parseBoolean(cutLine[1]);
                int quantity = Integer.parseInt(cutLine[2]);
                int unitPrice = Integer.parseInt(cutLine[3]);
                monthlyReport = new MonthlyReport(itemName, isExpense, quantity, unitPrice, month);
                fileMonth.add(monthlyReport);
            }
        }
    }

    public void scanFileYear() {
        String fileName = "y.2021.csv";
        ArrayList<String> lines = fileReader.readFileContents(fileName);
        for (int i = 1; i < lines.size(); i++) {
            String[] cutLine = lines.get(i).split(",");
            int month = Integer.parseInt(cutLine[0]);
            int amount = Integer.parseInt(cutLine[1]);
            boolean isExpense = Boolean.parseBoolean(cutLine[2]);
            yearlyReport = new YearlyReport(month, amount, isExpense);
            fileYear.add(yearlyReport);
        }
    }
}
