// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, BitmapDescriptor, LatLngBounds, LatLng

public final class GroundOverlay
{

    private final zzf zzaDc;

    public GroundOverlay(zzf zzf1)
    {
        zzaDc = (zzf)zzu.zzu(zzf1);
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
            flag = zzaDc.zza(((GroundOverlay)obj).zzaDc);
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
            f = zzaDc.getBearing();
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
            latlngbounds = zzaDc.getBounds();
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
            f = zzaDc.getHeight();
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
            s = zzaDc.getId();
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
            latlng = zzaDc.getPosition();
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
            f = zzaDc.getTransparency();
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
            f = zzaDc.getWidth();
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
            f = zzaDc.getZIndex();
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
            i = zzaDc.hashCodeRemote();
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
            flag = zzaDc.isVisible();
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
            zzaDc.remove();
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
            zzaDc.setBearing(f);
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
            zzaDc.setDimensions(f);
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
            zzaDc.zza(f, f1);
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
            zzaDc.zzu(bitmapdescriptor.zzvg());
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
            zzaDc.setPosition(latlng);
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
            zzaDc.setPositionFromBounds(latlngbounds);
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
            zzaDc.setTransparency(f);
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
            zzaDc.setVisible(flag);
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
            zzaDc.setZIndex(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
