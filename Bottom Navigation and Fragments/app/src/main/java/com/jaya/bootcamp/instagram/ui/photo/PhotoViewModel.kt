package com.jaya.bootcamp.instagram.ui.photo

import com.jaya.bootcamp.instagram.ui.base.BaseViewModel
import com.jaya.bootcamp.instagram.utils.network.NetworkHelper
import com.jaya.bootcamp.instagram.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

class PhotoViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper
) : BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {


    override fun onCreate() {

    }
}