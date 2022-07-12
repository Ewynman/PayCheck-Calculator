import java.util.Scanner;

class pay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Does your job offer overtime pay?(1 for yes 2 for no): ");
        int overtime = scan.nextInt();

        System.out.println("did you work overtime this week?(1 for yes 2 for no): ");
        int question = scan.nextInt();

        if(question == 1){
            if(overtime == 1){
                System.out.println("Enter your horuly Wage: ");
                double wage = scan.nextInt();
        
                System.out.println("Enter The ammount of hours you worked: ");
                double hoursWorked = scan.nextInt();
    
                System.out.println("Enter The ammount of overtime hours you worked: ");
                double overtimeHours = scan.nextInt();

                double overtimeWage;
                double i = (wage/2);
                double j = i + wage;

                overtimeWage = j;
    
                System.out.println("Your Overtime Wage is: " + overtimeWage);
    
                double overtimepay = overtimeWage * overtimeHours;
                double nonOTwage = hoursWorked * wage;
    
                double pay = overtimepay + nonOTwage;
                System.out.println("Your total pay before taxes is: " + pay);
        }
        }else{
           
            System.out.println("Enter your horuly Wage: ");
            double wage = scan.nextInt();
    
            System.out.println("Enter The ammount of hours you worked: ");
            double hoursWorked = scan.nextInt();
            
            double toatalPay;
            toatalPay = wage * hoursWorked;

            System.out.println("Your total pay before taxes is: " + toatalPay);
        }
    }
}