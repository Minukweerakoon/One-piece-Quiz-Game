package com.example.flaggame.screens.score

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.flaggame.R
import com.example.flaggame.databinding.FragmentScoreBinding
import com.example.flaggame.HapticUtils

class ScoreFragment : Fragment() {

    private lateinit var binding: FragmentScoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScoreBinding.inflate(inflater, container, false)

        // Retrieve score and player's name from arguments
        val scoreArgs by navArgs<ScoreFragmentArgs>()
        val score = scoreArgs.score
        val playerName = scoreArgs.name

        // Display score and player's name
        binding.displayResult.text = "${scoreArgs.name}!\nYou have scored ${scoreArgs.score} points out of 10"

        // Display message based on the score
        val message = when (score) {
            1 -> "You need to watch One Piece!"
            2 -> "Better you watch One Piece!"
            3 -> "Try to enjoy the anime!"
            4 -> "You could do better!"
            5 -> "Good effort!"
            6 -> "You know some stuff!"
            7 -> "Nicely Done!"
            8 -> "Almost perfect!"
            9 -> "The One Piece is REAL!"
            10 -> "Perfect score! You are a Legend!"
            else -> "Are you that unlucky?"
        }
        binding.scoreMessage.text = message

        // Handle play again button click
        binding.playAgain.setOnClickListener {
            val action = ScoreFragmentDirections.actionScoreFragmentToGameFragment()
            action.setName(playerName)
            findNavController().navigate(action)
            HapticUtils.performHapticFeedback(requireContext())
        }

        // Handle exit button click
        binding.exit.setOnClickListener {
            findNavController().navigate(R.id.action_scoreFragment_to_titleFragment)
            HapticUtils.performHapticFeedback(requireContext())
        }

        // Handle back press to navigate to title fragment
        val onBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_scoreFragment_to_titleFragment)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback)

        return binding.root
    }
}
