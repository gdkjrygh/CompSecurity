// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdate, Projection, UiSettings, MapView

public final class GoogleMap
{

    public static boolean a;
    private final IGoogleMapDelegate akm;
    private UiSettings akn;

    protected GoogleMap(IGoogleMapDelegate igooglemapdelegate)
    {
        akm = (IGoogleMapDelegate)jx.i(igooglemapdelegate);
    }

    public final Marker addMarker(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = akm.addMarker(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch (MarkerOptions markeroptions)
        {
            throw new RuntimeRemoteException(markeroptions);
        }
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        markeroptions = new Marker(markeroptions);
        return markeroptions;
        return null;
    }

    public final void animateCamera(CameraUpdate cameraupdate)
    {
        try
        {
            akm.animateCamera(cameraupdate.nA());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
    }

    public final void clear()
    {
        try
        {
            akm.clear();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final CameraPosition getCameraPosition()
    {
        CameraPosition cameraposition;
        try
        {
            cameraposition = akm.getCameraPosition();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraposition;
    }

    public final Location getMyLocation()
    {
        Location location;
        try
        {
            location = akm.getMyLocation();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return location;
    }

    public final Projection getProjection()
    {
        Projection projection;
        try
        {
            projection = new Projection(akm.getProjection());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return projection;
    }

    public final UiSettings getUiSettings()
    {
        if (akn == null)
        {
            akn = new UiSettings(akm.getUiSettings());
        }
        RemoteException remoteexception;
        try
        {
            return akn;
        }
        catch (RemoteException remoteexception1)
        {
            throw new RuntimeRemoteException(remoteexception1);
        }
        remoteexception;
        throw remoteexception;
    }

    public final boolean isTrafficEnabled()
    {
        boolean flag;
        try
        {
            flag = akm.isTrafficEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final void moveCamera(CameraUpdate cameraupdate)
    {
        try
        {
            akm.moveCamera(cameraupdate.nA());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
    }

    public final boolean setIndoorEnabled(boolean flag)
    {
        try
        {
            flag = akm.setIndoorEnabled(flag);
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final void setMapType(int i)
    {
        try
        {
            akm.setMapType(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setMyLocationEnabled(boolean flag)
    {
        try
        {
            akm.setMyLocationEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setOnCameraChangeListener(OnCameraChangeListener oncamerachangelistener)
    {
        if (oncamerachangelistener != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        int i;
        akm.setOnCameraChangeListener(null);
        i = MapView.a;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        try
        {
            akm.setOnCameraChangeListener(new _cls7(oncamerachangelistener));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnCameraChangeListener oncamerachangelistener) { }
        break MISSING_BLOCK_LABEL_45;
        oncamerachangelistener;
        throw oncamerachangelistener;
        try
        {
            throw oncamerachangelistener;
        }
        // Misplaced declaration of an exception variable
        catch (OnCameraChangeListener oncamerachangelistener)
        {
            throw new RuntimeRemoteException(oncamerachangelistener);
        }
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener oninfowindowclicklistener)
    {
        if (oninfowindowclicklistener != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        int i;
        akm.setOnInfoWindowClickListener(null);
        i = MapView.a;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        try
        {
            akm.setOnInfoWindowClickListener(new _cls12(oninfowindowclicklistener));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnInfoWindowClickListener oninfowindowclicklistener) { }
        break MISSING_BLOCK_LABEL_45;
        oninfowindowclicklistener;
        throw oninfowindowclicklistener;
        try
        {
            throw oninfowindowclicklistener;
        }
        // Misplaced declaration of an exception variable
        catch (OnInfoWindowClickListener oninfowindowclicklistener)
        {
            throw new RuntimeRemoteException(oninfowindowclicklistener);
        }
    }

    public final void setOnMapClickListener(OnMapClickListener onmapclicklistener)
    {
        if (onmapclicklistener != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        int i;
        akm.setOnMapClickListener(null);
        i = MapView.a;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        try
        {
            akm.setOnMapClickListener(new _cls8(onmapclicklistener));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnMapClickListener onmapclicklistener) { }
        break MISSING_BLOCK_LABEL_45;
        onmapclicklistener;
        throw onmapclicklistener;
        try
        {
            throw onmapclicklistener;
        }
        // Misplaced declaration of an exception variable
        catch (OnMapClickListener onmapclicklistener)
        {
            throw new RuntimeRemoteException(onmapclicklistener);
        }
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onmarkerclicklistener)
    {
        if (onmarkerclicklistener != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        int i;
        akm.setOnMarkerClickListener(null);
        i = MapView.a;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        try
        {
            akm.setOnMarkerClickListener(new _cls10(onmarkerclicklistener));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnMarkerClickListener onmarkerclicklistener) { }
        break MISSING_BLOCK_LABEL_45;
        onmarkerclicklistener;
        throw onmarkerclicklistener;
        try
        {
            throw onmarkerclicklistener;
        }
        // Misplaced declaration of an exception variable
        catch (OnMarkerClickListener onmarkerclicklistener)
        {
            throw new RuntimeRemoteException(onmarkerclicklistener);
        }
    }

    public final void setTrafficEnabled(boolean flag)
    {
        try
        {
            akm.setTrafficEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void stopAnimation()
    {
        try
        {
            akm.stopAnimation();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    private class _cls7 extends com.google.android.gms.maps.internal.f.a
    {

        final GoogleMap akp;
        final OnCameraChangeListener akx;

        public void onCameraChange(CameraPosition cameraposition)
        {
            akx.onCameraChange(cameraposition);
        }

        _cls7(OnCameraChangeListener oncamerachangelistener)
        {
            akp = GoogleMap.this;
            akx = oncamerachangelistener;
            super();
        }

        private class OnCameraChangeListener
        {

            public abstract void onCameraChange(CameraPosition cameraposition);
        }

    }


    private class _cls12 extends com.google.android.gms.maps.internal.h.a
    {

        final OnInfoWindowClickListener akC;
        final GoogleMap akp;

        public void e(l l)
        {
            akC.onInfoWindowClick(new Marker(l));
        }

        _cls12(OnInfoWindowClickListener oninfowindowclicklistener)
        {
            akp = GoogleMap.this;
            akC = oninfowindowclicklistener;
            super();
        }

        private class OnInfoWindowClickListener
        {

            public abstract void onInfoWindowClick(Marker marker);
        }

    }


    private class _cls8 extends com.google.android.gms.maps.internal.j.a
    {

        final GoogleMap akp;
        final OnMapClickListener aky;

        public void onMapClick(LatLng latlng)
        {
            aky.onMapClick(latlng);
        }

        _cls8(OnMapClickListener onmapclicklistener)
        {
            akp = GoogleMap.this;
            aky = onmapclicklistener;
            super();
        }

        private class OnMapClickListener
        {

            public abstract void onMapClick(LatLng latlng);
        }

    }


    private class _cls10 extends com.google.android.gms.maps.internal.n.a
    {

        final OnMarkerClickListener akA;
        final GoogleMap akp;

        public boolean a(l l)
        {
            return akA.onMarkerClick(new Marker(l));
        }

        _cls10(OnMarkerClickListener onmarkerclicklistener)
        {
            akp = GoogleMap.this;
            akA = onmarkerclicklistener;
            super();
        }

        private class OnMarkerClickListener
        {

            public abstract boolean onMarkerClick(Marker marker);
        }

    }

}
