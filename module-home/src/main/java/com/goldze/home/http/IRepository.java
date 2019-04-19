package com.goldze.home.http;

import android.arch.lifecycle.OnLifecycleEvent;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.Path;

public interface IRepository {
    interface IHttp {
        Observable<Response<String>> getToutiao(String parms);
    }

    interface ICache {
        Observable<Response<String>> getToutiao(String parms);
    }
}
