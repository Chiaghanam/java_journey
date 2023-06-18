/*

NAME:CHIAGHANAM AMOBICHHUKWU
MATRIC NO.:ADUN/FS/20/430
COURSE:SEN102
DEPARTMENT:SOFTWARE ENGINEERING
SITE NAME(PACKAGE):BMI
FUNCTION:CALCULATE THE BODY MASS INDEX
LANGUAGE:JAVA

*/
import java.util.Scanner;//IMPORT SCANNER
public class BMi{//OPEN CLASS
	public static void main(String[]args){//MAIN
		Scanner input=new Scanner(System.in);//PROGRAM FOR INPUT
		System.out.print("Input weight in pound:");//OUT PRINT FOR USER TO KNOW WHERE TO INPUT WEIGHT
		double weight=input.nextDouble();//INPUT WEIGHT PROGRAM

		System.out.print("Input height in inches:");//OUT PRINT FOR USER TO KNOW WHERE TO INPUT HEIGHT
		double inches=input.nextDouble();//PROGRAM TO INPUT HEIGHT

		System.out.println(weight/inches);//OUT PRINT RESULT
		}//END MAIN
			}//END CLASS


