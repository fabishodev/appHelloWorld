package com.example.apphelloworld.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.apphelloworld.R


class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var btnFragments2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnFragments2 = view.findViewById(R.id.btn_fragment_detail)

        btnFragments2.setOnClickListener(){
            var nombre = "Fbby"
            /*findNavController().navigate(R.id.action_mainFragment_to_detailFragment, bundleOf(
                "nombre" to nombre
            ))*/

            val action = MainFragmentDirections.actionMainFragmentToDetailFragment()
            action.nombre = nombre
        }
    }
}