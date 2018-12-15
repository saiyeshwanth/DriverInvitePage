package com.example.android.driverinvitepage;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton b1 = findViewById(R.id.fb);
        ImageButton b3 = findViewById(R.id.twitter);
        ImageButton b4 = findViewById(R.id.email);

    }
    fun openMsg(v:View)
    ImageButton b2 = findViewById(R.id.msg);

}
}
