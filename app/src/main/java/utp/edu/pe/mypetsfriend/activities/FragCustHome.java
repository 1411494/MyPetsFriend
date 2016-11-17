package utp.edu.pe.mypetsfriend.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import utp.edu.pe.mypetsfriend.R;


/**
 * Created by Marco on 01/11/2016.
 */
public class FragCustHome extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    TextView dniTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frag_cust_home, container, false);
        dniTextView =(TextView) view.findViewById(R.id.dniTextView);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.chagePassfab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), CustChangePassActivity.class);
                startActivity(intent);
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        return view;

    }


}