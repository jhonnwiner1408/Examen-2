package pe.idat.ec2_bernal_alessandro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.idat.ec2_bernal_alessandro.ui.theme.EC2BERNALALESSANDROTheme

class MainActivity : ComponentActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var libroadapter: Libroadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EC2BERNALALESSANDROTheme {
        }
    }
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val Libros = getLibros()
        libroadapter = Libroadapter(Libros)
        recyclerView.adapter = libroadapter
}

    private fun getLibros(): List<Libro> {
        return listOf(
            Libro("Foto estudio corazón", "Foto estudio de mi padre", "2008"),
            Libro("Design Patterns", "Elements of Reusable Object-Oriented Software", "1994"),
            Libro("Refactoring", "Improving the Design of Existing Code", "1999"),
            Libro("Introduction to Algorithms", "Comprehensive introduction to algorithms", "2009"),
            Libro("The Pragmatic Programmer", "Your Journey to Mastery", "1999"),
            Libro("Code Complete", "A Practical Handbook of Software Construction", "2004"),
            Libro("The Mythical Man-Month", "Essays on Software Engineering", "1975"),
            Libro("Effective Java", "Programming Language Guide", "2008"),
            Libro("Java Concurrency in Practice", "Concurrency for developers", "2006"),
            Libro("Structure and Interpretation of Computer Programs", "MIT's introductory course textbook", "1996")
        )
    }
}