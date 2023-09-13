package io.aelf.rn_sdk

import com.facebook.react.ReactActivity

class ReactNativeActivity : ReactActivity() {
    override fun getMainComponentName(): String {
        return "Root"
    }
}