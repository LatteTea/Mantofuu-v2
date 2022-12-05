package com.example.bgstofuu.composeable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bgstofuu.ui.theme.BGSTofuuTheme


@Composable
fun FormDaftar(){
    var mail by remember {
        mutableStateOf("")
    }
    var pw by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Mantofuu",
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Text(
            text = "Daftar Akun",
            fontWeight = FontWeight.ExtraLight,
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 72.dp)
        )

        TextField(
            value = mail,
            onValueChange = { mail = it },
            label = { Text("E-Mail") },
            modifier = Modifier.padding(bottom = 40.dp)
        )

        TextField(
            value = pw,
            onValueChange = { pw = it },
            label = { Text("Password") },
            modifier = Modifier.padding(bottom = 40.dp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        )

        TextField(
            value = pw,
            onValueChange = { pw = it },
            label = { Text("RePassword") },
            modifier = Modifier.padding(bottom = 50.dp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Button(onClick = {}) {
            Text(text = "Daftar")
        }

        TextButton(onClick = {},
        ) {
            Text(text = "Login")
        }

    }
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(id = com.example.bgstofuu.R.drawable.ic_circle_bottom ),
            contentDescription = stringResource(id = com.example.bgstofuu.R.string.app_name ),
            modifier = Modifier
                .size(1200.dp)
                .padding(top = 710.dp)
        )
    }
}

data class RegisterUiState(
    val email: String = "",
    val password: String = "",
    val rePassword: String = ""
)

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    BGSTofuuTheme() {
        FormDaftar()
    }
}