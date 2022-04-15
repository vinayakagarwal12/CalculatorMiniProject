package calculator;
import java.util.*;
public class Calculator {
    public static double square_root(double x)
    {
        double ans = Math.sqrt(x);
        System.out.println("Square root of "+x+" = "+ans);
        return ans;
    }
    public static int factorial(int num){
        int res = 1 ;
        for(int i=num; i>=1; i--) {
            res = res*i;
        }
//        logger.info("Factorial of "+num);
//        logger.info("!"+num+" = "+c);
        System.out.println("The Result is "+res+"\n");
        System.out.println("");
        return res;
    }
    public static double natural_log(double num){
        double res = Math.log(num);
//        logger.info("Natural logarithm of"+num);
//        logger.info("log("+num+") = "+c	);
//        System.out.println("");
        System.out.println("The Result is "+ res+"\n");
        System.out.println("");
        return res;
    }
    public static double power_func(double num, double exp){
        double res = Math.pow(num,exp);
//        logger.info(num+" powers "+exp);
//        logger.info(num+"^"+exp+" = "+c);
//        System.out.println("");
        System.out.println("The Result is "+ res+"\n");
        System.out.println("");
        return res;
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int flag=0;
        int op;
        int num_int;
        double num_double,num_x,b;
        while(flag==0)
        {
            System.out.println("Enter the operation number \n"+
                    "1.Square root \n"+
                    "2.Factorial \n"+
                    "3.Natural logarithm (base е) \n"+
                    "4.Power function\n"+
                    "5:Exit\n");
            op = reader.nextInt();
            if(op==5)
            {
                flag=1;
            }
            else {
                switch(op) {
                    case 1:
                        System.out.print("Enter number: ");
                        num_double = reader.nextDouble();
                        square_root(num_double);
                        break;
                    case 2:
                        System.out.print("Enter number: ");
                        num_int = reader.nextInt();
                        factorial(num_int);
                        break;
                    case 3:
                        System.out.print("Enter number: ");
                        num_double = reader.nextDouble();
                        natural_log(num_double);
                        break;
                    case 4:
                        System.out.print("Enter number: ");
                        num_x = reader.nextDouble();
                        System.out.print("exponent: ");
                        b=reader.nextDouble();
                        power_func(num_x,b);
                        break;
                    default:
                        System.out.println("Invalid Code Entered try again");
                }
            }
        }
    }
}
