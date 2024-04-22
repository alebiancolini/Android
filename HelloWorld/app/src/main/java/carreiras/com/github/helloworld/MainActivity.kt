package carreiras.com.github.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Criando um objeto de texto
        val texto = TextView(this)
        texto.text = "Hello	Kotlin"

        // Definindo o conteúdo da tela
        setContentView(texto)
    }
}