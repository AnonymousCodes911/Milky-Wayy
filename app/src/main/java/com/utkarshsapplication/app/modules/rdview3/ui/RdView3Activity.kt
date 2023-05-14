package com.utkarshsapplication.app.modules.rdview3.ui

import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityRdView3Binding
import com.utkarshsapplication.app.modules.rdview3.`data`.viewmodel.RdView3VM
import kotlin.String
import kotlin.Unit

class RdView3Activity : BaseActivity<ActivityRdView3Binding>(R.layout.activity_rd_view_3) {
  private val viewModel: RdView3VM by viewModels<RdView3VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rdView3VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RD_VIEW3ACTIVITY"

  }
}
