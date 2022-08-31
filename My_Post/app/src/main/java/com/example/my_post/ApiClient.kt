package com.example.my_post

interface ApiClient {
    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildApiClient(apiInterface:Class<T>): T{
        return retrofit.create(apiInterface)
    }
}