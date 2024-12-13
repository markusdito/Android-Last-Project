import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Detail(title: String, rating: String, poster: Int, desc: String, modifier: Modifier = Modifier, navController: NavController) {
    Surface(color = Color.White) {

        Column(modifier = modifier.padding(24.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = title,
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Rating",
                        tint = Color.Yellow,
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Text(
                        text = rating,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                }
            }
            Image(
                modifier = Modifier
                    .width(180.dp)
                    .height(280.dp),
                painter = painterResource(poster),
                contentDescription = "Movie Poster",
            )
            Text(
                text = "Description",
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 40.dp)
            )
            Text(
                text = desc,
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(top = 8.dp)
            )
            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = { navController.navigate("Dashboard") },
                modifier = Modifier
                    .padding(16.dp)
                    .width(120.dp)
                    .height(48.dp)
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Back",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}
