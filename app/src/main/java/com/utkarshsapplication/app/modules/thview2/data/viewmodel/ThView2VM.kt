package com.utkarshsapplication.app.modules.thview2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview2.`data`.model.ThView2Model
import org.koin.core.KoinComponent

class ThView2VM : ViewModel(), KoinComponent {
  val thView2Model: MutableLiveData<ThView2Model> = MutableLiveData(ThView2Model())

  var navArguments: Bundle? = null
}
