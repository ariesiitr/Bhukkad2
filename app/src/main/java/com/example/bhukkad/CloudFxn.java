package com.example.bhukkad;
import io.reactivex.Observable;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface CloudFxn {
    @GET("token")
    Call<CashFreeToken> getToken(@Query("orderId") String orderId,
                                 @Query("orderAmount") String orderAmount);
}
