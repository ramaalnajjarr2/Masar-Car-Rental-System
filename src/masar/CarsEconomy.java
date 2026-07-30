
package masar;
import java.util.Scanner;
public class CarsEconomy extends Cars implements Rental,Order{
private double CarPricePerDay;
    public CarsEconomy() {
    }
    public CarsEconomy(double CarPricePerDay, String CarName, String CarType, String CarColor, double CarPlateNumber, String CarState, int CarReleaseYear) {
        super(CarName, CarType, CarColor, CarPlateNumber, CarState, CarReleaseYear);
        this.CarPricePerDay = CarPricePerDay;
    }
    
    @Override
    public void rentCar(){
    if (CarState=="available"){
    CarState="Rented";
    System.out.println("[[[[[[[[[[  The rental process was completed successfully Thank you for visiting Masar ]]]]]]]]]]");}
    else
            System.out.println("Invalid choice. Please try again.");
    }
    @Override
    public void returnCar(){
    if (CarState=="Rented"){
    CarState="available";
            System.out.println("[[[[[[[[[[ The return process was completed successfully Thank you for visiting Masar ]]]]]]]]]]");}


    }     @Override
public void rentelcost(){
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of days to rent:");
int numdays=in.nextInt();
double rentelcost=numdays*CarPricePerDay;
            System.out.println("rentelcost    "+rentelcost);
}
 @Override
    public void orderdetails(String OrderDate,String ReturnDate){
        int OrderID=1;
        System.out.println(" [[[[[[[[[[[[[[[[[[[[ Details Your Order ]]]]]]]]]]]]]]]]]]]]"+"\n"+
                "{Order ID} : "+OrderID+"\n"+
                "{OrderDate} : "+OrderDate+"1/6"+"\n"+
                "{ReturnDate} : "+ReturnDate+"\n"+
                "{CarPricePerDay} : "+this.CarPricePerDay+"\n"+
                "{CarName} : "+this.CarName+"\n"+
                "{CarType} : "+this.CarType+"\n"+
                "{CarColor} : "+this.CarColor+"\n"+
                "{CarPlateNumber} : "+this.CarPlateNumber+"\n"+
                "{CarReleaseYear} : "+this.CarReleaseYear);
        
                        ++OrderID;
    }

    @Override
  public String toString() {
return    "    "+CarPricePerDay+"     "+CarName+"  "+CarType+"  "+CarColor
        +"   "+CarReleaseYear+"   "+CarState +"   "+CarPlateNumber+"\n";}
}
