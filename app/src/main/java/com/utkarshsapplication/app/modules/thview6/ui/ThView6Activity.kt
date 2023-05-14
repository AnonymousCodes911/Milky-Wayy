package com.utkarshsapplication.app.modules.thview6.ui

import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView6Binding
import com.utkarshsapplication.app.modules.thview5.ui.ThView5Activity
import com.utkarshsapplication.app.modules.thview6.`data`.viewmodel.ThView6VM
import kotlin.String
import kotlin.Unit

class ThView6Activity : BaseActivity<ActivityThView6Binding>(R.layout.activity_th_view_6) {
  private val viewModel: ThView6VM by viewModels<ThView6VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thView6VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnuser.setOnClickListener {
      val destIntent = ThView5Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TH_VIEW6ACTIVITY"

  }
}
