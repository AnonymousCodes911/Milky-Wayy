package com.utkarshsapplication.app.modules.rdview2one.ui

import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityRdView2OneBinding
import com.utkarshsapplication.app.modules.rdview2one.`data`.viewmodel.RdView2OneVM
import kotlin.String
import kotlin.Unit

class RdView2OneActivity : BaseActivity<ActivityRdView2OneBinding>(R.layout.activity_rd_view_2_one)
    {
  private val viewModel: RdView2OneVM by viewModels<RdView2OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rdView2OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RD_VIEW2ONE_ACTIVITY"

  }
}
