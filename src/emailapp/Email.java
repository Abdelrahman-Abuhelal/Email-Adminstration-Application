package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int defaultPassNumber=10;
    private int mailCapicity=50;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println("Department is: "+this.department);
        this.password=randomPassword(defaultPassNumber);
        System.out.println("Your pass is "+getPassword());
        this.email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+".company.com";
        System.out.println("Your email is: "+this.email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String setDepartment() {
        System.out.println("Hi "+getFirstName());
        System.out.print("Enter your department: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \n");
        Scanner input =new Scanner(System.in);
        int choice=input.nextInt();
        switch (choice) {
            case 1:
                return this.department = "Sales";
            case 2:
                return this.department = "Development";
            case 3:
                return  this.department = "Accounting";
            default:
                return  this.department = "";
        }
    }

    public String getDepartment() {
        return department;
    }
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$";
        char[]ListedPass=passwordSet.toCharArray();
        String generatedPass="";
        for (int i=0;i<length;i++){
            int random=(int)(Math.random()* passwordSet.length());
            generatedPass +=  ListedPass[random];
        }
        return generatedPass;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getMailCapicity() {
        return mailCapicity;
    }

    public void setMailCapicity(int mailCapicity){
        this.mailCapicity=mailCapicity;
    }

    @Override
    public String toString() {
        return "The employee : "+getFirstName()+" "+getLastName()+" has the email: "+getEmail()+" with capicity: "+getMailCapicity()+"(GB)";
    }
}
