package javahomeworkweek2;

/**
 * A calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation methods.
 */

public class SumWithParameters {
    //additional
    public static void additional(int a, int b){
        int answer = a + b;
        System.out.println("This is the answer "+answer);


    }
    public static void subtraction(int c, int d){
        //subtraction
        int answer = c - d;
        System.out.println("Subtraction of two number of " +c+ " and " +d+ " is " +answer);

    }

    public static void main(String[] args) {
        additional(20,40);
        subtraction(70,60);
        SumWithParameters one =  new SumWithParameters();
        one.multiplication(10,20);
        SumWithParameters two = new SumWithParameters();
        two.division(100, 50);

    }
    public void multiplication(int e, int f){
        //multiplication
        int answer = e * f;
        System.out.println("Multiplication of " +e+ " and " +f+ " number is " +answer);

    }
    public void division(int g, int h){
        //division
        int answer = g/h;
        System.out.println("Division of " +g+ " and " +h+ " is total " +answer);
    }

}
