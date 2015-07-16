package ceron.gabriel.notas;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tQuices =(EditText) findViewById(R.id.tQuices);
        final EditText tProye=(EditText) findViewById(R.id.tProye);
        final EditText tLabs= (EditText) findViewById(R.id.tLabs);
        final EditText tExpo= (EditText) findViewById(R.id.tExpo);
        Button boton= (Button) findViewById(R.id.bBoton);
        final TextView tProm=(TextView) findViewById(R.id.tProm);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double promedio;
                promedio=Double.parseDouble(tQuices.getText().toString())*0.15+Double.parseDouble(tProye.getText().toString())*0.4+Double.parseDouble(tExpo.getText().toString())*0.1+Double.parseDouble(tLabs.getText().toString())*0.35;
                tProm.setText(Double.toString(promedio));
            }

        });


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
