package com.utkarshsapplication.app.modules.thview5.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.utkarshsapplication.app.R
import com.utkarshsapplication.app.appcomponents.base.BaseActivity
import com.utkarshsapplication.app.databinding.ActivityThView5Binding
import com.utkarshsapplication.app.modules.thview5.`data`.model.ListuserRowModel
import com.utkarshsapplication.app.modules.thview5.`data`.viewmodel.ThView5VM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ThView5Activity : BaseActivity<ActivityThView5Binding>(R.layout.activity_th_view_5) {
  private val viewModel: ThView5VM by viewModels<ThView5VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listuserAdapter = ListuserAdapter(viewModel.listuserList.value?:mutableListOf())
    binding.recyclerListuser.adapter = listuserAdapter
    listuserAdapter.setOnItemClickListener(
    object : ListuserAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListuserRowModel) {
        onClickRecyclerListuser(view, position, item)
      }
    }
    )
    viewModel.listuserList.observe(this) {
      listuserAdapter.updateData(it)
    }
    binding.thView5VM = viewModel
    setUpSearchViewGroupTwentyListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListuser(
    view: View,
    position: Int,
    item: ListuserRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroupTwentyListener(): Unit {
    binding.searchViewGroupTwenty.setOnQueryTextListener(object :
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
      const val TAG: String = "TH_VIEW5ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ThView5Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
