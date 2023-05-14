package com.utkarshsapplication.app.modules.thview8.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview8.`data`.model.SpinnerGroupSevenModel
import com.utkarshsapplication.app.modules.thview8.`data`.model.SpinnerZipcodeModel
import com.utkarshsapplication.app.modules.thview8.`data`.model.ThView8Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ThView8VM : ViewModel(), KoinComponent {
  val thView8Model: MutableLiveData<ThView8Model> = MutableLiveData(ThView8Model())

  var navArguments: Bundle? = null

  val spinnerZipcodeList: MutableLiveData<MutableList<SpinnerZipcodeModel>> = MutableLiveData()

  val spinnerGroupSevenList: MutableLiveData<MutableList<SpinnerGroupSevenModel>> =
      MutableLiveData()
}
