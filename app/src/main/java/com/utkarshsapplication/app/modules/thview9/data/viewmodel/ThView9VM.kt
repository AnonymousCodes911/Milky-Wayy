package com.utkarshsapplication.app.modules.thview9.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview9.`data`.model.ThView9Model
import org.koin.core.KoinComponent

class ThView9VM : ViewModel(), KoinComponent {
  val thView9Model: MutableLiveData<ThView9Model> = MutableLiveData(ThView9Model())

  var navArguments: Bundle? = null
}
