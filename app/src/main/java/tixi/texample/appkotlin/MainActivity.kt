package tixi.texample.appkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valor1 = findViewById<EditText>(R.id.editTextTextPersonName);
        val valor2= findViewById<EditText>(R.id.editTextTextPersonName2);
        val resultado= findViewById<EditText>(R.id.editTextTextPersonName3);
        val btnSumar = findViewById<Button>(R.id.button);

        btnSumar.setOnClickListener {
            val a = valor1.text.toString().toInt()
           val b = valor2.text.toString().toInt()
            val suma = a+b;
            //resultado.text = "La suma es :${suma.toString()}";
        resultado.text = Editable.Factory.getInstance().newEditable("${suma.toString()}")
        };
    }

}