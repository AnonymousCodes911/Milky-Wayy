package com.utkarshsapplication.app.modules.thview7.ui

import android.view.View
import androidx.activity.viewModels
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView7Binding
import com.utkarshsapplication.app.modules.thview5.ui.ThView5Activity
import com.utkarshsapplication.app.modules.thview7.`data`.model.ListnameRowModel
import com.utkarshsapplication.app.modules.thview7.`data`.viewmodel.ThView7VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ThView7Activity : BaseActivity<ActivityThView7Binding>(R.layout.activity_th_view_7) {
  private val viewModel: ThView7VM by viewModels<ThView7VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnameAdapter = ListnameAdapter(viewModel.listnameList.value?:mutableListOf())
    binding.recyclerListname.adapter = listnameAdapter
    listnameAdapter.setOnItemClickListener(
    object : ListnameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnameRowModel) {
        onClickRecyclerListname(view, position, item)
      }
    }
    )
    viewModel.listnameList.observe(this) {
      listnameAdapter.updateData(it)
    }
    binding.thView7VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnuser.setOnClickListener {
      val destIntent = ThView5Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListname(
    view: View,
    position: Int,
    item: ListnameRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TH_VIEW7ACTIVITY"

  }
}
