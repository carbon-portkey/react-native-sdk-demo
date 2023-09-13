pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
//        maven {
//            url = java.net.URI("$rootDir/../../node_modules/react-native/android")
//        }
//        maven {
//            url = java.net.URI("$rootDir/../../node_modules/jsc-android/dist")
//        }
    }
}

rootProject.name = "react-native-sdk-demo"
include(":app")
include(":rn-sdk")

apply(
    from =
    file("../../node_modules/@react-native-community/cli-platform-android/native_modules.gradle")
)