package comtillie1hello_world.httpsgithub.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    /*
 * Called when the player clicks one button.
 */
    public void onBtnClickGroep(View view) {
        EditText txtBedrag = (EditText) findViewById(R.id.editBedrag);
        EditText txtTotaalBedrag = (EditText) findViewById(R.id.editTotaalBedrag);
        EditText txtPercentage = (EditText) findViewById(R.id.editPercentage);
        float p = Float.parseFloat(txtPercentage.getText().toString());
        float b = Float.parseFloat(txtBedrag.getText().toString());
        float totaal = (float) (b*(1.0+(p/100.0)));
        txtTotaalBedrag.setText(String.format("%.2f", totaal));
    }

    public void onBtnClickPersoon(View view) {
        EditText txtBedrag = (EditText) findViewById(R.id.editBedrag);
        EditText txtPercentage = (EditText) findViewById(R.id.editPercentage);
        EditText txtPersonen = (EditText) findViewById(R.id.editPersonen);
        EditText txtBedragPerPersoon = (EditText) findViewById(R.id.editBedragPerPersoon);
        float pp = Float.parseFloat(txtPersonen.getText().toString());
        float p = Float.parseFloat(txtPercentage.getText().toString());
        float b = Float.parseFloat(txtBedrag.getText().toString());
        float totaalpp = (float) ((b*(1.0+(p/100.0)))/pp);
        txtBedragPerPersoon.setText(String.format("%.2f", totaalpp));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Fooi App");
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

