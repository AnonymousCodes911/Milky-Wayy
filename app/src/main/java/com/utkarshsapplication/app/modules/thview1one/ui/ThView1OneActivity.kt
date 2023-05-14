package com.utkarshsapplication.app.modules.thview1one.ui

import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView1OneBinding
import com.utkarshsapplication.app.modules.thview1one.`data`.viewmodel.ThView1OneVM
import kotlin.String
import kotlin.Unit

class ThView1OneActivity : BaseActivity<ActivityThView1OneBinding>(R.layout.activity_th_view_1_one)
    {
  private val viewModel: ThView1OneVM by viewModels<ThView1OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thView1OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TH_VIEW1ONE_ACTIVITY"

  }
}
