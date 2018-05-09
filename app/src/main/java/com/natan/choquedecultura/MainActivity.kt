package com.natan.choquedecultura

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.natan.choquedecultura.models.YoutubeResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fetchYoutubeVideos()
    }

    fun fetchYoutubeVideos() {
        val api = RetrofitHelper.getRetrofit()?.create(YoutubeApi::class.java)
        api?.listVideos()?.enqueue(object: Callback<YoutubeResult> {
            override fun onFailure(call: Call<YoutubeResult>?, t: Throwable?) {
                Log.e("Youtube", "Error", t)
            }

            override fun onResponse(call: Call<YoutubeResult>?, response: Response<YoutubeResult>?) {
                Log.d("Youtube", response?.body()?.items?.firstOrNull()?.snippet?.title)
            }
        })
    }
}
