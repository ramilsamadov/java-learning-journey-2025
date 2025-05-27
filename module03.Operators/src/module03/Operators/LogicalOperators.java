package module03.Operators;

public class LogicalOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // NOT operator '!' 
        // a > b returns true, then !true becomes false
        boolean result = !(a > b);
        System.out.println("NOT operator test result: " + result); // Output: false

        // AND operator '&&'
        // a > 2 returns true AND b < 7 returns true => result is true
        boolean result_and = a > 2 && b < 7;
        System.out.println("AND operator test result: " + result_and); // Output: true

        // OR operator '||'
        // a > 2 returns true OR b < 1 returns false => at least one is true => result is true
        boolean result_or = a > 2 || b < 1;
        System.out.println("OR operator test result: " + result_or); // Output: true

        // Ternary operator '?:'
        // If a > 6, result is true; else, false. Since a = 5, result is false
        boolean ternary_operator = a > 6 ? true : false;
        System.out.println("Ternary operator test result: " + ternary_operator); // Output: false
    }
}
