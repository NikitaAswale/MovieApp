
package com.example.movieapp
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter


//how each items looks like
@Composable
fun CategoryItem(content : Content,
                 navigateToDetail:(Content) -> Unit){
    Column (modifier = Modifier.padding(8.dp)
        .fillMaxSize()
        .clickable { navigateToDetail(content) },
        horizontalAlignment = Alignment.CenterHorizontally){
        //Content image
        Image(
            painter = rememberAsyncImagePainter(content.image.original),
            contentDescription = null,
            modifier = Modifier.fillMaxSize().aspectRatio(1f)
        )

        //Category Title
        Text(
            text = content.name,
            color = Color.Black,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top=4.dp)
        )
    }
}
