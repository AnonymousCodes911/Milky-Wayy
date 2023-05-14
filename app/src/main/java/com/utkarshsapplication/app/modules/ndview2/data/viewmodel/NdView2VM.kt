package com.utkarshsapplication.app.modules.ndview2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.ndview2.`data`.model.NdView2Model
import org.koin.core.KoinComponent

class NdView2VM : ViewModel(), KoinComponent {
  val ndView2Model: MutableLiveData<NdView2Model> = MutableLiveData(NdView2Model())

  var navArguments: Bundle? = null
}
