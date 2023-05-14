package com.utkarshsapplication.app.modules.rdview4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityRdView4Binding
import com.utkarshsapplication.app.modules.rdview4.`data`.viewmodel.RdView4VM
import com.utkarshsapplication.app.modules.thview1.ui.ThView1Activity
import kotlin.String
import kotlin.Unit

class RdView4Activity : BaseActivity<ActivityRdView4Binding>(R.layout.activity_rd_view_4) {
  private val viewModel: RdView4VM by viewModels<RdView4VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rdView4VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFingerprintrem.setOnClickListener {
      val destIntent = ThView1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RD_VIEW4ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RdView4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
