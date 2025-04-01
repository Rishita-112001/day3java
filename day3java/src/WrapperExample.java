public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing: primitive to wrapper class
        Integer intObj = 100;  // Autoboxing from int to Integer
        Double doubleObj = 5.67; // Autoboxing from double to Double

        // Unboxing: wrapper class to primitive
        int primitiveInt = intObj;  // Unboxing from Integer to int
        double primitiveDouble = doubleObj;  // Unboxing from Double to double

        // Using some wrapper class methods
        String str = intObj.toString();  // Integer to String
        System.out.println("Integer as string: " + str);  // Output: "100"

        // Parsing strings to primitive types
        int parsedInt = Integer.parseInt("123");
        System.out.println("Parsed integer: " + parsedInt);  // Output: 123

        // Comparing wrapper objects
        Integer anotherIntObj = 200;
        System.out.println(intObj.compareTo(anotherIntObj));  // Output: -1 (because 100 < 200)
    }
}
