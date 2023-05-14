package com.utkarshsapplication.app.modules.rdviewnone.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RdViewNOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScanYourFinge: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scan_your_finge)

)
