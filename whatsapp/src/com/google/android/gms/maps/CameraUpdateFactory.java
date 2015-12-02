// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdate

public final class CameraUpdateFactory
{

    private static ICameraUpdateFactoryDelegate akl;

    public static void a(ICameraUpdateFactoryDelegate icameraupdatefactorydelegate)
    {
        akl = (ICameraUpdateFactoryDelegate)jx.i(icameraupdatefactorydelegate);
    }

    private static ICameraUpdateFactoryDelegate nB()
    {
        return (ICameraUpdateFactoryDelegate)jx.b(akl, "CameraUpdateFactory is not initialized");
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraposition)
    {
        try
        {
            cameraposition = new CameraUpdate(nB().newCameraPosition(cameraposition));
        }
        // Misplaced declaration of an exception variable
        catch (CameraPosition cameraposition)
        {
            throw new RuntimeRemoteException(cameraposition);
        }
        return cameraposition;
    }

    public static CameraUpdate newLatLng(LatLng latlng)
    {
        try
        {
            latlng = new CameraUpdate(nB().newLatLng(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latlngbounds, int i)
    {
        try
        {
            latlngbounds = new CameraUpdate(nB().newLatLngBounds(latlngbounds, i));
        }
        // Misplaced declaration of an exception variable
        catch (LatLngBounds latlngbounds)
        {
            throw new RuntimeRemoteException(latlngbounds);
        }
        return latlngbounds;
    }

    public static CameraUpdate zoomBy(float f)
    {
        CameraUpdate cameraupdate;
        try
        {
            cameraupdate = new CameraUpdate(nB().zoomBy(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraupdate;
    }

    public static CameraUpdate zoomTo(float f)
    {
        CameraUpdate cameraupdate;
        try
        {
            cameraupdate = new CameraUpdate(nB().zoomTo(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraupdate;
    }
}
