package utp.edu.pe.mypetsfriend.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import utp.edu.pe.mypetsfriend.R;
import utp.edu.pe.mypetsfriend.activities.CustPetsViewActivity;
import utp.edu.pe.mypetsfriend.models.Pet;

/**
 * Created by Marco on 06/11/2016.
 */

public class PetAdapter
        extends RecyclerView.Adapter<PetAdapter.ViewHolder> {
    private List<Pet> pets;

    public PetAdapter(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public PetAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.card_cust_pest_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(
            PetAdapter.ViewHolder holder, final int position) {
        holder.nameTextView.setText(pets.get(position).getPet_name());
        holder.breedTextView.setText(pets.get(position).getBreed());
        holder.ageTextView.setText(pets.get(position).getAge_year());
        holder.pictureImageView.setImageResource(Integer.parseInt(pets.get(position).getPictureUri()));

        holder.quoteCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("id", position);
                // bundle.putString("phrase", quotes.get(position).getPhrase());
                //bundle.putString("author", quotes.get(position).getAuthor());
                // bundle.putString("pictureUri", quotes.get(position).getPictureUri());
                Intent itemIntent = new Intent(v.getContext(), CustPetsViewActivity.class);
                itemIntent.putExtras(bundle);
                v.getContext().startActivity(itemIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView quoteCardView;
        TextView nameTextView;
        TextView breedTextView;
        TextView ageTextView;
        ImageView pictureImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            quoteCardView = (CardView) itemView.findViewById(R.id.listPetsCardView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            breedTextView = (TextView) itemView.findViewById(R.id.breedTextView);
            ageTextView = (TextView) itemView.findViewById(R.id.ageTextView);
            pictureImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
        }
    }
}
