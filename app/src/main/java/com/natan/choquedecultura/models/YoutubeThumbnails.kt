package com.natan.choquedecultura.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class YoutubeThumbnails {

    @Expose
    @SerializedName("default")
    var default: ThumbnailDetails? = null
    @Expose
    @SerializedName("medium")
    var medium: ThumbnailDetails? = null
    @Expose
    @SerializedName("high")
    var high: ThumbnailDetails? = null
    @Expose
    @SerializedName("standard")
    var standard: ThumbnailDetails? = null
    @Expose
    @SerializedName("maxres")
    var maxres: ThumbnailDetails? = null

    /*
    default: {
        url: "https://i.ytimg.com/vi/8VmbLF3-Aww/default.jpg",
        width: 120,
        height: 90
    },
    medium: {
        url: "https://i.ytimg.com/vi/8VmbLF3-Aww/mqdefault.jpg",
        width: 320,
        height: 180
    },
    high: {
        url: "https://i.ytimg.com/vi/8VmbLF3-Aww/hqdefault.jpg",
        width: 480,
        height: 360
    },
    standard: {
        url: "https://i.ytimg.com/vi/8VmbLF3-Aww/sddefault.jpg",
        width: 640,
        height: 480
    },
    maxres: {
        url: "https://i.ytimg.com/vi/8VmbLF3-Aww/maxresdefault.jpg",
        width: 1280,
        height: 720
    }
     */
}

class ThumbnailDetails {

    @Expose
    @SerializedName("url")
    var url: String? = null

}