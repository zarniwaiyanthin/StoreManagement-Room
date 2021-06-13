package com.example.storemanagement.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.storemanagement.model.Product
import com.example.storemanagement.R
import kotlinx.android.synthetic.main.item_product.view.*

class ProductAdapter:RecyclerView.Adapter<ProductAdapter.MyViewHolder>() {
    private val itemList= mutableListOf<Product>()
    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val view=layoutInflater.inflate(R.layout.item_product,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item=itemList.get(position)
        holder.itemView.tvProductName.text=item.productName
        holder.itemView.tvProductPrice.text=item.price
    }

    fun setData(newData:List<Product>){
        itemList.clear()
        itemList.addAll(newData)
        notifyDataSetChanged()
    }
}