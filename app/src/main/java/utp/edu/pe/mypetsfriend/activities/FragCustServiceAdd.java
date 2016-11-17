package utp.edu.pe.mypetsfriend.activities;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;


import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import utp.edu.pe.mypetsfriend.R;

/**
 * Created by Marco on 01/11/2016.
 */

public class FragCustServiceAdd extends Fragment {

    String[] datos = {"vacunas", "corte"};


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        final View view = inflater.inflate(R.layout.frag_cust_service_add, container, false);

        Spinner servicesSpinner = (Spinner) view.findViewById(R.id.serviceSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_spinner_item, datos);
        servicesSpinner.setAdapter(adapter);
        servicesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                                                      @Override
                                                      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                          switch (position)
                                                          {
                                                              case 1:
                                                                  Toast toast = Toast.makeText(view.getContext(), datos[position], Toast.LENGTH_SHORT);
                                                                  toast.show();
                                                                  break;
                                                          }
                                                      }

                                                      @Override
                                                      public void onNothingSelected(AdapterView<?> parent) {

                                                      }
                                                  }
        );


        EditText dateEditText = (EditText) view.findViewById(R.id.dateEditText);
        dateEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {

                    DateDialog dialog = new DateDialog(v);
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    dialog.show(ft, "DatePiker");

                }
            }
        });

        EditText timeEditText = (EditText) view.findViewById(R.id.timeEditText);
        timeEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {

                    TimeDialog dialog = new TimeDialog(v);
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    dialog.show(ft, "TimePicker");

                }
            }
        });

        return view;
    }

    public void onStart() {
        super.onStart();

    }

}