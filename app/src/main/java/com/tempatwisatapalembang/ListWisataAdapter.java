package com.tempatwisatapalembang;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>
{
    private ArrayList<GetterAndSetterWisataData> listWisata;
    private Context ctx;

    public ListWisataAdapter(ArrayList<GetterAndSetterWisataData> listWisata, Context ctx)
    {
        this.listWisata = listWisata;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.item_card, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position)
    {
        GetterAndSetterWisataData wisata = listWisata.get(position);
        holder.tvName.setText(wisata.getNameWisata());
        holder.tvAlamat.setText(wisata.getAlamatWisata());
        holder.tvTarif.setText(wisata.getTarif());
        holder.tvJamOperasional.setText(wisata.getJamOperasional());
        holder.tvRating.setText(wisata.getRating());
        Glide.
                with(ctx)
                .load(wisata.getFotoWisata())
                .centerCrop()
                .into(holder.imgWisata);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvDesc;
                String xNama, xDesc, xLokasi;
                int xFoto;

                tvDesc = view.findViewById(R.id.tv_desc);
                xNama = wisata.getNameWisata();
                xDesc = wisata.getDescWisata();
                xFoto = wisata.getFotoWisata();
                xLokasi = wisata.getLokasi();

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xDesc", xDesc);
                kirim.putExtra("xFoto", xFoto);
                kirim.putExtra("xLokasi", xLokasi);
                ctx.startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return listWisata.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgWisata;
        TextView tvName, tvAlamat, tvTarif, tvJamOperasional, tvRating, tvDesc;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgWisata = itemView.findViewById(R.id.iv_foto);
            tvName = itemView.findViewById(R.id.tv_nama);
            tvAlamat = itemView.findViewById(R.id.tv_alamat);
            tvTarif = itemView.findViewById(R.id.tv_tarif);
            tvJamOperasional = itemView.findViewById(R.id.tv_jam_operasional);
            tvRating = itemView.findViewById(R.id.tv_rating);
        }
    }
}