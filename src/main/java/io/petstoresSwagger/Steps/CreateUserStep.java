package io.petstoresSwagger.Steps;

import com.sqasa.rest.demo.utils.KrakenRest;
import io.petstoresSwagger.models.UserModel;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class CreateUserStep  {

    public void createPost(String url, List<UserModel> listUser){

        KrakenRest.inicializarRequest();

        String body = "{\n" +
                "  \"id\": "+listUser.get(0).getId()+",\n" +
                "  \"username\": \""+listUser.get(0).getUserName()+"\",\n" +
                "  \"firstName\": \""+listUser.get(0).getFirstName()+"\",\n" +
                "  \"lastName\": \""+listUser.get(0).getLastName()+"\",\n" +
                "  \"email\": \""+listUser.get(0).getEmail()+"\",\n" +
                "  \"password\": \""+listUser.get(0).getPassword()+"\",\n" +
                "  \"phone\": \""+listUser.get(0).getPhone()+"\",\n" +
                "  \"userStatus\": "+listUser.get(0).getUserStatus()+"\n" +
                "}";
        System.out.println(body);
        SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").post();


    }

    public void  validateStatusCode(int status){

        KrakenRest.compararStatus(status);
    }
}
