package com.utkarshsapplication.app.modules.rdview1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityRdView1Binding
import com.utkarshsapplication.app.modules.ndview2.ui.NdView2Activity
import com.utkarshsapplication.app.modules.rdview1.`data`.viewmodel.RdView1VM
import com.utkarshsapplication.app.modules.rdview2.ui.RdView2Activity
import com.utkarshsapplication.app.modules.rdview3.ui.RdView3Activity
import com.utkarshsapplication.app.modules.rdview3one.ui.RdView3OneActivity
import kotlin.String
import kotlin.Unit

class RdView1Activity : BaseActivity<ActivityRdView1Binding>(R.layout.activity_rd_view_1) {
  private val viewModel: RdView1VM by viewModels<RdView1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rdView1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGroupThree.setOnClickListener {
      val destIntent = Intent(this, RdView3OneActivity::class.java)
      startActivity(destIntent)
    }
    binding.txtGroupFour.setOnClickListener {
      val destIntent = RdView2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RD_VIEW1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RdView1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
