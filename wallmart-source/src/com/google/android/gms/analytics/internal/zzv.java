// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlm;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzr, zzf

public class zzv extends zzd
{

    private boolean zzMV;
    private boolean zzMW;
    private AlarmManager zzMX;

    protected zzv(zzf zzf)
    {
        super(zzf);
        zzMX = (AlarmManager)getContext().getSystemService("alarm");
    }

    private PendingIntent zzjW()
    {
        Intent intent = new Intent(getContext(), com/google/android/gms/analytics/AnalyticsReceiver);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(getContext(), 0, intent, 0);
    }

    public void cancel()
    {
        zzio();
        zzMW = false;
        zzMX.cancel(zzjW());
    }

    public boolean zzbr()
    {
        return zzMW;
    }

    protected void zzhB()
    {
        ActivityInfo activityinfo;
        try
        {
            zzMX.cancel(zzjW());
            if (zzif().zzjt() <= 0L)
            {
                break MISSING_BLOCK_LABEL_70;
            }
            activityinfo = getContext().getPackageManager().getReceiverInfo(new ComponentName(getContext(), com/google/android/gms/analytics/AnalyticsReceiver), 2);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return;
        }
        if (activityinfo == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (activityinfo.enabled)
        {
            zzaY("Receiver registered. Using alarm for local dispatch.");
            zzMV = true;
        }
    }

    public boolean zzjU()
    {
        return zzMV;
    }

    public void zzjV()
    {
        zzio();
        zzx.zza(zzjU(), "Receiver not registered");
        long l = zzif().zzjt();
        if (l > 0L)
        {
            cancel();
            long l1 = zzid().elapsedRealtime();
            zzMW = true;
            zzMX.setInexactRepeating(2, l1 + l, 0L, zzjW());
        }
    }
}
