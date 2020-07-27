package com.example.gmail.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gmail.Models.adaptadorMensajes;
import com.example.gmail.Models.mensaje;
import com.example.gmail.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link frgmessages#newInstance} factory method to
 * create an instance of this fragment.
 */
public class frgmessages extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerview=null;
    ArrayList<mensaje> lstMensaje;
    public frgmessages() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment frgmessages.
     */
    // TODO: Rename and change types and number of parameters
    public static frgmessages newInstance(String param1, String param2) {
        frgmessages fragment = new frgmessages();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        lstMensaje = new ArrayList<>();
        View view = inflater.inflate(R.layout.fragment_frgmessages, container, false);
        recyclerview=(RecyclerView)view.findViewById(R.id.rcvMensajes);
        recyclerview.setLayoutManager(new LinearLayoutManager((getContext())));
        llenarLista();
        setHasOptionsMenu(true);
        adaptadorMensajes adapter = new adaptadorMensajes(lstMensaje);
        recyclerview.setAdapter(adapter);
        return view;
    }

  /*  @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.mnutoolbarF,menu);
    }*/
    private void llenarLista()
    {
        lstMensaje.add(new mensaje(R.drawable.usuario,"Login exitoso SGA","Mensaje desde el Sistema de Gestión Académica","23:12","sga2"));
        lstMensaje.add(new mensaje(R.drawable.usuario2,"CV ING ELECTRICO","Buenas Tardes Estimados. Esperando que se encuentre en buen estado de salud","17:30","Hernan Espinoza Ortega"));
        lstMensaje.add(new mensaje(R.drawable.usuario,"Login exitoso SGA","Mensaje desde el Sistema de Gestión Académica","23:12","sga2"));
        lstMensaje.add(new mensaje(R.drawable.usuario,"Login exitoso SGA","Mensaje desde el Sistema de Gestión Académica","23:12","sga2"));
        lstMensaje.add(new mensaje(R.drawable.user,"Fwd: PARA SUBIR NUMERO 2020","Byron Oviedo Bayas, Ph.D.DIRECTORIO","10 jul.","BYRON WLADIMIR OVIEDO BAYAS"));
        lstMensaje.add(new mensaje(R.drawable.usuario2,"INFORME HORAS COMPLEMENTARIAS","INFORME HORAS COMPLEMENTARIAS","10 jul.","JUAN CARLOS ENRIQUE ORTEGA"));
        lstMensaje.add(new mensaje(R.drawable.usuario,"Login exitoso SGA","Mensaje desde el Sistema de Gestión Académica","23:12","sga2"));
        lstMensaje.add(new mensaje(R.drawable.user,"Fwd: PARA SUBIR NUMERO 2020","Byron Oviedo Bayas, Ph.D.DIRECTORIO","10 jul.","BYRON WLADIMIR OVIEDO BAYAS"));
        lstMensaje.add(new mensaje(R.drawable.usuario2,"INFORME HORAS COMPLEMENTARIAS","INFORME HORAS COMPLEMENTARIAS","10 jul.","JUAN CARLOS ENRIQUE ORTEGA"));

    }
}