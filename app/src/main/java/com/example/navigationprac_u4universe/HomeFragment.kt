package com.example.navigationprac_u4universe

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
//NavHostFrag jode NavController associate hoy chhe..jeno
class HomeFragment : Fragment(R.layout.fragment_home) { //aana thi khali layout display thava lagshe
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
//    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//jeva aapde destinations vachhe actions define karie..safeArgs ee caller Frag(jena thi badha Frag attach thata hashe) mate "Direction" class generate kare chhe...
        btn_send_money.setOnClickListener {
                //Fragment.findNavController() ..Avtivity.findNavController()...or ..View.findNavController()
                //thanks to kotlin extensions ..aapde findNavController() ne directly use kari shakie chhie..
            //way-1 ..Destination ni ID thi navigate thao..
//            findNavController().navigate(R.id.chooseReceiverFragment)
            //way-2 ..Destination mate action define kari ..and ee Action ni ID use kari navigate karie
//            findNavController().navigate(R.id.action_homeFragment_to_chooseReceiverFragment)
            // var action = find
            //way-3 ..SafeArgs plug in thi "Direction" class male.. jene use kari navigate karie    [type safe way ma data pass karva aa method best ..Bundle nu best alternative]
            var action = HomeFragmentDirections.actionHomeFragmentToChooseReceiverFragment()
            findNavController().navigate(action)

        }

        btn_view_balance.setOnClickListener {
//            findNavController().navigate(R.id.viewBalanceFragment)
//            findNavController().navigate(R.id.action_homeFragment_to_viewBalanceFragment)
            var action = HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
            findNavController().navigate(action)
        }

        btn_transactions.setOnClickListener {
//            findNavController().navigate(R.id.viewTransactionFragment)
//            findNavController().navigate(R.id.action_homeFragment_to_viewTransactionFragment)
            var action = HomeFragmentDirections.actionHomeFragmentToViewTransactionFragment()
            findNavController().navigate(action)
        }

    }

}