import java.util.Scanner;

public class AndOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Age1:");
        int a1 = input.nextInt();
        System.out.print("Enter Age2:");
        int a2 = input.nextInt();
        System.out.print("Enter Age3:");
        int a3 = input.nextInt();
        System.out.print("Enter Age4:");
        int a4 = input.nextInt();
        System.out.print("Enter Age5:");
        int a5 = input.nextInt();
        if (a1 > a2 && a1 > a3 && a1 > a4 && a1 > a5) {
            System.out.print(a1+ " is greatest than " +a2 +" , " +a3 + " , " +a4 + " and " +a5);
        }
       else if (a2 > a1 && a2 > a3 && a2 > a4 && a2 > a5){
            System.out.print(a2+ " is greatest than " +a1 + " , " +a3 + " , " +a4 +" and " +a5);

        }
       if (a3>a1 && a3>a2 && a3>a4 && a3>a5){
           System.out.print(a3+ " is greatest than " +a1 + " , " +a2 + " , " +a4 + " and " +a5);

       }
       if (a4>a1 && a4>a2 && a4>a3 && a4>a5){
           System.out.print(a4+ " is greatest than " +a1 + " , " +a2 + " , " +a3 + " and " +a5);
       }
       if (a5>a1 && a5>a2 && a5>a3 && a5>a4){
           System.out.print(a5+ " is greater than " +a1 + " , " +a2 + " , " +a3 + " and " +a4);
       }
    }
}
