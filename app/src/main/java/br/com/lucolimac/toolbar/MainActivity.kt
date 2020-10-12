package br.com.lucolimac.toolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Double.parseDouble

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(tolbar)
        btComparar.setOnClickListener {
            if (parseDouble(etanolEdit.text.toString()) / parseDouble(gasolinaEdit.text.toString()) <= 0.7)
                imageResult.setImageResource(R.drawable.abasteca_etanol)
            else
                imageResult.setImageResource(R.drawable.abasteca_gasolina)
        }
    }
}