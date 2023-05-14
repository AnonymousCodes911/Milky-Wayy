package com.utkarshsapplication.app.modules.rdviewn.ui

import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityRdViewNBinding
import com.utkarshsapplication.app.modules.rdviewn.`data`.viewmodel.RdViewNVM
import kotlin.String
import kotlin.Unit

class RdViewNActivity : BaseActivity<ActivityRdViewNBinding>(R.layout.activity_rd_view_n) {
  private val viewModel: RdViewNVM by viewModels<RdViewNVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rdViewNVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RD_VIEW_N_ACTIVITY"

  }
}
