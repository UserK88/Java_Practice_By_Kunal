package javapractice;

public class intMethods {

    public static void main(String[] args) {

        //equals() function
        //Parameters to be passed
        //return type
        //example

        //The .equals() method is used to compare two objects for equality.
        //It takes one parameter of type Object (any Java object).The parameter should be the object that you want to compare with the current object.
        //It returns a boolean value.true if the objects are considered equal, false otherwise.
        // example:
        Integer num1 = 5;
        Integer num2 = 5;
        Integer num3 = 10;

        System.out.println(num1.equals(num2));
        System.out.println(num1.equals(num3));



        //Function: compareTo() Purpose: Compares two Integer objects numerically
        //Parameters to be Passed: One parameter: an Integer object to compare with the current object.
        //Return Type: int: 0 if both integers are equal, Positive value if the current integer is greater, Negative value if the current integer is smaller.
        //Example:
        Integer nums1 = 5;
        Integer nums2 = 10;

        System.out.println(nums1.compareTo(nums2));
        System.out.println(nums2.compareTo(nums1));

        //Function: parseInt() Purpose: Converts a String into a primitive int.
        //Parameters to be Passed:One parameter: a String representing a numeric value.
        //Return Type: int: the integer value parsed from the string.
        //Example:
        String str = "123";
        int num = Integer.parseInt(str);

        System.out.println(num);

        //Function: valueOf() Purpose: Returns an Integer object holding the value of the specified int or String.
        // Parameters to be Passed:One parameter: either a String or an int value.
        //Return Type: Integer: an Integer object representing the value.
        //Example:
        int primitiveNum = 10;
        String strin = "20";

        Integer no1 = Integer.valueOf(primitiveNum);
        Integer no2 = Integer.valueOf(strin);

        System.out.println(no1);
        System.out.println(no2);

        //Function: toString() Purpose: Converts an Integer object or a primitive int into a String.
        //Parameters to be Passed:One parameter: an int value (for the static version), or none if it's an Integer object.
        //Return Type:String: the string representation of the integer.
        //Example:
        Integer numbe = 123;

        String str1 = numbe.toString();
        String str2 = Integer.toString(456);

        System.out.println(str1);
        System.out.println(str2);





    }
}
