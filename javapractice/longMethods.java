package javapractice;

public class longMethods {
    public static void main(String[] args) {

        //Function: parseLong() Purpose: Converts a String into a primitive long.
        //Parameters to be Passed: One parameter: a String representing a long integer.
        //Return Type:long: the long value parsed from the string.
        //Example:
        String str = "123456789";
        long num = Long.parseLong(str);
        System.out.println(num);

        //Function: bitCount() Purpose: Returns the number of one-bits in the two's complement binary representation of the specified long value.
        //Parameters to be Passed: One parameter: a primitive long value.
        //Return Type: int: the number of one-bits in the binary representation of the long value.
        //Example:
        long numx = 7L; // Binary: 111

        int bitCount = Long.bitCount(numx);

        System.out.println(bitCount);

        //Function: valueOf() Purpose: Returns a Long object holding the value of the specified primitive long or String.
        //Parameters to be Passed: One parameter: either a String or a primitive long.
        //Return Type: Long: an object representing the specified long value.
        //Example:
        long primitiveNum = 100000L;
        String string = "200000";

        Long num1 = Long.valueOf(primitiveNum);
        Long num2 = Long.valueOf(string);

        System.out.println(num1);
        System.out.println(num2);

        //Function: toString() Purpose: Converts a Long object or primitive long into a String.
        //Parameters to be Passed: One parameter: a primitive long (for the static version), or none if called on a Long object.
        //Return Type: String: the string representation of the long value.
        //Example:
        Long numz = 123456789L;

        String str1 = numz.toString();
        String str2 = Long.toString(987654321L);

        System.out.println(str1);
        System.out.println(str2);

        //Function: bitCount() Purpose: Returns the number of one-bits in the two's complement binary representation of the specified long value.
        //Parameters to be Passed:One parameter: a primitive long value.
        //Return Type:int: the number of one-bits in the binary representation of the long value.
        //Example:
        long numv = 7L;

        int bitCountt = Long.bitCount(numv);

        System.out.println(bitCountt);
    }
}
