package bwe.com.bawei.retrofit2.M;

import bwe.com.bawei.retrofit2.Bean;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ServiceAPI {
@GET("query?key=55010ae808217e996bbf414bbdad843c&pon=1&ps=10")
Observable<Bean> tags();
}