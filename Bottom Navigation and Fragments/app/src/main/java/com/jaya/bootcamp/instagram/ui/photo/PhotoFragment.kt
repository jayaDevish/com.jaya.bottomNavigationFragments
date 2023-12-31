package com.jaya.bootcamp.instagram.ui.photo

import android.os.Bundle
import android.view.View
import com.jaya.bootcamp.instagram.R
import com.jaya.bootcamp.instagram.di.component.FragmentComponent
import com.jaya.bootcamp.instagram.ui.base.BaseFragment

class PhotoFragment : BaseFragment<PhotoViewModel>() {

    companion object {

        const val TAG = "PhotoFragment"

        fun newInstance(): PhotoFragment {
            val args = Bundle()
            val fragment = PhotoFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun provideLayoutId(): Int = R.layout.fragment_photo

    override fun injectDependencies(fragmentComponent: FragmentComponent) {
        fragmentComponent.inject(this)
    }

    override fun setupObservers() {
        super.setupObservers()

    }

    override fun setupView(view: View) {

    }

}