package utp.edu.pe.mypetsfriend.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import utp.edu.pe.mypetsfriend.R;
import utp.edu.pe.mypetsfriend.models.Pet;
import utp.edu.pe.mypetsfriend.models.PetEntity;

public class CustPetsViewActivity extends AppCompatActivity {

    ImageView pictureImageView;
    TextView namePetTextView, breedPetTextView, agePetTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_pets_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        pictureImageView = (ImageView) findViewById(R.id.pictureImageView);
        namePetTextView = (TextView) findViewById(R.id.nameTextView);
        breedPetTextView = (TextView) findViewById(R.id.breedTextView);
        agePetTextView = (TextView) findViewById(R.id.ageTextView);

        Bundle bundle = getIntent().getExtras();
        int id = bundle.getInt("id");
        Pet pet = getPetById(id);
        namePetTextView.setText(pet.getPet_name());
        breedPetTextView.setText(pet.getBreed());
        agePetTextView.setText(pet.getAge_year());
        pictureImageView.setImageResource(Integer.parseInt(pet.getPictureUri()));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private Pet getPetById(int id) {

        PetEntity service;
        service = new PetEntity();
        service.getPets();
        //return ((PetsApplication) getApplication())
        //  .getService()
        // .findPetsById(id);
        return service.findPetsById(id);
    }
}
