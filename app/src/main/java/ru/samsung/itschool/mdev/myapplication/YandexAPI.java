package ru.samsung.itschool.mdev.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YandexAPI {
    @GET("api/v1/predict.json/complete")
    Call<Model> predictor(@Query("key") String key, @Query("q") String q, @Query("lang") String lang);

    //@GET("api/v1/predict.json/getLangs")

}
