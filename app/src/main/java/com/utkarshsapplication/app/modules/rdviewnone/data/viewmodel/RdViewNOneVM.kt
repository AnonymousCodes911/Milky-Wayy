package com.utkarshsapplication.app.modules.rdviewnone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.rdviewnone.`data`.model.RdViewNOneModel
import org.koin.core.KoinComponent

class RdViewNOneVM : ViewModel(), KoinComponent {
  val rdViewNOneModel: MutableLiveData<RdViewNOneModel> = MutableLiveData(RdViewNOneModel())

  var navArguments: Bundle? = null
}
