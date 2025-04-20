package com.example.movieapp

import android.media.Rating

data class MovieContent(
    val content : List<Content>
)

data class Content(
    val id : Int,
    val url : String,
    val name : String,
    val type : String,
    val language : String,
    val Status : String,
    val runtime: Int,
    val averageRuntime : Int,
    val premiered : String,
    val ended : String,
    val officialSite : String,
    val rating : Rating,
    val schedule : Schedule,
    val genres : List<String>,
    val weight : Int,
    val network : Network,
    val webChannel : String,
    val dvdCountry : String,
    val externals : Externals,
    val image : Image,
    val summary : String,
    val updated : Int,
    val _links : Links,
    val previousepisode :PreviousEpisode
    )

data class Schedule(
    val time : String,
    val days : List<String>
)

data class Rating(
    val average : Int
)

data class Network(
   val id : Int,
   val name : String,
   val country : Country,
   val officialSite : String
)

data class Country(
    val name : String,
    val code : String,
    val timezone : String
)

data class Externals(
    val tvrage : Int,
    val thetvdb: Int,
    val imdb: Int
)

data class Image(
    val medium :String,
    val original : String
)

data class Links(
    val self : Self
)

data class Self(
    val href : String
)

data class PreviousEpisode(
    val href : String,
    val name : String
)