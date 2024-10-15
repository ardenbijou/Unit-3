package math_class;

/**
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //using math class which is a static class
        //static things (methods and variables) belong to the class rather than
        //objects (instance of the class)
        //we don't need to create an object since Math class is static
        // ClassName.methodName(); e.g. Math.random()
        // ClassName.staticVariableName(); e.g. Math.PI

        // abs
        int num1 = -2;
        
        // pow
        
        // sqrt
        


        //create a random number in the range [0,1)
        double random = Math.random();
        System.out.println(random);
        
        //create a random1 number in the range [0, 6)
        double random2 = Math.random();
        random2*= 6; //tryna change the range
        System.out.println(random2);
        // create a random number in the range [0,n]

        // create a random number in the range [m,n]



        //using the Random Class
        //This is not static so we have to create a Random object

        //create a Random object

        //get int with and without bound

        // get double





    }
}
