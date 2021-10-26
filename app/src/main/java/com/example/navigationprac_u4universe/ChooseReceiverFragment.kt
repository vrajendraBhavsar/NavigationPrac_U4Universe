package com.example.navigationprac_u4universe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_choose_receiver.*

class ChooseReceiverFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_receiver, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_next.setOnClickListener {
            if (et_receiver_name.text.isNotEmpty()){
                var name = et_receiver_name.text.toString()
//1. data pass using bundle[no compile time TypeSafety] ..means  ..data pass krta and receive karta time ..jate j putString, putInt,getString etc karvu pade..and jo sender and receiver side different data type hoy to error nahi aave ..data pass to nahi thay and default value j receiver ne malshe..
//                var args = Bundle()
//                args.putString("NAME", name)
//
//                findNavController().navigate(R.id.sendCashFragment, args)

//2. data pass using SafeArgs..
                //SendCashFrag mate argument set karo ..in navGraph
                val action = ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashFragment(name)
                findNavController().navigate(action)
            }else{
                Toast.makeText(context, "Enter Data", Toast.LENGTH_LONG).show()
            }

        }
    }
}