package com.codetarian.myresepapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListResepAdapter extends RecyclerView.Adapter<ListResepAdapter.ListViewHolder> {

    private ArrayList<Resep> listResep;

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListResepAdapter(ArrayList<Resep> list) {
        this.listResep = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_resep, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Resep resep =listResep.get(position);

        Glide.with(holder.itemView.getContext())
                .load(resep.getPhoto())
                .apply(new RequestOptions().override(200,200))
                .into(holder.imgPhoto);
        holder.tvName.setText(resep.getName());
        holder.tvBahan.setText(resep.getBahan());
        holder.tvCara.setText(resep.getCara());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listResep.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listResep.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvBahan, tvCara;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvBahan = itemView.findViewById(R.id.tv_item_bahan);
            tvCara = itemView.findViewById(R.id.tv_item_cara);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Resep data);
    }
}
