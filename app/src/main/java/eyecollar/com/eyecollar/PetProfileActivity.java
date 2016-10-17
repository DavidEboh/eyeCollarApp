package eyecollar.com.eyecollar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class PetProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_profile);

        // Create variable to store user's:
        // Username
        EditText etUsername = (EditText) findViewById(R.id.etUsername);

        // Link to Welcome Message
        TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        String message = username + "Choose a pet.";
        welcomeMessage.setText(message);
        etUsername.setText(username);

    }
}
