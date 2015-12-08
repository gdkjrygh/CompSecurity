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

public class zzhm
{

    final String zzGY;
    long zzHl;
    long zzHm;
    int zzHn;
    int zzHo;
    int zzHp;
    private final Object zzpc = new Object();

    public zzhm(String s)
    {
        zzHl = -1L;
        zzHm = -1L;
        zzHn = -1;
        zzHo = 0;
        zzHp = 0;
        zzGY = s;
    }

    public static boolean zzG(Context context)
    {
        ComponentName componentname;
        int i;
        i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (i == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaD("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaD("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to fetch AdActivity theme");
            com.google.android.gms.ads.internal.util.client.zzb.zzaD("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public void zzb(AdRequestParcel adrequestparcel, long l)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzHm != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzHm = l;
        zzHl = zzHm;
_L2:
        if (adrequestparcel.extras == null || adrequestparcel.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        zzHl = l;
        if (true) goto _L2; else goto _L1
_L1:
        adrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adrequestparcel;
        zzHn = zzHn + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public Bundle zze(Context context, String s)
    {
        Bundle bundle;
        synchronized (zzpc)
        {
            bundle = new Bundle();
            bundle.putString("session_id", zzGY);
            bundle.putLong("basets", zzHm);
            bundle.putLong("currts", zzHl);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", zzHn);
            bundle.putInt("pclick", zzHo);
            bundle.putInt("pimp", zzHp);
            bundle.putBoolean("support_transparent_background", zzG(context));
        }
        return bundle;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zzfT()
    {
        synchronized (zzpc)
        {
            zzHp = zzHp + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzfU()
    {
        synchronized (zzpc)
        {
            zzHo = zzHo + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long zzgl()
    {
        return zzHm;
    }
}
