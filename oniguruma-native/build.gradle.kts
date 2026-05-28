/*******************************************************************************
 *    sora-editor - the awesome code editor for Android
 *    https://github.com/Rosemoe/sora-editor
 ******************************************************************************/

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.publish)
}

android {
    namespace = "io.github.rosemoe.sora.oniguruma"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    // ==================== ส่วน NDK + CMake ====================
    ndkVersion = "29.0.14206865"

    externalNativeBuild {
        cmake {
            path = "src/main/cpp/CMakeLists.txt"   // ใช้ String
            version = "3.31.5"
        }
    }
    // =======================================================

}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.junit)
    androidTestImplementation(libs.androidx.test.espresso)
}
