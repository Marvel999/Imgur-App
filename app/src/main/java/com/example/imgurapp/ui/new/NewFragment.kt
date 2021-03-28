package com.example.imgurapp.ui.new

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.imgurapp.databinding.FragmentNewBinding

class NewFragment : Fragment() {

    private lateinit var newViewModel: NewViewModel
    private var _binding: FragmentNewBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        newViewModel =
            ViewModelProvider(this).get(NewViewModel::class.java)

        _binding = FragmentNewBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        newViewModel.getAlubm()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}