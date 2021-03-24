package com.codingblocks.staticfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_count_down.*
import kotlinx.android.synthetic.main.fragment_count_down.view.*
import kotlinx.android.synthetic.main.fragment_count_up.view.*


// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [CountDownFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CountDownFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_count_down, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var count = 50;
        tvcountdown.text= count.toString()
        subbtn.setOnClickListener {
            if(count>0)
            {
                count--
                tvcountdown.text = count.toString()
                Toast.makeText(requireContext(),"Value decreased",Toast.LENGTH_SHORT).show()

        }
            else
            {
                Toast.makeText(requireContext(),"Value cannot be negative",Toast.LENGTH_SHORT).show()
            }
    }

}




}