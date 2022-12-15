package com.example.dictionaryapp.feature_dictionary.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dictionaryapp.feature_dictionary.domain.model.Meaning
import com.example.dictionaryapp.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    // val sourceUrls: List<String>,
    val meanings: List<Meaning>,
    //  val license: LicenseDto,
    @PrimaryKey val
    id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            word = word,
            //  sourceUrls = sourceUrls,
            //license = license
        )
    }
}
