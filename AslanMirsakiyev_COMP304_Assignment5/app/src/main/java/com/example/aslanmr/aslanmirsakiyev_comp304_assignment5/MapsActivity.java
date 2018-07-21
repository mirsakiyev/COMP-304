package com.example.aslanmr.aslanmirsakiyev_comp304_assignment5;

/*
 * Assignment 5
 * Aslan Mirsakiyev
 * 20 of July 2018
 */

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        mMap = googleMap;

        String showroom=getIntent().getStringExtra("showroom");

        // Mercedes Markers
        if (showroom.equals("Mercedes_Location1"))
        {
            LatLng Mercedes_Location1 = new LatLng(43.766401, 79.279133);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("Mercedes_Location1");
            markerOptions.snippet("761 Dundas St E, Toronto, ON M5A 4N5, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(Mercedes_Location1);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Mercedes_Location1));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        if (showroom.equals("Mercedes_Location2"))
        {
            LatLng Mercedes_Location2 = new LatLng(43.765201, 79.279240);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("Mercedes_Location2");
            markerOptions.snippet("123 Progress St E, Toronto, ON M2A 1N5, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(Mercedes_Location2);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Mercedes_Location2));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        if (showroom.equals("Mercedes_Location3"))
        {
            LatLng Mercedes_Location3 = new LatLng(43.765671, 79.279258);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("Mercedes_Location3");
            markerOptions.snippet("567 Keele St, North York, ON M2K 1T5, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(Mercedes_Location3);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Mercedes_Location3));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }




        // BMW Markers
        if (showroom.equals("BMW_Location1"))
        {
            LatLng BMW_Location1 = new LatLng(43.765612, 79.279257);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("BMW_Location1");
            markerOptions.snippet("6511 Yonge St, Toronto, ON N1J 1N2, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(BMW_Location1);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(BMW_Location1));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        if (showroom.equals("BMW_Location2"))
        {
            LatLng BMW_Location2 = new LatLng(43.765700, 79.279200);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("BMW_Location2");
            markerOptions.snippet("89 Sheppard Ave W, Toronto, ON M1Y 8N2, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(BMW_Location2);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(BMW_Location2));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        if (showroom.equals("BMW_Location3"))
        {
            LatLng BMW_Location3 = new LatLng(43.765620, 79.279259);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("BMW_Location3");
            markerOptions.snippet("708 Sheppard Ave E, North York, ON M2K 1B7, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(BMW_Location3);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(BMW_Location3));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }



        // Honda Markers
        if (showroom.equals("Honda_Location1"))
        {
            LatLng Honda_Location1 = new LatLng(43.765622, 79.279254);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("Honda_Location1");
            markerOptions.snippet("1000 Bay St, Toronto, ON N1J 1N2, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(Honda_Location1);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Honda_Location1));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        if (showroom.equals("Honda_Location2"))
        {
            LatLng Honda_Location2 = new LatLng(43.765547, 79.279265);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("Honda_Location2");
            markerOptions.snippet("2000 Bay St, Toronto, ON N1J 1N2, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(Honda_Location2);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Honda_Location2));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }
        if (showroom.equals("Honda_Location3"))
        {
            LatLng Honda_Location3 = new LatLng(43.765621, 79.279278);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("Honda_Location3");
            markerOptions.snippet("3000 Bay St, Toronto, ON N1J 1N2, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(Honda_Location3);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Honda_Location3));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }



        // Lexus Markers
        if (showroom.equals("Lexus_Location1"))
        {
            LatLng Lexus_Location1 = new LatLng(43.765511, 79.279299);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("Lexus_Location1");
            markerOptions.snippet("2100 Domino St, Toronto, ON N1J 1N2, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(Lexus_Location1);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Lexus_Location1));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }

        if (showroom.equals("Lexus_Location2"))
        {
            LatLng Lexus_Location2 = new LatLng(43.765911, 79.279290);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("Lexus_Location2");
            markerOptions.snippet("4100 Domino St, Toronto, ON N1J 1N2, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(Lexus_Location2);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Lexus_Location2));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }

        if (showroom.equals("Lexus_Location3"))
        {
            LatLng Lexus_Location3 = new LatLng(43.765811, 79.279300);
            MarkerOptions markerOptions = new MarkerOptions();
            mMap.clear();
            markerOptions.title("Lexus_Location3");
            markerOptions.snippet("2111 Domino St, Toronto, ON N1J 1N2, Phone (416) 947-9000");
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.common_google_signin_btn_icon_dark_normal));
            markerOptions.position(Lexus_Location3);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Lexus_Location3));
            mMap.moveCamera(CameraUpdateFactory.zoomTo(10.2f));
        }

    }
}
