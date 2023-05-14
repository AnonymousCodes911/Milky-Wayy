package com.utkarshsapplication.app.modules.thview2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView2Binding
import com.utkarshsapplication.app.modules.thview2.`data`.viewmodel.ThView2VM
import com.utkarshsapplication.app.modules.thview5.ui.ThView5Activity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class ThView2Activity : BaseActivity<ActivityThView2Binding>(R.layout.activity_th_view_2) {
  private val viewModel: ThView2VM by viewModels<ThView2VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thView2VM = viewModel
    setUpSearchViewGroupEighteenListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnuser.setOnClickListener {
      val destIntent = ThView5Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewGroupEighteenListener(): Unit {
    binding.searchViewGroupEighteen.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "TH_VIEW2ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ThView2Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
