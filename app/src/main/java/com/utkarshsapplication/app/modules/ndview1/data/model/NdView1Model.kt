package com.utkarshsapplication.app.modules.ndview1.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NdView1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_we_ll_show_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNextStep: String? = MyApp.getInstance().resources.getString(R.string.lbl_next_step)

)
