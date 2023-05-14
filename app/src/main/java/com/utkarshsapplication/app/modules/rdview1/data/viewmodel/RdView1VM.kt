package com.utkarshsapplication.app.modules.rdview1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.rdview1.`data`.model.RdView1Model
import org.koin.core.KoinComponent

class RdView1VM : ViewModel(), KoinComponent {
  val rdView1Model: MutableLiveData<RdView1Model> = MutableLiveData(RdView1Model())

  var navArguments: Bundle? = null
}
