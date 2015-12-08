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
import com.google.android.gms.internal.zzlb;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics

private class zzIX extends zzd
    implements ics.zza
{

    final Tracker zzIU;
    private boolean zzIV;
    private int zzIW;
    private long zzIX;
    private boolean zzIY;
    private long zzIZ;

    private void zzhr()
    {
        if (zzIX >= 0L || zzIV)
        {
            zzhg().zza(Tracker.zza(zzIU));
            return;
        } else
        {
            zzhg().zzb(Tracker.zza(zzIU));
            return;
        }
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        zzIV = flag;
        zzhr();
    }

    public void setSessionTimeout(long l)
    {
        zzIX = l;
        zzhr();
    }

    protected void zzhn()
    {
    }

    public boolean zzhq()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = zzIY;
        zzIY = false;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    boolean zzhs()
    {
        return zzhP().elapsedRealtime() >= zzIZ + Math.max(1000L, zzIX);
    }

    public void zzn(Activity activity)
    {
        if (zzIW == 0 && zzhs())
        {
            zzIY = true;
        }
        zzIW = zzIW + 1;
        if (zzIV)
        {
            Object obj = activity.getIntent();
            if (obj != null)
            {
                zzIU.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
            }
            HashMap hashmap = new HashMap();
            hashmap.put("&t", "screenview");
            Tracker tracker = zzIU;
            if (Tracker.zzk(zzIU) != null)
            {
                obj = Tracker.zzk(zzIU).zzq(activity);
            } else
            {
                obj = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", ((String) (obj)));
            if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
            {
                activity = Tracker.zzp(activity);
                if (!TextUtils.isEmpty(activity))
                {
                    hashmap.put("&dr", activity);
                }
            }
            zzIU.send(hashmap);
        }
    }

    public void zzo(Activity activity)
    {
        zzIW = zzIW - 1;
        zzIW = Math.max(0, zzIW);
        if (zzIW == 0)
        {
            zzIZ = zzhP().elapsedRealtime();
        }
    }

    protected (Tracker tracker, zzf zzf)
    {
        zzIU = tracker;
        super(zzf);
        zzIX = -1L;
    }
}
