package io.petstoresSwagger.models;

public class UserModel {

    //Variables
    String userName;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;

    int id;
    int userStatus;

    //Metodo por defecto
    public UserModel() {
    }

    //Metodo inicializador
    public UserModel( String firstName, String lastName, String email, String password, String phone, int id, int userStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.id = id;
        this.userStatus = userStatus;
    }

    //Metodos Getters
    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public int getUserStatus() {
        return userStatus;
    }
}
