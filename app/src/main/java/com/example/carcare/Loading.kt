import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.carcare.R
import com.example.carcare.MainActivity

class Loading : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        val loadingButton = findViewById<Button>(R.id.loading)
        loadingButton.setOnClickListener {
            val intent = Intent(this@Loading, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
