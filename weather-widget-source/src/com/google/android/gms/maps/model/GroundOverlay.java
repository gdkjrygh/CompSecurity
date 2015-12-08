// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zzc;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, BitmapDescriptor, LatLngBounds, LatLng

public final class GroundOverlay
{

    private final zzc zzaHb;

    public GroundOverlay(zzc zzc1)
    {
        zzaHb = (zzc)zzx.zzv(zzc1);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof GroundOverlay))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = zzaHb.zza(((GroundOverlay)obj).zzaHb);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public float getBearing()
    {
        float f;
        try
        {
            f = zzaHb.getBearing();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public LatLngBounds getBounds()
    {
        LatLngBounds latlngbounds;
        try
        {
            latlngbounds = zzaHb.getBounds();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return latlngbounds;
    }

    public float getHeight()
    {
        float f;
        try
        {
            f = zzaHb.getHeight();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public String getId()
    {
        String s;
        try
        {
            s = zzaHb.getId();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public LatLng getPosition()
    {
        LatLng latlng;
        try
        {
            latlng = zzaHb.getPosition();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return latlng;
    }

    public float getTransparency()
    {
        float f;
        try
        {
            f = zzaHb.getTransparency();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public float getWidth()
    {
        float f;
        try
        {
            f = zzaHb.getWidth();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public float getZIndex()
    {
        float f;
        try
        {
            f = zzaHb.getZIndex();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = zzaHb.hashCodeRemote();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public boolean isVisible()
    {
        boolean flag;
        try
        {
            flag = zzaHb.isVisible();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public void remove()
    {
        try
        {
            zzaHb.remove();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setBearing(float f)
    {
        try
        {
            zzaHb.setBearing(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setDimensions(float f)
    {
        try
        {
            zzaHb.setDimensions(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setDimensions(float f, float f1)
    {
        try
        {
            zzaHb.zza(f, f1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setImage(BitmapDescriptor bitmapdescriptor)
    {
        try
        {
            zzaHb.zzw(bitmapdescriptor.zzwB());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BitmapDescriptor bitmapdescriptor)
        {
            throw new RuntimeRemoteException(bitmapdescriptor);
        }
    }

    public void setPosition(LatLng latlng)
    {
        try
        {
            zzaHb.setPosition(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setPositionFromBounds(LatLngBounds latlngbounds)
    {
        try
        {
            zzaHb.setPositionFromBounds(latlngbounds);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLngBounds latlngbounds)
        {
            throw new RuntimeRemoteException(latlngbounds);
        }
    }

    public void setTransparency(float f)
    {
        try
        {
            zzaHb.setTransparency(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setVisible(boolean flag)
    {
        try
        {
            zzaHb.setVisible(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZIndex(float f)
    {
        try
        {
            zzaHb.setZIndex(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
