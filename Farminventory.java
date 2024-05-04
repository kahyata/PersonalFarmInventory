import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        // FarmIncome, FarmExpenses, and LivestockRecord Instances
        FarmingInventory farmingInventory = new FarmingInventory();
        farmingInventory.initializeInstances();

        // Print farm incomes as a table
        System.out.println("Farm Incomes:");
        farmingInventory.printFarmIncomesTable();

        // Print farm expenses as a table
        System.out.println("\nFarm Expenses:");
        farmingInventory.printFarmExpensesTable();

        // Print livestock records as a table
        System.out.println("\nLivestock Records:");
        farmingInventory.printLivestockRecordsTable();

        // Print Equipment Inventory
        System.out.println("\nEquipment Inventory:");
        farmingInventory.printEquipmentInventory();

        // Print Equipment Maintenance
        System.out.println("\nEquipment Maintenance:");
        farmingInventory.printEquipmentMaintenance();

        // Print Chemicals (if available)
        System.out.println("\nChemicals & Meds:");
        farmingInventory.printChemicals();
    }
}

class FarmingInventory {
    private ArrayList<FarmIncome> farmIncomes = new ArrayList<>(2);
    private ArrayList<FarmExpenses> farmExpenses = new ArrayList<>(2);
    private ArrayList<LivestockRecord> livestockRecords = new ArrayList<>(2);
    private ArrayList<Equipmentinventory> equipmentinventory = new ArrayList<>(2);
    private ArrayList<EquipmentMaintenance> equipmentmaintenance = new ArrayList<>(2);
    private ArrayList<Chemicals> chemicals = new ArrayList<>(2);

    public void initializeInstances() {
        FarmIncome income1 = new FarmIncome(new Date(), "Crop Sales", "Sale of wheat", "Cash", 1500.00, 4);
        FarmIncome income2 = new FarmIncome(new Date(), "Livestock Sales", "Sale of cows", "Bank transfer", 5000.00, 4);

        FarmExpenses expense1 = new FarmExpenses(new Date(), "Seeds", 200.00, "Purchased from local store", 4);
        FarmExpenses expense2 = new FarmExpenses(new Date(), "Feed", 300.00, "Ordered online", 4);

        LivestockRecord livestock1 = new LivestockRecord("Cow1", "Female", 500.00, 1000.00, 800.00, 1200.00, "Cow");
        LivestockRecord livestock2 = new LivestockRecord("Sheep1", "Male", 100.00, 200.00, 150.00, 250.00, "Sheep");

        Equipmentinventory equipment1 = new Equipmentinventory(new Date(), "shovel", "200.00", "blue", 2);
        Equipmentinventory equipment2 = new Equipmentinventory(new Date(), "Gumboots", "150.00", "blue", 2);

        EquipmentMaintenance equipmentmaintenance1 = new EquipmentMaintenance(new Date(), "shovel", "welding", "small job");
        EquipmentMaintenance equipmentmaintenance2 = new EquipmentMaintenance(new Date(), "wheelbarrow", "repainting", "New color");

        Chemicals chemical1 = new Chemicals(new Date(), "Pesticide A", "5 gallons", "ABC123", "Pesticide");
        Chemicals chemical2 = new Chemicals(new Date(), "Herbicide B", "3 gallons", "XYZ789", "Herbicide");

        farmIncomes.add(income1);
        farmIncomes.add(income2);

        farmExpenses.add(expense1);
        farmExpenses.add(expense2);

        livestockRecords.add(livestock1);
        livestockRecords.add(livestock2);

        equipmentinventory.add(equipment1);
        equipmentinventory.add(equipment2);

        equipmentmaintenance.add(equipmentmaintenance1);
        equipmentmaintenance.add(equipmentmaintenance2);

        chemicals.add(chemical1);
        chemicals.add(chemical2);
    }

    // Methods to print tables

    // Method to print farm incomes as a table
    public void printFarmIncomesTable() {
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
    public void printFarmExpensesTable() {
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
    public void printLivestockRecordsTable() {
        // Print header row
        System.out.printf("%-15s%-15s%-10s%-10s%-15s%-15s%-15s%n", "Name", "Gender", "Weight", "Value", "Bought Price", "Sale Price", "Animal Type");

        // Print each livestock record as a row in the table
        for (LivestockRecord livestock : livestockRecords) {
            System.out.printf("%-15s%-15s%-10.2f%-10.2f%-15.2f%-15.2f%-15s%n", livestock.getName(), livestock.getGender(), livestock.getWeight(), livestock.getValue(), livestock.getBoughtPrice(), livestock.getSalePrice(), livestock.getAnimalType());
        }
    }

    // Method to print equipment inventory as a table
    public void printEquipmentInventory() {
        // Print header row
        System.out.printf("%-15s%-15s%-10s%-10s%-10s%n", "Date", "Name", "Price", "Colour", "Units");

        // Print each equipment as a row in the table
        for (Equipmentinventory equipment : equipmentinventory) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = dateFormat.format(equipment.getDate());
            System.out.printf("%-15s%-15s%-10s%-10s%-10d%n", dateStr, equipment.getName(), equipment.getPrice(), equipment.getColour(), equipment.getUnits());
        }
    }

    // Method to print equipment maintenance as a table
    public void printEquipmentMaintenance() {
        // Print header row
        System.out.printf("%-15s%-15s%-15s%-10s%n", "Date", "Name", "Maintenance Type", "Remarks");

        // Print each equipment maintenance record as a row in the table
        for (EquipmentMaintenance maintenance : equipmentmaintenance) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = dateFormat.format(maintenance.getDate());
            System.out.printf("%-15s%-15s%-15s%-10s%n", dateStr, maintenance.getEquipmentName(), maintenance.getMaintenanceType(), maintenance.getRemarks());
        }
    }

    // Method to print chemicals as a table
    public void printChemicals() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
        // Print header row
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "Date", "Name", "Quantity", "Code", "Type");
    
        // Print each chemical record as a row in the table
        for (Chemicals chemical : chemicals) {
            String dateStr = dateFormat.format(chemical.getDate());
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", dateStr, chemical.getName(), chemical.getQuantity(), chemical.getCode(), chemical.getType());
        }
    }
}

class FarmIncome {
    private final Date date;
    private final String source;
    private final String description;
    private final String paymentMethod;
    private final double amount;
    private final int month;

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
}

class FarmExpenses {
    private final Date date;
    private final String expenses;
    private final double cost;
    private final String remarks;
    private final int month;

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
}

class LivestockRecord {
    private final String name;
    private final String gender;
    private final double weight;
    private final double value;
    private final double boughtPrice;
    private final double salePrice;
    private final String animalType;

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
}

class Equipmentinventory {
    private final Date date;
    private final String name;
    private final String price;
    private final String colour;
    private final int units;

    // Constructor
    public Equipmentinventory(Date date, String name, String price, String colour, int units) {
        this.date = date;
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.units = units;
    }

    // Getters
    public Date getDate() {
        return this.date;
    }

    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public int getUnits() {
        return this.units;
    }
}

class EquipmentMaintenance {
    private final Date date;
    private final String equipmentName;
    private final String maintenanceType;
    private final String remarks;

    // Constructor
    public EquipmentMaintenance(Date date, String equipmentName, String maintenanceType, String remarks) {
        this.date = date;
        this.equipmentName = equipmentName;
        this.maintenanceType = maintenanceType;
        this.remarks = remarks;
    }

    // Getters
    public Date getDate() {
        return this.date;
    }

    public String getEquipmentName() {
        return this.equipmentName;
    }

    public String getMaintenanceType() {
        return this.maintenanceType;
    }

    public String getRemarks() {
        return this.remarks;
    }
}

class Chemicals {
    private Date date;
    private String name;
    private String quantity;
    private String code;
    private String type;

    // Constructor with all fields
    public Chemicals(Date date, String name, String quantity, String code, String type) {
        this.date = date;
        this.name = name;
        this.quantity = quantity;
        this.code = code;
        this.type = type;
    }

    // Constructor with essential fields
    public Chemicals(String name, String quantity, String type) {
        this(new Date(), name, quantity, "", type);
    }

    // Getters and setters (if needed)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
