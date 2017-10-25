package in.good_work.auth_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IMainView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IMainPresenter p = new MainPresenterImpl(this);
        p.getData();
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onShowErrors(String error) {

    }

    @Override
    public <T> void onShowData(T t) {
        Toast.makeText(this, (String) t, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }
}
