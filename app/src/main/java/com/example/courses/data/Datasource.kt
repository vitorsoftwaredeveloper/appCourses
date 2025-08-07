package com.example.courses.data

import com.example.courses.R
import com.example.courses.model.Courses

class Datasource() {
    fun loadCourses(): List<Courses> {
        return listOf<Courses>(
            Courses(R.string.law, R.drawable.law, (1..300).random()),
            Courses(R.string.film, R.drawable.film, (1..300).random()),
            Courses(R.string.tech, R.drawable.tech, (1..300).random()),
            Courses(R.string.crafts, R.drawable.crafts, (1..300).random()),
            Courses(R.string.design, R.drawable.design, (1..300).random()),
            Courses(R.string.architecture, R.drawable.architecture, (1..300).random()),
            Courses(R.string.automotive, R.drawable.automotive, (1..300).random()),
            Courses(R.string.biology, R.drawable.biology, (1..300).random()),
            Courses(R.string.business, R.drawable.business, (1..300).random()),
            Courses(R.string.culinary, R.drawable.culinary, (1..300).random()),
            Courses(R.string.drawing, R.drawable.drawing, (1..300).random()),
            Courses(R.string.ecology, R.drawable.ecology, (1..300).random()),
            Courses(R.string.fashion, R.drawable.fashion, (1..300).random()),
            Courses(R.string.finance, R.drawable.finance, (1..300).random()),
            Courses(R.string.engineering, R.drawable.engineering, (1..300).random()),
            Courses(R.string.gaming, R.drawable.gaming, (1..300).random()),
            Courses(R.string.geology, R.drawable.geology, (1..300).random()),
            Courses(R.string.history, R.drawable.history, (1..300).random()),
            Courses(R.string.journalism, R.drawable.journalism, (1..300).random()),
            Courses(R.string.lifestyle, R.drawable.lifestyle, (1..300).random()),
            Courses(R.string.music, R.drawable.music, (1..300).random()),
            Courses(R.string.painting, R.drawable.painting, (1..300).random()),
            Courses(R.string.photography, R.drawable.photography, (1..300).random()),
            Courses(R.string.physics, R.drawable.physics, (1..300).random()),
        )
    }
}