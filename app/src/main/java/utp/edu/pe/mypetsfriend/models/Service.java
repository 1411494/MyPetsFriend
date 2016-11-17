package utp.edu.pe.mypetsfriend.models;

/**
 * Created by Marco on 10/11/2016.
 */

public class Service {

    private int service_id;
    private String description;
    private Double Price;
    private boolean status;

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
