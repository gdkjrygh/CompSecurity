// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zzh;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class TileOverlay
{

    private final zzh zzaHG;

    public TileOverlay(zzh zzh1)
    {
        zzaHG = (zzh)zzx.zzv(zzh1);
    }

    public void clearTileCache()
    {
        try
        {
            zzaHG.clearTileCache();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof TileOverlay))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = zzaHG.zza(((TileOverlay)obj).zzaHG);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public boolean getFadeIn()
    {
        boolean flag;
        try
        {
            flag = zzaHG.getFadeIn();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public String getId()
    {
        String s;
        try
        {
            s = zzaHG.getId();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public float getZIndex()
    {
        float f;
        try
        {
            f = zzaHG.getZIndex();
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
            i = zzaHG.hashCodeRemote();
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
            flag = zzaHG.isVisible();
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
            zzaHG.remove();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setFadeIn(boolean flag)
    {
        try
        {
            zzaHG.setFadeIn(flag);
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
            zzaHG.setVisible(flag);
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
            zzaHG.setZIndex(f);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }
}
