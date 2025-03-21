package com.example.cgpacalculatorapp.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
private fun CGPA() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {

        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                "CGPA Calculator",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                style = TextStyle(fontSize = 30.sp)
            )
            Spacer(Modifier.padding(top = 10.dp))
            Subjects(Subject = "Math1")
            GradeTextField(grade = "", onValueChange = {})
            Spacer(Modifier.padding(top = 10.dp))
            CreditTextField(credit = "Enter Grade", onValueChange = {})
            Spacer(Modifier.padding(top = 10.dp))
            Subjects(Subject = "Physics")
            GradeTextField(grade = "", onValueChange = {})
            Spacer(Modifier.padding(top = 10.dp))
            CreditTextField(credit = "Enter Grade", onValueChange = {})
            Spacer(Modifier.padding(top = 10.dp))
            Subjects(Subject = "Chemistry")
            GradeTextField(grade = "", onValueChange = {})
            Spacer(Modifier.padding(top = 10.dp))
            CreditTextField(credit = "Enter Grade", onValueChange = {})
            Spacer(Modifier.padding(top = 10.dp))
            Subjects(Subject = "C")
            GradeTextField(grade = "", onValueChange = {})
            Spacer(Modifier.padding(top = 10.dp))
            CreditTextField(credit = "Enter Grade", onValueChange = {})

            Row() {
                Column() {

                    Button(
                        onClick = {}, colors = ButtonDefaults.buttonColors(
                            Color(0xFFBEABE0)
                        ), shape = RoundedCornerShape(15.dp)
                    ) {
                        Text(text = "Calculate CGPA", fontSize = 16.sp, color = Color.Black)

                    }
                }
            }
            Row(modifier = Modifier.fillMaxHeight()) {
                Spacer(modifier = Modifier.padding(top = 30.dp))
                Surface(
                    modifier = Modifier
                        .width(160.dp)
                        .height(200.dp)
                        .wrapContentHeight(),
                    color = Color(0xFF1D1C1D),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(
                        text = "Your All Time\nCGPA: ",
                        modifier = Modifier.padding(start = 10.dp),
                        style = TextStyle(
                            fontSize = 16.sp, color = Color(0xFFFFFFFF)


                        )
                    )
                }
                Surface(
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxSize(),
                    color = Color(0xFF1D1C1D),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Column(
                        modifier = Modifier,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Your SGPA: ",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 6.dp),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 16.sp, color = Color(0xFFFFFFFF)


                            )
                        )
                    }
                }


            }
        }
    }


}


@Composable
fun Subjects(modifier: Modifier = Modifier, Subject: String) {
    Text(
        text = Subject, modifier = Modifier.fillMaxWidth(), style = TextStyle(fontSize = 20.sp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GradeTextField(grade: String, onValueChange: (String) -> Unit) {
    TextField(
        value = grade,
        onValueChange = { text -> onValueChange(text) },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        label = { Text(text = "Enter Grade", fontSize = 12.sp, color = Color.White) },
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            containerColor = Color(0xFF7E57C2) // Corrected hex color
        ),
        shape = RoundedCornerShape(15.dp),
        textStyle = TextStyle(fontSize = 12.sp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreditTextField(credit: String, onValueChange: (String) -> Unit) {
    TextField(
        value = credit,
        onValueChange = { text -> onValueChange(text) },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        label = { Text(text = "Enter Credit", fontSize = 12.sp, color = Color.Black) },
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            containerColor = Color(0xFF9A8282) // Corrected hex color
        ),
        shape = RoundedCornerShape(15.dp),
        textStyle = TextStyle(fontSize = 12.sp)
    )
}
