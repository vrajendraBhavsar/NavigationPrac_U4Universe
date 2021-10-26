package com.example.navigationprac_u4universe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
//"navGraph" ne NavDrawer or BottomNavigation jode attach/link karta .. top level destination or UI like Hamburger icon ne automatic navComponent manage kare chhe
//NavDrawer or BottomNavigation nu kaam top level destination show karavanu (e.g. profile, feeds, stories off your friends ...je single touch ma accessible hovi joiee eevi screens/frag/destinations)
class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//1.actionBar set up ...
//- find navController ..je NavHostFrag thi mali jashe .. as NavController ee NavHostFrag jode attached hoy chhe..
//- ee easily koi pan Frag je navGraph ma added hoy eema "findNavController()" karva thi mali jay chhe ..
//- but MainActivity koi navGraph jode attach nathi ..."findNavController()" no option malshe kharo ...but ee Exception generate karshe..
//- so activity ma navHostFrag(supportFragmentManager()) ni help thi ..navController mali jashe..

        val navHostFragment: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment   //aa frag ne cast krvu padshe "NavHostFragment" tarike
        navController = navHostFragment.navController

        //thanks to kotlin extension ..NavigationUI.setupActionBarWithNavController() aakhu nai lakhvu pade..
        setupActionBarWithNavController(navController)   //je Frag container ma aavshe eenu title ActionBar par set thai jasje

    }

    override fun onSupportNavigateUp(): Boolean {

        return navController.navigateUp() || super.onSupportNavigateUp()    //navigateUp() - previous destination/frag par lai jay..
    }
}