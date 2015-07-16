package ceron.gabriel.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tNumero1=(EditText) findViewById(R.id.tNumero1);
        final EditText tNumero2=(EditText) findViewById(R.id.tNumero2);
        final TextView tResultado=(TextView) findViewById(R.id.tResultado);

        Button bMas=(Button) findViewById(R.id.bMas);
        Button bMenos=(Button) findViewById(R.id.bMenos);
        Button bMult=(Button) findViewById(R.id.bMult);
        Button bDiv=(Button) findViewById(R.id.bDiv);


        bMas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double num1,num2,resultado;
                num1 = Double.parseDouble(tNumero1.getText().toString());
                num2 = Double.parseDouble(tNumero2.getText().toString());
                resultado=num1+num2;
                tResultado.setText(Double.toString(resultado));
            }
        });

        bMenos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double num1,num2,resultado;
                num1 = Double.parseDouble(tNumero1.getText().toString());
                num2 = Double.parseDouble(tNumero2.getText().toString());
                resultado=num1-num2;
                tResultado.setText(Double.toString(resultado));
            }
        });

        bMult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double num1,num2,resultado;
                num1 = Double.parseDouble(tNumero1.getText().toString());
                num2 = Double.parseDouble(tNumero2.getText().toString());
                resultado=num1*num2;
                tResultado.setText(Double.toString(resultado));
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double num1,num2,resultado;
                num1 = Double.parseDouble(tNumero1.getText().toString());
                num2 = Double.parseDouble(tNumero2.getText().toString());
                resultado=num1/num2;
                tResultado.setText(Double.toString(resultado));
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        final TextView textBox =(TextView) findViewById(R.id.tResultado);
        CharSequence userText = textBox.getText();
        outState.putCharSequence("savedText", userText);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedState) {
        super.onRestoreInstanceState(savedState);
        final TextView textBox = (TextView) findViewById(R.id.tResultado);
        CharSequence userText = savedState.getCharSequence("savedText");
        textBox.setText(userText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
