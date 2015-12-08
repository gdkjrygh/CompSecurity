// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesUtil

public class GoogleApiAvailability
{

    private static final GoogleApiAvailability zzOL = new GoogleApiAvailability();

    GoogleApiAvailability()
    {
    }

    public static GoogleApiAvailability getInstance()
    {
        return zzOL;
    }

    public int isGooglePlayServicesAvailable(Context context)
    {
        int j = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        int i = j;
        if (GooglePlayServicesUtil.zze(context, j))
        {
            i = 18;
        }
        return i;
    }

}
