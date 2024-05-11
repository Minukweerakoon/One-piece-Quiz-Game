package com.example.flaggame.screens.title

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.flaggame.databinding.FragmentTitleBinding
import com.example.flaggame.HapticUtils

class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTitleBinding.inflate(inflater, container, false)

        binding.startBtn.setOnClickListener {
            // Check if the name EditText is not empty
            if (binding.etName.text.toString().isNotEmpty()) {
                // Navigate to the InstructionsFragment
                val action = TitleFragmentDirections.actionTitleFragmentToInstructionsFragment()
                action.name = binding.etName.text.toString()
                findNavController().navigate(action)
                HapticUtils.performHapticFeedback(requireContext())
            } else {
                // Display a toast message if the name EditText is empty
                Toast.makeText(requireContext(), "Enter your name to start", Toast.LENGTH_SHORT).show()

            }
        }

        return binding.root
    }
}
