package com.example.repogit.ui.repo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.repogit.R
import com.example.repogit.databinding.ItemListBinding
import com.example.repogit.model.Repo

class RepoListAdapter: RecyclerView.Adapter<RepoListAdapter.ViewHolder>() {
    private lateinit var repoList:List<Repo>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoListAdapter.ViewHolder {
        val binding: ItemListBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_list, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepoListAdapter.ViewHolder, position: Int) {
        holder.bind(repoList[position])
    }

    override fun getItemCount(): Int {
        return if(::repoList.isInitialized) repoList.size else 0
    }

    fun updateRepoList(repoList:List<Repo>){
        this.repoList = repoList
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root){
        private val viewModel = RepoViewModel()

        fun bind(repo: Repo) {
            viewModel.bind(repo)
            binding.viewModel = viewModel
        }
    }
}