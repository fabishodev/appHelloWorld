package com.example.apphelloworld.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.apphelloworld.R


class DetailFragment : Fragment(R.layout.fragment_detail) {

    private var nombre:String?  = ""
    val args:DetailFragmentArgs by navArgs()//Delegation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*arguments?.let{ bundle ->
            nombre = bundle.getString("nombre")
        }*/


        nombre = args.nombre
        Toast.makeText(this.activity, nombre, Toast.LENGTH_SHORT).show()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}