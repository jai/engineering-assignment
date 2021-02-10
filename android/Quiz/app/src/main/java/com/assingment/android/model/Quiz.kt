package com.assingment.android.model

data class Quiz(
    val imageResId: Int?,
    val question: String,
    val choices: List<String>,
    val answers: String
)

class Data {
    companion object {
        val quizes = listOf(
            Quiz(
                imageResId = null,
                question = "What is the capital of Thailand?",
                choices = listOf("Tokyo", "Krugthep", "Bangkok noi", "Seoul"),
                answers = "Krugthep"
            ),
            Quiz(
                imageResId = null,
                question = "What is the world's most populated country?",
                choices = listOf("Russia", "India", "China", "USA"),
                answers = "China"
            ),
            Quiz(
                imageResId = null,
                question = "The Great Barrier Reef is off the coast of which country?",
                choices = listOf("New Zealand", "Australia", "Fiji", "South Africa"),
                answers = "Australia"
            ),
            Quiz(
                imageResId = null,
                question = "What is the World's Smallest Country?",
                choices = listOf("Monaco", "Vatican City", "Lichtenstein", "Luxembourg"),
                answers = "Vatican City"
            ),
            Quiz(
                imageResId = null,
                question = "In which country is the world's highest waterfall?",
                choices = listOf("USA", "Brazil", "Venezuela", "South Africa"),
                answers = "Venezuela"
            ),
            Quiz(
                imageResId = null,
                question = "In which country is Mount Fuji located?",
                choices = listOf("South Korea", "China", "Peru", "Japan"),
                answers = "Japan"
            ),
            Quiz(
                imageResId = null,
                question = "In which country is the Cape of Good Hope?",
                choices = listOf("Australia", "USA", "Canada", "South Africa"),
                answers = "South Africa"
            ),
            Quiz(
                imageResId = null,
                question = "What country has the greatest number of active volcanoes?",
                choices = listOf("Philippines", "Japan", "Italy", "Indonesia"),
                answers = "Indonesia"
            ),
            Quiz(
                imageResId = null,
                question = "The Sierra Madre Oriental is a mountain range in which country?",
                choices = listOf("China", "Mexico", "Peru", "Argentina"),
                answers = "Mexico"
            ),
            Quiz(
                imageResId = null,
                question = "Where was the hottest temperature ever recorded?",
                choices = listOf("Peru", "Mexico", "Libya", "India"),
                answers = "Libya"
            )
        )
    }
}
