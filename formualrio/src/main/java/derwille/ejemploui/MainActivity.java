package derwille.ejemploui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    String checkbox1;
    String checkbox2;
    String checkbox3;
    String checkbox4;
    String radio;

    private RadioGroup radioSexGroup;

    protected ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        final EditText eNombre=(EditText) findViewById(R.id.eNombre);
        final EditText eCorreo=(EditText) findViewById(R.id.eCorreo);
        final EditText eTelefono= (EditText) findViewById(R.id.eTelefono);
        final TextView tName=(TextView) findViewById(R.id.tNombre);
        final TextView tMail=(TextView) findViewById(R.id.tCorreo);
        final TextView tTel=(TextView) findViewById(R.id.tTelefono);
        final TextView tSex=(TextView) findViewById(R.id.tSex);
        final TextView tHobbies=(TextView) findViewById(R.id.tHobbies);
        Spinner spinner = (Spinner) findViewById(R.id.sSpinner);

        adapter = ArrayAdapter.createFromResource(this, R.array.Cities,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        Button boton =(Button) findViewById(R.id.bBoton);

        radioSexGroup = (RadioGroup) findViewById(R.id.rGroup);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tName.setText(eNombre.getText());
                tMail.setText(eCorreo.getText());
                tTel.setText(eTelefono.getText());
                tHobbies.setText(checkbox1+checkbox2+checkbox3+checkbox4);

                int selectedId = radioSexGroup.getCheckedRadioButtonId();

                if (selectedId == R.id.rMale)
                    radio="Mujer";
                else if (selectedId == R.id.rFemale)
                    radio ="Hombre";
                else
                    radio="No seleccionado";

                tSex.setText(radio);

            }
        });


    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.cBici:
                if (checked)
                    checkbox1="Bicicleta ";
                else
                    checkbox1=" ";
                break;
            case R.id.cMusic:
                if (checked)
                    checkbox2="Musica ";
                else
                    checkbox2=" ";
                break;
            case R.id.cChess:
                if (checked)
                    checkbox3="Ajedrés ";
                else
                    checkbox3=" ";
                break;
            case R.id.cGuitar:
                if (checked)
                    checkbox4="Guitarra ";
                else
                    checkbox4=" ";
                break;
            // TODO: Veggie sandwich
        }
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
