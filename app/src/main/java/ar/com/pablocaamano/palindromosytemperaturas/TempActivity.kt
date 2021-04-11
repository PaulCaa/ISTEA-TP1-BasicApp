package ar.com.pablocaamano.palindromosytemperaturas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class TempActivity : AppCompatActivity() {

    lateinit var celsius: EditText;
    lateinit var fahren: EditText;
    lateinit var convertBtn: Button;
    lateinit var returnBtn: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        initializeElems();

        // convert action
        convertBtn.setOnClickListener(View.OnClickListener {
            this.transform();
        })

        // Action to returnBtn
        returnBtn.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        })
    }

    fun initializeElems() {
        celsius = findViewById(R.id.tempCelsius);
        fahren = findViewById(R.id.tempFahren);
        convertBtn = findViewById(R.id.tempConvertBtn);
        returnBtn = findViewById(R.id.tempReturnBtn);
    }

    fun transform() {
        var cel: Double = celsius.text.toString().toDouble();
        var res: Double = (cel * 1.8) + 32;
        fahren.setText(res.toString() + "ºF");
    }
}