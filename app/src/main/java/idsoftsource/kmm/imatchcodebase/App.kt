package idsoftsource.kmm.imatchcodebase;

import android.app.Application
import dagger.internal.DaggerCollections
import idsoftsource.kmm.imatchcodebase.di.component.AppComponent
import idsoftsource.kmm.imatchcodebase.di.module.AppModule

class App:Application() {


    override fun onCreate() {
        super.onCreate()
        initInjector()
    }

    private fun initInjector() {

    }
}