package com.example.mylbs;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mylbs.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, AdapterView.OnItemSelectedListener {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    public static final String namapulau[]={"pilih","Sumatra","Jawa","Kalimantan","Sulawesi","NTB","NTT","Bali","Papua","Maluku"};
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        spinner=findViewById(R.id.pilihpulau);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,namapulau);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        double lati,longi;

        switch (position)
        {
            case 0 :
                mMap.clear();
                break;
            case 1 :
                mMap.clear();
                LatLng aceh = new LatLng(4.3500447, 95.5688299);
                mMap.addMarker(new MarkerOptions().position(aceh).title("Aceh"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(aceh));


                LatLng mdan = new LatLng(3.6422756, 98.5294065);
                mMap.addMarker(new MarkerOptions().position(mdan).title("Medan"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(mdan));


                LatLng padng = new LatLng(-0.9345808, 100.2511828);
                mMap.addMarker(new MarkerOptions().position(padng).title("Padang"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(padng));


                LatLng palmbng = new LatLng(-2.9549663, 104.6929239);
                mMap.addMarker(new MarkerOptions().position(palmbng).title("Palembang"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(palmbng));
                break;

            case 2 :
            case 3 :
            case 4 :
            default:
                Toast.makeText(this, "Gak ada boss !!!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}