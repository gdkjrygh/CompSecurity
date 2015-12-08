// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzoq, zzoj

public final class zzot
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final zzoj zzaIR;
    private final Map zzaIS = new HashMap();

    public zzot(zzoj zzoj1)
    {
        zzx.zzv(zzoj1);
        zzaIR = zzoj1;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        if (bundle != null)
        {
            if ((bundle = bundle.getBundle("com.google.android.gms.measurement.screen_view")) != null)
            {
                int i = bundle.getInt("id");
                if (i <= 0)
                {
                    Log.w("com.google.android.gms.measurement.internal.ActivityLifecycleTracker", "Invalid screenId in saved activity state");
                    return;
                } else
                {
                    activity = zza(activity, i);
                    activity.setScreenName(bundle.getString("name"));
                    activity.zzhT(bundle.getInt("referrer_id"));
                    activity.zzdU(bundle.getString("referrer_name"));
                    activity.zzam(bundle.getBoolean("interstitial"));
                    activity.zzxX();
                    return;
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity)
    {
        zzaIS.remove(activity);
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        if (bundle != null)
        {
            if ((activity = (zzoq)zzaIS.get(activity)) != null)
            {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("id", activity.zzbp());
                bundle1.putString("name", activity.zzxT());
                bundle1.putInt("referrer_id", activity.zzxU());
                bundle1.putString("referrer_name", activity.zzxV());
                bundle1.putBoolean("interstitial", activity.zzxY());
                bundle.putBundle("com.google.android.gms.measurement.screen_view", bundle1);
                return;
            }
        }
    }

    public void onActivityStarted(Activity activity)
    {
        zzoq zzoq1 = zza(activity, 0);
        zzaIR.zzb(zzoq1, activity);
    }

    public void onActivityStopped(Activity activity)
    {
    }

    zzoq zza(Activity activity, int i)
    {
        zzx.zzv(activity);
        zzoq zzoq2 = (zzoq)zzaIS.get(activity);
        zzoq zzoq1 = zzoq2;
        if (zzoq2 == null)
        {
            if (i == 0)
            {
                zzoq1 = new zzoq(true);
            } else
            {
                zzoq1 = new zzoq(true, i);
            }
            zzoq1.setScreenName(activity.getClass().getCanonicalName());
            zzaIS.put(activity, zzoq1);
        }
        return zzoq1;
    }
}
