import java.util.Scanner;

public class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CREATE A PIN");
        int pin = sc.nextInt();
        int balance = 0;
        int attempts = 3;

    
        int option = 0;

        while(attempts > 0){
            System.out.println("ENTER PIN TO LOGIN INTO ACCOUNT");
        int loginPin = sc.nextInt();

            if(pin == loginPin){
                System.out.println("LOGIN SUCCESSFUL");
                System.out.println("ENTER OPTION: 1. CHECK BALANCE  2. WITHDRAW  3. DEPOSIT  4. EXIT");
                option=sc.nextInt();
                switch(option){

                    case 1:
                    System.out.println("YOUR CURRENT BALANCE IS: "+balance);
                    break;

                    case 2:
                    System.out.println("ENTER AMOUNT TO WITHDRAW");
                    int withdraw = sc.nextInt();

                    if(withdraw <= balance){
                        balance = balance - withdraw;
                        System.out.println("WITHDRAWAL SUCCESSFUL");
                    }
                    else{
                        System.out.println("INSUFFICIENT BALANCE");
                    }
                    break;

                    case 3:
                    System.out.println("ENTER AMOUNT TO DEPOSIT");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("DEPOSIT SUCCESSFUL");
                    break;

                    case 4:
                    System.out.println("EXITING...");
                    sc.close();
                    return;
                }
              

            }

                else {
                    attempts--;
                    if (attempts > 0) {
                        System.out.println("LOGIN UNSUCCESSFUL. " + attempts + " ATTEMPT(S) LEFT.");
                    } else {
                        System.out.println("LOGIN UNSUCCESSFUL. YOU HAVE USED UP ALL ATTEMPTS. ACCOUNT LOCKED.");
                        sc.close();
                        return;  // Exit program after 3 failed attempts
                    }
                }   
        }
    }
}  