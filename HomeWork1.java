/**
 * Java Basic. Home Work #1
 *
 * @author Parhamenko Andrii
 * @todo 5.09.2022
 * @date 7.09.2022
 */
class HomeWork1 {
    public static void main(String[] args) {
        // task 1
        int a = 5;
        System.out.println("We have a rectangle, side a " + a);
        int b = 10;
        System.out.println("side b" + b);
        System.out.println("We need to calculate the perimeter and area of the figure. p - Perimeter, s - Area.");
        System.out.println("Perimeter = 2 * (a+b)"); 
        int p = 2 * ( 5 + 10 );
        System.out.println ("p =" + p);
        System.out.println("Area = a*b");
        int s = 5 * 10;
        System.out.println("s =" + s);

        // task 2
        a = 5;
        b = 3;
        float x = 5 * 3;
        float z = 5 / 3f;
        float y = 5 + 3;
        float q = 5 - 3;
        System.out.printf("%f%n%f%n%f%n%f%n", x,z,y,q);

        //task 3
        int[] array = new int [5];
        array[0] = 2; array[1] = 4;
        array[2] = 6; array[3] = 8;
        array[4] = 10;
        for (int n : array) System.out.println(n);
    }
}