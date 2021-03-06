package com.thebestdiscountandroid.features.deals.data

import retrofit2.Call
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DealsService
@Inject constructor(retrofit: Retrofit) : DealsApi {
    private val dealsApi by lazy { retrofit.create(DealsApi::class.java) }

    override fun getTopDeals(userId: Int): Call<List<Deal>> = dealsApi.getTopDeals(userId)

    override fun filterProductByName(userId: Int, productName: String): Call<List<Deal>> =
        dealsApi.filterProductByName(userId, productName)
}
