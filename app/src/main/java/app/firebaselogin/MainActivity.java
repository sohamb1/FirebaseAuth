package app.firebaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // For Logout

     /* FirebaseAuth.getInstance().signOut();
        LoginManager.getInstance().logOut(); */
}
