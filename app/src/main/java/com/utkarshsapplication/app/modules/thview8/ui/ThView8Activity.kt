package com.utkarshsapplication.app.modules.thview8.ui

import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView8Binding
import com.utkarshsapplication.app.modules.thview5.ui.ThView5Activity
import com.utkarshsapplication.app.modules.thview8.`data`.model.SpinnerGroupSevenModel
import com.utkarshsapplication.app.modules.thview8.`data`.model.SpinnerZipcodeModel
import com.utkarshsapplication.app.modules.thview8.`data`.viewmodel.ThView8VM
import kotlin.String
import kotlin.Unit

class ThView8Activity : BaseActivity<ActivityThView8Binding>(R.layout.activity_th_view_8) {
  private val viewModel: ThView8VM by viewModels<ThView8VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerZipcodeList.value = mutableListOf(
    SpinnerZipcodeModel("Item1"),
    SpinnerZipcodeModel("Item2"),
    SpinnerZipcodeModel("Item3"),
    SpinnerZipcodeModel("Item4"),
    SpinnerZipcodeModel("Item5")
    )
    val spinnerZipcodeAdapter =
    SpinnerZipcodeAdapter(this,R.layout.spinner_item,viewModel.spinnerZipcodeList.value?:
    mutableListOf())
    binding.spinnerZipcode.adapter = spinnerZipcodeAdapter
    viewModel.spinnerGroupSevenList.value = mutableListOf(
    SpinnerGroupSevenModel("Item1"),
    SpinnerGroupSevenModel("Item2"),
    SpinnerGroupSevenModel("Item3"),
    SpinnerGroupSevenModel("Item4"),
    SpinnerGroupSevenModel("Item5")
    )
    val spinnerGroupSevenAdapter =
    SpinnerGroupSevenAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupSevenList.value?:
    mutableListOf())
    binding.spinnerGroupSeven.adapter = spinnerGroupSevenAdapter
    binding.thView8VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnuser.setOnClickListener {
      val destIntent = ThView5Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TH_VIEW8ACTIVITY"

  }
}
