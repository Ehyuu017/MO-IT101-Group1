/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nesty
 */
public class Employee {
    private int eNum;
    private String name;
    private String stat;
    private String bDay;
    private String add;
    private String pn;
    private String ssnum;
    private String phnum;
    private String pgnum;
    private String tnum;
    private String pos;
    

    // Constructor
    public Employee(int eNum, String name, String stat, String bDay, String add, String pn, String ssnum, String phnum,
            String pgnum, String tnum, String pos) {
        
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
    }
    
}
