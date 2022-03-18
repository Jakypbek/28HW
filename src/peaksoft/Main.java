package peaksoft;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        
        System.out.println(sqrt.apply((double) 9));

    }

    public static UnaryOperator<Double> sqrt = Math::sqrt;
}
