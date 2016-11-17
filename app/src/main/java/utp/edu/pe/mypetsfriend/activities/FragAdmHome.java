package utp.edu.pe.mypetsfriend.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import utp.edu.pe.mypetsfriend.R;

/**
 * Created by Marco on 05/11/2016.
 */

public class FragAdmHome extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

      View view  =inflater.inflate(R.layout.frag_adm_home, container, false);


        return view;
    }

}