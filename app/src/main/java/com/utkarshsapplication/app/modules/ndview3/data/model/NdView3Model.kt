package com.utkarshsapplication.app.modules.ndview3.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NdView3Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_sellers_sha)

)
