package com.recyclerviewmultipleviewtype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.recyclerviewmultipleviewtype.adapter.MainAdapter
import com.recyclerviewmultipleviewtype.data.Data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var adapter: MainAdapter

    companion object {
        const val VIEW_TYPE_ONE = 1
        const val VIEW_TYPE_TWO = 2
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
    }

    private fun setupUI() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MainAdapter(this, setData())
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                (recyclerView.layoutManager as LinearLayoutManager).orientation
            )
        )
        recyclerView.adapter = adapter
    }

    private fun setData(): ArrayList<Data> {
        val dataList = ArrayList<Data>()
        dataList.add(Data(VIEW_TYPE_ONE, "1. Hi! I am in View 1"))
        dataList.add(Data(VIEW_TYPE_TWO, "2. Hi! I am in View 2"))
        dataList.add(Data(VIEW_TYPE_ONE, "3. Hi! I am in View 3"))
        dataList.add(Data(VIEW_TYPE_TWO, "4. Hi! I am in View 4"))
        dataList.add(Data(VIEW_TYPE_ONE, "5. Hi! I am in View 5"))
        dataList.add(Data(VIEW_TYPE_TWO, "6. Hi! I am in View 6"))
        dataList.add(Data(VIEW_TYPE_ONE, "7. Hi! I am in View 7"))
        dataList.add(Data(VIEW_TYPE_TWO, "8. Hi! I am in View 8"))
        dataList.add(Data(VIEW_TYPE_ONE, "9. Hi! I am in View 9"))
        dataList.add(Data(VIEW_TYPE_TWO, "10. Hi! I am in View 10"))
        dataList.add(Data(VIEW_TYPE_ONE, "11. Hi! I am in View 11"))
        dataList.add(Data(VIEW_TYPE_TWO, "12. Hi! I am in View 12"))
        return dataList
    }

}
