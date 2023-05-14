package com.utkarshsapplication.app.modules.rdview2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.rdview2.`data`.model.RdView2Model
import org.koin.core.KoinComponent

class RdView2VM : ViewModel(), KoinComponent {
  val rdView2Model: MutableLiveData<RdView2Model> = MutableLiveData(RdView2Model())

  var navArguments: Bundle? = null
}
