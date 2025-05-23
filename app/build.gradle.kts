plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id ("kotlin-kapt")
}

android {
    namespace = "com.felix.gamers_hub"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.felix.gamers_hub"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //Navigation
    // Jetpack Compose Navigation (Valid)
    implementation("androidx.navigation:navigation-compose:2.8.0")

  // (Optional) For View-based apps — not needed if you're only using Compose
   implementation("androidx.navigation:navigation-fragment-ktx:2.8.0")
   implementation("androidx.navigation:navigation-ui-ktx:2.8.0")




    //Room
    implementation ("androidx.room:room-runtime:2.6.1")
    kapt ("androidx.room:room-compiler:2.6.1")
    implementation ("androidx.room:room-ktx:2.6.1")

    // Image Loading (Coil for Jetpack Compose)
    implementation ("io.coil-kt:coil-compose:2.4.0")

//livedata
    implementation("androidx.compose.runtime:runtime-livedata:1.6.4")

implementation("androidx.core:core-splashscreen:1.0.1")



        implementation("io.coil-kt:coil-compose:2.4.0")
        implementation("io.coil-kt:coil-gif:2.4.0")


// ExoPlayer core
    implementation("androidx.media3:media3-exoplayer:1.3.1")

// Optional UI components (if using PlayerView in XML or Compose interop)
    implementation("androidx.media3:media3-ui:1.3.1")


    implementation("androidx.compose.ui:ui:1.6.0")
    implementation("androidx.activity:activity-compose:1.9.0")




}




