package com.utkarshsapplication.app.modules.thview5.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview5.`data`.model.ListuserRowModel
import com.utkarshsapplication.app.modules.thview5.`data`.model.ThView5Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ThView5VM : ViewModel(), KoinComponent {
  val thView5Model: MutableLiveData<ThView5Model> = MutableLiveData(ThView5Model())

  var navArguments: Bundle? = null

  val listuserList: MutableLiveData<MutableList<ListuserRowModel>> =
      MutableLiveData(mutableListOf())
}
