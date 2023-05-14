package com.utkarshsapplication.app.modules.thview2one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview2one.`data`.model.ThView2OneModel
import org.koin.core.KoinComponent

class ThView2OneVM : ViewModel(), KoinComponent {
  val thView2OneModel: MutableLiveData<ThView2OneModel> = MutableLiveData(ThView2OneModel())

  var navArguments: Bundle? = null
}
