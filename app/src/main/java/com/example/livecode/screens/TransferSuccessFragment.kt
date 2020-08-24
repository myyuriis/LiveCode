package com.example.livecode.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.livecode.R
import com.example.livecode.databinding.FragmentTransferSuccessBinding

class TransferSuccessFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentTransferSuccessBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_transfer_success, container, false)
        binding.doneButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_transferSuccessFragment_to_loginFragment)
        }
        return binding.root
    }

}