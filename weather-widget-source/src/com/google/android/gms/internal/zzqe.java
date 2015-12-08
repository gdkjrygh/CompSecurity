// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.Container;

// Referenced classes of package com.google.android.gms.internal:
//            zzqf, zzoj, zzoq

class zzqe
{
    static class zza
        implements zzoj.zza
    {

        private final Tracker zzKq;

        public void zza(zzoq zzoq1)
        {
            zzKq.setScreenName(zzoq1.zzxT());
            com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder screenviewbuilder = new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder();
            screenviewbuilder.set("&a", String.valueOf(zzoq1.zzbp()));
            zzKq.send(screenviewbuilder.build());
        }

        public void zza(zzoq zzoq1, Activity activity)
        {
        }

        zza(Tracker tracker)
        {
            zzKq = tracker;
        }
    }


    private final Context mContext;
    private final zzqf zzpo;

    public zzqe(Context context, Container container, zzqf zzqf1)
    {
        mContext = context;
        zzpo = zza(container, zzqf1);
        zzBi();
    }

    private void zzBi()
    {
        if (zzpo.zzBk() && !TextUtils.isEmpty(zzpo.getTrackingId()))
        {
            Tracker tracker = zzfg(zzpo.getTrackingId());
            tracker.enableAdvertisingIdCollection(zzpo.zzBl());
            zzb(new zza(tracker));
        }
    }

    static zzqf zza(Container container, zzqf zzqf1)
    {
        if (container == null || container.isDefault())
        {
            return zzqf1;
        } else
        {
            zzqf1 = new zzqf.zza(zzqf1.zzBj());
            zzqf1.zzfh(container.getString("trackingId")).zzau(container.getBoolean("trackScreenViews")).zzav(container.getBoolean("collectAdIdentifiers"));
            return zzqf1.zzBm();
        }
    }

    public zzqf zzBh()
    {
        return zzpo;
    }

    void zzb(zzoj.zza zza1)
    {
        zzx.zzv(zza1);
        zzoj zzoj1 = zzoj.zzaJ(mContext);
        zzoj1.zzaj(true);
        zzoj1.zza(zza1);
    }

    Tracker zzfg(String s)
    {
        return GoogleAnalytics.getInstance(mContext).newTracker(s);
    }
}
