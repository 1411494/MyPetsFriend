package utp.edu.pe.mypetsfriend.models;

import java.util.ArrayList;
import java.util.List;

import utp.edu.pe.mypetsfriend.R;

/**
 * Created by Marco on 06/11/2016.
 */

public class PetEntity {

private List<Pet> pets;

    public List<Pet> getPets()
    {
        if(pets == null) {
            pets = new ArrayList<>();
            initializeData();
        }
        return pets;
    }
    public Pet findPetsById(int id) {
        return pets.get(id);
    }

    private void initializeData() {
        pets.add(new Pet("1", "Phrase 1", "Author 1", Integer.toString(R.mipmap.ic_launcher),"1"));
        pets.add(new Pet("2", "Phrase 2", "Author 2", Integer.toString(R.mipmap.ic_launcher),"2"));
        pets.add(new Pet("3", "Phrase 3", "Author 3", Integer.toString(R.mipmap.ic_launcher),"3"));
        pets.add(new Pet("4", "Phrase 4", "Author 4", Integer.toString(R.mipmap.ic_launcher),"1"));
        pets.add(new Pet("5", "Phrase 5", "Author 5", Integer.toString(R.mipmap.ic_launcher),"1"));
    }
}
