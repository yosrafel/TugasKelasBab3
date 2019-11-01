package com.example.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.Model.DaftarTeman;
import com.example.proteintracker.R;

import java.util.ArrayList;

public class DaftarTemanAdapter extends RecyclerView.Adapter<DaftarTemanAdapter.ViewHolder> {

    public DaftarTemanAdapter(ArrayList<DaftarTeman> daftarTemanArrayList) {
        this.daftarTemanArrayList = daftarTemanArrayList;
    }

    private ArrayList<DaftarTeman> daftarTemanArrayList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_teman,parent,false); //
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(daftarTemanArrayList.get(position).getNama());
        holder.txtNim.setText(daftarTemanArrayList.get(position).getNim());
        holder.txtCita.setText(daftarTemanArrayList.get(position).getCita());
        holder.txtMoto.setText(daftarTemanArrayList.get(position).getMoto());
        holder.txtHobi.setText(daftarTemanArrayList.get(position).getHobi());
        holder.imgFoto.setImageResource(daftarTemanArrayList.get(position).getFoto());
        holder.txtGender.setText(daftarTemanArrayList.get(position).getGender());
    }

    @Override
    public int getItemCount() {
        return (daftarTemanArrayList != null)? daftarTemanArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{ //utk menghubungkan dari txt
        private TextView txtNama, txtCita, txtGender, txtNim, txtHobi, txtMoto;
        private ImageView imgFoto;

        public ViewHolder(View view){
            super(view);
            txtNama = view.findViewById(R.id.txtNamaMhs);
            txtNim = view.findViewById(R.id.txtNimMhs);
            txtCita = view.findViewById(R.id.txtCitaMhs);
            txtHobi = view.findViewById(R.id.txtHobiMhs);
            txtMoto = view.findViewById(R.id.txtMotoMhs);
            imgFoto = view.findViewById(R.id.imageViewMhs);
            txtGender = view.findViewById(R.id.txtGenderMhs);
        }
    }
}
