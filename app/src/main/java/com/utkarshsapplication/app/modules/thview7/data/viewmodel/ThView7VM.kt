package com.utkarshsapplication.app.modules.thview7.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.thview7.`data`.model.ListnameRowModel
import com.utkarshsapplication.app.modules.thview7.`data`.model.ThView7Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ThView7VM : ViewModel(), KoinComponent {
  val thView7Model: MutableLiveData<ThView7Model> = MutableLiveData(ThView7Model())

  var navArguments: Bundle? = null

  val listnameList: MutableLiveData<MutableList<ListnameRowModel>> =
      MutableLiveData(mutableListOf())
}
