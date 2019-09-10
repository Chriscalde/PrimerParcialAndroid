package com.example.primerparcial

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     var actualValue = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn5.setOnClickListener {
            actualValue = actualValue + 5
            var actualString = actualValue.toString()
            actualProd.setText(actualString)

            Log.d("Valor Actual",actualString)
        }
        btn10.setOnClickListener {
            actualValue= actualValue+10
            var actualString = actualValue.toString()
            actualProd.setText(actualString)

            Log.d("Valor Actual",actualString)
        }
        btn30.setOnClickListener {
            actualValue=actualValue+30
            var actualString = actualValue.toString()
            actualProd.setText(actualString)

            Log.d("Valor Actual",actualString)
        }
        btn50.setOnClickListener {
            actualValue=actualValue+50
            var actualString = actualValue.toString()
            actualProd.setText(actualString)

            Log.d("Valor Actual",actualString)
        }

        btnCalculateTotal.setOnClickListener {
            var inputTotal = totalProd.text.toString()
            var totalApples = Integer.parseInt(inputTotal) * 80
//            Log.d()
            Toast.makeText(applicationContext,"El total es ${totalApples.toString()}",Toast.LENGTH_SHORT).show()
        }

        btnCalculateActual.setOnClickListener {
            var inputActual = actualProd.text.toString()
            var actualApples = Integer.parseInt(inputActual) * 80
            Toast.makeText(applicationContext,"El actual es ${actualApples.toString()}",Toast.LENGTH_SHORT).show()
        }

        btnCalculatePct.setOnClickListener {
            var actualInt = Integer.parseInt(actualProd.text.toString())
            var totalInt = Integer.parseInt(totalProd.text.toString())
            var percent = (actualInt*100)/totalInt
            if(percent>=70){
                colorBack.setBackgroundColor(Color.RED)
            }
            percentage.setText(percent.toString()+"%")

        }

    }
}
