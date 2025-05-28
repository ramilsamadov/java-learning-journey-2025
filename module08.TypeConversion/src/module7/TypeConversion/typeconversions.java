package module7.TypeConversion;

public class typeconversions {

    public static void main(String[] args) {
        String a = "5";
        int c = 5;
        Integer a_int = Integer.valueOf(a);  // Use wrapper class, not primitive
        System.out.println(a_int.getClass().getName());  // Prints: java.lang.Integer
        System.out.println(a_int.getClass().getSimpleName()); //Prints: Integer
        
        String c_str = String.valueOf(c);
        System.out.println(c_str.getClass().getSimpleName());
        
        double d = 5.50;
        int d_int = (int)d;
        System.out.println(d_int);
        
        double c_double = (double)c;
        System.out.println(c_double);
        
        float f = 5.15f;
        long f_long = (long)f;
        System.out.println(f_long);
        
    }
}
