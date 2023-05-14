package com.utkarshsapplication.app.modules.rdview1one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.rdview1one.`data`.model.RdView1OneModel
import org.koin.core.KoinComponent

class RdView1OneVM : ViewModel(), KoinComponent {
  val rdView1OneModel: MutableLiveData<RdView1OneModel> = MutableLiveData(RdView1OneModel())

  var navArguments: Bundle? = null
}
