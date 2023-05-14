package com.utkarshsapplication.app.modules.thview9.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ThView9Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyAkanksha: String? = MyApp.getInstance().resources.getString(R.string.lbl_hey_akanksha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoose: String? = MyApp.getInstance().resources.getString(R.string.lbl_choose)
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
