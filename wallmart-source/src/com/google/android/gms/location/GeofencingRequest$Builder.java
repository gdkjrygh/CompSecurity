// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest, Geofence

public static final class zzaBM
{

    private final List zzaBL = new ArrayList();
    private int zzaBM;

    public static int zzgD(int i)
    {
        return i & 7;
    }

    public zzaBM addGeofence(Geofence geofence)
    {
        zzx.zzb(geofence, "geofence can't be null.");
        zzx.zzb(geofence instanceof ParcelableGeofence, "Geofence must be created using Geofence.Builder.");
        zzaBL.add((ParcelableGeofence)geofence);
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
        if (!zzaBL.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "No geofence has been added to this request.");
        return new GeofencingRequest(zzaBL, zzaBM, null);
    }

    public zzaBM setInitialTrigger(int i)
    {
        zzaBM = zzgD(i);
        return this;
    }

    public e()
    {
        zzaBM = 5;
    }
}
