/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Nesty
 */


import java.util.Scanner;


public class Main {

 public static void main(String[] args) {
        
        // Create an array to store employee objects
        Employee[] employees = new Employee[35];
        
        // Initialize employee objects
        employees[0] = new Employee(1, "Manuel Garcia III", "Regular", "10/11/1983", "Valero Carpark Building Valero Street 1227, Makati City", "966-860-270", "44-4506057-3", "820126853951", "691295330870", "442-605-657-000", "Chief Executive Officer", 90000.00, 1125.00, 1800.00, 2700.00, 535.71, 1500.00, 2000.00, 1000.00, 0.00);
        employees[1] = new Employee(2, "Antonio Lim", "Regular", "06/19/1988", "San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite", "171-867-411", "52-2061274-9", "331735646338", "663904995411", "683-102-776-000", "Chief Operating Officer", 60000.00, 1125.00, 1200.00, 1800.00, 357.14, 1500.00, 2000.00, 1000.00, 0.00);
        employees[2] = new Employee(3, "Bianca Sofia Aquino", "Regular", "08/04/1989", "Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City", "966-889-370", "30-8870406-2", "177451189665", "171519773969", "971-711-280-000", "Chief Finance Officer", 60000.00, 1125.00, 1200.00, 1800.00, 357.14, 1500.00, 2000.00, 1000.00, 0.00);
        employees[3] = new Employee(4, "Isabella Reyes", "Regular", "06/16/1994", "460 Solanda Street Intramuros 1000, Manila", "786-868-477", "40-2511815-0", "341911411254", "416946776041", "876-809-437-000", "Chief Marketing Officer", 60000.00, 1125.00, 1200.00, 1800.00, 357.14, 1500.00, 2000.00, 1000.00, 0.00);
        employees[4] = new Employee(5, "Eduard Hernandez", "Regular", "09/23/1989", "National Highway, Gingoog, Misamis Occidental", "088-861-012", "50-5577638-1", "957436191812", "952347222457", "031-702-374-000", "IT Operations and Systems", 52670.00,  1125.00,  1053.40, 1580.10,  313.51,  1500.00, 1000.00, 1000.00, 0.00);     
        employees[5] = new Employee(6, "Andrea Mae Villanueva", "Regular", "02/14/1988", "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ", "918-621-603", "49-1632020-8", "382189453145", "441093369646", "317-674-022-000", "HR Manager", 52670.00,  1125.00,  1053.40, 1580.10,  313.51,  1500.00, 1000.00, 1000.00, 0.00); 
        employees[6] = new Employee(7, "Brad San Jose", "Regular", "03/15/1996", "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi ", "797-009-261", "40-2400714-1", "239192926939", "210850209964", "672-474-690-000", "HR Team Leader", 42975.00, 1125.00, 859.50, 1289.25,  255.80, 1500.00, 800.00,  800.00, 0.00); 
        employees[7] = new Employee(8, "Alice Romualdez", "Regular", "05/14/1992", "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte  ", "983-606-799", "55-4476527-2", "545652640232", "211385556888", "888-572-294-000", "HR Rank and File", 22500.00, 1125.00, 450.00, 675.00, 133.93, 1500.00, 500.00, 500.00, 0.00); 
        employees[8] = new Employee(9, "Rosie Atienza", "Regular", "09/24/1948", "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte ", "266-036-427", "41-0644692-3", "708988234853", "260107732354", "604-997-793-000", "HR Rank and File", 22500.00, 1125.00, 450.00, 675.00, 133.93, 1500.00, 500.00,  500.00, 0.00); 
        employees[9] = new Employee(10, "Roderick Alvaro", "Regular", "03/30/1988", "#284 T. Morato corner, Scout Rallos Street, Quezon City ", "053-381-386", "64-7605054-4", "578114853194", "799254095212", "525-420-419-000", "Accounting Head", 52670.00, 1125.00, 1053.40, 1580.10, 313.51, 1500.00, 1000.00, 1000.00, 0.00); 
        employees[10] = new Employee(11, "Anthony Salcedo", "Regular", "09/14/1993", "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate ", "070-766-300", "26-9647608-3", "126445315651", "218002473454", "210-805-911-000", "Payroll Manager", 50825.00, 1125.00, 1016.50, 2033.00, 302.53, 1500.00, 1000.00, 1000.00, 0.00); 
        employees[11] = new Employee(12, "Josie Lopez", "Regular", "01/14/1987", "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro ", "478-355-427", "44-8563448-3", "431709011012", "113071293354", "218-489-737-000", "Payroll Team Leader", 38475.00, 1125.00, 769.50, 1154.25, 229.02, 1500.00, 800.00, 800.00, 0.00); 
        employees[12] = new Employee(13, "Martha Farala", "Regular", "01/11/1942", "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte  ", "329-034-366", "45-5656375-0", "233693897247", "631130283546", "210-835-851-000", "Payroll Rank and File", 24000.00, 1125.00, 480.00, 720.00, 142.86, 1500.00, 500.00, 500.00, 0.00); 
        employees[13] = new Employee(14, "Leila Martinez", "Regular", "07/11/1970", "37/46 Kulas Roads, Maragondon 0962 Quirino  ", "877-110-749", "27-2090996-4", "515741057496", "101205445886", "275-792-513-000", "Payroll Rank and File", 24000.00, 1125.00, 480.00, 720.00, 142.86, 1500.00, 500.00, 500.00, 0.00); 
        employees[14] = new Employee(15, "Fredrick Romualdez", "Regular", "03/10/1985", "22A/52 Lubowitz Meadows, Pililla 4895 Zambales ", "023-079-009", "26-8768374-1", "308366860059", "223057707853", "598-065-761-000", "Account Manager", 53500.00, 1125.00, 1070.00, 1605.00, 318.45, 1500.00, 1000.00, 1000.00, 0.00); 
        employees[15] = new Employee(16, "Christian Mata", "Regular", "10/21/1987", "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu  ", "783-776-744", "49-2959312-6", "824187961962", "631052853464", "103-100-522-000", "Account Team Leader", 42975.00, 1125.00, 859.50, 1289.25, 255.80, 1500.00, 800.00, 800.00, 0.00); 
        employees[16] = new Employee(17, "Selena De Leon", "Regular", "02/20/1975", "89A Armstrong Trace, Compostela 7874 Maguindanao ", "975-432-139", "27-2090208-8", "587272469938", "719007608464", "482-259-498-000", "Account Team Leader", 41850.00, 1125.00, 837.00, 1255.50, 249.11, 1500.00, 800.00, 800.00, 0.00); 
        employees[17] = new Employee(18, "Allison San Jose", "Regular", "06/24/1986", "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union ", "179-075-129", "45-3251383-0", "745148459521", "114901859343", "121-203-336-000", "Account Rank and File", 22500.00, 1035.00, 450.00, 675.00, 133.93, 1500.00, 500.00, 500.00, 0.00); 
        employees[18] = new Employee(19, "Cydney  Rosario", "Regular", "10/06/1996", "93A/21 Berge Points, Tapaz 2180 Quezon ", "868-819-912", "49-1629900-2", "579253435499", "265104358643", "122-244-511-000", "Account Rank and File", 22500.00, 1035.00, 450.00, 675.00, 133.93, 1500.00, 500.00, 500.00, 0.00); 
        employees[19] = new Employee(20, "Mark Bautista", "Regular", "02/12/1991", "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino ", "683-725-348", "49-1647342-5", "399665157135", "260054585575", "273-970-941-000", "Account Rank and File", 23250.00, 1035.00, 465.00, 697.50, 138.39, 1500.00, 500.00, 500.00, 0.00); 
        employees[20] = new Employee(21, "Darlene Lazaro", "Probationary", "11/25/1985", "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino ", "740-721-558", "45-5617168-2", "606386917510", "104907708845", "354-650-951-000", "Account Rank and File", 23250.00, 1035.00, 465.00, 697.50, 138.39, 1500.00, 500.00, 500.00, 0.00); 
        employees[21] = new Employee(22, "Kolby Delos Santos", "Probationary", "02/26/1980", "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur ", "739-443-033", "52-0109570-6", "357451271274", "113017988667", "187-500-345-000", "Account Rank and File", 24000.00, 1080.00, 480.00, 720.00, 142.86, 1500.00, 500.00, 500.00, 0.00); 
        employees[22] = new Employee(23, "Vella Santos", "Probationary", "12/31/1983", "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur ", "955-879-269", "52-9883524-3", "548670482885", "360028104576", "101-558-994-000", "Account Rank and File", 22500.00, 1035.00, 450.00, 675.00,  133.93, 1500.00, 500.00, 500.00, 0.00); 
        employees[23] = new Employee(24, "Tomas Del Rosario", "Probationary", "12/18/1978", "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque", "882-550-989", "45-5866331-6", "953901539995", "913108649964", "560-735-732-000", "Account Rank and File", 22500.00, 1035.00, 450.00, 675.00,  133.93, 1500.00, 500.00, 500.00, 0.00); 
        employees[24] = new Employee(25, "Jacklyn Tolentino", "Probationary", "05/19/1984", "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao ", "675-757-366", "47-1692793-0", "753800654114", "210546661243", "841-177-857-000", "Account Rank and File", 24000.00, 1080.00, 480.00, 720.00, 142.86, 1500.00, 500.00, 500.00, 0.00); 
        employees[25] = new Employee(26, "Percival Gutierrez", "Probationary", "12/18/1970", "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur ", "512-899-876", "40-9504657-8", "797639382265", "210897095686", "502-995-671-000", "Account Rank and File", 24750.00, 1102.50, 495.00, 742.50, 147.32, 1500.00, 500.00, 500.00, 0.00); 
        employees[26] = new Employee(27, "Garfield Manalaysay", "Probationary", "08/28/1986", "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur ", "948-628-136", "45-3298166-4", "810909286264", "211274476563", "336-676-445-000", "Account Rank and File", 24750.00, 1102.50, 495.00, 742.50, 147.32, 1500.00, 500.00, 500.00, 0.00); 
        employees[27] = new Employee(28, "Lizeth Villegas", "Probationary", "12/12/1981", "66/77 Mann Views, Luisiana 1263 Dinagat Islands ", "332-372-215", "40-2400719-4", "934389652994", "122238077997", "210-395-397-000", "Account Rank and File", 24000.00, 1080.00, 480.00, 720.00, 142.86, 1500.00, 500.00, 500.00, 0.00); 
        employees[28] = new Employee(29, "Carol Ramos", "Probationary", "08/20/1978", "72/70 Stamm Spurs, Bustos 4550 Iloilo ", "250-700-389", "60-1152206-4", "351830469744", "212141893454", "395-032-717-000", "Account Rank and File", 22500.00, 1035.00, 450.00, 675.00, 133.93, 1500.00, 500.00, 500.00, 0.00); 
        employees[29] = new Employee(30, "Emelia Maceda", "Probationary", "04/14/1973", "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija ", "973-358-041", "54-1331005-0", "465087894112", "515012579765", "215-973-013-000", "Account Rank and File", 22500.00, 1035.00, 450.00, 675.00, 133.93, 1500.00, 500.00, 500.00, 0.00); 
        employees[30] = new Employee(31, "Delia Aguilar", "Probationary", "01/27/1989", "95 Cremin Junction, Surallah 2809 Cotabato ", "529-705-439", "52-1859253-1", "136451303068", "110018813465", "599-312-588-000", "Account Rank and File", 22500.00, 1035.00, 450.00, 675.00, 133.93, 1500.00, 500.00, 500.00, 0.00); 
        employees[31] = new Employee(32, "John Rafael Castro", "Regular", "02/09/1992", "Hi-way, Yati, Liloan Cebu ", "332-424-955", "26-7145133-4", "601644902402", "697764069311", "404-768-309-000", "Sales & Marketing", 52670.00, 1125.00, 1053.40, 1580.10, 313.51, 1500.00, 1000.00, 1000.00, 0.00); 
        employees[32] = new Employee(33, "Carlos Ian Martinez", "Regular", "11/16/1990", "Bulala, Camalaniugan ", "078-854-208", "11-5062972-7", "380685387212", "993372963726", "256-436-296-000", "Supply Chain and Logistics", 52670.00, 1125.00, 1053.40, 1580.10, 313.51, 1500.00, 1000.00, 1000.00, 0.00); 
        employees[33] = new Employee(34, "Beatriz Santos", "Regular", "08/07/1990", "Agapita Building, Metro Manila ", "526-639-511", "20-2987501-5", "918460050077", "874042259378", "911-529-713-000", "Customer Service and Relations", 52670.00, 1125.00, 1053.40, 1580.10, 313.51, 1500.00, 1000.00, 1000.00, 0.00); 
        
        
        // Create a Scanner object to read user input
        Scanner emp = new Scanner(System.in);

        // Prompt the user to input employee number
        System.out.print("Enter employee number: ");
        int inputEmployeeNumber = emp.nextInt();

        // Find the employee with the entered number
        Employee selectedEmployee = null;
        for (Employee employee : employees) {
            if (employee.geteNum() == inputEmployeeNumber) {
                selectedEmployee = employee;
                break;
            }
        }

        // Display employee details if found
        if (selectedEmployee != null) {
        System.out.println("=====================================");
        System.out.println("         Employee Information");
        System.out.println("=====================================");
            selectedEmployee.displayDetails();
        } else {
        System.out.println("Employee not found with the entered number.");

        }        
        // Close the scanner
        emp.close();
        
        }
        
    }
