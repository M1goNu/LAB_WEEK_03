package com.example.lab_week_03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Button
import androidx.navigation.fragment.findNavController

class DetailFragment : Fragment() {

    private lateinit var coffeeTitle: TextView
    private lateinit var coffeeDesc: TextView
    private lateinit var backButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        coffeeTitle = view.findViewById(R.id.coffee_title)
        coffeeDesc = view.findViewById(R.id.coffee_desc)
        backButton = view.findViewById(R.id.btn_back)

        val coffeeId = arguments?.getInt(ListFragment.COFFEE_ID)

        when (coffeeId) {
            R.id.affogato -> {
                coffeeTitle.text = getString(R.string.affogato_title)
                coffeeDesc.text = getString(R.string.affogato_desc)
            }
            R.id.americano -> {
                coffeeTitle.text = getString(R.string.americano_title)
                coffeeDesc.text = getString(R.string.americano_desc)
            }
            R.id.latte -> {
                coffeeTitle.text = getString(R.string.latte_title)
                coffeeDesc.text = getString(R.string.latte_desc)
            }
            R.id.cappuccino -> {
                coffeeTitle.text = getString(R.string.cappuccino_title)
                coffeeDesc.text = getString(R.string.cappuccino_desc)
            }
            R.id.espresso -> {
                coffeeTitle.text = getString(R.string.espresso_title)
                coffeeDesc.text = getString(R.string.espresso_desc)
            }
        }

        backButton.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}
