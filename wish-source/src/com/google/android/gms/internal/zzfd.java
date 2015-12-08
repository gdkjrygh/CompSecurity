// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

public class zzfd
{

    final String zzBL;
    long zzBX;
    long zzBY;
    int zzBZ;
    int zzCa;
    int zzCb;
    private final Object zzoe = new Object();

    public zzfd(String s)
    {
        zzBX = -1L;
        zzBY = -1L;
        zzBZ = -1;
        zzCa = 0;
        zzCb = 0;
        zzBL = s;
    }

    public static boolean zzt(Context context)
    {
        ComponentName componentname;
        int i;
        i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (i == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzal("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzal("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Fail to fetch AdActivity theme");
            com.google.android.gms.ads.internal.util.client.zzb.zzal("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public void zzb(AdRequestParcel adrequestparcel, long l)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzBY != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzBY = l;
        zzBX = zzBY;
_L2:
        if (adrequestparcel.extras == null || adrequestparcel.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        zzBX = l;
        if (true) goto _L2; else goto _L1
_L1:
        adrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adrequestparcel;
        zzBZ = zzBZ + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public Bundle zzd(Context context, String s)
    {
        Bundle bundle;
        synchronized (zzoe)
        {
            bundle = new Bundle();
            bundle.putString("session_id", zzBL);
            bundle.putLong("basets", zzBY);
            bundle.putLong("currts", zzBX);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", zzBZ);
            bundle.putInt("pclick", zzCa);
            bundle.putInt("pimp", zzCb);
            bundle.putBoolean("support_transparent_background", zzt(context));
        }
        return bundle;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zzeD()
    {
        synchronized (zzoe)
        {
            zzCb = zzCb + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzeE()
    {
        synchronized (zzoe)
        {
            zzCa = zzCa + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long zzeU()
    {
        return zzBY;
    }
}
