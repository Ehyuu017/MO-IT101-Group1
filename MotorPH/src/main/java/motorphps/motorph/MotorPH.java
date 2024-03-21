/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package motorphps.motorph;





/**
 *
 * @author Nesty
 */





import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MotorPH {
    private static final DecimalFormat f = new DecimalFormat("0.00");
    public static void main(String[] args) {
        int[] employeeNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34};
        //Employee Details
        String[] employeeNames = 
            {"Manuel Garcia III", 
             "Antonio Lim", 
             "Bianca Sofia Aquino",
             "Isabella Reyes",
             "Eduard Hernandez",
             "Andrea Mae Villanueva",
             "Brad San Jose",
             "Alice Romualdez",
             "Rosie Atienza",
             "Roderick Alvaro",
             "Anthony Salcedo",
             "Josie Lopez",
             "Martha Farala",
             "Leila Martinez",
             "Fredrick Romualdez",
             "Christian Mata",
             "Selena De Leon",
             "Allison San Jose",
             "Cydney Rosario",
             "Mark Bautista",
             "Darlene Lazaro",
             "Kolby Delos Santos",
             "Vella Santos",
             "Tomas Del Rosario",
             "Jacklyn Tolentino",
             "Percival Gutierrez",
             "Garfield Manalaysay",
             "Lizeth Villegas",
             "Carol Ramos",
             "Emelia Maceda",
             "Delia Aguilar",
             "John Rafael Castro",
             "Carlos Ian Martinez",
             "Beatriz Santos"};
        
        String[] birthdays = 
            {"10/11/1983",
            "06/19/1988",
            "08/04/1989",
            "06/16/1994",
            "09/23/1989",
            "02/14/1988",
            "03/15/1996",
            "05/14/1992",
            "09/24/1948",
            "03/30/1988",
            "09/14/1993",
            "01/14/1987",
            "01/11/1942",
            "07/11/1970",
            "03/10/1985",
            "10/21/1987",
            "02/20/1975",
            "06/24/1986",
            "10/06/1996",
            "02/12/1991",
            "11/25/1985",
            "02/26/1980",
            "12/31/1983",
            "12/18/1978",
            "05/19/1984",
            "12/18/1970",
            "08/28/1986",
            "12/12/1981",
            "08/20/1978",
            "04/14/1973",
            "01/27/1989",
            "02/09/1992",
            "11/16/1990",
            "08/07/1990"};
        
        String[] Status = 
            {"Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Regular",
            "Probationary",
            "Probationary",
            "Probationary",
            "Probationary",
            "Probationary",
            "Probationary",
            "Probationary",
            "Probationary",
            "Probationary",
            "Probationary",
            "Probationary",
            "Regular",
            "Regular",
            "Regular"};
         
        String[] Address = 
            {"Valero Carpark Building Valero Street 1227, Makati City",
            "San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite",
            "Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City",
            "460 Solanda Street Intramuros 1000, Manila",
            "National Highway, Gingoog,  Misamis Occidental",
            "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands",
            "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi",
            "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte",
            "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte",
            "#284 T. Morato corner, Scout Rallos Street, Quezon City",
            "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate",
            "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro",
            "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte",
            "37/46 Kulas Roads, Maragondon 0962 Quirino",
            "22A/52 Lubowitz Meadows, Pililla 4895 Zambales",
            "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu",
            "89A Armstrong Trace, Compostela 7874 Maguindanao",
            "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union",
            "93A/21 Berge Points, Tapaz 2180 Quezon",
            "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino",
            "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino",
            "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur",
            "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur",
            "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque",
            "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao",
            "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur",
            "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur",
            "66/77 Mann Views, Luisiana 1263 Dinagat Islands",
            "72/70 Stamm Spurs, Bustos 4550 Iloilo",
            "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija",
            "95 Cremin Junction, Surallah 2809 Cotabato",
            "Hi-way, Yati, Liloan Cebu",
            "Bulala, Camalaniugan",
            "Agapita Building, Metro Manila"};
        
        String[] PhoneNumber = 
            {"966-860-270",
            "171-867-411",
            "966-889-370",
            "786-868-477",
            "088-861-012",
            "918-621-603",
            "797-009-261",
            "983-606-799",
            "266-036-427",
            "053-381-386",
            "070-766-300",
            "478-355-427",
            "329-034-366",
            "877-110-749",
            "023-079-009",
            "783-776-744",
            "975-432-139",
            "179-075-129",
            "868-819-912",
            "683-725-348",
            "740-721-558",
            "739-443-033",
            "955-879-269",
            "882-550-989",
            "675-757-366",
            "512-899-876",
            "948-628-136",
            "332-372-215",
            "250-700-389",
            "973-358-041",
            "529-705-439",
            "332-424-955",
            "078-854-208",
            "526-639-511"};
        
        // Government IDs
        String[] SSS = 
            {"44-4506057-3",
            "52-2061274-9",
            "30-8870406-2",
            "40-2511815-0",
            "50-5577638-1",
            "49-1632020-8",
            "40-2400714-1",
            "55-4476527-2",
            "41-0644692-3",
            "64-7605054-4",
            "26-9647608-3",
            "44-8563448-3",
            "45-5656375-0",
            "27-2090996-4",
            "26-8768374-1",
            "49-2959312-6",
            "27-2090208-8",
            "45-3251383-0",
            "49-1629900-2",
            "49-1647342-5",
            "45-5617168-2",
            "52-0109570-6",
            "52-9883524-3",
            "45-5866331-6",
            "47-1692793-0",
            "40-9504657-8",
            "45-3298166-4",
            "40-2400719-4",
            "60-1152206-4",
            "54-1331005-0",
            "52-1859253-1",
            "26-7145133-4",
            "11-5062972-7",
            "20-2987501-5"};

        String[] Philhealth = 
            {"820126853951",
            "331735646338",
            "177451189665",
            "341911411254",
            "957436191812",
            "382189453145",
            "239192926939",
            "545652640232",
            "708988234853",
            "578114853194",
            "126445315651",
            "431709011012",
            "233693897247",
            "515741057496",
            "308366860059",
            "824187961962",
            "587272469938",
            "745148459521",
            "579253435499",
            "399665157135",
            "606386917510",
            "357451271274",
            "548670482885",
            "953901539995",
            "753800654114",
            "797639382265",
            "810909286264",
            "934389652994",
            "351830469744",
            "465087894112",
            "136451303068",
            "601644902402",
            "380685387212",
            "918460050077"};

        String[] TIN = 
            {"442-605-657-000",
            "683-102-776-000",
            "971-711-280-000",
            "876-809-437-000",
            "031-702-374-000",
            "317-674-022-000",
            "672-474-690-000",
            "888-572-294-000",
            "604-997-793-000",
            "525-420-419-000",
            "210-805-911-000",
            "218-489-737-000",
            "210-835-851-000",
            "275-792-513-000",
            "598-065-761-000",
            "103-100-522-000",
            "482-259-498-000",
            "121-203-336-000",
            "122-244-511-000",
            "273-970-941-000",
            "354-650-951-000",
            "187-500-345-000",
            "101-558-994-000",
            "560-735-732-000",
            "841-177-857-000",
            "502-995-671-000",
            "336-676-445-000",
            "210-395-397-000",
            "395-032-717-000",
            "215-973-013-000",
            "599-312-588-000",
            "404-768-309-000",
            "256-436-296-000",
            "911-529-713-000"};

        String[] Pagibig = 
            {"691295330870",
            "663904995411",
            "171519773969",
            "416946776041",
            "952347222457",
            "441093369646",
            "210850209964",
            "211385556888",
            "260107732354",
            "799254095212",
            "218002473454",
            "113071293354",
            "631130283546",
            "101205445886",
            "223057707853",
            "631052853464",
            "719007608464",
            "114901859343",
            "265104358643",
            "260054585575",
            "104907708845",
            "113017988667",
            "360028104576",
            "913108649964",
            "210546661243",
            "210897095686",
            "211274476563",
            "122238077997",
            "212141893454",
            "515012579765",
            "110018813465",
            "697764069311",
            "993372963726",
            "874042259378"};
        
        String[] Position = 
            {"Chief Executive Officer",
            "Chief Operating Officer",
            "Chief Finance Officer",
            "Chief Marketing Officer",
            "IT Operations and Systems",
            "HR Manager",
            "HR Team Leader",
            "HR Rank and File",
            "HR Rank and File",
            "Accounting Head",
            "Payroll Manager",
            "Payroll Team Leader",
            "Payroll Rank and File",
            "Payroll Rank and File",
            "Account Manager",
            "Account Team Leader",
            "Account Team Leader",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Account Rank and File",
            "Sales & Marketing",
            "Supply Chain and Logistics",
            "Customer Service and Relations"};

        String[] Supervisor = 
            {"N/A",
            "Manuel Garcia III",
            "Manuel Garcia III",
            "Manuel Garcia III",
            "Antonio Lim",
            "Antonio Lim",
            "Andrea Mae Villanueva",
            "Brad San Jose",
            "Brad San Jose",
            "Bianca Sofia Aquino",
            "Roderick Alvaro",
            "Anthony Salcedo",
            "Anthony Salcedo",
            "Anthony Salcedo",
            "Antonio Lim",
            "Fredrick Romualdez",
            "Fredrick Romualdez",
            "Christian Mata",
            "Christian Mata",
            "Christian Mata",
            "Christian Mata",
            "Christian Mata",
            "Christian Mata",
            "Christian Mata",
            "Selena De Leon",
            "Selena De Leon",
            "Selena De Leon",
            "Selena De Leon",
            "Selena De Leon",
            "Selena De Leon",
            "Selena De Leon",
            "Isabella Reyes",
            "Isabella Reyes",
            "Isabella Reyes"};
        
        
        //Salary Rate Calculation
        int[] BasicSalary = 
            {90000,
            60000,
            60000,
            60000,
            52670,
            52670,
            42975,
            22500,
            22500,
            52670,
            50825,
            38475,
            24000,
            24000,
            53500,
            42975,
            41850,
            22500,
            22500,
            23250,
            23250,
            24000,
            22500,
            22500,
            24000,
            24750,
            24750,
            24000,
            22500,
            22500,
            22500,
            52670,
            52670,
            52670};

        int[] RiceSubsidy = 
            {1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500,
            1500};

        int[] PhoneAllowance = 
            {2000,
            2000,
            2000,
            2000,
            1000,
            1000,
            800,
            500,
            500,
            1000,
            1000,
            800,
            500,
            500,
            1000,
            800,
            800,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            1000,
            1000,
            1000,
            1000};

        int[] ClothingAllowance = 
            {1000,
            1000,
            1000,
            1000,
            1000,
            1000,
            800,
            500,
            500,
            1000,
            1000,
            800,
            500,
            500,
            1000,
            800,
            800,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            500,
            1000,
            1000,
            1000};
    
        double[] hourlyRates = 
            {535.71,
            357.14,
            357.14,
            357.14,
            313.51,
            313.51,
            255.80,
            133.93,
            133.93,
            313.51,
            302.53,
            229.02,
            142.86,
            142.86,
            318.45,
            255.80,
            249.11,
            133.93,
            133.93,
            138.39,
            138.39,
            142.86,
            133.93,
            133.93,
            142.86,
            147.32,
            147.32,
            142.86,
            133.93,
            133.93,
            133.93,
            313.51,
            313.51,
            313.51};
        
        //Contributions
        double[] SSSd = 
            {1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1125.00,
            1035.00,
            1035.00,
            1035.00,
            1035.00,
            1080.00,
            1035.00,
            1035.00,
            1080.00,
            1102.50,
            1102.50,
            1080.00,
            1035.00,
            1035.00,
            1035.00,
            1125.00,
            1125.00,
            1125.00};
        
        double[] Phild = 
            {2700.00,
            1800.00,
            1800.00,
            1800.00,
            1580.10,
            1580.10,
            1289.25,
            675.00,
            675.00,
            1580.10,
            1524.75,
            1154.25,
            720.00,
            720.00,
            1605.00,
            1289.25,
            1255.50,
            675.00,
            675.00,
            697.50,
            697.50,
            720.00,
            675.00,
            675.00,
            720.00,
            742.50,
            742.50,
            720.00,
            675.00,
            675.00,
            675.00,
            1580.10,
            1580.10,
            1580.10};
        
        double[] Pagibigd = 
            {1800.00,
            1200.00,
            1200.00,
            1200.00,
            1053.40,
            1053.40,
            859.50,
            450.00,
            450.00,
            1053.40,
            1016.50,
            769.50,
            480.00,
            480.00,
            1070.00,
            859.50,
            837.00,
            450.00,
            450.00,
            465.00,
            465.00,
            480.00,
            450.00,
            450.00,
            480.00,
            495.00,
            495.00,
            480.00,
            450.00,
            450.00,
            450.00,
            1053.40,
            1053.40,
            1053.40};
    
  

        Scanner scanner = new Scanner(System.in);
        
        try {
        System.out.println("Enter the employee number :");
        int choice = scanner.nextInt();
        
        if (choice > 34) {
                throw new IllegalArgumentException(" ");
            }
        
        /*Error Handling
        if (choice >= 1 && choice < 34) {
            } else {
        System.out.println("No Data Found. ");
        System.out.println("Enter the employee number :");
        choice = scanner.nextInt();
        }*/
    
        //Employee Hours Work and Overtime
        System.out.print("Enter hours worked of Employee : ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter Overtime hours of Employee : ");
        double Overtime = scanner.nextDouble();
        
       
       int index = choice - 1;
       double grossSalary = hourlyRates[index] * hoursWorked;
       double OT = (Overtime * hourlyRates[index]) * 1.25;
       double TotalHrs = grossSalary + OT;
       double deduction = TotalHrs - SSSd[index] - Pagibigd[index] - Phild[index];
       
       double Tax = 0;
                  if(deduction >= 20833 && deduction < 33333) {
                  Tax = (deduction - 20833) * 0.2;
                  }
                  else if (deduction >= 33333 && deduction < 66667) {
                  Tax = ((deduction - 33333) * 0.25) + 2500;
                  }
                  else if (deduction >= 66667 && deduction < 166667) {
                  Tax = ((deduction - 66667) * 0.3) + 10833;
                  }
                  else if (deduction >= 166667 && deduction < 666667) {
                  Tax = ((deduction - 166667) * 0.32) + 40833.33;
                  }
                  else if (deduction >= 666667) {
                  Tax = ((deduction - 166667) * 0.35) + 200833.33;
                  }
                  
        double netSal = deduction - Tax;
        double netSalary = netSal + RiceSubsidy[index] + PhoneAllowance[index] + ClothingAllowance[index];
       
       
        System.out.println("=====================================");
        System.out.println("          Employee Details");
        System.out.println("=====================================");
        System.out.println("Employee Number: " + employeeNumbers[index]);
        System.out.println("Employee Name: " + employeeNames[index]);
        System.out.println("Birthday: " + birthdays[index]);
        System.out.println("Status: " + Status[index]);
        System.out.println("Address: " + Address[index]);
        System.out.println("Phone Number: " + PhoneNumber[index]);
        System.out.println("SSS No: " + SSS[index]);
        System.out.println("Philhealth No: " + Philhealth[index]);
        System.out.println("Pagibig No: " + Pagibig[index]);
        System.out.println("TIN No: " + TIN[index]);
        System.out.println("Position: " + Position[index]);
        System.out.println("Supervisor: " + Supervisor[index]);
        System.out.println("=====================================");
        System.out.println("           Contribution");
        System.out.println("=====================================");
        System.out.println("SSS: " + f.format(SSSd[index]));
        System.out.println("Pagibig: " + f.format(Pagibigd[index]));
        System.out.println("Philhealth: " + f.format (Phild[index]));
        System.out.println("=====================================");
        System.out.println("          Salary Details");
        System.out.println("=====================================");
        System.out.println("Basic Salary: " + f.format (BasicSalary[index]));
        System.out.println("Hourly Rate: " + f.format(hourlyRates[index]));
        System.out.println("Overtime Pay: " + f.format(OT));
        System.out.println("Gross Salary: " + f.format (TotalHrs));
        System.out.println("Rice Subsidy: " + f.format (RiceSubsidy[index]));
        System.out.println("Phone Allowance: " + f.format (PhoneAllowance[index]));
        System.out.println("Clothing Allowance: " + f.format (ClothingAllowance[index]));
        System.out.println("Witholding Tax: " + f.format (Tax));
        System.out.println("Net Salary: " + f.format(netSalary));
        for (int i = 0; i < 4; i++)
        System.out.println();
        
        System.out.println("=====================================");
        System.out.println("               Payslip");
        System.out.println("=====================================");
        System.out.println("Employee Name: " + employeeNames[index]);
        System.out.println("Position: " + Position[index]);
        System.out.println("SSS No: " + SSS[index]);
        System.out.println("Philhealth No: " + Philhealth[index]);
        System.out.println("Pagibig No: " + Pagibig[index]);
        System.out.println("TIN No: " + TIN[index]);
        System.out.println("**************************************");
        System.out.println("             Contribution");
        System.out.println("**************************************");
        System.out.println("SSS: " + f.format(SSSd[index]));
        System.out.println("Pagibig: " + f.format(Pagibigd[index]));
        System.out.println("Philhealth: " + f.format (Phild[index]));
        System.out.println("**************************************");
        System.out.println("               Benefits");
        System.out.println("**************************************");
        System.out.println("Rice Subsidy: " + f.format (RiceSubsidy[index]));
        System.out.println("Phone Allowance: " + f.format (PhoneAllowance[index]));
        System.out.println("Clothing Allowance: " + f.format (ClothingAllowance[index]));
        System.out.println("**************************************");
        System.out.println("               Salary");
        System.out.println("**************************************");
        System.out.println("Salary Cutoff: 03/01/24 - 03/31/24" );
        System.out.println("Basic Salary: " + f.format (BasicSalary[index]));
        System.out.println("Overtime Pay: " + f.format(OT));
        System.out.println("Gross Salary: " + f.format (TotalHrs));
        System.out.println("Witholding Tax: " + f.format (Tax));
        System.out.println("Net Salary: " + f.format(netSalary));
         for (int i = 0; i < 1; i++)
        System.out.println();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            
        }
         
        // Clear the screen
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (IOException | InterruptedException ex) {
                System.out.println("Error clearing the screen.");
            }
        
       
    }
}

