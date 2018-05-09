package com.natan.choquedecultura

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.natan.choquedecultura.models.YoutubeItem
import com.natan.choquedecultura.models.YoutubeResult
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity: AppCompatActivity(), VideoClickListener {

    val adapter = YoutubeAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = adapter

        fetchYoutubeVideos()
    }

    private fun fetchYoutubeVideos() {
        val api = RetrofitHelper.getRetrofit()?.create(YoutubeApi::class.java)
        api?.listVideos()?.enqueue(object: Callback<YoutubeResult> {
            override fun onFailure(call: Call<YoutubeResult>?, t: Throwable?) {
                Log.e("Youtube", "Error", t)
                Toast.makeText(this@MainActivity, "Erro!", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<YoutubeResult>?, response: Response<YoutubeResult>?) {
                refreshList(response?.body()?.items)
            }
        })
    }

    private fun refreshList(items: List<YoutubeItem>?) {
        adapter.items = items ?: emptyList()
    }


    override fun onItemClicked(item: YoutubeItem) {
        val id = item.snippet?.resourceId?.videoId ?: return
        val appIntent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$id"))
        val webIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=$id"))
        try {
            startActivity(appIntent)
        } catch (ex: ActivityNotFoundException) {
            startActivity(webIntent)
        }

    }
}
