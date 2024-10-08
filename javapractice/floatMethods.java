package javapractice;

public class floatMethods {
    public static void main(String[] args) {
        //Function: isNaN()Purpose: Determines if the specified Float value is "Not-a-Number" (NaN).
        //Parameters to be Passed:None, when used with a Float object.
        //Return Type:boolean: true if the value is NaN, otherwise false.
        //Example:
        Float num = Float.NaN;

        System.out.println(num.isNaN());

        //Function: floatValue() Purpose: Returns the value of the Float object as a primitive float.
        //Parameters to be Passed:None. It works on the current Float object.
        //Return Type:float: the primitive float value.
        //Example:
        Float numb = 3.14f;
        float primitiveNum = numb.floatValue();

        System.out.println(primitiveNum);

        //Function: compare() Purpose: Compares two float values.
        //Parameters to be Passed:Two parameters: two float values to compare.
        //Return Type: int: 0 if both float values are equal,Positive value if the first float is greater,Negative value if the first float is smaller.
        //Example:
        float num1 = 3.14f;
        float num2 = 2.71f;

        System.out.println(Float.compare(num1, num2)); // Output: 1 (since 3.14 > 2.71)
        System.out.println(Float.compare(num2, num1));

        //Function: byteValue()Purpose: Converts the Float value to a primitive byte.
        //Parameters to be Passed:None. It works on the current Float object.
        //Return Type:byte: the byte representation of the Float value (truncated if necessary).
        //Example:
        Float numz = 123.45f;
        byte byteValue = numz.byteValue();

        System.out.println(byteValue);

        //Function: shortValue() Purpose: Converts the Float value to a primitive short.
        //Parameters to be Passed: None. It works on the current Float object.
        //Return Type:short: the short representation of the Float value (truncated if necessary).
        //Example:

        Float numx = 12345.67f;
        short shortValue = numx.shortValue();

        System.out.println(shortValue);

        //Function: parseFloat() Purpose: Converts a String into a primitive float.
        //Parameters to be Passed:One parameter: a String representing a floating-point number.
        //Return Type: float: the float value parsed from the string.
        //Example:

        String str = "3.14";
        float numc = Float.parseFloat(str);

        System.out.println(numc);

    }
}
