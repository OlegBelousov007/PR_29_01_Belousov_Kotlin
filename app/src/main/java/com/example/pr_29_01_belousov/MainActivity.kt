package com.example.pr_29_01_belousov

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pr_29_01_belousov.ui.theme.PR_29_01_BelousovTheme
import java.util.Calendar
import java.util.Date

class MainActivity : ComponentActivity() {
        private lateinit var showButton: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val date = Date()
        val calendar = Calendar.getInstance()
        calendar.time = date
        val month = calendar.get(Calendar.MONTH)

        val season = when (month){
            in 2..4 -> "spring"
            in 5..7 -> "summer"
            in 8..10 -> "winter"
            else -> {"winter"}
        }

        val imageId = resources.getIdentifier("drawable/$season", null, packageName)
        imageView.setImageSourse(imageId)
    }
}
