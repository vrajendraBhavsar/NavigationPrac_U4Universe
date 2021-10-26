package com.example.navigationprac_u4universe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_send_cash.*

class SendCashFragment : Fragment(R.layout.fragment_send_cash) {
    //when you define action in navGraph ..automatically Direction class generate thay ..
    // same way destination pr Argument define karta ..je destination or argument define kari hoy ..ena mate Args ni argument file generate thai jay..automatically
    val args: SendCashFragmentArgs by navArgs() //navArgs() "args" variable ne internally initialize karai deshe..

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //to get bundle data from ChooseReceiver..
//1. receive data using Bundle..
        //var receiveName: String? = arguments?.getString("NAME")
//2. receive data using SafeArgs..

        var receiveName: String = args.receiverName
        var amount: Long = args.amount
        tv_receiver.text = "Send cash to $receiveName"
        et_amount.setText(amount.toString())
    }
}