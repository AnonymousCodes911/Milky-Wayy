package com.utkarshsapplication.app.modules.thview6.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview6.`data`.model.ThView6Model
import org.koin.core.KoinComponent

class ThView6VM : ViewModel(), KoinComponent {
  val thView6Model: MutableLiveData<ThView6Model> = MutableLiveData(ThView6Model())

  var navArguments: Bundle? = null
}
