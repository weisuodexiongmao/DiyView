package bwe.com.bawei.retrofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import bwe.com.bawei.retrofit2.P.Presenter;
import bwe.com.bawei.retrofit2.V.V_view;
import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity implements V_view{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.Rlv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Presenter presenter=new Presenter(this);
        presenter.presen();

    }

    @Override
    public void getData(Bean bean) {
        String title = bean.getResult().getList().get(1).getTitle();
        Log.d("TAG1",title);

    }
}
