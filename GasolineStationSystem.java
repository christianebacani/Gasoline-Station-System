import java.util.Scanner;

public class GasolineStationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to Bacani`s Gasoline Station!");
        
        System.out.print("Please choose the type of gas\n");
        
        System.out.print("1.) Leaded\n2.) Unleaded\n3.) Exit\n");
        System.out.print("Enter your choice : ");
        String userChoose = input.nextLine();
        
        if(userChoose.equals("1")){
            System.out.print("The gas fare per liter of Leaded Gas is : P 68\n");
            System.out.print("Enter how many liters of gas you want to refill : ");
            int liters = input.nextInt();
            
            int total = liters * 68;
            
            System.out.print("The total is : P " + total);
            System.out.print("\nEnter your payment : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            
            System.out.print("Change : P " + change);
                 
        }else if(userChoose.equals("2")){
            System.out.print("The gas fare per liter of Uneaded Gas is : P 72\n");
            System.out.print("Enter how many liters of gas you want to refill : ");
            int liters = input.nextInt();
            
            int total = liters * 72;
            
            System.out.print("The total is : P " + total);
            System.out.print("\nEnter your payment : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            
            System.out.print("Change : P " + change);
            
        }else if (userChoose.equals("3")){
            System.out.print("EXITING APP---");
            
        }else{
            System.out.print("INVALID CHOICE!");
        }   
           
       
        System.out.print("\n\nTHANK YOU FOR VISITING OUR APP!");
        
        
    }
}

