package com.utkarshsapplication.app.modules.thview9.ui

import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView9Binding
import com.utkarshsapplication.app.modules.thview9.`data`.viewmodel.ThView9VM
import kotlin.String
import kotlin.Unit

class ThView9Activity : BaseActivity<ActivityThView9Binding>(R.layout.activity_th_view_9) {
  private val viewModel: ThView9VM by viewModels<ThView9VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thView9VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TH_VIEW9ACTIVITY"

  }
}
