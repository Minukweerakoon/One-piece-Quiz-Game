package com.minuk.onepiecequiz.screens.title

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.minuk.onepiecequiz.databinding.FragmentTitleBinding
import com.minuk.onepiecequiz.HapticUtils

class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTitleBinding.inflate(inflater, container, false)

        binding.startBtn.setOnClickListener {
            // Get the entered name
            val enteredName = binding.etName.text.toString().trim()

            if (enteredName.isNotEmpty()) {
                // Capitalize the first letter of the name
                val formattedName = enteredName.substring(0, 1).toUpperCase() + enteredName.substring(1)

                // Navigate to the InstructionsFragment
                val action = TitleFragmentDirections.actionTitleFragmentToInstructionsFragment()
                action.name = formattedName
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
