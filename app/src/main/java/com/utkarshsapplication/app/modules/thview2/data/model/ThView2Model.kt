package com.utkarshsapplication.app.modules.thview2.`data`.model

import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ThView2Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMilk: String? = MyApp.getInstance().resources.getString(R.string.lbl_milk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheese: String? = MyApp.getInstance().resources.getString(R.string.lbl_cheese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYogurt: String? = MyApp.getInstance().resources.getString(R.string.lbl_yogurt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIceCream: String? = MyApp.getInstance().resources.getString(R.string.lbl_ice_cream)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButter: String? = MyApp.getInstance().resources.getString(R.string.lbl_butter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGhee: String? = MyApp.getInstance().resources.getString(R.string.lbl_ghee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCustard: String? = MyApp.getInstance().resources.getString(R.string.lbl_custard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaneer: String? = MyApp.getInstance().resources.getString(R.string.lbl_paneer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtermilk: String? = MyApp.getInstance().resources.getString(R.string.lbl_buttermilk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalendarOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_calendar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVendors: String? = MyApp.getInstance().resources.getString(R.string.lbl_vendors)

)
