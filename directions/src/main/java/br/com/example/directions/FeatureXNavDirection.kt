package br.com.example.directions

import br.com.example.navigation.NavDirection

data class FeatureXNavDirection(
    val firstValue: String? = null,
    val secondValue: Boolean? = null,
    val thirdValue: Int? = null
) : NavDirection