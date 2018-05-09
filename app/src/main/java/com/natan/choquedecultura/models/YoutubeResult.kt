package com.natan.choquedecultura.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class YoutubeResult {

    @Expose
    @SerializedName("items")
    var items: List<YoutubeItem>? = null

    /*
    kind: "youtube#playlistItemListResponse",
    etag: ""95M1zlW0txkV42I4OG1Zscxrg5A/qTMKiM7zEXHSG0IwAMObB8QLHN0"",
    nextPageToken: "CAgQAA",
    pageInfo: {
        totalResults: 22,
        resultsPerPage: 8
    },
    items: []
     */
}