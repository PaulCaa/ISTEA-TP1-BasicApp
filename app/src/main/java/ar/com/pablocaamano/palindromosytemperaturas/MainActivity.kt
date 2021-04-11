package ar.com.pablocaamano.palindromosytemperaturas

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnPal: Button;
    lateinit var btnTemp: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeElems();

        // Action to 1st button
        btnPal.setOnClickListener(View.OnClickListener {
            this.goToActivity(this, PalindActivity::class.java);
        });

        // Action to 2nd button
        btnTemp.setOnClickListener(View.OnClickListener {
            this.goToActivity(this, TempActivity::class.java);
        });
    }

    fun initializeElems()  {
        btnPal = findViewById(R.id.mainPalinBtn);
        btnTemp = findViewById(R.id.mainTempBtn);
    }

    fun <T>goToActivity(context: Context, view: Class<T>) {
        val intent: Intent = Intent(context,view);
        startActivity(intent);
    }
}