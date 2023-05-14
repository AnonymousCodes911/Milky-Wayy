package com.utkarshsapplication.app.modules.thview4.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ThView4Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyAkanksha: String? = MyApp.getInstance().resources.getString(R.string.lbl_hey_akanksha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVendor: String? = MyApp.getInstance().resources.getString(R.string.lbl_vendor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_consumer)

)
