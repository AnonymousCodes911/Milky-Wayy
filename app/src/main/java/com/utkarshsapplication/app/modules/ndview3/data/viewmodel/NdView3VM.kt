package com.utkarshsapplication.app.modules.ndview3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.ndview3.`data`.model.NdView3Model
import org.koin.core.KoinComponent

class NdView3VM : ViewModel(), KoinComponent {
  val ndView3Model: MutableLiveData<NdView3Model> = MutableLiveData(NdView3Model())

  var navArguments: Bundle? = null
}
