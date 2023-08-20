package com.example.sushma

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.sushma.databinding.ActivityMainBinding

public class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fade.setOnClickListener(View.OnClickListener {

        })
    }
    fun void() {
      var builder = AlertDialog.Builder(this);
        val inflater = layoutInflater
        builder.setMessage("Hello")
        builder.setTitle("its a prank")
        val dialogLayout = inflater.inflate(R.layout.hello_dialog,null);
        val textView = dialogLayout.findViewById<TextView>(R.id.fade)
        builder.setView(dialogLayout)
        builder.setPositiveButton(android.R.string.yes){dialogInterface,i->
                Toast.makeText(this,"This is hello World!",Toast.LENGTH_LONG).show()
            builder.show()
            }
    }
}