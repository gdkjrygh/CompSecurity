// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest, Geofence

public static final class zzaxK
{

    private final List zzaxJ = new ArrayList();
    private int zzaxK;

    public static int zzgr(int i)
    {
        return i & 7;
    }

    public zzaxK addGeofence(Geofence geofence)
    {
        zzu.zzb(geofence, "geofence can't be null.");
        zzu.zzb(geofence instanceof ParcelableGeofence, "Geofence must be created using Geofence.Builder.");
        zzaxJ.add((ParcelableGeofence)geofence);
        return this;
    }

    public e addGeofences(List list)
    {
        if (list != null && !list.isEmpty())
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Geofence geofence = (Geofence)list.next();
                if (geofence != null)
                {
                    addGeofence(geofence);
                }
            }
        }
        return this;
    }

    public GeofencingRequest build()
    {
        boolean flag;
        if (!zzaxJ.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "No geofence has been added to this request.");
        return new GeofencingRequest(zzaxJ, zzaxK, null);
    }

    public zzaxK setInitialTrigger(int i)
    {
        zzaxK = zzgr(i);
        return this;
    }

    public e()
    {
        zzaxK = 5;
    }
}
