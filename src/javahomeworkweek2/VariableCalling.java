package javahomeworkweek2;

/**
 * Java programme
 * Declare two instance and two static variables.
 * Declare one instance method.
 * Declare one static method.
 * Call all four instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */

public class VariableCalling {
    //This is instance variable
    String name = "This is my number";
    int a = 112;
    //This is static variable
    static int number = 221;
    static String message = "Text on this for message";

    public static void main(String[] args){
        //this methods include for static
        VariableCalling abz = new VariableCalling();
        System.out.println(abz.name);
        System.out.println(abz.a);
        System.out.println(VariableCalling.number);
        System.out.println(VariableCalling.message);


    }
public void im(){
        //this method is for instance variable
VariableCalling abz = new VariableCalling();
    System.out.println(name);
    System.out.println(a);

}
}
