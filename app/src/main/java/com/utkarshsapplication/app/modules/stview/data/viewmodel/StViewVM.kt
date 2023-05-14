package com.utkarshsapplication.app.modules.stview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.stview.`data`.model.StViewModel
import org.koin.core.KoinComponent

class StViewVM : ViewModel(), KoinComponent {
  val stViewModel: MutableLiveData<StViewModel> = MutableLiveData(StViewModel())

  var navArguments: Bundle? = null
}
