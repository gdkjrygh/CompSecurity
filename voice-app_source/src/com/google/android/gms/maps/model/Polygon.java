// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzj;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class Polygon
{

    private final zzj zzaDz;

    public Polygon(zzj zzj1)
    {
        zzaDz = (zzj)zzu.zzu(zzj1);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Polygon))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = zzaDz.zza(((Polygon)obj).zzaDz);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public int getFillColor()
    {
        int i;
        try
        {
            i = zzaDz.getFillColor();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public List getHoles()
    {
        List list;
        try
        {
            list = zzaDz.getHoles();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return list;
    }

    public String getId()
    {
        String s;
        try
        {
            s = zzaDz.getId();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public List getPoints()
    {
        List list;
        try
        {
            list = zzaDz.getPoints();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return list;
    }

    public int getStrokeColor()
    {
        int i;
        try
        {
            i = zzaDz.getStrokeColor();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public float getStrokeWidth()
    {
        float f;
        try
        {
            f = zzaDz.getStrokeWidth();
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
            f = zzaDz.getZIndex();
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
            i = zzaDz.hashCodeRemote();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public boolean isGeodesic()
    {
        boolean flag;
        try
        {
            flag = zzaDz.isGeodesic();
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
            flag = zzaDz.isVisible();
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
            zzaDz.remove();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setFillColor(int i)
    {
        try
        {
            zzaDz.setFillColor(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setGeodesic(boolean flag)
    {
        try
        {
            zzaDz.setGeodesic(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setHoles(List list)
    {
        try
        {
            zzaDz.setHoles(list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new RuntimeRemoteException(list);
        }
    }

    public void setPoints(List list)
    {
        try
        {
            zzaDz.setPoints(list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new RuntimeRemoteException(list);
        }
    }

    public void setStrokeColor(int i)
    {
        try
        {
            zzaDz.setStrokeColor(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setStrokeWidth(float f)
    {
        try
        {
            zzaDz.setStrokeWidth(f);
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
            zzaDz.setVisible(flag);
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
            zzaDz.setZIndex(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
