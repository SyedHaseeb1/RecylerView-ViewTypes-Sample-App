package com.hsb.recyclerviewtypes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.hsb.recyclerviewtypes.R
import com.hsb.recyclerviewtypes.app_view_model.AppViewModel
import com.hsb.recyclerviewtypes.databinding.FragmentTwoViewTypeRVBinding

class TwoViewTypeRVFragment : Fragment() {
    private lateinit var binding: FragmentTwoViewTypeRVBinding
    private var inComings = ArrayList<String>()
    private var outGoings = ArrayList<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTwoViewTypeRVBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            RV()
        }
    }

    fun RV() {
        val dataList = ArrayList<Data>()
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "1. Hi! Incoming"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "2. Hi! Outgoing"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "3. Hi! Incoming"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "5. Hi! Incoming"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "4. Hi! Outgoing"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "9. Hi! Incoming"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "6. Hi! Outgoing"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "7. Hi! Incoming"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "8. Hi! Outgoing"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_ONE, "11. Hi! Incoming"))

        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "10. Hi! Outgoing"))
        dataList.add(Data(RecyclerViewAdapter.VIEW_TYPE_TWO, "12. Hi! Outgoing"))

        val adapter = context?.let { RecyclerViewAdapter(it, dataList) }
        binding.twoviewsRV.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapter
        }
    }
}