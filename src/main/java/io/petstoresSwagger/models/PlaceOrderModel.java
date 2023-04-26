package io.petstoresSwagger.models;

public class PlaceOrderModel {

    String id;
    String petId;
    String quantity;
    String shipDate;
    String status;

    Boolean complete;

    public PlaceOrderModel(String id, String petId, String quantity, String shipDate, String status) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getPetId() {
        return petId;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public String getStatus() {
        return status;
    }

    public Boolean getComplete() {
        return complete;
    }
}
