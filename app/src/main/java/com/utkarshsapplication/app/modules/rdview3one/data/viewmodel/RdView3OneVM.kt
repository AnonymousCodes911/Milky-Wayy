package com.utkarshsapplication.app.modules.rdview3one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.rdview3one.`data`.model.RdView3OneModel
import org.koin.core.KoinComponent

class RdView3OneVM : ViewModel(), KoinComponent {
  val rdView3OneModel: MutableLiveData<RdView3OneModel> = MutableLiveData(RdView3OneModel())

  var navArguments: Bundle? = null
}
