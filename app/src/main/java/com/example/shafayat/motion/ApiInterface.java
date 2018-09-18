package com.example.shafayat.motion;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {


    @GET("motnpi/digital/7/{signal}")
    Call<ResponseModel> sendSignal(@Path("signal") int signal);
}
