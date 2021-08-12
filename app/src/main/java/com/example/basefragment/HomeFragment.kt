package com.example.basefragment


import android.os.Bundle
import com.example.basefragment.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding,HomeViewModel>() {
    override fun getFragmentView() = R.layout.fragment_home

    override fun getViewModel() = HomeViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}