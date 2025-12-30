package com.ellyelbarra.game.activities
import android.os.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.ellyelbarra.game.R
class SplashActivity:AppCompatActivity(){
 override fun onCreate(b:Bundle?){
  super.onCreate(b)
  setContentView(R.layout.activity_splash)
  Handler(Looper.getMainLooper()).postDelayed({
   startActivity(Intent(this,MainActivity::class.java));finish()
  },2000)
 }
}
