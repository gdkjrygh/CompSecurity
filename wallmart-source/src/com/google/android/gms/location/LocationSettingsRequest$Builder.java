// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsRequest, LocationRequest

public static final class zzaCf
{

    private boolean zzaCd;
    private boolean zzaCe;
    private boolean zzaCf;
    private final ArrayList zzaCg = new ArrayList();

    public zzaCf addAllLocationRequests(Collection collection)
    {
        zzaCg.addAll(collection);
        return this;
    }

    public zzaCg addLocationRequest(LocationRequest locationrequest)
    {
        zzaCg.add(locationrequest);
        return this;
    }

    public LocationSettingsRequest build()
    {
        return new LocationSettingsRequest(zzaCg, zzaCd, zzaCe, zzaCf, null);
    }

    public zzaCf setAlwaysShow(boolean flag)
    {
        zzaCd = flag;
        return this;
    }

    public zzaCd setNeedBle(boolean flag)
    {
        zzaCe = flag;
        return this;
    }

    public ()
    {
        zzaCd = false;
        zzaCe = false;
        zzaCf = false;
    }
}
