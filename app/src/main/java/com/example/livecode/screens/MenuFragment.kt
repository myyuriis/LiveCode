package com.example.livecode.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.livecode.R
import com.example.livecode.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentMenuBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_menu, container, false)
        binding.transferButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_transferToFragment)
        }
        binding.historyButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_historyFragment)
        }
        return binding.root
//        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

}