package com.slow

sealed class Routes(val route: String) {
    object Login : Routes("login")
    object SignUp : Routes("sign_up")
    object ForgotPassword : Routes("forgot_password")
}
