// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

public final class LocationStatusCodes
{

    public static final int ERROR = 1;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
    public static final int SUCCESS = 0;

    private LocationStatusCodes()
    {
    }

    public static int zzgM(int i)
    {
        if (i >= 0 && i <= 1 || 1000 <= i && i <= 1002)
        {
            return i;
        } else
        {
            return 1;
        }
    }

    public static Status zzgN(int i)
    {
        i;
        JVM INSTR tableswitch 1 1: default 20
    //                   1 29;
           goto _L1 _L2
_L1:
        return new Status(i);
_L2:
        i = 13;
        if (true) goto _L1; else goto _L3
_L3:
    }
}
