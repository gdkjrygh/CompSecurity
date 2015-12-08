// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsRequest, LocationRequest

public static final class zzayd
{

    private boolean zzayb;
    private boolean zzayc;
    private boolean zzayd;
    private final ArrayList zzaye = new ArrayList();

    public zzayd addAllLocationRequests(Collection collection)
    {
        zzaye.addAll(collection);
        return this;
    }

    public zzaye addLocationRequest(LocationRequest locationrequest)
    {
        zzaye.add(locationrequest);
        return this;
    }

    public LocationSettingsRequest build()
    {
        return new LocationSettingsRequest(zzaye, zzayb, zzayc, zzayd, null);
    }

    public zzayd setAlwaysShow(boolean flag)
    {
        zzayb = flag;
        return this;
    }

    public zzayb setNeedBle(boolean flag)
    {
        zzayc = flag;
        return this;
    }

    public ()
    {
        zzayb = false;
        zzayc = false;
        zzayd = false;
    }
}
