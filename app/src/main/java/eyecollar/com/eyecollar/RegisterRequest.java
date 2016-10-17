package eyecollar.com.eyecollar;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gamecrazed664 on 10/15/2016.
 */

// Allow us to make a request to the Register.php file on the Web Server
public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://54.211.27.163/Register2.php";
    private Map<String, String> params;

    //Constructor object
    public RegisterRequest(String firstname, String lastname, String email, String username, String password, Response.Listener<String> listener){

        // Send the data to Register.php on the webserver
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("firstname", firstname);
        params.put("lastname", lastname);
        params.put("email", email);
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
