package com.natan.choquedecultura.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class YoutubeItem {

    @Expose
    @SerializedName("snippet")
    var snippet: YoutubeSnippet? = null

    /*
    kind: "youtube#playlistItem",
    etag: ""95M1zlW0txkV42I4OG1Zscxrg5A/pJ1g8QWlfZ7RgeiOHj0TWX17W-A"",
    id: "UExUZXFmT1F6cUpOeVVqS1ZFb2dvNUFBMU9fdzJtMWhPMy44Mjc5REFBRUE2MTdFRDU0",
    snippet: {}
     */

}