package Homework_lesson1;

/**
 * Created by Юрий on 25.05.2016.
 */
import java.util.Scanner;
public class Homework1 {
    public static void main (String [] args) {

        // задача 1
        Scanner sc = new Scanner(System.in);
        System.out.print ("Введите число a: ");
        double a = sc.nextDouble();
        System.out.print ("Введите число b: ");
        double b = sc.nextDouble();
        System.out.print ("Введите число c: ");
        double c = sc.nextDouble();
        double D = b*b - 4*a*c;
        if (D > 0)
        {
            double x1 = -b - (Math.sqrt(D)) / (2 * a);
            double x2 = -b + (Math.sqrt(D)) / (2 * a);
            System.out.println ("Корни уравнения x1: " + x1 + "x2: " + x2);
        }
        else if (D == 0)
        {
            double x = -b / (2 *a);
            System.out.println (" Корень уравнения x: " + x);
        }
        else
        {
            System.out.println ("Уравнение не имеет действительных корней");
        }


        // задача 2
        System.out.print ("Введите число а: ");
        int aa = sc.nextInt();
        System.out.print ("Введите число b: ");
        int bb = sc.nextInt();
        System.out.print ("Введите число c: ");
        int cc = sc.nextInt();
        int min;
        int med;
        int max;
        if (aa>=bb && aa>=cc)
        {
            max = aa;
            if (bb>=cc)
            {
                med = bb;
                min = cc;
            }
            else
            {
                med = cc;
                min = bb;
            }
        }
        else if (bb>=aa && bb>=cc)
        {
            max = bb;
            if (aa>=cc)
            {
                med = aa;
                min = cc;
            }
            else
            {
                med = cc;
                min = aa;
            }
        }
        else
        {
            max = cc;
            if (aa>=bb)
            {
                med = aa;
                min = bb;
            }
            else
            {
                med = bb;
                min = aa;
            }

        }
        System.out.print ("Числа от меньшего к большему:" + min + " " + med + " " + max);








    }

}
