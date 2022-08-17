package com.example.newprojectcovi;

import android.os.Bundle;



import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng>arrayList= new ArrayList<LatLng>();
    LatLng mumbai = new LatLng(19.0760, 72.8777);
    LatLng noblemedical = new LatLng(19.093984, 72.912996);
    LatLng rupalimedical = new LatLng(19.079044, 72.865357);
    LatLng healthcare = new LatLng(19.022313, 72.836554);
    LatLng noble2 = new LatLng(18.976475, 72.807233);
    LatLng generalmedical = new LatLng(18.972652, 72.822034);
    LatLng allindiastore = new LatLng(18.955339, 72.826032);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(mumbai);
        arrayList.add(noblemedical);
        arrayList.add(rupalimedical);
        arrayList.add(healthcare);
        arrayList.add(noble2);
        arrayList.add(generalmedical);
        arrayList.add(allindiastore);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap =googleMap;
        for (int i=0;i<arrayList.size();i++){


            float v = 0;
            mMap.addMarker(new MarkerOptions().position(arrayList.get(i)).title("Marker"));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(  15.0f));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(arrayList.get(i)));
        }
    }
}