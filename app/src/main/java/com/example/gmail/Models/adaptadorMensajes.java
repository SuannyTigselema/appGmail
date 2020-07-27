package com.example.gmail.Models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gmail.R;

import java.util.ArrayList;

public class adaptadorMensajes extends RecyclerView.Adapter<adaptadorMensajes.MyViewHolder> {
    private static final int TYPE_HEADER=0;
    private static final int TYPE_LIST=0;


    private ArrayList<mensaje> mLista;
    public TextView nombre;
    public TextView lblOrigen;
    public TextView lblAsunto;
    public TextView lblMensaje;
    public TextView lblHora;
    public ImageView imgFoto;


    public adaptadorMensajes(ArrayList<mensaje> lstMensaje) {
       // mContext = context;
        this.mLista=lstMensaje;
    }

    //Métodos propios del RecyclerdView

    //infla los items al recyclerd
    @NonNull
    @Override
    public adaptadorMensajes.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
           view= LayoutInflater.from(parent.getContext())
                   .inflate(R.layout.ly_itemmensaje,null,false);
           return new MyViewHolder(view);

    }

    //enlaza cada vista del viewholder con los datos de la Lista de productos
    @Override
    public void onBindViewHolder(@NonNull adaptadorMensajes.MyViewHolder holder, int position) {

        lblOrigen.setText(mLista.get(position).getOrigen());
        lblAsunto.setText(mLista.get(position).getAsunto());
        lblMensaje.setText(mLista.get(position).getMensaje());
        lblHora.setText(mLista.get(position).getHora());
        imgFoto.setImageResource(mLista.get(position).imgPerfil);
    }

    //Devuelve la cantidad del elementos del recyclerd
    @Override
    public int getItemCount() {
        return mLista.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        int view_type;
        //Obtener los elementos q irán en cada item
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

                lblOrigen=(TextView)itemView.findViewById(R.id.lblOrigen);
                lblAsunto=(TextView)itemView.findViewById(R.id.lblAsunto);
                lblMensaje=(TextView)itemView.findViewById(R.id.lblMensaje);
                lblHora=(TextView)itemView.findViewById(R.id.lblHora);
                imgFoto=(ImageView) itemView.findViewById(R.id.imgperfil);

        }
    }

}
