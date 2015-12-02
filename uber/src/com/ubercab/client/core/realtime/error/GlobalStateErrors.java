// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.realtime.error;

import gke;
import java.util.List;

public final class GlobalStateErrors
{

    private GlobalStateErrors()
    {
    }

    public static List get()
    {
        return gke.a("rtapi.riders.account_banned", "rtapi.device.force_upgrade", "rtapi.unauthorized");
    }
}
