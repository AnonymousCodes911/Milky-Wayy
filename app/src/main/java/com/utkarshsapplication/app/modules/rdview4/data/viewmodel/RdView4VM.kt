package com.utkarshsapplication.app.modules.rdview4.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.rdview4.`data`.model.RdView4Model
import org.koin.core.KoinComponent

class RdView4VM : ViewModel(), KoinComponent {
  val rdView4Model: MutableLiveData<RdView4Model> = MutableLiveData(RdView4Model())

  var navArguments: Bundle? = null
}
