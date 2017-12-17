package bwe.com.bawei.retrofit2.P;

import bwe.com.bawei.retrofit2.Bean;
import bwe.com.bawei.retrofit2.M.Mod;
import bwe.com.bawei.retrofit2.V.V_view;

/**
 * Created by 猥琐的熊猫 on 2017/12/17.
 */

public class Presenter {
    private V_view v_view;
    private Mod mod;
    public Presenter(V_view v_view) {
        this.v_view = v_view;
        this.mod=new Mod();
    }
    public void presen(){
        mod.getData(new Mod.Data1() {
            @Override
            public void data1(Bean bean) {
                v_view.getData(bean);
            }
        });
    }
}
