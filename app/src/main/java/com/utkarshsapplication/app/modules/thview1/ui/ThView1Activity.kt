package com.utkarshsapplication.app.modules.thview1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView1Binding
import com.utkarshsapplication.app.modules.thview1.`data`.viewmodel.ThView1VM
import com.utkarshsapplication.app.modules.thview2one.ui.ThView2OneActivity
import kotlin.String
import kotlin.Unit

class ThView1Activity : BaseActivity<ActivityThView1Binding>(R.layout.activity_th_view_1) {
  private val viewModel: ThView1VM by viewModels<ThView1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thView1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGroupThirtyOne.setOnClickListener {
      val destIntent = ThView2OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TH_VIEW1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThView1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
