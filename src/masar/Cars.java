
package masar;
public class Cars extends RentalCar {
protected String CarName;
protected String CarType;
protected int CarReleaseYear;
protected String CarColor;
protected double CarPlateNumber;
protected String CarState;
    public Cars() {}
    public Cars(String CarName, String CarType, String CarColor, double CarPlateNumber, String CarState, int CarReleaseYear) {
        this.CarName = CarName;
        this.CarType = CarType;
        this.CarReleaseYear = CarReleaseYear;
        this.CarColor = CarColor;
        this.CarPlateNumber = CarPlateNumber;
        setCarState(CarState);
    }
    public String getCarState() {
        return CarState;
    }
    public void setCarState(String CarState) {
        if (CarState=="available")
        this.CarState = CarState;
        else if (CarState=="Rented")
        this.CarState = CarState;
        else  if (CarState=="maintenance")
        this.CarState = CarState;}
    @Override
     public String Details(){
     return "Name - Masar"+"\n"+"Adress - Jordan_Amman"+"\n"+"phoneNumber - 0797051281"+"\n"+"instagram - Masar_Rentalcar"+"\n"+"Facebook - Masar_Rentalcar";
     }}
