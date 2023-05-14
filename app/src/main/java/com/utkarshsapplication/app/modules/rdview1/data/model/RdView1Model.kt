package com.utkarshsapplication.app.modules.rdview1.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RdView1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_to_mil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFour: String? = MyApp.getInstance().resources.getString(R.string.msg_sign_in_sign_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThree: String? = MyApp.getInstance().resources.getString(R.string.msg_continue_with_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_continuing_y)

)
