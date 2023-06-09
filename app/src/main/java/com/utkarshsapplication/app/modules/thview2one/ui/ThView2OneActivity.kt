package com.utkarshsapplication.app.modules.thview2one.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView2OneBinding
import com.utkarshsapplication.app.modules.thview2one.`data`.viewmodel.ThView2OneVM
import com.utkarshsapplication.app.modules.thview3.ui.ThView3Activity
<<<<<<< HEAD
import com.utkarshsapplication.app.modules.thview4.ui.ThView4Activity
=======
>>>>>>> fe0bdb01b8eb0835565bd057cf36f49df4c05e50
import kotlin.String
import kotlin.Unit

class ThView2OneActivity : BaseActivity<ActivityThView2OneBinding>(R.layout.activity_th_view_2_one)
    {
  private val viewModel: ThView2OneVM by viewModels<ThView2OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thView2OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
<<<<<<< HEAD
//    binding.txtLanguageOne.setOnClickListener {
//      val destIntent = ThView3Activity.getIntent(this, null)
//      startActivity(destIntent)
//    }
//    binding.linearColumnlanguage.setOnClickListener {
//      val destIntent =Intent(this,ThView3Activity::class.java)
//      startActivity(destIntent)
//    }
    binding.viewRectangleNine.setOnClickListener {
      val destIntent =Intent(this,ThView4Activity::class.java)
=======
    binding.txtLanguageOne.setOnClickListener {
      val destIntent = ThView3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnlanguageOne.setOnClickListener {
      val destIntent = ThView3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleNine.setOnClickListener {
      val destIntent = ThView3Activity.getIntent(this, null)
>>>>>>> fe0bdb01b8eb0835565bd057cf36f49df4c05e50
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TH_VIEW2ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThView2OneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
