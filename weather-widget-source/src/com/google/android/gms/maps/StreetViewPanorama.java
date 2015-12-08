// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama
{
    public static interface OnStreetViewPanoramaCameraChangeListener
    {

        public abstract void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera);
    }

    public static interface OnStreetViewPanoramaChangeListener
    {

        public abstract void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation);
    }

    public static interface OnStreetViewPanoramaClickListener
    {

        public abstract void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation);
    }

    public static interface OnStreetViewPanoramaLongClickListener
    {

        public abstract void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetviewpanoramaorientation);
    }


    private final IStreetViewPanoramaDelegate zzaGj;

    protected StreetViewPanorama(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
    {
        zzaGj = (IStreetViewPanoramaDelegate)zzx.zzv(istreetviewpanoramadelegate);
    }

    public void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
    {
        try
        {
            zzaGj.animateTo(streetviewpanoramacamera, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StreetViewPanoramaCamera streetviewpanoramacamera)
        {
            throw new RuntimeRemoteException(streetviewpanoramacamera);
        }
    }

    public StreetViewPanoramaLocation getLocation()
    {
        StreetViewPanoramaLocation streetviewpanoramalocation;
        try
        {
            streetviewpanoramalocation = zzaGj.getStreetViewPanoramaLocation();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return streetviewpanoramalocation;
    }

    public StreetViewPanoramaCamera getPanoramaCamera()
    {
        StreetViewPanoramaCamera streetviewpanoramacamera;
        try
        {
            streetviewpanoramacamera = zzaGj.getPanoramaCamera();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return streetviewpanoramacamera;
    }

    public boolean isPanningGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaGj.isPanningGesturesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isStreetNamesEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaGj.isStreetNamesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isUserNavigationEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaGj.isUserNavigationEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isZoomGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaGj.isZoomGesturesEnabled();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public Point orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
    {
        try
        {
            streetviewpanoramaorientation = zzaGj.orientationToPoint(streetviewpanoramaorientation);
        }
        // Misplaced declaration of an exception variable
        catch (StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            throw new RuntimeRemoteException(streetviewpanoramaorientation);
        }
        if (streetviewpanoramaorientation == null)
        {
            return null;
        }
        streetviewpanoramaorientation = (Point)zze.zzp(streetviewpanoramaorientation);
        return streetviewpanoramaorientation;
    }

    public StreetViewPanoramaOrientation pointToOrientation(Point point)
    {
        try
        {
            point = zzaGj.pointToOrientation(zze.zzx(point));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            throw new RuntimeRemoteException(point);
        }
        return point;
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
    {
        if (onstreetviewpanoramacamerachangelistener == null)
        {
            try
            {
                zzaGj.setOnStreetViewPanoramaCameraChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramacamerachangelistener);
            }
        }
        zzaGj.setOnStreetViewPanoramaCameraChangeListener(new com.google.android.gms.maps.internal.zzr.zza(onstreetviewpanoramacamerachangelistener) {

            final StreetViewPanorama zzaGl;
            final OnStreetViewPanoramaCameraChangeListener zzaGm;

            public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera)
            {
                zzaGm.onStreetViewPanoramaCameraChange(streetviewpanoramacamera);
            }

            
            {
                zzaGl = StreetViewPanorama.this;
                zzaGm = onstreetviewpanoramacamerachangelistener;
                super();
            }
        });
        return;
    }

    public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
    {
        if (onstreetviewpanoramachangelistener == null)
        {
            try
            {
                zzaGj.setOnStreetViewPanoramaChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramachangelistener);
            }
        }
        zzaGj.setOnStreetViewPanoramaChangeListener(new com.google.android.gms.maps.internal.zzs.zza(onstreetviewpanoramachangelistener) {

            final OnStreetViewPanoramaChangeListener zzaGk;
            final StreetViewPanorama zzaGl;

            public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation)
            {
                zzaGk.onStreetViewPanoramaChange(streetviewpanoramalocation);
            }

            
            {
                zzaGl = StreetViewPanorama.this;
                zzaGk = onstreetviewpanoramachangelistener;
                super();
            }
        });
        return;
    }

    public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
    {
        if (onstreetviewpanoramaclicklistener == null)
        {
            try
            {
                zzaGj.setOnStreetViewPanoramaClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramaclicklistener);
            }
        }
        zzaGj.setOnStreetViewPanoramaClickListener(new com.google.android.gms.maps.internal.zzt.zza(onstreetviewpanoramaclicklistener) {

            final StreetViewPanorama zzaGl;
            final OnStreetViewPanoramaClickListener zzaGn;

            public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            {
                zzaGn.onStreetViewPanoramaClick(streetviewpanoramaorientation);
            }

            
            {
                zzaGl = StreetViewPanorama.this;
                zzaGn = onstreetviewpanoramaclicklistener;
                super();
            }
        });
        return;
    }

    public final void setOnStreetViewPanoramaLongClickListener(OnStreetViewPanoramaLongClickListener onstreetviewpanoramalongclicklistener)
    {
        if (onstreetviewpanoramalongclicklistener == null)
        {
            try
            {
                zzaGj.setOnStreetViewPanoramaLongClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaLongClickListener onstreetviewpanoramalongclicklistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramalongclicklistener);
            }
        }
        zzaGj.setOnStreetViewPanoramaLongClickListener(new com.google.android.gms.maps.internal.zzu.zza(onstreetviewpanoramalongclicklistener) {

            final StreetViewPanorama zzaGl;
            final OnStreetViewPanoramaLongClickListener zzaGo;

            public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            {
                zzaGo.onStreetViewPanoramaLongClick(streetviewpanoramaorientation);
            }

            
            {
                zzaGl = StreetViewPanorama.this;
                zzaGo = onstreetviewpanoramalongclicklistener;
                super();
            }
        });
        return;
    }

    public void setPanningGesturesEnabled(boolean flag)
    {
        try
        {
            zzaGj.enablePanning(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setPosition(LatLng latlng)
    {
        try
        {
            zzaGj.setPosition(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setPosition(LatLng latlng, int i)
    {
        try
        {
            zzaGj.setPositionWithRadius(latlng, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setPosition(String s)
    {
        try
        {
            zzaGj.setPositionWithID(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void setStreetNamesEnabled(boolean flag)
    {
        try
        {
            zzaGj.enableStreetNames(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setUserNavigationEnabled(boolean flag)
    {
        try
        {
            zzaGj.enableUserNavigation(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZoomGesturesEnabled(boolean flag)
    {
        try
        {
            zzaGj.enableZoom(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    IStreetViewPanoramaDelegate zzwR()
    {
        return zzaGj;
    }
}
