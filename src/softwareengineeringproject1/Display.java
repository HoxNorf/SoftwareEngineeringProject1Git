/**
 * 
 */

import java.io.IOException;
import java.util.*;

public class Display extends ATM{
// public class Display{
    
    public int screen() {

        System.out.println("PROJECT ATM\n");
        System.out.print("Account number:\n");
        System.out.print("Enter pin:\n");

        while (true) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            mainMenu();

            int choice = myObj.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Exit.");
                break;
            }

            if (choice == 1) {
                checkBalanceDisplay();
            }

            if (choice == 2) {
                boolean advance = false;
                while (!advance){
                    withdrawDisplay();
                    System.out.print("Choose the option given: ");
                    int choiceWithdraw = myObj.nextInt();
                    if (choiceWithdraw == 1){
//                       if (amount - 20 >= 0){
//                            deposit(20);
//                            advance = true;
//                       } else {
//                            System.out.println("Insufficient funds!");
//                       }
                    } else if (choiceWithdraw == 2){
//                       if (amount - 40 >= 0){
//                            deposit(40);
//                            advance = true;
//                       } else {
//                            System.out.println("Insufficient funds!");
//                       }
                    } else if (choiceWithdraw == 2){
//                       if (amount - 40 >= 0){
//                            deposit(40);
//                            advance = true;
//                       } else {
//                            System.out.println("Insufficient funds!");
//                       }
                    } else if (choiceWithdraw == 3){
//                       if (amount - 60 >= 0){
//                            deposit(60);
//                            advance = true;
//                       } else {
//                            System.out.println("Insufficient funds!");
//                       }
                    } else if (choiceWithdraw == 4){
//                       if (amount - 80 >= 0){
//                            deposit(80);
//                            advance = true;
//                       } else {
//                            System.out.println("Insufficient funds!");
//                       }
                    } else if (choiceWithdraw == 5){
//                       if (amount - 100 >= 0){
//                            deposit(100);
//                            advance = true;
//                       } else {
//                            System.out.println("Insufficient funds!");
//                       }
                    } else if (choiceWithdraw == 6){
//                       if (amount - 120 >= 0){
//                            deposit(120);
//                            advance = true;
//                       } else {
//                            System.out.println("Insufficient funds!");
//                       }
                    } else if (choiceWithdraw == 7){
//                       if (amount - 140 >= 0){
//                            deposit(140);
//                            advance = true;
//                       } else {
//                            System.out.println("Insufficient funds!");
//                       }
                    } else {
                        advance = true;
                    }   
                }
            }

            if (choice == 3) {//This is our keypad, user chose 3, send 3 back to the atm.
                return 3;
            }

            if (choice == 4) {
                transferDisplay();
            }

        }
        return 0;
    }


    public void Login() throws IOException{

    }


    public void mainDisplay(){

    }


    public void mainMenu(){
        System.out.println("\n_____________________");
        System.out.println("|     Main Menu        |");
        System.out.println("|[1] View Balance      |");
        System.out.println("|[2] Withdraw Cash     |");
        System.out.println("|[3] Deposit Cash      |");
        System.out.println("|[4] Transfer          |");
        System.out.println("|[5] Exit              |");
        System.out.println("|______________________|");
    }


    public void checkBalanceDisplay() {
        System.out.println("Display balance here");
        //checkings or savings?
    }

    public float depositDisplay() {
        System.out.println("Deposit amount: 50 ");
        float amount=50;//Replace this with user input.
        //checkings or savings?
        return amount;
    }

    public void withdrawDisplay() {
        System.out.println(" _____________________");
        System.out.println("|[1] $20      [5] $100|");
        System.out.println("|[2] $40      [6] $120|");
        System.out.println("|[3] $60      [7] $140|");
        System.out.println("|[4] $80      [8] Exit|");
        System.out.println("|_____________________|");
        //checking or savings?

    }

    public void transferDisplay() {
        System.out.println(" We will transfer here");
    }

}
