package com.utkarshsapplication.app.modules.thview3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview3.`data`.model.ThView3Model
import org.koin.core.KoinComponent

class ThView3VM : ViewModel(), KoinComponent {
  val thView3Model: MutableLiveData<ThView3Model> = MutableLiveData(ThView3Model())

  var navArguments: Bundle? = null
}
