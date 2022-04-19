public class App {
    //This method takes in two int parameters to add.
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }

    //This method takes in 3 int parameters to add.
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    // returns the greater integer value
    private static int greaterValue(int num1, int num2){
        return Math.max(num1,num2);
        //Math.max is used to return the greatest value between the given numbers
    }

    // returns the greater double value
    private static double greaterValue(double num1, double num2){
        return Math.max(num1,num2);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //calls that take in 2 parameters, and 3 parameters
        //computes their sum.

        System.out.println("The sum of 9 and 20 is "+computeSum(9,20));
        System.out.println("The sum of 11 and 12 and 13 is "+computeSum(11,12,13));

        //Call the greaterValue method with integer parameters

        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        //Call the greaterValue method with double parameters
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}
