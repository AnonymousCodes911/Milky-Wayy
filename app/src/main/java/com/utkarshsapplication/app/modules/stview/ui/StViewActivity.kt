package com.utkarshsapplication.app.modules.stview.ui

import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityStViewBinding
import com.utkarshsapplication.app.modules.ndview1.ui.NdView1Activity
import com.utkarshsapplication.app.modules.stview.`data`.viewmodel.StViewVM
import kotlin.String
import kotlin.Unit

class StViewActivity : BaseActivity<ActivityStViewBinding>(R.layout.activity_st_view) {
  private val viewModel: StViewVM by viewModels<StViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.stViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGetStarted.setOnClickListener {
      val destIntent = NdView1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
//    binding.imageArrowThree.setOnClickListener {
//      val destIntent = NdView1Activity.getIntent(this, null)
//      startActivity(destIntent)
//    }
    binding.linearRowgetstarted.setOnClickListener {
      val destIntent = NdView1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ST_VIEW_ACTIVITY"

  }
}
