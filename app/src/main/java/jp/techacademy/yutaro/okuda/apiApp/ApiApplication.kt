package jp.techacademy.yutaro.okuda.apiApp

import android.app.Application
import io.realm.Realm

class ApiApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}