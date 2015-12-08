// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, BitmapDescriptor, LatLng

public final class Marker
{

    private final zzf zzaHq;

    public Marker(zzf zzf1)
    {
        zzaHq = (zzf)zzx.zzv(zzf1);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Marker))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = zzaHq.zzh(((Marker)obj).zzaHq);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public float getAlpha()
    {
        float f;
        try
        {
            f = zzaHq.getAlpha();
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
            s = zzaHq.getId();
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
            latlng = zzaHq.getPosition();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return latlng;
    }

    public float getRotation()
    {
        float f;
        try
        {
            f = zzaHq.getRotation();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public String getSnippet()
    {
        String s;
        try
        {
            s = zzaHq.getSnippet();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public String getTitle()
    {
        String s;
        try
        {
            s = zzaHq.getTitle();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = zzaHq.hashCodeRemote();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public void hideInfoWindow()
    {
        try
        {
            zzaHq.hideInfoWindow();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public boolean isDraggable()
    {
        boolean flag;
        try
        {
            flag = zzaHq.isDraggable();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isFlat()
    {
        boolean flag;
        try
        {
            flag = zzaHq.isFlat();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isInfoWindowShown()
    {
        boolean flag;
        try
        {
            flag = zzaHq.isInfoWindowShown();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isVisible()
    {
        boolean flag;
        try
        {
            flag = zzaHq.isVisible();
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
            zzaHq.remove();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setAlpha(float f)
    {
        try
        {
            zzaHq.setAlpha(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setAnchor(float f, float f1)
    {
        try
        {
            zzaHq.setAnchor(f, f1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setDraggable(boolean flag)
    {
        try
        {
            zzaHq.setDraggable(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setFlat(boolean flag)
    {
        try
        {
            zzaHq.setFlat(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setIcon(BitmapDescriptor bitmapdescriptor)
    {
        try
        {
            zzaHq.zzx(bitmapdescriptor.zzwB());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BitmapDescriptor bitmapdescriptor)
        {
            throw new RuntimeRemoteException(bitmapdescriptor);
        }
    }

    public void setInfoWindowAnchor(float f, float f1)
    {
        try
        {
            zzaHq.setInfoWindowAnchor(f, f1);
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
            zzaHq.setPosition(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setRotation(float f)
    {
        try
        {
            zzaHq.setRotation(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setSnippet(String s)
    {
        try
        {
            zzaHq.setSnippet(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void setTitle(String s)
    {
        try
        {
            zzaHq.setTitle(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void setVisible(boolean flag)
    {
        try
        {
            zzaHq.setVisible(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void showInfoWindow()
    {
        try
        {
            zzaHq.showInfoWindow();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
