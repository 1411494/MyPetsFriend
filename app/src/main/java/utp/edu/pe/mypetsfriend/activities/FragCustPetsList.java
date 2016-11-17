package utp.edu.pe.mypetsfriend.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import utp.edu.pe.mypetsfriend.R;
import utp.edu.pe.mypetsfriend.adapters.PetAdapter;
import utp.edu.pe.mypetsfriend.models.PetEntity;


/**
 * Created by Marco on 01/11/2016.
 */
public class FragCustPetsList extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    RecyclerView quotesRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frag_cust_pets_list, container, false);
        quotesRecyclerView = (RecyclerView) view.findViewById(R.id.listpetsRecyclerView);
        quotesRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        quotesRecyclerView.setAdapter(new PetAdapter(getService().getPets()));

        return view;
    }


    private PetEntity getService() {
        // return ((PetsApplication) getActivity().getApplication() ).getService();
        PetEntity service;
        service = new PetEntity();
        return service;

        //return ((PetsApplication) getActivity().getApplication() ).getService();
    }
}
