package com.example.movieapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _moviecontent = mutableStateOf(MovieState())
    val Movie_Content: State<MovieState> = _moviecontent

    init {
        fetchMovieCategories()
    }

    private fun fetchMovieCategories() {
        viewModelScope.launch {
            try {
                val response = movieServices.getCategories()
                /*_categorieState.value = _categorieState.value.copy(
                        list = response.categories,
                        loading = false,
                        error = null

                    )*/
                _moviecontent.value = MovieState(
                    loading = false,
                    list = response,
                    error = null
                )

            } catch (e: Exception) {
                _moviecontent.value = _moviecontent.value.copy(
                    loading = false,
                    error = "Error fetching Categories ${e.message}"
                )
            }
        }
    }
}


    data class MovieState(
        val loading: Boolean = true,
        val list: List<Content> = emptyList(),
        val error: String? = null
    )
