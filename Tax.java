/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nesty
 */
import java.util.Scanner;
public class Tax {
    
    private double bs;
    private double sss;
    private double pG;
    private double pH;
    private double HRate;
    private double rs;
    private double pa;
    private double ca;
    private double netSal;
    
    
    // Constructor
    public Tax(double bs, double sss, double pG, double pH, double HRate, double rs, double pa, double ca) {
        
        this.bs = bs;
        this.sss = sss;
        this.pG = pG;
        this.pH = pH;
        this.HRate = HRate;
        this.rs = rs;
        this.pa = pa;
        this.ca = ca;
    }

    // Getter methods
    public double getbs() {
        return bs;
    }

    public double getsss() {
        return sss;
    }

    public double getpG() {
        return pG;
    }
    
    public double getpH() {
        return pH;
    }
     
    public double HRate() {
        return HRate;
    }
    
    public double rs() {
        return rs;
    }
    
    public double pa() {
        return pa;
    }
    
    public double ca() {
        return ca;
    }
    
    public double getnetSal() {
        return netSal;
    }
      
       // Method to calculate salary based on hours worked
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * HRate;
    }

    // Method to calculate income tax
    public double calculateTaxableincome() {
        //Taxable Salary
        return bs - pH - pG - sss;
    }

    // Method to calculate Tax
    public double calculateTaxF() {
        // Tax Calculation
        return calculateTaxableincome() - 66667;
        
    }
    
       // Method to calculate total tax
    public double calculateTotalTax() {
        return calculateTaxF() * 0.3 + 10833;
    }
    
      public double NetSal() {
        return calculateTaxableincome() - calculateTotalTax() + rs + pa + ca;
    }
    

    // Display employee details
    public void displayDetails() {
        System.out.println("=====================================");
        System.out.println("            Contributions");
        System.out.println("=====================================");
        System.out.println("SSS Deduction: " + sss);
        System.out.println("Pag-Ibig Deduction: " + pG);
        System.out.println("Phil-Health Deduction: " + pH);
        System.out.println("=====================================");
        System.out.println("            Salary Information");
        System.out.println("=====================================");
        System.out.println("Basic Salary: " + bs);
        System.out.println("Hourly Rate: " + HRate);
        System.out.println("Rice Subsidy: " + rs);
        System.out.println("Phone Allowance: " + pa);
        System.out.println("Clothing Allowance: " + ca);
        System.out.println("Net Salary: " + NetSal());
        System.out.println();
    }
}
