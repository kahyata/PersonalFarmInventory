import java.util.ArrayList;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        // FarmIncome, FarmExpenses, and LivestockRecord Instances
        FarmIncome income1 = new FarmIncome(new Date(), "Crop Sales", "Sale of wheat", "Cash", 1500.00, 4);
        FarmIncome income2 = new FarmIncome(new Date(), "Livestock Sales", "Sale of cows", "Bank transfer", 5000.00, 4);

        FarmExpenses expense1 = new FarmExpenses(new Date(), "Seeds", 200.00, "Purchased from local store", 4);
        FarmExpenses expense2 = new FarmExpenses(new Date(), "Feed", 300.00, "Ordered online", 4);

        LivestockRecord livestock1 = new LivestockRecord("Cow1", "Female", 500.00, 1000.00, 800.00, 1200.00, "Cow");
        LivestockRecord livestock2 = new LivestockRecord("Sheep1", "Male", 100.00, 200.00, 150.00, 250.00, "Sheep");

        // ArrayLists to store instances
        ArrayList<FarmIncome> farmIncomes = new ArrayList<>();
        ArrayList<FarmExpenses> farmExpenses = new ArrayList<>();
        ArrayList<LivestockRecord> livestockRecords = new ArrayList<>();

        // Instances to the lists
        farmIncomes.add(income1);
        farmIncomes.add(income2);

        farmExpenses.add(expense1);
        farmExpenses.add(expense2);

        livestockRecords.add(livestock1);
        livestockRecords.add(livestock2);

        // Print farm incomes as a table
        System.out.println("Farm Incomes:");
        printFarmIncomesTable(farmIncomes);

        // Print farm expenses as a table
        System.out.println("\nFarm Expenses:");
        printFarmExpensesTable(farmExpenses);

        // Print livestock records as a table
        System.out.println("\nLivestock Records:");
        printLivestockRecordsTable(livestockRecords);
    }

    // Method to print farm incomes as a table
    public static void printFarmIncomesTable(ArrayList<FarmIncome> farmIncomes) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Print header row
        System.out.printf("%-15s%-20s%-25s%-15s%-10s%-10s%n", "Date", "Source", "Description", "Payment Method", "Amount", "Month");
        
        // Print each income as a row in the table
        for (FarmIncome income : farmIncomes) {
            String dateStr = dateFormat.format(income.getDate());
            System.out.printf("%-15s%-20s%-25s%-15s%-10.2f%-10d%n", dateStr, income.getSource(), income.getDescription(), income.getPaymentMethod(), income.getAmount(), income.getMonth());
        }
    }

    // Method to print farm expenses as a table
    public static void printFarmExpensesTable(ArrayList<FarmExpenses> farmExpenses) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Print header row
        System.out.printf("%-15s%-20s%-15s%-20s%-10s%n", "Date", "Expenses", "Cost", "Remarks", "Month");
        
        // Print each expense as a row in the table
        for (FarmExpenses expense : farmExpenses) {
            String dateStr = dateFormat.format(expense.getDate());
            System.out.printf("%-15s%-20s%-15.2f%-20s%-10d%n", dateStr, expense.getExpenses(), expense.getCost(), expense.getRemarks(), expense.getMonth());
        }
    }

    // Method to print livestock records as a table
    public static void printLivestockRecordsTable(ArrayList<LivestockRecord> livestockRecords) {
        // Print header row
        System.out.printf("%-15s%-15s%-10s%-10s%-15s%-15s%-15s%n", "Name", "Gender", "Weight", "Value", "Bought Price", "Sale Price", "Animal Type");
        
        // Print each livestock record as a row in the table
        for (LivestockRecord livestock : livestockRecords) {
            System.out.printf("%-15s%-15s%-10.2f%-10.2f%-15.2f%-15.2f%-15s%n", livestock.getName(), livestock.getGender(), livestock.getWeight(), livestock.getValue(), livestock.getBoughtPrice(), livestock.getSalePrice(), livestock.getAnimalType());
        }
    }
}


class FarmIncome {
    private Date date;
    private String source;
    private String description;
    private String paymentMethod;
    private double amount;
    private int month;

    // Constructor
    public FarmIncome(Date date, String source, String description, String paymentMethod, double amount, int month) {
        this.date = date;
        this.source = source;
        this.description = description;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.month = month;
    }

    // Getters
    public Date getDate() {
        return this.date;
    }

    public String getSource() {
        return this.source;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public double getAmount() {
        return this.amount;
    }

    public int getMonth() {
        return this.month;
    }

    // Setters
    public void setDate(Date date) {
        this.date = date;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}

class FarmExpenses {
    private Date date;
    private String expenses;
    private double cost;
    private String remarks;
    private int month;

    // Constructor
    public FarmExpenses(Date date, String expenses, double cost, String remarks, int month) {
        this.date = date;
        this.expenses = expenses;
        this.cost = cost;
        this.remarks = remarks;
        this.month = month;
    }

    // Getters
    public Date getDate() {
        return this.date;
    }

    public String getExpenses() {
        return this.expenses;
    }

    public double getCost() {
        return this.cost;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public int getMonth() {
        return this.month;
    }

    // Setters
    public void setDate(Date date) {
        this.date = date;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}

class LivestockRecord {
    private String name;
    private String gender;
    private double weight;
    private double value;
    private double boughtPrice;
    private double salePrice;
    private String animalType;

    // Constructor
    public LivestockRecord(String name, String gender, double weight, double value, double boughtPrice, double salePrice, String animalType) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.value = value;
        this.boughtPrice = boughtPrice;
        this.salePrice = salePrice;
        this.animalType = animalType;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getValue() {
        return this.value;
    }

    public double getBoughtPrice() {
        return this.boughtPrice;
    }

    public double getSalePrice() {
        return this.salePrice;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
