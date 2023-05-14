package com.utkarshsapplication.app.modules.thview1one.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ThView1OneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyAkanksha: String? = MyApp.getInstance().resources.getString(R.string.lbl_hey_akanksha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_english)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hindi)

)
