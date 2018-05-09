package com.natan.choquedecultura

import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    private var retrofit: Retrofit? = null

    fun getRetrofit(): Retrofit? {
        if (retrofit == null) {
            rebuildRetrofit()
        }
        return retrofit
    }

    private fun rebuildRetrofit() {
        val client = buildClient()
        retrofit = Retrofit.Builder()
                .baseUrl("https://www.googleapis.com/youtube/v3/") // TODO: replace with your base url
                .addConverterFactory(GsonConverterFactory.create(buildGson()))
                .client(client)
                .build()
    }

    private fun buildClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        addLoggingInterceptor(builder)
        return builder.build()
    }

    private fun addLoggingInterceptor(builder: OkHttpClient.Builder) {
        if (BuildConfig.DEBUG) {
            val httpLoggingInterceptor = HttpLoggingInterceptor { message -> Log.d("HttpLoggingInterceptor", message) }
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            builder.addNetworkInterceptor(httpLoggingInterceptor)
        }
    }

    private fun buildGson(): Gson {
        return GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create()
    }
}