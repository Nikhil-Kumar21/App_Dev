package com.iitr.memeshare

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*

class ApiCall {
    var imageUrl: String? = "https://i.redd.it/0vgc0w8in4s81.jpg"
    fun requesting(context: Context): String? {

        val queue = Volley.newRequestQueue(context)
        val url = "https://meme-api.herokuapp.com/gimme"

        // Request a string response from the provided URL.
        val jsonRequest = JsonObjectRequest(
            Request.Method.GET, url,null,
            { response ->
                imageUrl=response.getString("url")
                //Toast.makeText(context, "${imageUrl}", Toast.LENGTH_SHORT).show()

            },
            { imageUrl=null
            })

        queue.add(jsonRequest)
        //Toast.makeText(context, "${imageUrl}", Toast.LENGTH_SHORT).show()

        return imageUrl
    }
}