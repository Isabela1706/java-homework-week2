package javahomeworkweek2;

/**
 * Java programme
 * Declare two static variables
 * Declare one static method
 * Call both static variables into the static method inside the print statement.
 * Declare the Main method.
 * Call the static method into the Main method and Run the programme.
 */

public class StaticVariable {
    //static variable
    static int a = 25;
    static String message = "Twentyfive";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(message);
        System.out.println("New method starts here");
        StaticVariable sv = new StaticVariable();
        sv.met();


    }
    public void met(){
        //static method
        System.out.println(StaticVariable.a);
        System.out.println(StaticVariable.message);
    }
}
