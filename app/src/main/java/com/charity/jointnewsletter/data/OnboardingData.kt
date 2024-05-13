package com.charity.jointnewsletter.data

import androidx.compose.ui.graphics.Color
import com.charity.jointnewsletter.ui.theme.ColorBlue

data class OnboardingData(
   val image: Int,
   val backgroundColor: Color = ColorBlue,
   val mainColor: Color = ColorBlue,
   val mainText:String,
   val subText:String

)



