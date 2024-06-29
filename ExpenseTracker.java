import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseTracker {
    private List<Expense> expenses;
    private Scanner scanner;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Expense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Set Budget");
            System.out.println("4. Analyze Expenses");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    setBudget();
                    break;
                case 4:
                    analyzeExpenses();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }

    private void addExpense() {
        System.out.print("Enter date (yyyy-mm-dd): ");
        String date = scanner.next();
        System.out.print("Enter category: ");
        String category = scanner.next();
        System.out.print("Enter description: ");
        String description = scanner.next();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        Expense expense = new Expense(date, category, description, amount);
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    private void viewExpenses() {
        System.out.println("Expenses:");
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    private void setBudget() {
        System.out.print("Enter budget for category: ");
        String category = scanner.next();
        System.out.print("Enter budget amount: ");
        double amount = scanner.nextDouble();

        // TO DO: implement budgeting feature
        System.out.println("Budget set successfully!");
    }

    private void analyzeExpenses() {
        System.out.println("Expenses by category:");
        // TO DO: implement expense analysis feature
    }

    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        expenseTracker.run();
    }
}

class Expense {
    private String date;
    private String category;
    private String description;
    private double amount;

    public Expense(String date, String category, String description, double amount) {
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Category: " + category + ", Description: " + description + ", Amount: " + amount;
    }
}
