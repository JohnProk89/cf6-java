package gr.aueb.cf.ch5methodsfloatdouble;

/**
 * Declares float / double variables.
 */
public class DeclarationsApp {

    public static void main(String[] args) {

//      float ff = 5.6; // compile error
        float suffixedFloat = 3.5F; // double typecast to float
        double literalDouble = 14.8;

        float suffixedIntToFloat = 22F; // int typecast RS to float, increases efficiency
        float intToFloat = 4; // int typecast LS to float
        double suffixedIntToDouble = 19D; // int typecast RS to double, increases efficiency
        double IntToDouble = 19; // int typecast LS to double

        final float LIGHT_SPEED = 3.0E5F;
        final double PI = 3.1415;
    }
}
