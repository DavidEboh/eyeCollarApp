package eyecollar.com.eyecollar;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gamecrazed664 on 10/16/2016.
 */

public class LoginRequest extends StringRequest {
    private static final String LOGIN_REQUEST_URL = "http://54.211.27.163/Login2.php";
    private Map<String, String> params;

    //Constructor object
    public LoginRequest(String username, String password, Response.Listener<String> listener){

        // Send the data to Register.php on the web server
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
