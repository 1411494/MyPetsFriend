package utp.edu.pe.mypetsfriend.activities;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.renderscript.RenderScript;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;

import java.util.ArrayList;
import java.util.List;

import utp.edu.pe.mypetsfriend.R;
import utp.edu.pe.mypetsfriend.models.User;
import utp.edu.pe.mypetsfriend.services.NewsService;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText userEditText;
    private EditText passwordEditText;
    private List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEditText = (EditText) findViewById(R.id.userEditText);
        passwordEditText =(EditText) findViewById(R.id.passwordEditText);
        users = new ArrayList<>();

        loginButton = (Button) findViewById(R.id.loginButton) ;
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CustWelcomeActivity.class));
            }
        });
    }
    private void updateUsers() {

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

            AndroidNetworking
                    .get(NewsService.USERS_URL)
                    .setTag("list")
                    .setPriority(Priority.LOW)
                    .build()
                    .getAsJSONObject(new JSONObjectRequestListener() {
                        @Override
                        public void onResponse(JSONObject response) {
                            try {
                                if(response.getString("status").equalsIgnoreCase("ok")) {
                                    users = User.buildFromJSONArray(
                                            response.getJSONArray("list"));

                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                        @Override
                        public void onError(ANError anError) {
                            Log.d("LatestNews", anError.getErrorBody());
                        }
                    });

        } else {
            // display error
        }

    }
    @Override
    protected void onResume() {
        super.onResume();
      //  updateUsers();
    }

}
