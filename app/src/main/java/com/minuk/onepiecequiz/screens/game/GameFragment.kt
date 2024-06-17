package com.minuk.onepiecequiz.screens.game

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.minuk.onepiecequiz.Constants
import com.minuk.onepiecequiz.Question
import com.minuk.onepiecequiz.R
import com.minuk.onepiecequiz.databinding.FragmentGameBinding
import com.minuk.onepiecequiz.HapticUtils

class GameFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentGameBinding

    private lateinit var mQuestionsList : ArrayList<Question>

    private var mSelectedPosition: Int = 0
    private var mCorrectAnswer : Int = 0
    private var mCurrrentPosition: Int = 1
    private var answersClickable: Boolean = true // Flag to track whether answers are clickable
    private var answerShown: Boolean = false // Flag to track whether correct answer is shown

    private var countDownTimer: CountDownTimer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game, container, false)
        mQuestionsList = Constants.getQuestion()
        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)
        setQuestion()
        return binding.root
    }

    private fun setQuestion() {
        mSelectedPosition = 0
        answersClickable = true
        answerShown = false

        val question: Question = mQuestionsList[mCurrrentPosition -1]
        binding.tvQuestion.text = question.question
        binding.imageView.setImageResource(question.image)
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionOne.tag = 1
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionTwo.tag = 2
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionThree.tag = 3
        binding.tvOptionFour.text = question.optionFour
        binding.tvOptionFour.tag = 4
        binding.pb.progress = mCurrrentPosition
        binding.tvProgress.text = "$mCurrrentPosition" + "/" + binding.pb.max
        defaultAppearance()
        if (mCurrrentPosition == mQuestionsList.size) {
            binding.btnSubmit.text = "Quiz Finished"
        } else {
            binding.btnSubmit.text = "Submit"
        }

        startCountDown()
    }

    private fun defaultAppearance() {
        val options = listOf<TextView>(
            binding.tvOptionOne,
            binding.tvOptionTwo,
            binding.tvOptionThree,
            binding.tvOptionFour
        )
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(requireContext(), R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_optionOne, R.id.tv_optionTwo, R.id.tv_optionThree, R.id.tv_optionFour -> {
                if (answersClickable && !answerShown) {
                    selectedOptionView(v as TextView, v.tag as Int)
                    HapticUtils.performHapticFeedback(requireContext())
                }
            }
            R.id.btnSubmit -> {
                if (mSelectedPosition == 0) {
                    mCurrrentPosition++
                    if (mCurrrentPosition <= mQuestionsList.size) {
                        setQuestion()
                    } else {
                        val action = GameFragmentDirections.actionGameFragmentToScoreFragment()
                        val nameOfPlayer by navArgs<GameFragmentArgs>()
                        action.score = mCorrectAnswer
                        action.name = nameOfPlayer.name
                        findNavController().navigate(action)
                    }
                } else {
                    if (answersClickable && !answerShown) {
                        val question = mQuestionsList[mCurrrentPosition - 1]
                        if (question.correctAnswer != mSelectedPosition) {
                            answerView(mSelectedPosition, R.drawable.wrong_option_border_bg)
                        } else {
                            mCorrectAnswer++
                        }
                        answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                        if (mCurrrentPosition == mQuestionsList.size) {
                            binding.btnSubmit.text = "Finished"
                        } else {
                            binding.btnSubmit.text = " Go to Next Question"
                        }
                        mSelectedPosition = 0
                        answersClickable = false
                        answerShown = true
                        countDownTimer?.cancel()
                        HapticUtils.performHapticFeedback(requireContext())
                    }
                    HapticUtils.performHapticFeedback(requireContext())
                }
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedPosition: Int) {
        defaultAppearance()
        mSelectedPosition = selectedPosition
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(requireContext(), R.drawable.selected_option_border_bg)
    }

    private fun answerView(selectedPosition: Int, drawableView: Int) {
        val option = when (selectedPosition) {
            1 -> binding.tvOptionOne
            2 -> binding.tvOptionTwo
            3 -> binding.tvOptionThree
            4 -> binding.tvOptionFour
            else -> null
        }
        option?.background = ContextCompat.getDrawable(requireContext(), drawableView)
    }

    private fun startCountDown() {
        countDownTimer?.cancel()
        countDownTimer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsLeft = millisUntilFinished / 1000
                binding.tvTimer.text = "Time left: $secondsLeft seconds"
            }

            override fun onFinish() {
                mCurrrentPosition++
                if (mCurrrentPosition <= mQuestionsList.size) {
                    setQuestion()
                } else {
                    val action = GameFragmentDirections.actionGameFragmentToScoreFragment()
                    val nameOfPlayer by navArgs<GameFragmentArgs>()
                    action.score = mCorrectAnswer
                    action.name = nameOfPlayer.name
                    findNavController().navigate(action)
                }
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        countDownTimer?.cancel()
    }
}
