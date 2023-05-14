package com.utkarshsapplication.app.modules.thview1one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview1one.`data`.model.ThView1OneModel
import org.koin.core.KoinComponent

class ThView1OneVM : ViewModel(), KoinComponent {
  val thView1OneModel: MutableLiveData<ThView1OneModel> = MutableLiveData(ThView1OneModel())

  var navArguments: Bundle? = null
}
