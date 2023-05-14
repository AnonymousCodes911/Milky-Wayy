package com.utkarshsapplication.app.modules.rdview2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityRdView2Binding
import com.utkarshsapplication.app.modules.rdview2.`data`.viewmodel.RdView2VM
import com.utkarshsapplication.app.modules.rdview3one.ui.RdView3OneActivity
import com.utkarshsapplication.app.modules.rdview4.ui.RdView4Activity
import kotlin.String
import kotlin.Unit

class RdView2Activity : BaseActivity<ActivityRdView2Binding>(R.layout.activity_rd_view_2) {
  private val viewModel: RdView2VM by viewModels<RdView2VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rdView2VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = RdView4Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtLogin.setOnClickListener {
      val destIntent = RdView3OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RD_VIEW2ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RdView2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
