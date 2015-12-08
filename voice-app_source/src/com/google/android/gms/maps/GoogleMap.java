// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
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
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdate, Projection, UiSettings, LocationSource

public final class GoogleMap
{
    public static interface CancelableCallback
    {

        public abstract void onCancel();

        public abstract void onFinish();
    }

    public static interface InfoWindowAdapter
    {

        public abstract View getInfoContents(Marker marker);

        public abstract View getInfoWindow(Marker marker);
    }

    public static interface OnCameraChangeListener
    {

        public abstract void onCameraChange(CameraPosition cameraposition);
    }

    public static interface OnIndoorStateChangeListener
    {

        public abstract void onIndoorBuildingFocused();

        public abstract void onIndoorLevelActivated(IndoorBuilding indoorbuilding);
    }

    public static interface OnInfoWindowClickListener
    {

        public abstract void onInfoWindowClick(Marker marker);
    }

    public static interface OnMapClickListener
    {

        public abstract void onMapClick(LatLng latlng);
    }

    public static interface OnMapLoadedCallback
    {

        public abstract void onMapLoaded();
    }

    public static interface OnMapLongClickListener
    {

        public abstract void onMapLongClick(LatLng latlng);
    }

    public static interface OnMarkerClickListener
    {

        public abstract boolean onMarkerClick(Marker marker);
    }

    public static interface OnMarkerDragListener
    {

        public abstract void onMarkerDrag(Marker marker);

        public abstract void onMarkerDragEnd(Marker marker);

        public abstract void onMarkerDragStart(Marker marker);
    }

    public static interface OnMyLocationButtonClickListener
    {

        public abstract boolean onMyLocationButtonClick();
    }

    public static interface OnMyLocationChangeListener
    {

        public abstract void onMyLocationChange(Location location);
    }

    public static interface SnapshotReadyCallback
    {

        public abstract void onSnapshotReady(Bitmap bitmap);
    }

    private static final class zza extends com.google.android.gms.maps.internal.zzb.zza
    {

        private final CancelableCallback zzaBH;

        public void onCancel()
        {
            zzaBH.onCancel();
        }

        public void onFinish()
        {
            zzaBH.onFinish();
        }

        zza(CancelableCallback cancelablecallback)
        {
            zzaBH = cancelablecallback;
        }
    }


    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate zzaBp;
    private UiSettings zzaBq;

    protected GoogleMap(IGoogleMapDelegate igooglemapdelegate)
    {
        zzaBp = (IGoogleMapDelegate)zzu.zzu(igooglemapdelegate);
    }

    public final Circle addCircle(CircleOptions circleoptions)
    {
        try
        {
            circleoptions = new Circle(zzaBp.addCircle(circleoptions));
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
            groundoverlayoptions = zzaBp.addGroundOverlay(groundoverlayoptions);
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
            markeroptions = zzaBp.addMarker(markeroptions);
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
            polygonoptions = new Polygon(zzaBp.addPolygon(polygonoptions));
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
            polylineoptions = new Polyline(zzaBp.addPolyline(polylineoptions));
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
            tileoverlayoptions = zzaBp.addTileOverlay(tileoverlayoptions);
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
            zzaBp.animateCamera(cameraupdate.zzvg());
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
        IGoogleMapDelegate igooglemapdelegate;
        zzd zzd;
        try
        {
            igooglemapdelegate = zzaBp;
            zzd = cameraupdate.zzvg();
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
        zzd zzd;
        try
        {
            igooglemapdelegate = zzaBp;
            zzd = cameraupdate.zzvg();
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
            zzaBp.clear();
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
            cameraposition = zzaBp.getCameraPosition();
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
            obj = zzaBp.getFocusedBuilding();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj = new IndoorBuilding(((zzg) (obj)));
        return ((IndoorBuilding) (obj));
        return null;
    }

    public final int getMapType()
    {
        int i;
        try
        {
            i = zzaBp.getMapType();
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
            f = zzaBp.getMaxZoomLevel();
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
            f = zzaBp.getMinZoomLevel();
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
            location = zzaBp.getMyLocation();
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
            projection = new Projection(zzaBp.getProjection());
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
            if (zzaBq == null)
            {
                zzaBq = new UiSettings(zzaBp.getUiSettings());
            }
            uisettings = zzaBq;
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
            flag = zzaBp.isBuildingsEnabled();
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
            flag = zzaBp.isIndoorEnabled();
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
            flag = zzaBp.isMyLocationEnabled();
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
            flag = zzaBp.isTrafficEnabled();
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
            zzaBp.moveCamera(cameraupdate.zzvg());
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
            zzaBp.setBuildingsEnabled(flag);
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
            zzaBp.setContentDescription(s);
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
            flag = zzaBp.setIndoorEnabled(flag);
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
                zzaBp.setInfoWindowAdapter(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InfoWindowAdapter infowindowadapter)
            {
                throw new RuntimeRemoteException(infowindowadapter);
            }
        }
        zzaBp.setInfoWindowAdapter(new com.google.android.gms.maps.internal.zzd.zza(infowindowadapter) {

            final InfoWindowAdapter zzaBG;
            final GoogleMap zzaBs;

            public zzd zzf(zzi zzi)
            {
                return zze.zzw(zzaBG.getInfoWindow(new Marker(zzi)));
            }

            public zzd zzg(zzi zzi)
            {
                return zze.zzw(zzaBG.getInfoContents(new Marker(zzi)));
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBG = infowindowadapter;
                super();
            }
        });
        return;
    }

    public final void setLocationSource(LocationSource locationsource)
    {
        if (locationsource == null)
        {
            try
            {
                zzaBp.setLocationSource(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (LocationSource locationsource)
            {
                throw new RuntimeRemoteException(locationsource);
            }
        }
        zzaBp.setLocationSource(new com.google.android.gms.maps.internal.ILocationSourceDelegate.zza(locationsource) {

            final GoogleMap zzaBs;
            final LocationSource zzaBx;

            public void activate(com.google.android.gms.maps.internal.zzi zzi)
            {
                zzaBx.activate(new LocationSource.OnLocationChangedListener(this, zzi) {

                    final com.google.android.gms.maps.internal.zzi zzaBy;
                    final _cls6 zzaBz;

                    public void onLocationChanged(Location location)
                    {
                        try
                        {
                            zzaBy.zzd(location);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Location location)
                        {
                            throw new RuntimeRemoteException(location);
                        }
                    }

            
            {
                zzaBz = _pcls6;
                zzaBy = zzi1;
                super();
            }
                });
            }

            public void deactivate()
            {
                zzaBx.deactivate();
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBx = locationsource;
                super();
            }
        });
        return;
    }

    public final void setMapType(int i)
    {
        try
        {
            zzaBp.setMapType(i);
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
            zzaBp.setMyLocationEnabled(flag);
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
                zzaBp.setOnCameraChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnCameraChangeListener oncamerachangelistener)
            {
                throw new RuntimeRemoteException(oncamerachangelistener);
            }
        }
        zzaBp.setOnCameraChangeListener(new com.google.android.gms.maps.internal.zzf.zza(oncamerachangelistener) {

            final OnCameraChangeListener zzaBA;
            final GoogleMap zzaBs;

            public void onCameraChange(CameraPosition cameraposition)
            {
                zzaBA.onCameraChange(cameraposition);
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBA = oncamerachangelistener;
                super();
            }
        });
        return;
    }

    public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener onindoorstatechangelistener)
    {
        if (onindoorstatechangelistener == null)
        {
            try
            {
                zzaBp.setOnIndoorStateChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnIndoorStateChangeListener onindoorstatechangelistener)
            {
                throw new RuntimeRemoteException(onindoorstatechangelistener);
            }
        }
        zzaBp.setOnIndoorStateChangeListener(new com.google.android.gms.maps.internal.zzg.zza(onindoorstatechangelistener) {

            final OnIndoorStateChangeListener zzaBr;
            final GoogleMap zzaBs;

            public void onIndoorBuildingFocused()
            {
                zzaBr.onIndoorBuildingFocused();
            }

            public void zza(zzg zzg)
            {
                zzaBr.onIndoorLevelActivated(new IndoorBuilding(zzg));
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBr = onindoorstatechangelistener;
                super();
            }
        });
        return;
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener oninfowindowclicklistener)
    {
        if (oninfowindowclicklistener == null)
        {
            try
            {
                zzaBp.setOnInfoWindowClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnInfoWindowClickListener oninfowindowclicklistener)
            {
                throw new RuntimeRemoteException(oninfowindowclicklistener);
            }
        }
        zzaBp.setOnInfoWindowClickListener(new com.google.android.gms.maps.internal.zzh.zza(oninfowindowclicklistener) {

            final OnInfoWindowClickListener zzaBF;
            final GoogleMap zzaBs;

            public void zze(zzi zzi)
            {
                zzaBF.onInfoWindowClick(new Marker(zzi));
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBF = oninfowindowclicklistener;
                super();
            }
        });
        return;
    }

    public final void setOnMapClickListener(OnMapClickListener onmapclicklistener)
    {
        if (onmapclicklistener == null)
        {
            try
            {
                zzaBp.setOnMapClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapClickListener onmapclicklistener)
            {
                throw new RuntimeRemoteException(onmapclicklistener);
            }
        }
        zzaBp.setOnMapClickListener(new com.google.android.gms.maps.internal.zzj.zza(onmapclicklistener) {

            final OnMapClickListener zzaBB;
            final GoogleMap zzaBs;

            public void onMapClick(LatLng latlng)
            {
                zzaBB.onMapClick(latlng);
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBB = onmapclicklistener;
                super();
            }
        });
        return;
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback onmaploadedcallback)
    {
        if (onmaploadedcallback == null)
        {
            try
            {
                zzaBp.setOnMapLoadedCallback(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapLoadedCallback onmaploadedcallback)
            {
                throw new RuntimeRemoteException(onmaploadedcallback);
            }
        }
        zzaBp.setOnMapLoadedCallback(new com.google.android.gms.maps.internal.zzk.zza(onmaploadedcallback) {

            final GoogleMap zzaBs;
            final OnMapLoadedCallback zzaBv;

            public void onMapLoaded()
                throws RemoteException
            {
                zzaBv.onMapLoaded();
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBv = onmaploadedcallback;
                super();
            }
        });
        return;
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onmaplongclicklistener)
    {
        if (onmaplongclicklistener == null)
        {
            try
            {
                zzaBp.setOnMapLongClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapLongClickListener onmaplongclicklistener)
            {
                throw new RuntimeRemoteException(onmaplongclicklistener);
            }
        }
        zzaBp.setOnMapLongClickListener(new com.google.android.gms.maps.internal.zzl.zza(onmaplongclicklistener) {

            final OnMapLongClickListener zzaBC;
            final GoogleMap zzaBs;

            public void onMapLongClick(LatLng latlng)
            {
                zzaBC.onMapLongClick(latlng);
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBC = onmaplongclicklistener;
                super();
            }
        });
        return;
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onmarkerclicklistener)
    {
        if (onmarkerclicklistener == null)
        {
            try
            {
                zzaBp.setOnMarkerClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMarkerClickListener onmarkerclicklistener)
            {
                throw new RuntimeRemoteException(onmarkerclicklistener);
            }
        }
        zzaBp.setOnMarkerClickListener(new com.google.android.gms.maps.internal.zzn.zza(onmarkerclicklistener) {

            final OnMarkerClickListener zzaBD;
            final GoogleMap zzaBs;

            public boolean zza(zzi zzi)
            {
                return zzaBD.onMarkerClick(new Marker(zzi));
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBD = onmarkerclicklistener;
                super();
            }
        });
        return;
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onmarkerdraglistener)
    {
        if (onmarkerdraglistener == null)
        {
            try
            {
                zzaBp.setOnMarkerDragListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMarkerDragListener onmarkerdraglistener)
            {
                throw new RuntimeRemoteException(onmarkerdraglistener);
            }
        }
        zzaBp.setOnMarkerDragListener(new com.google.android.gms.maps.internal.zzo.zza(onmarkerdraglistener) {

            final OnMarkerDragListener zzaBE;
            final GoogleMap zzaBs;

            public void zzb(zzi zzi)
            {
                zzaBE.onMarkerDragStart(new Marker(zzi));
            }

            public void zzc(zzi zzi)
            {
                zzaBE.onMarkerDragEnd(new Marker(zzi));
            }

            public void zzd(zzi zzi)
            {
                zzaBE.onMarkerDrag(new Marker(zzi));
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBE = onmarkerdraglistener;
                super();
            }
        });
        return;
    }

    public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
    {
        if (onmylocationbuttonclicklistener == null)
        {
            try
            {
                zzaBp.setOnMyLocationButtonClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
            {
                throw new RuntimeRemoteException(onmylocationbuttonclicklistener);
            }
        }
        zzaBp.setOnMyLocationButtonClickListener(new com.google.android.gms.maps.internal.zzp.zza(onmylocationbuttonclicklistener) {

            final GoogleMap zzaBs;
            final OnMyLocationButtonClickListener zzaBu;

            public boolean onMyLocationButtonClick()
                throws RemoteException
            {
                return zzaBu.onMyLocationButtonClick();
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBu = onmylocationbuttonclicklistener;
                super();
            }
        });
        return;
    }

    public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onmylocationchangelistener)
    {
        if (onmylocationchangelistener == null)
        {
            try
            {
                zzaBp.setOnMyLocationChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMyLocationChangeListener onmylocationchangelistener)
            {
                throw new RuntimeRemoteException(onmylocationchangelistener);
            }
        }
        zzaBp.setOnMyLocationChangeListener(new com.google.android.gms.maps.internal.zzq.zza(onmylocationchangelistener) {

            final GoogleMap zzaBs;
            final OnMyLocationChangeListener zzaBt;

            public void zzc(Location location)
            {
                zzaBt.onMyLocationChange(location);
            }

            public void zzo(zzd zzd)
            {
                zzaBt.onMyLocationChange((Location)zze.zzn(zzd));
            }

            
            {
                zzaBs = GoogleMap.this;
                zzaBt = onmylocationchangelistener;
                super();
            }
        });
        return;
    }

    public final void setPadding(int i, int j, int k, int l)
    {
        try
        {
            zzaBp.setPadding(i, j, k, l);
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
            zzaBp.setTrafficEnabled(flag);
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
            bitmap = zze.zzw(bitmap);
        } else
        {
            bitmap = null;
        }
        bitmap = (zze)(zze)bitmap;
        try
        {
            zzaBp.snapshot(new com.google.android.gms.maps.internal.zzw.zza(snapshotreadycallback) {

                final GoogleMap zzaBs;
                final SnapshotReadyCallback zzaBw;

                public void onSnapshotReady(Bitmap bitmap1)
                    throws RemoteException
                {
                    zzaBw.onSnapshotReady(bitmap1);
                }

                public void zzp(zzd zzd)
                    throws RemoteException
                {
                    zzaBw.onSnapshotReady((Bitmap)zze.zzn(zzd));
                }

            
            {
                zzaBs = GoogleMap.this;
                zzaBw = snapshotreadycallback;
                super();
            }
            }, bitmap);
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
            zzaBp.stopAnimation();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    IGoogleMapDelegate zzvi()
    {
        return zzaBp;
    }
}
