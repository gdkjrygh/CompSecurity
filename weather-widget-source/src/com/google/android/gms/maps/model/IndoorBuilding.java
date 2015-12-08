// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, IndoorLevel

public final class IndoorBuilding
{

    private final zzd zzaHk;

    public IndoorBuilding(zzd zzd1)
    {
        zzaHk = (zzd)zzx.zzv(zzd1);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof IndoorBuilding))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = zzaHk.zzb(((IndoorBuilding)obj).zzaHk);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public int getActiveLevelIndex()
    {
        int i;
        try
        {
            i = zzaHk.getActiveLevelIndex();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public int getDefaultLevelIndex()
    {
        int i;
        try
        {
            i = zzaHk.getActiveLevelIndex();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public List getLevels()
    {
        Object obj;
        try
        {
            Object obj1 = zzaHk.getLevels();
            obj = new ArrayList(((List) (obj1)).size());
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new IndoorLevel(com.google.android.gms.maps.model.internal.zze.zza.zzcS((IBinder)((Iterator) (obj1)).next())))) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return ((List) (obj));
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = zzaHk.hashCodeRemote();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public boolean isUnderground()
    {
        boolean flag;
        try
        {
            flag = zzaHk.isUnderground();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }
}
