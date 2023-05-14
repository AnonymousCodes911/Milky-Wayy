package com.utkarshsapplication.app.modules.thview7.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListnameRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkankshaGarg: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_akanksha_garg2)

)
