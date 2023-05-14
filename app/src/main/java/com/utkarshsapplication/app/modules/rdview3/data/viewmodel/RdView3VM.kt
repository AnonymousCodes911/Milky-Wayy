package com.utkarshsapplication.app.modules.rdview3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.rdview3.`data`.model.RdView3Model
import org.koin.core.KoinComponent

class RdView3VM : ViewModel(), KoinComponent {
  val rdView3Model: MutableLiveData<RdView3Model> = MutableLiveData(RdView3Model())

  var navArguments: Bundle? = null
}
