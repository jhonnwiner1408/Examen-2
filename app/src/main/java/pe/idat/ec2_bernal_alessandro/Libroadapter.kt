package pe.idat.ec2_bernal_alessandro

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Libroadapter(private val libros: List<Libro>): RecyclerView.Adapter<Libroadapter.LibroViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_libro, parent, false)
        return LibroViewHolder(view)
    }

    override fun onBindViewHolder(holder: LibroViewHolder, position: Int) {
        val Libro = libros[position]
        holder.tituloTextView.text = Libro.titulo
        holder.descripcionTextView.text = Libro.descripcion
        holder.publicacionTextView.text = Libro.publicación
    }

    override fun getItemCount(): Int = libros.size

    class LibroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tituloTextView: TextView = itemView.findViewById(R.id.libro_titulo)
        val descripcionTextView: TextView = itemView.findViewById(R.id.libro_descripcion)
        val publicacionTextView: TextView = itemView.findViewById(R.id.libro_publicacion)
    }
}