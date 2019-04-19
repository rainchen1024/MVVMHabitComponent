package com.goldze.home.http;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    @GET("http://is.snssdk.com/api/news/feed/v51/?{parms}")
    Observable<String> getToutiao(@Path("parms") String parms);
}
