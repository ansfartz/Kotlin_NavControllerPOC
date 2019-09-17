package com.example.android.navigation


import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        Log.d("xxx", "onCreate TitleFragment")

        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)


//        binding.playButton.setOnClickListener { view: View ->
////            Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
//
//            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
//
//        }


//        binding.playButton.setOnClickListener(
//                Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
//        )

        binding.playButton.setOnClickListener(
//              Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
                Navigation.createNavigateOnClickListener(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        )




        setHasOptionsMenu(true)
        return binding.root



    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController())
                || super.onOptionsItemSelected(item)

    }

    override fun onDestroyView() {
        Log.d("xxx", "onDestroy TitleFragment\n")
        super.onDestroyView()
    }
}

