package javahomeworkweek2;

/**
 * Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 *
 */


public class ComputeExpressions {
    public static void main(String[] args) {
        //float and double variable is use
        double a = 25.5;
        float b = 3.5f;
        float c = 3.5f;
        float d = 3.5f;
        double f = 40.5;
        float g = 4.5f;
        System.out.println((a*b-c*d)/(f-g));


    }
}
