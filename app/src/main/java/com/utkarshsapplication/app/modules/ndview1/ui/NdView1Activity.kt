package com.utkarshsapplication.app.modules.ndview1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityNdView1Binding
import com.utkarshsapplication.app.modules.ndview1.`data`.viewmodel.NdView1VM
import com.utkarshsapplication.app.modules.ndview2.ui.NdView2Activity
import com.utkarshsapplication.app.modules.rdview1.ui.RdView1Activity
import kotlin.String
import kotlin.Unit

class NdView1Activity : BaseActivity<ActivityNdView1Binding>(R.layout.activity_nd_view_1) {
  private val viewModel: NdView1VM by viewModels<NdView1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ndView1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowOne.setOnClickListener {
      val destIntent = NdView2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtNextStep.setOnClickListener {
      val destIntent = NdView2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRownextstep.setOnClickListener {
      val destIntent = NdView2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSkip.setOnClickListener {
      val destIntent = RdView1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ND_VIEW1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NdView1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
