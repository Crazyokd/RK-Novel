package oct.rekord.rknovel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().hide();
        ButterKnife.bind(this);
    }
}