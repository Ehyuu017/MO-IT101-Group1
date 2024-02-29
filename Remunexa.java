/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Nesty
 */
import java.util.Scanner;
public class Remunexa {
 
    public static void main(String[] args) {
        
        Employee e1 = new Employee(1, "Manuel Garcia III", "Regular", "10/11/1983", "Valero Carpark Building Valero Street 1227, Makati City", "966-860-270", "44-4506057-3", "820126853951", "691295330870", "442-605-657-000", "Chief Executive Officer");
        Employee e2 = new Employee(2, "Antonio Lim", "Regular", "06/19/1988", "San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite", "171-867-411", "52-2061274-9", "331735646338", "663904995411", "683-102-776-000", "Chief Operating Officer");
        Employee e3 = new Employee(3, "Bianca Sofia Aquino", "Regular", "08/04/1989", "Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City", "966-889-370", "30-8870406-2", "177451189665", "171519773969", "971-711-280-000", "Chief Finance Officer");
        Employee e4 = new Employee(4, "Isabella Reyes", "Regular", "06/16/1994", "460 Solanda Street Intramuros 1000, Manila", "786-868-477", "40-2511815-0", "341911411254", "416946776041", "876-809-437-000", "Chief Marketing Officer");
        
        Tax t1 = new Tax(90000.00, 1125.00, 1800.00, 2700.00, 535.71, 1500.00, 2000.00, 1000.00);
        Tax t2 = new Tax(60000.00, 1125.00, 1200.00, 1800.00, 357.14, 1500.00, 2000.00, 1000.00);
        Tax t3 = new Tax(60000.00, 1125.00, 1200.00, 1800.00, 357.14, 1500.00, 2000.00, 1000.00);
        Tax t4 = new Tax(60000.00, 1125.00, 1200.00, 1800.00, 357.14, 1500.00, 2000.00, 1000.00);
        
        // Displaying employee details
        System.out.println("=====================================");
        System.out.println("         Employee Information");
        System.out.println("=====================================");
        e1.displayDetails();
        t1.displayDetails();
        
        System.out.println("=====================================");
        System.out.println("             Tax Details");
        System.out.println("=====================================");
        System.out.println("Taxable Salary : " + t1.calculateTaxableincome());
        System.out.println("Tax            : " + t1.calculateTotalTax());
        
        
        // Taking input for hours worked
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours worked of Employee : ");
        int hoursWorked = scanner.nextInt();

        // Calculating and displaying salary
        double salary = t1.calculateSalary(hoursWorked);
        System.out.println("Salary of Employee : " + salary);
        // Closing the scanner
        scanner.close();
                
        
    }
}

