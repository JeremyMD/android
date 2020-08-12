package com.example.my_very_own_application


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.my_very_own_application.databinding.FragmentOneBinding

/**
 * A simple [Fragment] subclass.
 */
class OneFragment : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentOneBinding>(
            inflater, R.layout.fragment_one, container, false)

        return binding.root
    }


}
