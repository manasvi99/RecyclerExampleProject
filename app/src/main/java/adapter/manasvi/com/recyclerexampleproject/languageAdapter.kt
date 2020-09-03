package adapter.manasvi.com.recyclerexampleproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class languageAdapter(private val context : Context, private val images : List <Language>)
    : RecyclerView.Adapter<languageAdapter.LanguageViewHolder>(){


    class LanguageViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val img = itemView.findViewById<ImageView>(R.id.image)
        fun bindView(image: Language) {
            img.setImageResource(image.imageSrc)
            //imgTitle.text = image.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) :LanguageViewHolder {
      return(LanguageViewHolder(LayoutInflater.from(context).inflate(R.layout.langimage, parent, false)))

    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.bindView(images[position])
    }
}