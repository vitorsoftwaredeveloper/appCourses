package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Courses(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    val quantityCourses: Int
)
