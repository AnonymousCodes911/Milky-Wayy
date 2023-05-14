package com.utkarshsapplication.app.modules.ndview2.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NdView2Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtFeatures: String? = MyApp.getInstance().resources.getString(R.string.lbl_features)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_one_can_conveni)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNextStep: String? = MyApp.getInstance().resources.getString(R.string.lbl_next_step)

)
