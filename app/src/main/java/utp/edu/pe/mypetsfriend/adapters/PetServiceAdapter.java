package utp.edu.pe.mypetsfriend.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import utp.edu.pe.mypetsfriend.R;
import utp.edu.pe.mypetsfriend.models.PetService;

/**
 * Created by Marco on 10/11/2016.
 */

public class PetServiceAdapter extends BaseAdapter {
    private Context context;
    private List<PetService> petServiceList;

    public  PetServiceAdapter (Context context , List<PetService>  petServiceList)
    {
        this.context =context;
        this.petServiceList = petServiceList;
    }

    @Override
    public int getCount() {
        return petServiceList.size();
    }

    @Override
    public Object getItem(int position) {
        return petServiceList. get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View v  = View.inflate(context, R.layout.frag_cust_history_items, null);
        TextView serviceTextView =(TextView) v.findViewById(R.id.serviceTextView);
        TextView dataTextView = (TextView)v.findViewById(R.id.dateTextView);

        serviceTextView.setText( petServiceList.get(position).getName_service());
        dataTextView.setText(petServiceList.get(position).getDate());

        v.setTag(petServiceList.get(position).getPet_id());

        return v;
    }
}
