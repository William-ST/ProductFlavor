package productflavors.calculator;

import android.util.Log;

/**
 * Created by William_ST on 20/03/17.
 */

public class Operation {

    private double number1;
    private double number2;

    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
        Log.w("Operation", "result; "+(number1*number2));
    }
}
