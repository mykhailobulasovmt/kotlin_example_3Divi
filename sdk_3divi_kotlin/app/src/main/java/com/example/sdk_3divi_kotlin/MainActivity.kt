package com.example.sdk_3divi_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vdt.face_recognition.sdk.FacerecService


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = FacerecService.createService(
            applicationInfo.nativeLibraryDir + "/libfacerec.so",
            applicationInfo.dataDir + "/fsdk/conf/facerec",
            applicationInfo.dataDir + "/fsdk/license"
        )
    }

}