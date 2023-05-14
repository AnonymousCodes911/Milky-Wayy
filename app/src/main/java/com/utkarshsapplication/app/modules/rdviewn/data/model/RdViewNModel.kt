package com.utkarshsapplication.app.modules.rdviewn.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RdViewNModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScanYourFinge: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scan_your_finge2)

)
