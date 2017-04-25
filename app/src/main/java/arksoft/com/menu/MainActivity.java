package arksoft.com.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.paylas){

            Toast.makeText(MainActivity.this,"Paylaşma butonuna tıklandı",Toast.LENGTH_LONG).show();

        }else if(id==R.id.mesajyolla){

            Toast.makeText(MainActivity.this,"Mesaj yollama butonuna tıklandı",Toast.LENGTH_LONG).show();
        }




        return super.onOptionsItemSelected(item);
    }
}
