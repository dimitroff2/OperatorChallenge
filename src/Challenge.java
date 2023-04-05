public class Challenge {
    public static void main(String[] args) {

        /*
        1. create a double variable with a value of 20.00
        2. create a second variable of type double with a value of 80.00
        3. add both number together then multiply by 100.00
        4. use the remainder operator to figure out what the remainder from the results of the operation in step three and 40.00 will be
        5. create a boolean variable that assigns the value true if the remainder in step four is 0.00 ir false if its not zero
        6. output the boolean variable just to see what the result is
        7. write and if-then statement that displays a message 'got some remainder' if the boolean in step five is not true.
         */

        double var1 = 20.00;
        double var2 = 80.00;
        double total = (var1 + var2) * 100;
        double rem = total % 40;
        //System.out.println(rem);
        boolean step5 = rem == 0.00 ? true : false;
        System.out.println(step5);
        if(!step5){
            System.out.println("Got some remainder");
        }
    }
}
