package com.projectosma.tinder.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.ViewModelProvider
import android.content.Intent
import android.widget.ImageButton
import com.projectosma.tinder.PassearActivity
import com.projectosma.tinder.R
import com.projectosma.tinder.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    /**
     *
     */
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val homeViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textWelcome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        val textView1: TextView = binding.textdes
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        val imageButton: ImageButton = binding.imagepassear
        val imageButton1: ImageButton = binding.imagedate
        val imageButton2: ImageButton = binding.imagesearch




        return root
    }



    /**
     *
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /**
     * Calling this method will open a new activity.
     */



}