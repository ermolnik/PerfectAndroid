package com.ermolnik.perfectandroid.net;

import com.ermolnik.perfectandroid.net.models.User;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("api")
    Single<User> getRandomUser();

    @GET("api/?results={count}")
    Single<List<User>> getSeveralRandomUsers(@Path("count") int count);
}
