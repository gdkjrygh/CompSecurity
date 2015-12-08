// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdate, Projection, UiSettings, LocationSource

public final class GoogleMap
{
    public static interface OnMapClickListener
    {

        public abstract void onMapClick(LatLng latlng);
    }

    public static interface OnMarkerClickListener
    {

        public abstract boolean onMarkerClick(Marker marker);
    }

    public static interface OnMyLocationChangeListener
    {

        public abstract void onMyLocationChange(Location location);
    }


    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate zzaFp;
    private UiSettings zzaFq;

    protected GoogleMap(IGoogleMapDelegate igooglemapdelegate)
    {
        zzaFp = (IGoogleMapDelegate)zzx.zzv(igooglemapdelegate);
    }

    public final Circle addCircle(CircleOptions circleoptions)
    {
        try
        {
            circleoptions = new Circle(zzaFp.addCircle(circleoptions));
        }
        // Misplaced declaration of an exception variable
        catch (CircleOptions circleoptions)
        {
            throw new RuntimeRemoteException(circleoptions);
        }
        return circleoptions;
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
    {
        try
        {
            groundoverlayoptions = zzaFp.addGroundOverlay(groundoverlayoptions);
        }
        // Misplaced declaration of an exception variable
        catch (GroundOverlayOptions groundoverlayoptions)
        {
            throw new RuntimeRemoteException(groundoverlayoptions);
        }
        if (groundoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        groundoverlayoptions = new GroundOverlay(groundoverlayoptions);
        return groundoverlayoptions;
        return null;
    }

    public final Marker addMarker(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = zzaFp.addMarker(markeroptions);
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

    public final Polygon addPolygon(PolygonOptions polygonoptions)
    {
        try
        {
            polygonoptions = new Polygon(zzaFp.addPolygon(polygonoptions));
        }
        // Misplaced declaration of an exception variable
        catch (PolygonOptions polygonoptions)
        {
            throw new RuntimeRemoteException(polygonoptions);
        }
        return polygonoptions;
    }

    public final Polyline addPolyline(PolylineOptions polylineoptions)
    {
        try
        {
            polylineoptions = new Polyline(zzaFp.addPolyline(polylineoptions));
        }
        // Misplaced declaration of an exception variable
        catch (PolylineOptions polylineoptions)
        {
            throw new RuntimeRemoteException(polylineoptions);
        }
        return polylineoptions;
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions tileoverlayoptions)
    {
        try
        {
            tileoverlayoptions = zzaFp.addTileOverlay(tileoverlayoptions);
        }
        // Misplaced declaration of an exception variable
        catch (TileOverlayOptions tileoverlayoptions)
        {
            throw new RuntimeRemoteException(tileoverlayoptions);
        }
        if (tileoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        tileoverlayoptions = new TileOverlay(tileoverlayoptions);
        return tileoverlayoptions;
        return null;
    }

    public final void animateCamera(CameraUpdate cameraupdate)
    {
        try
        {
            zzaFp.animateCamera(cameraupdate.zzwB());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
    }

    public final void animateCamera(CameraUpdate cameraupdate, int i, CancelableCallback cancelablecallback)
    {
    /* block-local class not found */
    class zza {}

        IGoogleMapDelegate igooglemapdelegate;
        com.google.android.gms.dynamic.zzd zzd;
        try
        {
            igooglemapdelegate = zzaFp;
            zzd = cameraupdate.zzwB();
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
        if (cancelablecallback != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        cameraupdate = null;
        igooglemapdelegate.animateCameraWithDurationAndCallback(zzd, i, cameraupdate);
        return;
        cameraupdate = new zza(cancelablecallback);
        break MISSING_BLOCK_LABEL_18;
    }

    public final void animateCamera(CameraUpdate cameraupdate, CancelableCallback cancelablecallback)
    {
        IGoogleMapDelegate igooglemapdelegate;
        com.google.android.gms.dynamic.zzd zzd;
        try
        {
            igooglemapdelegate = zzaFp;
            zzd = cameraupdate.zzwB();
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
        if (cancelablecallback != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        cameraupdate = null;
        igooglemapdelegate.animateCameraWithCallback(zzd, cameraupdate);
        return;
        cameraupdate = new zza(cancelablecallback);
        break MISSING_BLOCK_LABEL_17;
    }

    public final void clear()
    {
        try
        {
            zzaFp.clear();
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
            cameraposition = zzaFp.getCameraPosition();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraposition;
    }

    public IndoorBuilding getFocusedBuilding()
    {
        Object obj;
        try
        {
            obj = zzaFp.getFocusedBuilding();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj = new IndoorBuilding(((com.google.android.gms.maps.model.internal.zzd) (obj)));
        return ((IndoorBuilding) (obj));
        return null;
    }

    public final int getMapType()
    {
        int i;
        try
        {
            i = zzaFp.getMapType();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public final float getMaxZoomLevel()
    {
        float f;
        try
        {
            f = zzaFp.getMaxZoomLevel();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public final float getMinZoomLevel()
    {
        float f;
        try
        {
            f = zzaFp.getMinZoomLevel();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public final Location getMyLocation()
    {
        Location location;
        try
        {
            location = zzaFp.getMyLocation();
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
            projection = new Projection(zzaFp.getProjection());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return projection;
    }

    public final UiSettings getUiSettings()
    {
        UiSettings uisettings;
        try
        {
            if (zzaFq == null)
            {
                zzaFq = new UiSettings(zzaFp.getUiSettings());
            }
            uisettings = zzaFq;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return uisettings;
    }

    public final boolean isBuildingsEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaFp.isBuildingsEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean isIndoorEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaFp.isIndoorEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean isMyLocationEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaFp.isMyLocationEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean isTrafficEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaFp.isTrafficEnabled();
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
            zzaFp.moveCamera(cameraupdate.zzwB());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraUpdate cameraupdate)
        {
            throw new RuntimeRemoteException(cameraupdate);
        }
    }

    public final void setBuildingsEnabled(boolean flag)
    {
        try
        {
            zzaFp.setBuildingsEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setContentDescription(String s)
    {
        try
        {
            zzaFp.setContentDescription(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public final boolean setIndoorEnabled(boolean flag)
    {
        try
        {
            flag = zzaFp.setIndoorEnabled(flag);
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter infowindowadapter)
    {
        if (infowindowadapter == null)
        {
            try
            {
                zzaFp.setInfoWindowAdapter(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InfoWindowAdapter infowindowadapter)
            {
                throw new RuntimeRemoteException(infowindowadapter);
            }
        }
        zzaFp.setInfoWindowAdapter(new _cls13(infowindowadapter));
        return;
    }

    public final void setLocationSource(LocationSource locationsource)
    {
        if (locationsource == null)
        {
            try
            {
                zzaFp.setLocationSource(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (LocationSource locationsource)
            {
                throw new RuntimeRemoteException(locationsource);
            }
        }
        zzaFp.setLocationSource(new _cls6(locationsource));
        return;
    }

    public final void setMapType(int i)
    {
        try
        {
            zzaFp.setMapType(i);
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
            zzaFp.setMyLocationEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setOnCameraChangeListener(OnCameraChangeListener oncamerachangelistener)
    {
        if (oncamerachangelistener == null)
        {
            try
            {
                zzaFp.setOnCameraChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnCameraChangeListener oncamerachangelistener)
            {
                throw new RuntimeRemoteException(oncamerachangelistener);
            }
        }
        zzaFp.setOnCameraChangeListener(new _cls7(oncamerachangelistener));
        return;
    }

    public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener onindoorstatechangelistener)
    {
        if (onindoorstatechangelistener == null)
        {
            try
            {
                zzaFp.setOnIndoorStateChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnIndoorStateChangeListener onindoorstatechangelistener)
            {
                throw new RuntimeRemoteException(onindoorstatechangelistener);
            }
        }
        zzaFp.setOnIndoorStateChangeListener(new _cls1(onindoorstatechangelistener));
        return;
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener oninfowindowclicklistener)
    {
        if (oninfowindowclicklistener == null)
        {
            try
            {
                zzaFp.setOnInfoWindowClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnInfoWindowClickListener oninfowindowclicklistener)
            {
                throw new RuntimeRemoteException(oninfowindowclicklistener);
            }
        }
        zzaFp.setOnInfoWindowClickListener(new _cls12(oninfowindowclicklistener));
        return;
    }

    public final void setOnMapClickListener(OnMapClickListener onmapclicklistener)
    {
        if (onmapclicklistener == null)
        {
            try
            {
                zzaFp.setOnMapClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapClickListener onmapclicklistener)
            {
                throw new RuntimeRemoteException(onmapclicklistener);
            }
        }
        zzaFp.setOnMapClickListener(new _cls8(onmapclicklistener));
        return;
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback onmaploadedcallback)
    {
        if (onmaploadedcallback == null)
        {
            try
            {
                zzaFp.setOnMapLoadedCallback(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapLoadedCallback onmaploadedcallback)
            {
                throw new RuntimeRemoteException(onmaploadedcallback);
            }
        }
        zzaFp.setOnMapLoadedCallback(new _cls4(onmaploadedcallback));
        return;
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onmaplongclicklistener)
    {
        if (onmaplongclicklistener == null)
        {
            try
            {
                zzaFp.setOnMapLongClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapLongClickListener onmaplongclicklistener)
            {
                throw new RuntimeRemoteException(onmaplongclicklistener);
            }
        }
        zzaFp.setOnMapLongClickListener(new _cls9(onmaplongclicklistener));
        return;
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onmarkerclicklistener)
    {
        if (onmarkerclicklistener == null)
        {
            try
            {
                zzaFp.setOnMarkerClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMarkerClickListener onmarkerclicklistener)
            {
                throw new RuntimeRemoteException(onmarkerclicklistener);
            }
        }
        zzaFp.setOnMarkerClickListener(new _cls10(onmarkerclicklistener));
        return;
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onmarkerdraglistener)
    {
        if (onmarkerdraglistener == null)
        {
            try
            {
                zzaFp.setOnMarkerDragListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMarkerDragListener onmarkerdraglistener)
            {
                throw new RuntimeRemoteException(onmarkerdraglistener);
            }
        }
        zzaFp.setOnMarkerDragListener(new _cls11(onmarkerdraglistener));
        return;
    }

    public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
    {
        if (onmylocationbuttonclicklistener == null)
        {
            try
            {
                zzaFp.setOnMyLocationButtonClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
            {
                throw new RuntimeRemoteException(onmylocationbuttonclicklistener);
            }
        }
        zzaFp.setOnMyLocationButtonClickListener(new _cls3(onmylocationbuttonclicklistener));
        return;
    }

    public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onmylocationchangelistener)
    {
        if (onmylocationchangelistener == null)
        {
            try
            {
                zzaFp.setOnMyLocationChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMyLocationChangeListener onmylocationchangelistener)
            {
                throw new RuntimeRemoteException(onmylocationchangelistener);
            }
        }
        zzaFp.setOnMyLocationChangeListener(new _cls2(onmylocationchangelistener));
        return;
    }

    public final void setPadding(int i, int j, int k, int l)
    {
        try
        {
            zzaFp.setPadding(i, j, k, l);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void setTrafficEnabled(boolean flag)
    {
        try
        {
            zzaFp.setTrafficEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotreadycallback)
    {
        snapshot(snapshotreadycallback, null);
    }

    public final void snapshot(SnapshotReadyCallback snapshotreadycallback, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            bitmap = zze.zzx(bitmap);
        } else
        {
            bitmap = null;
        }
        bitmap = (zze)(zze)bitmap;
        try
        {
            zzaFp.snapshot(new _cls5(snapshotreadycallback), bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SnapshotReadyCallback snapshotreadycallback)
        {
            throw new RuntimeRemoteException(snapshotreadycallback);
        }
    }

    public final void stopAnimation()
    {
        try
        {
            zzaFp.stopAnimation();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    IGoogleMapDelegate zzwD()
    {
        return zzaFp;
    }

    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$CancelableCallback
    /* block-local class not found */
    class CancelableCallback {}


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$InfoWindowAdapter
    /* block-local class not found */
    class InfoWindowAdapter {}


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$OnCameraChangeListener
    /* block-local class not found */
    class OnCameraChangeListener {}


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener
    /* block-local class not found */
    class OnIndoorStateChangeListener {}


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener
    /* block-local class not found */
    class OnInfoWindowClickListener {}


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$OnMapLoadedCallback
    /* block-local class not found */
    class OnMapLoadedCallback {}


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$OnMapLongClickListener
    /* block-local class not found */
    class OnMapLongClickListener {}


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$OnMarkerDragListener
    /* block-local class not found */
    class OnMarkerDragListener {}


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener
    /* block-local class not found */
    class OnMyLocationButtonClickListener {}


    // Unreferenced inner class com/google/android/gms/maps/GoogleMap$SnapshotReadyCallback
    /* block-local class not found */
    class SnapshotReadyCallback {}


    /* member class not found */
    class _cls13 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls12 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls10 {}


    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls5 {}

}
