package com.Akash;
import java.util.*;

abstract class calculate{
    protected double var1,var2;
    calculate(double var1,double var2){
        this.var1 = var1;
        this.var2 = var2;
    }
    abstract double calculate();
}
class Subtract extends calculate{
    Subtract(double var1,double var2){
        super(var1,var2);
    }
    double calculate(){
        return this.var1-this.var2;
    }
}
class Mul extends calculate{
    Mul(double var1,double var2){
        super(var1,var2);
    }
    double calculate(){
        return this.var1*this.var2;
    }
}
class Div extends calculate{
    Div(double var1,double var2){
        super(var1,var2);
    }
    double calculate(){
        if(this.var1==0 || this.var2==0) {
            System.out.println("One of the elements are zero");
            return -1;
        }
        else
            return this.var1/this.var2;
    }
}
class Add extends calculate{
    Add(double var1,double var2){
        super(var1,var2);
    }
    double calculate(){
        return this.var1+this.var2;
    }
}
public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter both no's = ");
            double num1, num2;
            calculate v;
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            System.out.println("     --------Calculator App-----------");
            System.out.println("Press + to add");
            System.out.println("Press - to subtract");
            System.out.println("Press * to multiply");
            System.out.println("Press / to divide");
            System.out.println("Enter your choice = ");
            sc.nextLine();
            char choice = sc.nextLine().charAt(0);
            switch (choice) {
                case '+':
                    v = new Add(num1, num2);
                    System.out.println("The result is = " + v.calculate());
                    break;
                case '-':
                    v = new Subtract(num1, num2);
                    System.out.println("The result is = " + v.calculate());
                    break;
                case '*':
                    v = new Mul(num1, num2);
                    System.out.println("The result is = " + v.calculate());
                    break;
                case '/':
                    v = new Div(num1, num2);
                    System.out.println("The result is = " + v.calculate());
                    break;
                default:
                    System.out.println("The choice is wrong");
            }
            System.out.println("Press 1 to continue = ");
            ch = sc.nextInt();
        }while(ch == 1);
    }
}
