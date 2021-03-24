package com.codingblocks.staticfragments

import android.os.Bundle
import android.security.identity.IdentityCredentialStore
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_count_up.*
import kotlinx.android.synthetic.main.fragment_count_up.view.*


// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [CountUpFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CountUpFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,

        savedInstanceState: Bundle?
    ): View?  = inflater.inflate(R.layout.fragment_count_up, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var count = 0;
        addbtn.setOnClickListener {
            count++
            tvcountup.text = count.toString()
            Toast.makeText(requireContext(),"Value increased",Toast.LENGTH_SHORT).show()
        }
    }

    }




