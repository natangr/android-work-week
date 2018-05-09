package com.natan.choquedecultura.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class YoutubeResourceId {

    @Expose
    @SerializedName("videoId")
    var videoId: String? = null

    /*
    kind: "youtube#video",
    videoId: "8VmbLF3-Aww"
     */

}