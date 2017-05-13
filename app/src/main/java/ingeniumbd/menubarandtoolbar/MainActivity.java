package ingeniumbd.menubarandtoolbar;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("It's Toolbar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu1:
                Toast.makeText(getApplicationContext(),"First Position",Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu2:
                Toast.makeText(getApplicationContext(),"Second Position",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                Toast.makeText(getApplicationContext(),"Third Position",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu4:
                Toast.makeText(getApplicationContext(),"Fourth Position",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}
