/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masar;
import java.util.Scanner;
public class Users extends RentalCar implements Order{
    private String FirstName;
    private String LastName;
    private String userName;
    private String userEmail;
    private String userNumperPhone;
    private String gender;
    private int age;
    private String Password;
    private String Adress;
    public Users() {
    }
    public Users(String FirstName, String LastName, String userEmail, String userNumperPhone, String gender, int age, String Adress, String Password) {
       this.FirstName=FirstName;
       this.LastName=LastName;
        this.userEmail = userEmail;
        this.userNumperPhone = userNumperPhone;
        this.gender = gender;
        this.age = age;
        setPassword(Password);
        this.Adress = Adress;
    }
    
    public void createAccount(){
        Scanner in=new Scanner(System.in);
        System.out.println("Write your account information");
        System.out.println("-Enter you FisrtName");
        String FisrtName=in.nextLine();
        this.FirstName=FisrtName;
        System.out.println("-Enter you LastName");
        String LastName=in.nextLine();
        this.LastName=LastName;
        System.out.println("-Enter your age ");
        int age = in.nextInt();
                this.age = age;
        System.out.print(" ");
        String FirstNme=in.nextLine();
        System.out.println("-Enter your NumperPhone ");
        String NumperPhone = in.nextLine();
        this.userNumperPhone = NumperPhone;
        System.out.println("-Enter your Email");
        String Email = in.nextLine();
            this.userEmail = Email;
         System.out.println("-Enter your gender  ");
        String gender = in.nextLine();
                this.gender = gender;
        System.out.println("-Enter your Adress ");
        String Adress = in.nextLine();
                this.Adress = Adress;
        System.out.println("-Enter your password ");
        String Password = in.nextLine();
                setPassword(Password);
        userName=FirstName+LastName;
        System.out.println("               =========="+"Welcome "+userName+" ====================");
        System.out.println("========================================================================================");
        System.out.println("========================================================================================");
        System.out.println("your account information"+"\n"+
                "{Your Name} : "+this.userName+"\n"+
                "{Your Email} : "+this.userEmail+"\n"+
                "{Your gender} : "+this.gender+"\n"+
                "{Your Adress} : "+this.Adress+"\n"+
                "{Your age} : "+this.age+"\n"+
                "{Your Password} : "+this.Password);
    }
    public void Login(){
     Scanner in=new Scanner(System.in);
        System.out.println("-Enter you username");
        String username=in.nextLine();
        this.userName=username;
        System.out.println("-Enter your password ");
        String password = in.nextLine();        
    System.out.println("Welcome "+userName);        
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        if(Password.length()>=8)
        this.Password = Password;
        else
            System.out.println("Your Password must be at least 8 characters ");
    }     
    @Override
    public void orderdetails(String OrderDate,String ReturnDate){
                int OrderID=1;
        System.out.println(" [[[[[[[[[[[[[[[[[[[[ Details Your account ]]]]]]]]]]]]]]]]]]]]"+"\n"+
                "{Order ID} : "+OrderID+"\n"+
                "{OrderDate} : "+OrderDate+OrderDate+"\n"+
                "{ReturnDate} : "+ReturnDate+"\n"+
                "{Your Name} : "+this.userName+"\n"+
                "{Your Email} : "+this.userEmail+"\n"+
                "{Your gender} : "+this.gender+"\n"+
                "{Your Adress} : "+this.Adress+"\n"+
                "{Your age} : "+this.age+"\n");
                                ++OrderID;        ;
    }
  @Override
 public String Details(){
return "Name - Masar"+"\n"+"Adress - Jordan_Amman"+"\n"+"phoneNumber - 0797051281"+"\n"+"instagram - Masar_Rentalcar"+"\n"+"Facebook - Masar_Rentalcar";
}    
}
