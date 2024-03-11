/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nesty
 */

public class Employee {
    public int eNum;
    public String name;
    public String stat;
    public String bDay;
    public String add;
    public String pn;
    public String ssnum;
    public String phnum;
    public String pgnum;
    public String tnum;
    public String pos;
    public double bs;
    public double sss;
    public double pG;
    public double pH;
    public double HRate;
    public double rs;
    public double pa;
    public double ca;
    public double bDeduction;
    public double NetSal;
    

    // Constructor
    public Employee(int eNum, String name, String stat, String bDay, 
            String add, String pn, String ssnum, String phnum,
            String pgnum, String tnum, String pos, double bs, double sss, 
            double pbig, double philh, double HRate, double rs, double pa, double ca, double NetSalary) {
        
        this.eNum = eNum;
        this.name = name;
        this.stat = stat;
        this.bDay = bDay;
        this.add = add;
        this.pn = pn;
        this.ssnum = ssnum;
        this.phnum = phnum;
        this.pgnum = pgnum;
        this.tnum = tnum;
        this.pos = pos;
        this.bs = bs;
        this.sss = sss;
        this.pG = pbig;
        this.pH = philh;
        this.HRate = HRate;
        this.rs = rs;
        this.pa = pa;
        this.ca = ca;
        this.NetSal = NetSalary;


    }
    
    // Getter methods
    public int geteNum() {
        return eNum;
    }

    public String getname() {
        return name;
    }

    public String getstat() {
        return stat;
    }
    
    public String getbDay() {
        return bDay;
    }

    public String getadd() {
        return add;
    }
    
    public String getpn() {
        return pn;
    }
    
    public String getssnum() {
        return ssnum;
    }
    
    public String getphnum() {
        return phnum;
    }
    
    public String getpgnum() {
        return pgnum;
    }
    
    public String gettnum() {
        return tnum;
    }
    
    public String getpos() {
        return pos;
    }
    
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
     
    public double getHRate() {
        return HRate;
    }
    
    public double getrs() {
        return rs;
    }
    
    public double getpa() {
        return pa;
    }
    
    public double getca() {
        return ca;
    }
    
    // Calculate total deductions before tax
    public double getbDeduction() {
        return bs - pH - pG - sss;
    }
    
    // Calculate net before tax
    public double getTaxSal() {
        return getbDeduction();
    }
    
      // Calculate net before tax
    public double getNetSal() {
        return NetSal;
    }
    
    // Calculate total deductions before tax
    public double getTotalSalary() {
        return getbDeduction() - TotalTax() + rs + pa + ca;
    }
    
    
    //Calculate Total Tax of Employee
    public double TotalTax() {
                  if(getTaxSal() >= 20833 && getTaxSal() < 33333) {
                  NetSal = (getTaxSal() - 20833) * 0.2;
                  }
                  else if (getTaxSal() >= 33333 && getTaxSal() < 66667) {
                  NetSal = ((getTaxSal() - 33333) * 0.25) + 2500;
                  }
                  else if (getTaxSal() >= 66667 && getTaxSal() < 166667) {
                  NetSal = ((getTaxSal() - 66667) * 0.3) + 10833;
                  }
                  else if (getTaxSal() >= 166667 && getTaxSal() < 666667) {
                  NetSal = ((getTaxSal() - 166667) * 0.32) + 40833.33;
                  }
                  else if (getTaxSal() >= 666667) {
                  NetSal = ((getTaxSal() - 166667) * 0.35) + 200833.33;
                  }
        
        return NetSal;
     }
     

 
    
    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + eNum);
        System.out.println("Name: " + name);
        System.out.println("Status: " + stat);
        System.out.println("Birthday: " + bDay);
        System.out.println("Address: " + add);
        System.out.println("Phone Number: " + pn);
        System.out.println("SSS Number: " + ssnum);
        System.out.println("Philhealth Number: " + phnum);
        System.out.println("Pag-ibig Number: " + pgnum);
        System.out.println("TIN Number: " + tnum);
        System.out.println("Position: " + pos);
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
        System.out.println("Semi-monthly Rate: " + bs / 2);
        System.out.println("Hourly Rate: " + HRate);
        System.out.println("Rice Subsidy: " + rs);
        System.out.println("Phone Allowance: " + pa);
        System.out.println("Clothing Allowance: " + ca);
        System.out.println("Witholding Tax: " + TotalTax());
        System.out.println("Net Salary: " + getTotalSalary());
        System.out.println();
        
    }
    
}
