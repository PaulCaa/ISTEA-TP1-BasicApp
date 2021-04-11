package ar.com.pablocaamano.palindromosytemperaturas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random.Default.nextInt

class PalindActivity : AppCompatActivity() {

    lateinit var textView: TextView;
    lateinit var returnBtn: Button;

    private lateinit var palindList: List<String>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palind);

        initializeElems();

        // Set text in textView
        this.setTextOnView();

        // Action to returnBtn
        returnBtn.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        })
    }

    fun initializeElems() {
        textView = findViewById(R.id.palindView);
        returnBtn = findViewById(R.id.palindReturnBtn);

        palindList = listOf(
            "Amor azul Ramera, de todo te di. Mariposa colosal, sí, yo de todo te di. Poda la rosa, Venus. El átomo como tal es un evasor alado. Pide, todo te doy: isla, sol, ocaso, pirámide. Todo te daré: mar, luz, aroma",
            "A mamá Roma le aviva el amor a papá y a papá Roma le aviva el amor a mamá",
            "Ana lleva nenes al abad, al reconocerla dábala Senen avellana",
            "Anita, la gorda lagartona, no traga la droga latina",
            "Logra Casillas allí sacar gol",
            "Adán no cede con Eva y Yavé no cede con nada",
            "Anula la luz azul a la Luna",
            "Dábale arroz a la zorra el abad",
            "La ruta nos aportó otro paso natural",
            "Yo dono rosas, oro no doy"
        );
    }

    fun setTextOnView() {
        var i: Int = nextInt(9);
        var p: String = palindList.get(i);
        textView.setText(p);
    }
}