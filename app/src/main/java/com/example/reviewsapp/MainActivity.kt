package com.example.reviewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = this.findViewById(R.id.btSubmit)
        val edtxt1: EditText = findViewById(R.id.num1)
        val edtxt2: EditText=findViewById(R.id.UserText)
        val resultTV: TextView = findViewById(R.id.Result)

        var flag: String = "Rating"
        val spinnerVal: Spinner = findViewById(R.id.sp1)
        var options = arrayOf("Rating", "Written Review")
        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        button.setOnClickListener { view ->

            var x: Int = edtxt1.text.toString().toInt();
            var y: String = edtxt2.text.toString();

            if (flag == "Rating")
                resultTV.text = Rating(x).toString();
            else
                resultTV.text = Text(y).toString();


        }
    }

    public fun Rating(a: Int): Int{
        return a;
    }

    public fun Text(a: String): String{
        return a;
    }

}