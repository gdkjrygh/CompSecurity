// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
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


    private final IStreetViewPanoramaDelegate zzaCj;

    protected StreetViewPanorama(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
    {
        zzaCj = (IStreetViewPanoramaDelegate)zzu.zzu(istreetviewpanoramadelegate);
    }

    public void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
    {
        try
        {
            zzaCj.animateTo(streetviewpanoramacamera, l);
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
            streetviewpanoramalocation = zzaCj.getStreetViewPanoramaLocation();
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
            streetviewpanoramacamera = zzaCj.getPanoramaCamera();
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
            flag = zzaCj.isPanningGesturesEnabled();
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
            flag = zzaCj.isStreetNamesEnabled();
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
            flag = zzaCj.isUserNavigationEnabled();
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
            flag = zzaCj.isZoomGesturesEnabled();
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
            streetviewpanoramaorientation = zzaCj.orientationToPoint(streetviewpanoramaorientation);
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
        streetviewpanoramaorientation = (Point)zze.zzn(streetviewpanoramaorientation);
        return streetviewpanoramaorientation;
    }

    public StreetViewPanoramaOrientation pointToOrientation(Point point)
    {
        try
        {
            point = zzaCj.pointToOrientation(zze.zzw(point));
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
                zzaCj.setOnStreetViewPanoramaCameraChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramacamerachangelistener);
            }
        }
        zzaCj.setOnStreetViewPanoramaCameraChangeListener(new com.google.android.gms.maps.internal.zzr.zza(onstreetviewpanoramacamerachangelistener) {

            final StreetViewPanorama zzaCl;
            final OnStreetViewPanoramaCameraChangeListener zzaCm;

            public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera)
            {
                zzaCm.onStreetViewPanoramaCameraChange(streetviewpanoramacamera);
            }

            
            {
                zzaCl = StreetViewPanorama.this;
                zzaCm = onstreetviewpanoramacamerachangelistener;
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
                zzaCj.setOnStreetViewPanoramaChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramachangelistener);
            }
        }
        zzaCj.setOnStreetViewPanoramaChangeListener(new com.google.android.gms.maps.internal.zzs.zza(onstreetviewpanoramachangelistener) {

            final OnStreetViewPanoramaChangeListener zzaCk;
            final StreetViewPanorama zzaCl;

            public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation)
            {
                zzaCk.onStreetViewPanoramaChange(streetviewpanoramalocation);
            }

            
            {
                zzaCl = StreetViewPanorama.this;
                zzaCk = onstreetviewpanoramachangelistener;
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
                zzaCj.setOnStreetViewPanoramaClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramaclicklistener);
            }
        }
        zzaCj.setOnStreetViewPanoramaClickListener(new com.google.android.gms.maps.internal.zzt.zza(onstreetviewpanoramaclicklistener) {

            final StreetViewPanorama zzaCl;
            final OnStreetViewPanoramaClickListener zzaCn;

            public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            {
                zzaCn.onStreetViewPanoramaClick(streetviewpanoramaorientation);
            }

            
            {
                zzaCl = StreetViewPanorama.this;
                zzaCn = onstreetviewpanoramaclicklistener;
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
                zzaCj.setOnStreetViewPanoramaLongClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnStreetViewPanoramaLongClickListener onstreetviewpanoramalongclicklistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramalongclicklistener);
            }
        }
        zzaCj.setOnStreetViewPanoramaLongClickListener(new com.google.android.gms.maps.internal.zzu.zza(onstreetviewpanoramalongclicklistener) {

            final StreetViewPanorama zzaCl;
            final OnStreetViewPanoramaLongClickListener zzaCo;

            public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            {
                zzaCo.onStreetViewPanoramaLongClick(streetviewpanoramaorientation);
            }

            
            {
                zzaCl = StreetViewPanorama.this;
                zzaCo = onstreetviewpanoramalongclicklistener;
                super();
            }
        });
        return;
    }

    public void setPanningGesturesEnabled(boolean flag)
    {
        try
        {
            zzaCj.enablePanning(flag);
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
            zzaCj.setPosition(latlng);
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
            zzaCj.setPositionWithRadius(latlng, i);
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
            zzaCj.setPositionWithID(s);
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
            zzaCj.enableStreetNames(flag);
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
            zzaCj.enableUserNavigation(flag);
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
            zzaCj.enableZoom(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    IStreetViewPanoramaDelegate zzvw()
    {
        return zzaCj;
    }
}
