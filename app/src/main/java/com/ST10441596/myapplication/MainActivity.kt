package com.ST10441596.myapplication

import android.context.Intnet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var etNum1 : EditText? = null
    var etNum2 : EditText? = null
    var tvDisp : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisp = findViewById(R.id.tvDisp)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {add()}

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener {sub()}

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener {mul()}

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener {div()}

        val btnSqr = findViewById<Button>(R.id.btnSqr)
        btnSqr.setOnClickListener {sqr()}

        val btnPow = findViewById<Button>(R.id.btnPow)
        btnPow.setOnClickListener {pow()}

        val btnNextScr = findViewById<Button>(R.id.btnNextScreen)
        btnNextScr.setOnClickListener{
            // call the next screen
            val intent = Intent(package)
        }
    }
    private fun add(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()){
            tvDisp?.text = "Please enter valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 + intNum2

        tvDisp?.text = intAnswer.toString()
    }
    private fun sub() {
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 - intNum2

        tvDisp?.text = intAnswer.toString()
    }
    private fun mul(){
            val input1 = etNum1?.text?.toString()
            val input2 = etNum2?.text?.toString()

            if (input1.isNullOrEmpty() || input2.isNullOrEmpty()){
                tvDisp?.text = "Please enter valid numbers."
                return
            }
            val intNum1 = input1.toInt()
            val intNum2 = input2.toInt()
            var intAnswer = 0

            intAnswer = intNum1 * intNum2

            tvDisp?.text = intAnswer.toString()
    }
    private fun div(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()){
            tvDisp?.text = "Please enter valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0.0

        if (intNum1 ==0) {
            tvDisp?.text = "Division by zerois not allowed"
        } else {
            intAnswer = intNum1 / intNum2
        }
        tvDisp?.text = intAnswer.toString()
    }
    private fun sqr(){
        val input1 = etNum1?.text?.toString()
        // val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()){
            tvDisp?.text = "Please enter valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 ^ intNum2

        tvDisp?.text = intAnswer.toString()
    }
    private fun pow() {
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid numbers."
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 + intNum2

        tvDisp?.text = intAnswer.toString()
    }
        var intNum1 = etNum1?.toString()?.toString()?.toInt()

    }
}