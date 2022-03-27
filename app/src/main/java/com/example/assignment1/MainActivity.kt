package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.confirmbt)
        val numdrinks: EditText =findViewById(R.id.numdrinks)

        val total: TextView =findViewById(R.id.total)

        var flag: String ="American"
        var flag2: Double=0.0
        val spinnerval: Spinner = findViewById(R.id.spinner2)
        var options= arrayOf("American","Iced Latte","Cappuccino","Esspresso","Mocha","Flat white")
        var prices=arrayOf(1.5,1.0,2.0,3.0,1.0,2.0)
        spinnerval.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)



        button.setOnClickListener{ view->
         var numd:Int =numdrinks.text.toString().toInt()
         var nump:Int = 2
         var totalnew:TextView=findViewById(R.id.total)
            val result:Double=flag2*numd
            totalnew.text= ""+(result).toString()


//            when(flag) {
//                "American" -> total.text=total(numd,nump).toString()
//                "Iced Latte" -> total.text=total(numd,nump).toString()
//                "Cappuccino" -> total.text=total(numd,nump).toString()
//                "Esspresso" -> total.text=total(numd,nump).toString()
//                "Mocha" ->  total.text=total(numd,nump).toString()
//                "Flat white" ->  total.text=total(numd,nump).toString()
////                "Flat white" -> price.text= "1.5"
//
//
        //            }






        }









        spinnerval.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2) //p2 is the index of selected item
                flag2=prices.get(p2)


            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
    public fun total(a: Int, b: Int): Int {
        return a*b
    }




}


