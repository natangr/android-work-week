package com.natan.choquedecultura.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class YoutubeSnippet {

    @Expose
    @SerializedName("title")
    var title: String? = null
    @Expose
    @SerializedName("description")
    var description: String? = null
    @Expose
    @SerializedName("thumbnails")
    var thumbnails: YoutubeThumbnails? = null
    @Expose
    @SerializedName("resourceId")
    var resourceId: YoutubeResourceId? = null

    /*
    publishedAt: "2018-02-22T14:45:03.000Z",
    channelId: "UCaSAM5kna2KyX-uVLSGr8PQ",
    title: "CINEMA, VIDEOGAME E MERITOCRACIA | Choque de Cultura",
    description: "No Choque de Cultura de hoje tem filme de videogame! Os pilotos discutem o reboot de Tomb Raider: A Origem. https://omelete.com.br/videos/choque-de-cultura/cinema-videogame-e-meritocracia-choque-de-cultura/ ASSINE O CANAL :) http://youtube.com/omeleteve Twitter: http://www.twitter.com/omelete Facebook: http://www.facebook.com/siteomelete",
    thumbnails: {},
    channelTitle: "omeleteve",
    playlistId: "PLTeqfOQzqJNyUjKVEogo5AA1O_w2m1hO3",
    position: 1,
    resourceId: {}
     */

}