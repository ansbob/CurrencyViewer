package com.example.currencyviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.currencyviewer.Fragments.ATFFragment;
import com.example.currencyviewer.Fragments.AltynFragment;
import com.example.currencyviewer.Fragments.HalykFragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.currencyviewer.Fragments.HalykFragment;
import com.example.currencyviewer.Interfaces.ResponseHttpAsyncTask;
import com.example.currencyviewer.Network.HttpPostAsyncTask;
import com.example.currencyviewer.Network.RequestUrls;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;

public class MainActivity extends AppCompatActivity{

    private static final String TAG = "MainActivity";

    private Button halykButton;
    private Button atfButton;
    private Button altynButton;

    private FragmentManager fm;

    private HalykFragment halykFragment = new HalykFragment();
    private ATFFragment atfFragment = new ATFFragment();
    private AltynFragment altynFragment = new AltynFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        halykButton = findViewById(R.id.button1);
        atfButton = findViewById(R.id.button2);
        altynButton = findViewById(R.id.button3);

        fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if(fragment == null) {
            fragment = new HalykFragment();
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }

        halykButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction().replace(R.id.fragmentContainer, halykFragment).commit();
            }
        });

        atfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction().replace(R.id.fragmentContainer, atfFragment).commit();
            }
        });

        altynButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction().replace(R.id.fragmentContainer, altynFragment).commit();
            }
        });
    }
}