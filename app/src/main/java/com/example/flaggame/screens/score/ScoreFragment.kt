package com.example.flaggame.screens.score

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs
import com.example.flaggame.R
import com.example.flaggame.databinding.FragmentScoreBinding

class ScoreFragment : Fragment() {

    lateinit var binding: FragmentScoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_score, container, false)

        val scoreArgs by navArgs<ScoreFragmentArgs>()
        val score = scoreArgs.score
        binding.displayResult.text = "${scoreArgs.name}!\n You have scored $score points out of 10"

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
            else -> "Unknown score"
        }
        binding.scoreMessage.text = message

        binding.playAgain.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_scoreFragment_to_titleFragment)
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            view?.findNavController()?.navigate(R.id.action_scoreFragment_to_titleFragment)
        }

        return binding.root
    }
}
