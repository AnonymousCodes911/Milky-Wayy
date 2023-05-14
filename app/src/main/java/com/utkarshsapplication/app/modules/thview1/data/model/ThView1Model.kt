package com.utkarshsapplication.app.modules.thview1.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ThView1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyAkanksha: String? = MyApp.getInstance().resources.getString(R.string.lbl_hey_akanksha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)

)
