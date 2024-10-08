package javapractice;

public class doubleMethods {
    public static void main(String[] args) {

        //Function: parseDouble() Purpose: Converts a String into a primitive double.
        //Parameters to be Passed: One parameter: a String representing a floating-point number in double precision.
        //Return Type: double: the double value parsed from the string.
        //Example:
        String str = "3.14159";
        double num = Double.parseDouble(str);
        System.out.println(num);

        //Function: sum() Purpose: Adds two double values.
        //Parameters to be Passed: Two parameters: two primitive double values.
        //Return Type: double: the sum of the two values.
        //Example:
        double num1 = 3.5;
        double num2 = 2.5;

        double result = Double.sum(num1, num2);

        System.out.println(result);

        //Function: max() Purpose: Returns the maximum of two double values.
        //Parameters to be Passed:
        //Two parameters: two primitive double values.
        //Return Type:double: the larger of the two values.
        //Example:
        double numz1 = 3.14159;
        double numz2 = 2.71828;
        double maxVal = Double.max(numz1, numz2);

        System.out.println(maxVal);

        //Function: min() Purpose: Returns the minimum of two double values.
        //Parameters to be Passed: Two parameters: two primitive double values.
        //Return Type: double: the smaller of the two values.
        //Example:
        double numc1 = 3.14159;
        double numc2 = 2.71828;

        double minVal = Double.min(numc1, numc2);

        System.out.println(minVal);

        //Function: longBitsToDouble() Purpose: Converts a long bit representation of a double into the actual double value.
        //Parameters to be Passed: One parameter: a long value representing the bits of the double.
        //Return Type:double: the double value represented by the long bits.
        //Example:
        long bits = 0x400921FB54442D18L;
        double numv = Double.longBitsToDouble(bits);

        System.out.println(numv);
    }
}
