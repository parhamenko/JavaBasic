/**
 * Java Basic. Home Work #1
 *
 * @author Parhamenko Andrii
 * @todo 7.09.2022
 * @date 11.09.2022
 */
class HomeWork2 {
    public static void main(String[] args) {
        //task 1
        checkWeather(29);
         //task2
        boolean isWeekend = true;
        boolean isRain = true;
        boolean walk = canWalk(isWeekend, isRain);
        System.out.printf ("Can I walk : %b%n", walk);
        //task 3
        int a = 3;
        int b = 5;
        int resultSum = sum (a, b);
        System.out.printf ("Sum : %d%n", resultSum);
        
        int resultSub = sub (a, b);
        System.out.printf ("Sub : %d%n", resultSub);
        
        int resultMultiple = multiple (a, b);
        System.out.printf ("multiple : %d%n", resultMultiple);
        
        float resultDiv = div (a, b);
        System.out.printf ("div : %.2f%n", resultDiv);


        


    }
    public static void checkWeather(int t) {
        //int t = -1;
        if (t < 0) {
            System.out.println ("It's frost");
            return; 
        }
        
        if (t < 18) {
            System.out.println ("It's cold!");
            return;
        }
        
        if (t < 28) {
            System.out.println ("It's warm!");
            return;
        }
            
        System.out.println ("It's Hot!");
    }
    
        //task2
    public static boolean canWalk(boolean isWeekend, boolean isRain) {
        return isWeekend && !isRain;
        
    }
    
    public static int sum (int a, int b) {
        return a + b;
        
    }
    
        public static int sub (int a, int b) {
        return a - b;
        
    }
    
        public static int multiple (int a, int b) {
        return a * b;
        
    }
    
        public static float div (int a, float b) {
        return a / b;
        
    }
}