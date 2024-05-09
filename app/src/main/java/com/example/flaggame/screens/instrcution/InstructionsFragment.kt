package com.example.flaggame.screens.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.flaggame.R
import com.example.flaggame.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {

    private lateinit var binding: FragmentInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInstructionsBinding.inflate(inflater, container, false)

        // Navigate to the game page when the continue button is clicked
        binding.btnContinue.setOnClickListener {
            findNavController().navigate(R.id.action_instructionsFragment_to_gameFragment)
        }

        return binding.root
    }
}
