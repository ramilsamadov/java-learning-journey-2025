package module05.Scope;

public class staticClassScope {
    static int count = 0; // class scope

    public void Counter() {
        count++;
    }

    public static void printCount() {
        System.out.println("Total objects: " + count);
    }
}
