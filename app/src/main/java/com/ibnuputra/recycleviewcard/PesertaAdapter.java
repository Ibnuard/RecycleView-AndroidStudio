package com.ibnuputra.recycleviewcard;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PesertaAdapter extends RecyclerView.Adapter<PesertaAdapter.PesertaViewHolder> {

    private ArrayList<Peserta> dataList;

    public PesertaAdapter(ArrayList<Peserta> dataList){
        this.dataList = dataList;
    }

    @Override
    public PesertaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_peserta, parent, false);
        return new PesertaViewHolder(view);
    }


    @Override
    public void onBindViewHolder (PesertaViewHolder holder, int position){
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNis.setText(dataList.get(position).getNis());
        holder.txtNomor.setText(dataList.get(position).getNomor());
    }

    @Override
    public int getItemCount(){
        return(dataList !=null) ? dataList.size() : 0;
    }

    public class PesertaViewHolder extends  RecyclerView.ViewHolder{
        private TextView txtNama, txtNis, txtNomor;

        public PesertaViewHolder(View itemView){
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtNis = (TextView) itemView.findViewById(R.id.txt_nis);
            txtNomor = (TextView) itemView.findViewById(R.id.txt_nomor);

        }
    }

}
