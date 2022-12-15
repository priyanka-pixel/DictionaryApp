package com.example.dictionaryapp.feature_dictionary.data.remote.dto

import com.example.dictionaryapp.feature_dictionary.data.local.entities.WordInfoEntity

data class WordInfoDto(
   // val license: LicenseDto = LicenseDto(),
    val meanings: List<MeaningDto> = listOf(),
   // val sourceUrls: List<String> = listOf(),
    val word: String = ""
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
           // license = license,
            meanings = meanings.map { it.toMeaning() },
           // sourceUrls = sourceUrls,
            word = word
        )
    }
}