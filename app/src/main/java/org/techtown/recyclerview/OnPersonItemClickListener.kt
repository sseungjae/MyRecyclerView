package org.techtown.recyclerview

import android.view.View

interface OnPersonItemClickListener {

    fun onItemClick(holder: PersonAdapter.ViewHolder?, viw: View?, position: Int)

}