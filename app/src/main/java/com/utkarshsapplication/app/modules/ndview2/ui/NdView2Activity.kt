package com.utkarshsapplication.app.modules.ndview2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityNdView2Binding
import com.utkarshsapplication.app.modules.ndview1.ui.NdView1Activity
import com.utkarshsapplication.app.modules.ndview2.`data`.viewmodel.NdView2VM
import com.utkarshsapplication.app.modules.ndview3.ui.NdView3Activity
import kotlin.String
import kotlin.Unit

class NdView2Activity : BaseActivity<ActivityNdView2Binding>(R.layout.activity_nd_view_2) {
  private val viewModel: NdView2VM by viewModels<NdView2VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ndView2VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowTwo.setOnClickListener {
      val destIntent = NdView3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtNextStep.setOnClickListener {
      val destIntent = NdView3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRownextstep.setOnClickListener {
      val destIntent = NdView3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnPrevious.setOnClickListener {
      val destIntent = NdView1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ND_VIEW2ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NdView2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
