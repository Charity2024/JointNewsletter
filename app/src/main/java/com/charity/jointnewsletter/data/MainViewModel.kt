package com.charity.jointnewsletter.data

import android.adservices.topics.Topic
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class MainViewModel: ViewModel() {
    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow("false")
    val isSearchig= _isSearching.asStateFlow()

    private val _articleTopics = MutableStateFlow(listOf<ArticleTopic>())
    @OptIn(FlowPreview::class)
    val articleTopics= searchText
        .debounce(1000L)
       // .onEach { _isSearching.update { Boolean:: true }}
        .combine(_articleTopics){text ,articleTopics ->
            if (text.isBlank()){
                articleTopics
            } else{
                delay(2000L)
                articleTopics.filter {
                    it.doesMatchSearchQuery(text)
                }
            }
        }
       // .onEach { _isSearching.update { false } }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _articleTopics.value
        )

    fun onSearchTextChange(text:String){
        _searchText.value =text
    }
}

data class ArticleTopic(
    val issueName: String
){
    fun doesMatchSearchQuery(query: String):Boolean{
        val matchingCombination = listOf(
            issueName,
            "${issueName.first()}"
        )
        return matchingCombination.any{
            it.contains(query,ignoreCase = true)
        }
    }

    companion object {
        val issueName: String
            get() {
                TODO()
            }
    }
}
private val topicNames = listOf(
    ArticleTopic(
        issueName = "Issue 1"
    ),
    ArticleTopic(
        issueName = "Issue 2"
    ),
    ArticleTopic(
        issueName = "Issue 3"
    ),
    ArticleTopic(
        issueName = "Issue 4"
    ),
    ArticleTopic(
        issueName = "Issue 5"
    ),
    ArticleTopic(
        issueName = "Issue 6"
    ),
    ArticleTopic(
        issueName = "Issue 7"
    ),
    ArticleTopic(
        issueName = "Issue 8"
    ),
    ArticleTopic(
        issueName = "Issue 9"
    ),
    ArticleTopic(
        issueName = "Issue 10"
    )
)