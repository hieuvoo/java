import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        double squareAndAdd = (legA * legA) + (legB * legB);
        // (3 x 3) + (4 x 4) = 25
        double c = Math.sqrt(squareAndAdd);
        // square root of 25 = 5
        return c;
    }
}