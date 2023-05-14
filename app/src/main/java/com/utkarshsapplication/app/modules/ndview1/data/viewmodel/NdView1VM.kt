package com.utkarshsapplication.app.modules.ndview1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.ndview1.`data`.model.NdView1Model
import org.koin.core.KoinComponent

class NdView1VM : ViewModel(), KoinComponent {
  val ndView1Model: MutableLiveData<NdView1Model> = MutableLiveData(NdView1Model())

  var navArguments: Bundle? = null
}
