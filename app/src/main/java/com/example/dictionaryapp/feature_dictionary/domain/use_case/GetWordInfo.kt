package com.example.dictionaryapp.feature_dictionary.domain.use_case


import com.example.dictionaryapp.core.util.Resource
import com.example.dictionaryapp.feature_dictionary.data.repository.WordInfoRepositoryImpl
import com.example.dictionaryapp.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepositoryImpl
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if (word.isBlank()) {
            return flow { }
        }
        return repository.getWordInfo(word)
    }
}