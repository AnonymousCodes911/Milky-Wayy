package com.utkarshsapplication.app.modules.thview4.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview4.`data`.model.ThView4Model
import org.koin.core.KoinComponent

class ThView4VM : ViewModel(), KoinComponent {
  val thView4Model: MutableLiveData<ThView4Model> = MutableLiveData(ThView4Model())

  var navArguments: Bundle? = null
}
