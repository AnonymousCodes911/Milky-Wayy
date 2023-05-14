package com.utkarshsapplication.app.modules.rdview2one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.rdview2one.`data`.model.RdView2OneModel
import org.koin.core.KoinComponent

class RdView2OneVM : ViewModel(), KoinComponent {
  val rdView2OneModel: MutableLiveData<RdView2OneModel> = MutableLiveData(RdView2OneModel())

  var navArguments: Bundle? = null
}
