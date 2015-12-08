// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.internal.zzlm;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics

private class zzKX extends zzd
    implements ics.zza
{

    final Tracker zzKU;
    private boolean zzKV;
    private int zzKW;
    private long zzKX;
    private boolean zzKY;
    private long zzKZ;

    private void zzhF()
    {
        if (zzKX >= 0L || zzKV)
        {
            zzhu().zza(Tracker.zza(zzKU));
            return;
        } else
        {
            zzhu().zzb(Tracker.zza(zzKU));
            return;
        }
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        zzKV = flag;
        zzhF();
    }

    public void setSessionTimeout(long l)
    {
        zzKX = l;
        zzhF();
    }

    protected void zzhB()
    {
    }

    public boolean zzhE()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = zzKY;
        zzKY = false;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    boolean zzhG()
    {
        return zzid().elapsedRealtime() >= zzKZ + Math.max(1000L, zzKX);
    }

    public void zzo(Activity activity)
    {
        if (zzKW == 0 && zzhG())
        {
            zzKY = true;
        }
        zzKW = zzKW + 1;
        if (zzKV)
        {
            Object obj = activity.getIntent();
            if (obj != null)
            {
                zzKU.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
            }
            HashMap hashmap = new HashMap();
            hashmap.put("&t", "screenview");
            Tracker tracker = zzKU;
            if (Tracker.zzk(zzKU) != null)
            {
                obj = Tracker.zzk(zzKU).zzr(activity);
            } else
            {
                obj = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", ((String) (obj)));
            if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
            {
                activity = Tracker.zzq(activity);
                if (!TextUtils.isEmpty(activity))
                {
                    hashmap.put("&dr", activity);
                }
            }
            zzKU.send(hashmap);
        }
    }

    public void zzp(Activity activity)
    {
        zzKW = zzKW - 1;
        zzKW = Math.max(0, zzKW);
        if (zzKW == 0)
        {
            zzKZ = zzid().elapsedRealtime();
        }
    }

    protected (Tracker tracker, zzf zzf)
    {
        zzKU = tracker;
        super(zzf);
        zzKX = -1L;
    }
}
