package com.utkarshsapplication.app.modules.thview4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView4Binding
import com.utkarshsapplication.app.modules.rdviewnone.ui.RdViewNOneActivity
import com.utkarshsapplication.app.modules.thview4.`data`.viewmodel.ThView4VM
import kotlin.String
import kotlin.Unit

class ThView4Activity : BaseActivity<ActivityThView4Binding>(R.layout.activity_th_view_4) {
  private val viewModel: ThView4VM by viewModels<ThView4VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thView4VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleNine.setOnClickListener {
      val destIntent = RdViewNOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TH_VIEW4ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThView4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
