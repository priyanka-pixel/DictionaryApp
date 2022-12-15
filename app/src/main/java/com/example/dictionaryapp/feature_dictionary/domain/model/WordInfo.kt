package com.example.dictionaryapp.feature_dictionary.domain.model

data class WordInfo(
  //  val license: LicenseDto,
    val meanings: List<Meaning>,
   // val sourceUrls: List<String>,
    val word: String
    )
