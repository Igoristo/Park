
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaction transaction = new Transaction();
        CompareReports compareReports = new CompareReports();
        ReportMonth reportMonth = new ReportMonth();
        ReportYear reportYear = new ReportYear();

        while (true) {
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                transaction.scanFileMonth();
            } else if (userInput == 2) {
                transaction.scanFileYear();
            } else if (userInput == 3) {
                compareReports.printCompare(transaction.fileYear, transaction.fileMonth);
            } else if (userInput == 4) {
                reportMonth.printReportMonth(transaction.fileMonth);
            } else if (userInput == 5) {
                reportYear.printReportYear(transaction.fileYear);
            } else if (userInput == 0) {
                System.out.println("Выход");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Считать все месячные отчёты.");
        System.out.println("2 - Считать годовой отчёт.");
        System.out.println("3 - Сверить отчёты за месяцы и за год.");
        System.out.println("4 - Вывести информацию обо всех месячных отчётах.");
        System.out.println("5 - Вывести информацию о годовом отчёте.");
        System.out.println("0 - Выход");
    }
}
