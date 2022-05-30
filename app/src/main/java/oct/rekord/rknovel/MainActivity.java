package oct.rekord.rknovel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img_more)
    ImageView imgMore;
    @BindView(R.id.img_search)
    ImageView imgSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hide ActionBar
        getSupportActionBar().hide();

        ButterKnife.bind(this);
    }

    @OnClick({R.id.img_search, R.id.img_more})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_search:
                Intent intent = new Intent(this, SearchActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.img_more:
//                PopMenu popMenu = new PopMenu(this);
//                popMenu.setSwitchModeListener(mSwitchModeListener);
//                popMenu.showAtLocation(llToolbar, Gravity.TOP | Gravity.RIGHT, 120, 110);
                break;
            default:
                break;
        }
    }
}