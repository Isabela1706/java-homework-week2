package javahomeworkweek2;

/**
 * Java programme
 * Declare two instance variables.
 * Declare one instance method.
 * Call both instance variables into the instance method inside the print statement.
 * Declare the Main method.
 * Call the above instance method into the Main method and Run the programme.
 */

public class InstanceVariable{
    //Two Instancve Variable
    int a = 35;
    int b = 25;
    public static void main(String[] args) {
        InstanceVariable A = new InstanceVariable();
        System.out.println(A.a);
        System.out.println(A.b);
        System.out.println("MT starts here");
        A.MT();




    }
    public void MT(){
        //instance method
        System.out.println(a);
        System.out.println(b);
    }
}


