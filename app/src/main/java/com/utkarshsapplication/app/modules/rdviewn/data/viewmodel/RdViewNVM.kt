package com.utkarshsapplication.app.modules.rdviewn.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.utkarshsapplication.app.modules.rdviewn.`data`.model.RdViewNModel
import org.koin.core.KoinComponent

class RdViewNVM : ViewModel(), KoinComponent {
  val rdViewNModel: MutableLiveData<RdViewNModel> = MutableLiveData(RdViewNModel())

  var navArguments: Bundle? = null
}
