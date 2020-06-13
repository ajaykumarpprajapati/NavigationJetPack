package com.anushka.navdemo5


import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.anushka.navdemo5.databinding.FragmentEmailBinding
import com.anushka.navdemo5.databinding.FragmentNameBinding

/**
 * A simple [Fragment] subclass.
 */
class EmailFragment : Fragment() {

    private lateinit var binding: FragmentEmailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var name: String? = arguments?.getString("user_input")
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_email, container, false)
        binding.submitButton?.setOnClickListener {
            val bundle: Bundle = bundleOf("user_email" to binding.emailEditText.text.toString(),"user_name" to name)
            findNavController().navigate(R.id.action_emailFragment_to_welcomeFragment, bundle)
        }
        return binding.root
    }
}
