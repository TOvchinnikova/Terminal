package com.t_ovchinnikova.terminal.data

import retrofit2.http.GET

interface ApiService {

    @GET("aggs/ticker/AAPL/range/1/hour/2022-01-09/2023-01-09?adjusted=true&sort=desc&limit=50000&apiKey=5NpJ7MHpagQhB6A84CU2ncc7OYSM0Dpl")
    suspend fun loadBars(): Result
}