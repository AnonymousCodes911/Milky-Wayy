package com.utkarshsapplication.app.modules.rdview4.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RdView4Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddYourFinger: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_your_finger)

)
