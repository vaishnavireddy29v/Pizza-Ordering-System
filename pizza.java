package pizzadelivery;
import java.text.DecimalFormat;
import java.util.Scanner;

public class pizzahut{
public static void main(String args[]){	
DecimalFormat df = new DecimalFormat("#.##");
Scanner keyboard = new Scanner(System.in);

//  Variables
String firstName; // first name of user
char crustType; 
String crust; // name of crust
char size; // pizza size
double cost = 0.0; // pizza cost
final double taxRate = 0.08; // amount tax owed
double tax; // tax amount
double total; // total of pizza + toppings
double lastTotal; // total of everything
int numberOfToppings = 0;
int numberOfToppings2 =0;
int numberOfToppings3;
String toppings = "Cheese";

// Prompts for name & determines discount
System.out.println("Enter your name: " );
firstName = keyboard.nextLine();

//Prompts for distance 
double distance = 0;
double deliveryfee = 0;
System.out.println("Please enter total distance in meters from pizza shop (0 for in store pickup):");
distance = keyboard.nextDouble();
if (distance == 0){
deliveryfee = 0;
System.out.println("There is no delivery fee.");}
else if (distance > 1000){
deliveryfee = ((distance *0.015 ) +2);
System.out.println("Your delivery fee is: ₹" + df.format(deliveryfee));}
else if (distance > 0){
deliveryfee = 2.00;
System.out.println("Your delivery fee is: ₹" + df.format(deliveryfee));}
// Prompts for pizza size
System.out.print("What size of pizza would you like ? (S)mall,(M)edium,(L)arge(enter S,M or L):\n" );
size = keyboard.next().charAt(0);

if (size=='S' || size=='s'){
cost = 100.99;
}
else if (size=='M'|| size=='m'){
cost = 159.99;}
else if (size=='L'|| size=='l'){
cost = 220.99;}
else if(size!='M' && size!='m' && size!='L' && size!='l' && size!='S' && size!='s') {
System.out.println("The number you have entered is illegal, your pizza size will be set Small. " );
cost=100.99;
}
keyboard.nextLine();

// Prompts user for type of crust
System.out.print("What type of crust do you want? (H)and-Tossed, (T)hin-crust, or (D)eep-dish (enter H, T, or D,): " );
crustType = keyboard.nextLine().charAt(0);

if (crustType == 'H' || crustType == 'h' ){
crust = "Hand-Tossed";}
else if (crustType == 'T' || crustType == 't' ){
crust = "Thin-Crust";}
else if (crustType == 'D' || crustType == 'd' ){
crust = "Deep-Dish";}
else if (crustType != 'H' && crustType != 'h' && crustType != 'T' && crustType    != 't' && crustType != 'D' && crustType != 'd' ){
System.out.println("The crust type you have entered is illegal, your crust type will be set to hand-tossed. " );}
crust = "Hand-Tossed";

// Prompts user for additonal toppings
System.out.println("All pizzas come with cheese." );
System.out.println("Additional toppings are ₹2.00 each, choose from Pepperoni or Sausage." );

// Pepperoni
System.out.println("Do you want Pepperoni? (Y/N)" );
numberOfToppings = keyboard.nextLine().charAt(0);
if (numberOfToppings == 'Y' || numberOfToppings == 'y' ){
numberOfToppings = 1;
toppings = toppings + " and Pepperoni";}
else{
numberOfToppings = 0;
}

//Sausage
System.out.println("Do you want Sausage? (Y/N)" );
numberOfToppings2 = keyboard.nextLine().charAt(0);
if (numberOfToppings2 == 'Y' || numberOfToppings2 == 'y' ){
numberOfToppings2 = 1;
toppings = toppings + " and Sausage";}
else{
numberOfToppings2 = 0;} 


numberOfToppings3 = (numberOfToppings) + (numberOfToppings2);

// Calculations
total = (cost) + (numberOfToppings3 * 2.25) + (deliveryfee);
tax = total * taxRate;
lastTotal = total * ( 1 + taxRate );

// Payment Confirmation
System.out.println(firstName + ", here is your order:"); 
System.out.println(size + "pizza");
System.out.println(crust +", " + toppings);
System.out.println("Order Cost: ₹" + df.format(total));
System.out.println("Tax: ₹" + df.format(tax));
System.out.println("Total Due: ₹" + df.format(lastTotal));
    }
   }

