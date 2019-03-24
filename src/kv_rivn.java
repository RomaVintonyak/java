import java.util.Scanner;

public class kv_rivn {
/**
 * square equation
 * @param args
 */
public static void main(String [] args){
    System.out.println("untie the square equation  ax^2+bx+c=0");
    double a, b, c;
    System.out.println("enter the first variable a:  ");
    Scanner scan = new Scanner(System.in);
    a = scan.nextDouble();
    System.out.println("enter the second variable b:  ");
    b = scan.nextDouble();
    System.out.println("enter the third variable c:  ");
    c = scan.nextDouble();
    scan.close();
    double d, x = 0, x1 = 0;
    d=Math.pow(b, 2)-(4*a*c);	//find a descriminant
    if (d>0)
    {
        x = (-b + Math.sqrt(d))/(2*a);
        x1 = (-b-Math.sqrt(d))/(2*a);
    }
    else if (d==0)
    {
        x = -b/(2*a);
    }
    else
    {System.out.println("This equation has no solution");}

    System.out.println("first value х  " + x + " second value х  " + x1 + " descreminant of this equation " + d);

}

}
