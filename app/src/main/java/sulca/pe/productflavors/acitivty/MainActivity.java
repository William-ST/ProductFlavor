package sulca.pe.productflavors.acitivty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import productflavors.calculator.Operation;
import sulca.pe.productflavors.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Operation operation = new Operation(2, 4);
    }

}
