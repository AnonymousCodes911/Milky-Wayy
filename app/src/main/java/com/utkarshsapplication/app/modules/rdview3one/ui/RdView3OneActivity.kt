package com.utkarshsapplication.app.modules.rdview3one.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityRdView3OneBinding
import com.utkarshsapplication.app.modules.rdview2.ui.RdView2Activity
import com.utkarshsapplication.app.modules.rdview3one.`data`.viewmodel.RdView3OneVM
import com.utkarshsapplication.app.modules.rdview4.ui.RdView4Activity
import kotlin.String
import kotlin.Unit

class RdView3OneActivity : BaseActivity<ActivityRdView3OneBinding>(R.layout.activity_rd_view_3_one)
    {
  private val viewModel: RdView3OneVM by viewModels<RdView3OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rdView3OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSignup.setOnClickListener {
      val destIntent = RdView2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = RdView4Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "RD_VIEW3ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RdView3OneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
