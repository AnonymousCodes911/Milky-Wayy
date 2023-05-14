package com.utkarshsapplication.app.modules.ndview3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityNdView3Binding
import com.utkarshsapplication.app.modules.ndview2.ui.NdView2Activity
import com.utkarshsapplication.app.modules.ndview3.`data`.viewmodel.NdView3VM
import com.utkarshsapplication.app.modules.rdview1.ui.RdView1Activity
import kotlin.String
import kotlin.Unit

class NdView3Activity : BaseActivity<ActivityNdView3Binding>(R.layout.activity_nd_view_3) {
  private val viewModel: NdView3VM by viewModels<NdView3VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ndView3VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnFinish.setOnClickListener {
      val destIntent = RdView1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnPrevious.setOnClickListener {
      val destIntent = NdView2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ND_VIEW3ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NdView3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
