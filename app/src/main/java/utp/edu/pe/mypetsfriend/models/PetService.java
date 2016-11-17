package utp.edu.pe.mypetsfriend.models;

/**
 * Created by Marco on 10/11/2016.
 * https://www.youtube.com/watch?v=YMJSBHAZsso
 */

public class PetService {
    private int PetService_id;
    private String pet_id;
    private int service_id;
    private String name_service;
    private String weight;
    private String date;
    private String next_date;
    private double price;
    private boolean delivery;
    private String observation;
    private boolean status;


    public PetService(int PetService_id,String name_service,String date  )
    {
        this.setPetService_id(PetService_id);
        this.setName_service(name_service);
        this.setDate(date);
    }


    public int getPetService_id() {
        return PetService_id;
    }

    public void setPetService_id(int petService_id) {
        PetService_id = petService_id;
    }

    public String getPet_id() {
        return pet_id;
    }

    public void setPet_id(String pet_id) {
        this.pet_id = pet_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getName_service() {
        return name_service;
    }

    public void setName_service(String name_service) {
        this.name_service = name_service;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNext_date() {
        return next_date;
    }

    public void setNext_date(String next_date) {
        this.next_date = next_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
