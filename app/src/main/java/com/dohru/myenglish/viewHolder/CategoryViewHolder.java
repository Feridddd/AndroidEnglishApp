package com.dohru.myenglish.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.dohru.myenglish.R;
import com.dohru.myenglish.forInterface.ItemClickListener;

public class CategoryViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView categoryImage;
    public TextView categoryText;

    private ItemClickListener itemClickListener;

    public CategoryViewHolder(View itemView){
        super(itemView);
        categoryImage  = (ImageView)itemView.findViewById(R.id.categry_image);
        categoryText  = (TextView) itemView.findViewById(R.id.categry_name);

        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}
