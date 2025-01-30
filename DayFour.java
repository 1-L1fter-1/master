public class DayFour {
 /*   public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs ((a + b) - c) < 0.0001;

    }

*/
 public static int flipBit(int value, int bitIndex) {
     return value ^ (1 << ( bitIndex - 1));
 }
}