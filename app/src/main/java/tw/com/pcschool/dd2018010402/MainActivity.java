package tw.com.pcschool.dd2018010402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] str;
    ListView lv;
    ArrayAdapter<String> ada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str = new String[] {"AAA","BBB","CCC"};
        lv = (ListView)findViewById(R.id.listView);
        ada = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                str
        );
        lv.setAdapter(ada);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, str[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
