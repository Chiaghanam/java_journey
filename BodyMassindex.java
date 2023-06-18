/*
   LOCAL FITNESS CENTER:  The BMI(Body Mass index Calculator).using the BufferedReader Class!
   Programmer: Chimenem Olowu[for teaching purposes,Admiralty University of Nigeria, ADUN]
   Date:     12th August 2021
   File Name: BodyMassindex.java
   Purpose:   The program calculates body mass index by getting the vaues of height and weight in pounds from the user (java.io fuctions...using the System.in ()and System.out.ptintin() The program converts inches to meters; pounds to kilograms and before outouting the body mass of the user
*/
import javax.swing.JOptionPane;

public class BodyMassindex
{
    public static void main(String[]args)//main method
    {
    String weightString;
    String heightString;
    double weight;
    double height;
    double bodyMassIndex;

    weightString = JOptionPane.showInputDialog("Enter your weight in pounds and click OK");//gets the value of weight from the
    weight = Double.parseDouble(weightString);//convertstring to double

    heightString = JOptionPane.showInputDialog("Enter your height in inches and click OK");//gets the value of height from the
    height = Double.parseDouble(heightString);//convert String to double

    weight = weight*2.2;//to convert pounds to kilograms
    height = height*39.36;//to convert inches to meters

    bodyMassIndex = weight/height;

    System.out.println("\tYour weight is "+weight+"kilogram");
    System.out.println("\tYour height is "+height+"meters");
    System.out.println("");
    System.out.println("\tTherefore,your body mass is "+bodyMassIndex+"kilograms per meter");


    }//end of main method
}//end of class
