package org.techtown.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager

        val adapter = PersonAdapter()

        adapter.items.add(Person("홍길동", "010-123-4567"))
        adapter.items.add(Person("홍길동2", "010-123-7567"))
        adapter.items.add(Person("홍길동3", "010-123-9567"))

        recyclerView.adapter = adapter

        adapter.listener = object : OnPersonItemClickListener{
            override fun onItemClick(holder: PersonAdapter.ViewHolder?, viw: View?, position: Int) {
                val name = adapter.items[position]
                showToast("아이템 선택딤 : $name")
            }
        }
    }

    fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }
}