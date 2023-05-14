package com.utkarshsapplication.app.modules.thview1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview1.`data`.model.ThView1Model
import org.koin.core.KoinComponent

class ThView1VM : ViewModel(), KoinComponent {
  val thView1Model: MutableLiveData<ThView1Model> = MutableLiveData(ThView1Model())

  var navArguments: Bundle? = null
}
