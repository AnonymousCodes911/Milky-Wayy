package com.utkarshsapplication.app.modules.thview5.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListuserRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRameshKumar: String? = MyApp.getInstance().resources.getString(R.string.lbl_ramesh_kumar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRs60L: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_60_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_km)

)
