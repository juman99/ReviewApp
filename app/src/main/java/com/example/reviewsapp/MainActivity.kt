package com.example.reviewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: button = this.findViewById(R.id.Result)
        button.setOnClickListener{
                view ->
        }
        val resultTV: TextView = findViewById(R.id.Result)
        var flag : String = "Rating"

        val spinnerVal : Spinner = findViewById(R.id.sp)
        var options = arrayOf("Rating","Written Review")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

    }
        button.setOnClickListener{ view ->

            var x: Int = edtxt1.text.toString().toInt();
            var y: Int = edtxt2.text.toString().toInt();
            if(flag =="sum")
                resultTV.text = sum(x,y).toString();
            else
                resultTV.text = multiply(x,y).toString();
        }

}