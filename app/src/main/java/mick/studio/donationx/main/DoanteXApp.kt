package mick.studio.donationx.main

import android.app.Application
import mick.studio.donationx.models.DonationMemStore
import mick.studio.donationx.models.DonationStore
import timber.log.Timber

class DonationXApp : Application() {

    lateinit var donationsStore: DonationStore

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        donationsStore = DonationMemStore()
        Timber.i("DonationX Application Started")
    }
}