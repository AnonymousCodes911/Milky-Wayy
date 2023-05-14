package com.utkarshsapplication.app.modules.rdview1one.ui

import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityRdView1OneBinding
import com.utkarshsapplication.app.modules.rdview1one.`data`.viewmodel.RdView1OneVM
import kotlin.String
import kotlin.Unit

class RdView1OneActivity : BaseActivity<ActivityRdView1OneBinding>(R.layout.activity_rd_view_1_one)
    {
  private val viewModel: RdView1OneVM by viewModels<RdView1OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rdView1OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RD_VIEW1ONE_ACTIVITY"

  }
}
