package com.example.repogit.ui.repo

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.repogit.R
import com.example.repogit.databinding.ActivityRepoListBinding
import com.example.repogit.injection.ViewModelFactory
import com.google.android.material.snackbar.Snackbar


class  RepoListActivity: AppCompatActivity() {
    private lateinit var binding: ActivityRepoListBinding
    private lateinit var viewModel: RepoListViewModel
    private var errorSnackbar: Snackbar? = null

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, ViewModelFactory(this)).get(RepoListViewModel::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_repo_list)
        binding.repoList.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        viewModel.loadRep()

        viewModel.errorMessage.observe(this, Observer {
                errorMessage -> if(errorMessage != null) showError(errorMessage) else hideError()
        })
        binding.viewModel = viewModel
    }

    private fun showError(@StringRes errorMessage:Int){
        errorSnackbar = Snackbar.make(binding.root, errorMessage, Snackbar.LENGTH_INDEFINITE)
        errorSnackbar?.setAction(R.string.retry, viewModel.errorClickListener)
        errorSnackbar?.show()
    }

    private fun hideError(){
        errorSnackbar?.dismiss()
    }
}