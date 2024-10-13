package javahomeworkweek2;

/**
 * Java programme
 * Declare one instance and one static variable.
 * Declare one instance method.
 * Declare one static method.
 * Call both instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */

public class MixVariables {
    //instance and static variable
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        MixVariables A = new MixVariables();
        System.out.println(A.a);
        System.out.println(b);
        System.out.println("Methods starts here");
        A.mn();



    }
public void mn(){
    System.out.println(a);
    System.out.println(MixVariables.b);
}

}
