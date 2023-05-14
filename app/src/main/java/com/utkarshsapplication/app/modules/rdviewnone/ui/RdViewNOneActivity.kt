package com.utkarshsapplication.app.modules.rdviewnone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityRdViewNOneBinding
import com.utkarshsapplication.app.modules.rdviewnone.`data`.viewmodel.RdViewNOneVM
import com.utkarshsapplication.app.modules.thview2.ui.ThView2Activity
import kotlin.String
import kotlin.Unit

class RdViewNOneActivity : BaseActivity<ActivityRdViewNOneBinding>(R.layout.activity_rd_view_n_one)
    {
  private val viewModel: RdViewNOneVM by viewModels<RdViewNOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rdViewNOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFingerprintrem.setOnClickListener {
      val destIntent = ThView2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RD_VIEW_N_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RdViewNOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
