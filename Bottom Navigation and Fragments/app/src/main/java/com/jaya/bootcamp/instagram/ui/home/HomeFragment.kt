package com.jaya.bootcamp.instagram.ui.home

import android.os.Bundle
import android.view.View
import com.jaya.bootcamp.instagram.R
import com.jaya.bootcamp.instagram.di.component.FragmentComponent
import com.jaya.bootcamp.instagram.ui.base.BaseFragment

class HomeFragment : BaseFragment<HomeViewModel>() {

    companion object {

        const val TAG = "HomeFragment"

        fun newInstance(): HomeFragment {
            val args = Bundle()
            val fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun provideLayoutId(): Int = R.layout.fragment_home

    override fun injectDependencies(fragmentComponent: FragmentComponent) {
        fragmentComponent.inject(this)
    }

    override fun setupObservers() {
        super.setupObservers()

    }

    override fun setupView(view: View) {

    }

}