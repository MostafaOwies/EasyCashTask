package com.islam.easycashtask.utils.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.islam.easycashtask.R

val tajawalFont = FontFamily(

        Font(R.font.tajawal_bold, weight = FontWeight.Bold),
        Font(R.font.tajawal_light, weight = FontWeight.Light),
        Font(R.font.tajawal_medium, weight = FontWeight.Medium),
        Font(R.font.tajawal_extra_bold, weight = FontWeight.ExtraBold),
        Font(R.font.tajawal_regular, weight = FontWeight(400))
)

// Set of Material typography styles to start with
val Typography = Typography(
        bodyLarge = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp
        )
        /* Other default text styles to override
        titleLarge = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 22.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp
        ),
        labelSmall = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Medium,
            fontSize = 11.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        )
        */
)

val Typography.customTextBody1: TextStyle
    @Composable
    get() {
        return TextStyle(
                fontFamily = tajawalFont,
                fontWeight = FontWeight(500),
                fontSize = 16.sp,
                lineHeight = 19.2.sp,
                letterSpacing = 0.25.sp,
                textAlign = TextAlign.Center,
                color = if (isSystemInDarkTheme()) custom_font_body1_color_dark else Color.Black

        )
    }

val Typography.customTextBody2: TextStyle
    @Composable
    get() {
        return TextStyle(
                fontFamily = tajawalFont,
                fontWeight = FontWeight(400),
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.15.sp,
                color = if (isSystemInDarkTheme()) custom_font_body2_color_dark else Color.Gray
        )
    }


