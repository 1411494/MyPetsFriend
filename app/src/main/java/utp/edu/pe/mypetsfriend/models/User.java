package utp.edu.pe.mypetsfriend.models;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marco on 13/11/2016.
 */

public class User {

    private String dni;
    private String user_name;
    private String password;
    private String type;
    private boolean status;

    public User()
    {

    }

    public User(String dni, String password, boolean status, String type, String user_name) {
        this.dni = dni;
        this.password = password;
        this.status = status;
        this.type = type;
        this.user_name = user_name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static User buildFromJSONObject(JSONObject jsonUser) {
        User user = new User();
        try {
            user.setDni(jsonUser.getString("dni"));
            user.setUser_name(jsonUser.getString("user_name"));
            user.setPassword(jsonUser.getString("password"));
            user.setType(jsonUser.getString("type"));
            user.setStatus(jsonUser.getBoolean("status"));


            Log.d("PetsFriend", user.getUser_name());
            return user;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<User> buildFromJSONArray(JSONArray jsonUsers) {
        int articlesCount = jsonUsers.length();
        List<User> users = new ArrayList<>();
        for(int i = 0; i< articlesCount; i++) {
            JSONObject jsonUser;
            try {
                jsonUser = (JSONObject) jsonUsers.get(i);
                User user = User
                        .buildFromJSONObject(jsonUser);
                users.add(user);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return users;
    }
}
