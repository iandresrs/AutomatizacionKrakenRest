package io.petstoresSwagger.Steps;

import com.sqasa.rest.demo.utils.KrakenRest;
import io.petstoresSwagger.models.PlaceOrderModel;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class PlaceOrderStep {

    public void createOrderPet(String url, List<PlaceOrderModel> listOrder){
        KrakenRest.inicializarRequest();

        String body = "{\r\n" +
                "  \"id\": \""+listOrder.get(0).getId()+"\",\r\n" +
                "  \"petId\": \""+listOrder.get(0).getPetId()+"\",\r\n" +
                "  \"quantity\": \""+listOrder.get(0).getQuantity()+"\",\r\n" +
                "  \"shipDate\": \""+listOrder.get(0).getShipDate()+"\",\r\n" +
                "  \"status\": \""+listOrder.get(0).getStatus()+"\",\r\n" +
                "  \"complete\": \""+listOrder.get(0).getComplete()+"\"\r\n" +
                "}";

        System.out.println(body);

        SerenityRest.given().baseUri(url).body(body).header("Content-Type","application/json").post();
    }

    public void  validateStatusCode(int status){
        KrakenRest.compararStatus(status);
    }
}
