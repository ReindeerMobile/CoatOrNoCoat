package hu.reindeer.coatornocoat;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

public class CoatOrNoCoatActivity extends Activity implements LocationListener {

	@Override
	public final void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
	}

	@Override
	public final void onLocationChanged(final Location loc) {
		loc.getLatitude();
		loc.getLongitude();
		Toast.makeText(getApplicationContext(), "Lat: " + loc.getLatitude() + ", long: " + loc.getLongitude(), Toast.LENGTH_SHORT).show();
	}

	@Override
	public final void onProviderDisabled(final String provider) {
		Toast.makeText(getApplicationContext(), "Gps Disabled", Toast.LENGTH_SHORT).show();
	}

	@Override
	public final void onProviderEnabled(final String provider) {
		Toast.makeText(getApplicationContext(), "Gps Enabled", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onStatusChanged(final String provider, final int status, final Bundle extras) {
	}
}