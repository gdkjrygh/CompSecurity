// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzod, zznw

public final class zzog
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final zznw zzaEV;
    private final Map zzaEW = new HashMap();

    public zzog(zznw zznw1)
    {
        zzu.zzu(zznw1);
        zzaEV = zznw1;
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
                    activity.zzhL(bundle.getInt("referrer_id"));
                    activity.zzdJ(bundle.getString("referrer_name"));
                    activity.zzai(bundle.getBoolean("interstitial"));
                    activity.zzwF();
                    return;
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity)
    {
        zzaEW.remove(activity);
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
            if ((activity = (zzod)zzaEW.get(activity)) != null)
            {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("id", activity.zzbn());
                bundle1.putString("name", activity.zzwB());
                bundle1.putInt("referrer_id", activity.zzwC());
                bundle1.putString("referrer_name", activity.zzwD());
                bundle1.putBoolean("interstitial", activity.zzwG());
                bundle.putBundle("com.google.android.gms.measurement.screen_view", bundle1);
                return;
            }
        }
    }

    public void onActivityStarted(Activity activity)
    {
        zzod zzod1 = zza(activity, 0);
        zzaEV.zzb(zzod1, activity);
    }

    public void onActivityStopped(Activity activity)
    {
    }

    zzod zza(Activity activity, int i)
    {
        zzu.zzu(activity);
        zzod zzod2 = (zzod)zzaEW.get(activity);
        zzod zzod1 = zzod2;
        if (zzod2 == null)
        {
            if (i == 0)
            {
                zzod1 = new zzod(true);
            } else
            {
                zzod1 = new zzod(true, i);
            }
            zzod1.setScreenName(activity.getClass().getCanonicalName());
            zzaEW.put(activity, zzod1);
        }
        return zzod1;
    }
}
