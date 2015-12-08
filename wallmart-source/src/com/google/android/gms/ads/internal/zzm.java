// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.MobileAdsSettingsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzoq;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzqg;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp

public class zzm extends com.google.android.gms.ads.internal.client.zzv.zza
    implements com.google.android.gms.internal.zzoj.zza, com.google.android.gms.internal.zzqg.zza
{

    private static final Object zzpm = new Object();
    private static zzm zzpn;
    private final Context mContext;
    zzqf zzpo;
    String zzpp;
    String zzpq;
    private boolean zzpr;
    private boolean zzps;

    zzm(Context context)
    {
        mContext = context;
        zzpr = false;
    }

    public static zzm zzq(Context context)
    {
        synchronized (zzpm)
        {
            if (zzpn == null)
            {
                zzpn = new zzm(context.getApplicationContext());
            }
            context = zzpn;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public String getClientId()
    {
label0:
        {
            synchronized (zzpm)
            {
                if (zzps)
                {
                    break label0;
                }
            }
            return null;
        }
        String s = GoogleAnalytics.getInstance(mContext).getClientId();
        obj;
        JVM INSTR monitorexit ;
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzoq zzoq1)
    {
    }

    public void zza(zzoq zzoq1, Activity activity)
    {
        if (zzoq1 != null && activity != null)
        {
            if (activity instanceof AdActivity)
            {
                int i = zzp.zzbx().zzk(activity);
                if (i == 1)
                {
                    zzoq1.zzam(true);
                    zzoq1.setScreenName("Interstitial Ad");
                    return;
                }
                if (i == 2 || i == 3)
                {
                    zzoq1.setScreenName("Expanded Ad");
                    return;
                } else
                {
                    zzoq1.setScreenName(null);
                    return;
                }
            }
            if (activity instanceof InAppPurchaseActivity)
            {
                zzoq1.setScreenName(null);
                return;
            }
        }
    }

    public void zza(String s, MobileAdsSettingsParcel mobileadssettingsparcel)
    {
label0:
        {
            synchronized (zzpm)
            {
                if (!zzpr)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Mobile ads is initialized already.");
            }
            return;
        }
        if (mContext != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to initialize mobile ads because context is null.");
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to initialize mobile ads because ApplicationCode is empty.");
        obj;
        JVM INSTR monitorexit ;
        return;
        zzpr = true;
        zzb(s, mobileadssettingsparcel);
        obj;
        JVM INSTR monitorexit ;
    }

    void zzb(String s, MobileAdsSettingsParcel mobileadssettingsparcel)
    {
label0:
        {
            if (mobileadssettingsparcel != null && mobileadssettingsparcel.zzty)
            {
                if (zzp.zzbx().zza(mContext.getPackageManager(), mContext.getPackageName(), "android.permission.INTERNET"))
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.e("Missing permission android.permission.INTERNET");
            }
            return;
        }
        if (!zzp.zzbx().zza(mContext.getPackageManager(), mContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
        {
            com.google.android.gms.ads.internal.util.client.zzb.e("Missing permission android.permission.ACCESS_NETWORK_STATE");
            return;
        }
        if (!Pattern.matches("ca-app-[a-z0-9_-]+~[a-z0-9_-]+", s))
        {
            throw new IllegalArgumentException("Please provide a valid application code");
        }
        zzps = true;
        zzpp = s;
        zzpq = mobileadssettingsparcel.zztz;
        s = zzqg.zzaR(mContext);
        mobileadssettingsparcel = new com.google.android.gms.internal.zzqf.zza(zzpp);
        if (!TextUtils.isEmpty(zzpq))
        {
            mobileadssettingsparcel.zzfh(zzpq);
        }
        s.zza(mobileadssettingsparcel.zzBm());
        s.zza(this);
        zzoj.zzaJ(mContext).zza(this);
        s.start();
    }

    public boolean zzbn()
    {
        boolean flag;
        synchronized (zzpm)
        {
            flag = zzps;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbo()
    {
        zzpo = zzqg.zzaR(mContext).zzBn();
    }

    public int zzbp()
    {
label0:
        {
            synchronized (zzpm)
            {
                if (zzps)
                {
                    break label0;
                }
            }
            return -1;
        }
        zzoq zzoq1 = zzoj.zzaJ(mContext).zzxw();
        if (zzoq1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        int i = zzoq1.zzbp();
        obj;
        JVM INSTR monitorexit ;
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        return -1;
    }

}
