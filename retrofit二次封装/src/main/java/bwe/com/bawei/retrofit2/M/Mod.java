package bwe.com.bawei.retrofit2.M;

import bwe.com.bawei.retrofit2.Bean;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 猥琐的熊猫 on 2017/12/17.
 */

public class Mod {
    public void getData(final Data1 data1){
        ServiceAPI api = RetrofitHelper.getAPI();
        Observable<Bean> observable = api.tags();
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Bean>() {
                    @Override
                    public void accept(Bean bean) throws Exception {
                      data1.data1(bean);
                    }
                });
    }
    public interface Data1{
        void data1(Bean bean);
    }
}
