package utp.edu.pe.mypetsfriend.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import utp.edu.pe.mypetsfriend.R;
import utp.edu.pe.mypetsfriend.adapters.PetServiceAdapter;
import utp.edu.pe.mypetsfriend.models.PetService;

/**
 * Created by Marco on 01/11/2016.
 */

public class FragCustHistory extends Fragment {

    private ListView historyListView;
    private PetServiceAdapter petServiceAdapter;
    private List<PetService> petServiceList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_cust_history, container, false);
        historyListView = (ListView) v.findViewById(R.id.historyListView);

        petServiceList = new ArrayList<>();
        petServiceList.add(new PetService(1, "hola 1", "45/66/23"));
        petServiceList.add(new PetService(2, "hola 2", "12/66/23"));
        petServiceList.add(new PetService(3, "hola 3", "6/66/23"));
        petServiceList.add(new PetService(4, "hola 4", "45/66/23"));

        petServiceAdapter = new PetServiceAdapter(getActivity(), petServiceList);
        historyListView.setAdapter(petServiceAdapter);

        historyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}