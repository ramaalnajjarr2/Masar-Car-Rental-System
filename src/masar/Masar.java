
package masar;

import java.util.Scanner;
public class Masar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("               ========== Welcome To Masar RentalCar =========================");
        System.out.println("=============================================================================================");
        System.out.println("=============================================================================================");
        System.out.println("Enter 1 || if you new user to create new account "+"\n" +"Enter 2 || if you old user to Log in "
        +"\n" +"Enter 3 || To see details of Masar "
        +"\n"+"============================================================================================="
        +"\n"+"=============================================================================================");
        int x=in.nextInt();
        if (x==1){
        Users obj1 = new Users();
        obj1.createAccount();}
            else if(x==2){
        Users obj2 = new Users();
        obj2.Login();}
            else if(x==3){
        RentalCar obj=new Users();
        System.out.println(obj.Details());}
        System.out.println("=============================================================================================");
        System.out.println("=============================================================================================");
        System.out.println("Enter 1 || if you want to see normal cars "+"\n"+"Enter 2 || if you want to see  economy Cars"
               +"\n" +"Enter 3 || To see details of Masar "
                +"\n"+"============================================================================================="
                +"\n"+"=============================================================================================");
        int y=in.nextInt();
        if (y==1){
        Cars []carsnormal=new CarsNormal[15];
        carsnormal[0]=new CarsNormal(50,"      Dodge Challenger","Dodge        ","Black ",1148632,"available",2024);
        carsnormal[1]=new CarsNormal(50,"      Mercedes cls 63 ","Mercedes     ","wight ",7754678,"Rented",2023);
        carsnormal[2]=new CarsNormal(40,"      Ford Escape     ","Ford         ","rad   ",7884567,"available",2022);
        carsnormal[3]=new CarsNormal(16,"      Corolla         ","Toyota       ","Firani",3665779,"available",2022);
        carsnormal[4]=new CarsNormal(32,"      Camry           ","Toyota       ","Black ",9967678,"available",2020);
        carsnormal[5]=new CarsNormal(25,"      Dodge Challenger","Dodge        ","Gray  ",8845277,"available",2021);
        carsnormal[6]=new CarsNormal(45,"      Range Rover     ","Land Rover   ","Firani",3485678,"Rented",2019);
        carsnormal[7]=new CarsNormal(35,"      Audi A5         ","Audi Ag      ","Black ",4430890,"available",2020);
        carsnormal[8]=new CarsNormal(20,"      BM E93          ","BM           ","Gray  ",3945678,"available",2023);
        carsnormal[9]=new CarsNormal(41,"      J Class         ","Mercedes benz","Black ",3487678,"Rented",2021); 
        System.out.print("============================================================================================="+"\n"
        +"Number  PricePerDay  Name               tybe          color    Year   state       PlateNumber"
        +"\n"+"============================================================================================="+"\n");
        for(int i=0;i<10;i++){
        System.out.println(i+"   "+carsnormal[i].toString());}
        System.out.println("=============================================================================================");
        System.out.println("Enter numper car you need   ");
        System.out.println("=============================================================================================");
        int z=in.nextInt();
        System.out.println("=============================================================================================");
        System.out.println("=============================================================================================");
       System.out.println("Enter 1 || to show Details "+"\n" +"Enter 2 || to show CarState "
        +"\n" +"Enter 3 || To rent Car "+"\n" +"Enter 4 || To show rentel cost"+"\n" +"Enter 5 || To show Order Details"+"\n" +"Enter 6 || To return Car "
        +"\n"+"============================================================================================="
        +"\n"+"=============================================================================================");
            
        int s=in.nextInt();
        switch(s){
        case 1:
            System.out.println(carsnormal[z].toString());
                       break;
        case 2:
            System.out.println(carsnormal[z].getCarState());
                       break;
        case 3:
            ((CarsNormal)carsnormal[z]).rentCar();
        case 4:{
            ((CarsNormal)carsnormal[z]).rentelcost();}
        case 5:{
            
            System.out.println("Enter Order Date");
            String OrderDate=in.nextLine();
            String O=in.nextLine();
            System.out.println("Enter ReturnDate");
            String ReturnDate=in.nextLine();
            ((CarsNormal)carsnormal[z]).orderdetails(OrderDate, ReturnDate);
        }       break;                              
        case 6:
            ((CarsNormal)carsnormal[z]).returnCar();
            break;
            default:
            System.out.println("Invalid choice. Please try again.");
            }   }     
        
       else if(y==2){
       Cars []carseconomy=new CarsEconomy[15];
        carseconomy[0]=new CarsEconomy(26,"   Toyota Yaris      ","Toyota    ","Black ",1144332,"available",2023);
        carseconomy[1]=new CarsEconomy(50,"   Ford Fiesta       ","Ford      ","Red   ",3629779,"available",2024);
        carseconomy[2]=new CarsEconomy(31,"   Kia Seltos        ","Kia       ","White ",4472762,"available",2021);
        carseconomy[3]=new CarsEconomy(36,"   Toyota Corolla    ","Toyota    ","Ramadi",1099706,"available",2023);
        carseconomy[4]=new CarsEconomy(25,"   Mitsubishi Attrage","Mitsubishi","Firani",3435678,"available",2020);
        carseconomy[5]=new CarsEconomy(16,"   Honda City        ","Honda     ","Black ",9080701,"available",2019);
        carseconomy[6]=new CarsEconomy(20,"   Hyundai Accent    ","Hyundai   ","White ",6765342,"available",2023);
        carseconomy[7]=new CarsEconomy(30,"   Kia Pegas         ","Kia       ","Red   ",9000876,"available",2022);
        carseconomy[8]=new CarsEconomy(40,"   Toyota Prius      ","Toyota    ","Firani",5030890,"available",2022);
        carseconomy[9]=new CarsEconomy(27,"   Chevrolet Spark   ","Chevrolet ","Ramadi",6688152,"available",2021);
        System.out.print("============================================================================================="+"\n"
        +"Number  PricePerDay  Name               tybe        color    Year   state      PlateNumber"
        +"\n"+"============================================================================================="+"\n");
        for(int i=0;i<10;i++){
        System.out.println(i+"   "+carseconomy[i].toString());}
        System.out.println("=============================================================================================");
        System.out.println("Enter numper car you need   ");
        System.out.println("=============================================================================================");
        int z=in.nextInt();
        System.out.println("=============================================================================================");
        System.out.println("=============================================================================================");
        System.out.println("Enter 1 || to show Details "+"\n" +"Enter 2 || to show CarState "
        +"\n" +"Enter 3 || To rent Car "+"\n" +"Enter 4 || To show rentel cost"+"\n" +"Enter 5 || To show Order Details"+"\n" +"Enter 6 || To return Car "
        +"\n"+"============================================================================================="
        +"\n"+"=============================================================================================");
        int s=in.nextInt();
        switch(s){
        case 1:
            System.out.println(carseconomy[z].toString());
                       break;
        case 2:
            System.out.println(carseconomy[z].getCarState());
                       break;
        case 3:
            ((CarsEconomy)carseconomy[z]).rentCar();
                       break;
        case 4:
            ((CarsEconomy)carseconomy[z]).rentelcost();
                       
        case 5:{
            System.out.println("Enter Order Date");
            String OrderDate=in.nextLine();
            String O=in.nextLine();
            System.out.println("Enter ReturnDate");
            String ReturnDate=in.nextLine();
            ((CarsEconomy)carseconomy[z]).orderdetails(OrderDate, ReturnDate);}
                       break; 
                      
        case 6:
            ((CarsEconomy)carseconomy[z]).returnCar();
            break;
            default:
            System.out.println("Invalid choice. Please try again.");
            }    }
        else if(y==3){
        RentalCar obj=new Cars();
        System.out.println(obj.Details());}


    }}