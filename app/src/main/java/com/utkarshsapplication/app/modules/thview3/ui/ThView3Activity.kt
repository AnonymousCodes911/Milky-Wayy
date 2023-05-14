package com.utkarshsapplication.app.modules.thview3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView3Binding
import com.utkarshsapplication.app.modules.thview3.`data`.viewmodel.ThView3VM
import com.utkarshsapplication.app.modules.thview4.ui.ThView4Activity
import kotlin.String
import kotlin.Unit

class ThView3Activity : BaseActivity<ActivityThView3Binding>(R.layout.activity_th_view_3) {
  private val viewModel: ThView3VM by viewModels<ThView3VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thView3VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerGroupFortyFour.setOnClickListener {
      val destIntent = ThView4Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TH_VIEW3ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThView3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
