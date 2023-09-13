package io.aelf.rn_sdk

import android.app.Application
import android.content.Context
import com.facebook.react.BuildConfig
import com.facebook.react.ReactApplication
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.soloader.SoLoader
import java.lang.reflect.InvocationTargetException

open class AppReactApplication : Application(), ReactApplication {
    private val mReactNativeHost = object : ReactNativeHost(this) {
        override fun getUseDeveloperSupport(): Boolean {
            return BuildConfig.DEBUG
        }

        override fun getPackages(): MutableList<ReactPackage> {
//            return PackageList(this).packages
            return mutableListOf()
        }

        override fun getJSMainModuleName(): String {
            return "index"
        }
    }

    override fun getReactNativeHost(): ReactNativeHost {
        return mReactNativeHost
    }

    override fun onCreate() {
        super.onCreate()
        // init .so file
        SoLoader.init(this, /* native exo package */ false)
        initializeFlipper(this, reactNativeHost.reactInstanceManager)
    }

    /**
     * Loads Flipper in React Native templates. Call this in the onCreate method with something like
     * initializeFlipper(this, getReactNativeHost().getReactInstanceManager());
     *
     * @param context
     * @param reactInstanceManager
     */
    private fun initializeFlipper(
        context: Context, reactInstanceManager: ReactInstanceManager
    ) {
        if (BuildConfig.DEBUG) {
            try {
                /**
                 * We use reflection here to pick up the class that initializes Flipper,
                 * since Flipper library is not available in release mode
                 */
                val aClass = Class.forName("com.awesomeproject.ReactNativeFlipper")
                aClass.getMethod(
                    "initializeFlipper",
                    Context::class.java,
                    ReactInstanceManager::class.java
                ).invoke(null, context, reactInstanceManager)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } catch (e: NoSuchMethodException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: InvocationTargetException) {
                e.printStackTrace()
            }
        }
    }
}