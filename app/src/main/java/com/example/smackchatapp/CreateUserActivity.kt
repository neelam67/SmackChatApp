package com.example.smackchatapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.ColorLong
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profiledefault"
    var userAvatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun changeBackGroundColorAvatar(view : View){

    }

    fun generateUserAvatarSignUp(view: View){
        var randomNo = Random()
        var color = randomNo.nextInt(2)
        var avatarImageNo = randomNo.nextInt(28)

        if(color == 0){
            userAvatar = "light$avatarImageNo"
        }else{
            userAvatar = "dark$avatarImageNo"
        }

        var resourceId = resources.getIdentifier(userAvatar, "drawable",packageName)
        imageView_Avatar.setImageResource(resourceId)
    }

    fun onSignUpclickedFromSignUp(view: View){

        var randomColor = Random()
        var redColor = randomColor.nextInt(255)
        var greenColor = randomColor.nextInt(255)
        var blueColor = randomColor.nextInt(255)

        imageView_Avatar.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor))
        var savedR = redColor.toDouble() / 255
        var savedG = greenColor.toDouble() / 255
        var savedB = blueColor.toDouble() / 255

        userAvatarColor = "[$savedR, $savedG, $savedB, 1]"

    }
}