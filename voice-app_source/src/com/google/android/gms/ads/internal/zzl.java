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
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zznw;
import com.google.android.gms.internal.zzod;
import com.google.android.gms.internal.zzpv;
import com.google.android.gms.internal.zzpw;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzo

public class zzl extends com.google.android.gms.ads.internal.client.zzv.zza
    implements com.google.android.gms.internal.zznw.zza, com.google.android.gms.internal.zzpw.zza
{

    private static final Object zzoW = new Object();
    private static zzl zzoX;
    private final Context mContext;
    zzpv zzoY;
    String zzoZ;
    String zzpa;
    private boolean zzpb;
    private boolean zzpc;

    zzl(Context context)
    {
        mContext = context;
        zzpb = false;
    }

    public static zzl zzq(Context context)
    {
        synchronized (zzoW)
        {
            if (zzoX == null)
            {
                zzoX = new zzl(context.getApplicationContext());
            }
            context = zzoX;
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
            synchronized (zzoW)
            {
                if (zzpc)
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

    public void zza(zzod zzod1)
    {
    }

    public void zza(zzod zzod1, Activity activity)
    {
        if (zzod1 != null && activity != null)
        {
            if (activity instanceof AdActivity)
            {
                int i = zzo.zzbv().zzk(activity);
                if (i == 1)
                {
                    zzod1.zzai(true);
                    zzod1.setScreenName("Interstitial Ad");
                    return;
                }
                if (i == 2 || i == 3)
                {
                    zzod1.setScreenName("Expanded Ad");
                    return;
                } else
                {
                    zzod1.setScreenName(null);
                    return;
                }
            }
            if (activity instanceof InAppPurchaseActivity)
            {
                zzod1.setScreenName(null);
                return;
            }
        }
    }

    public void zza(String s, MobileAdsSettingsParcel mobileadssettingsparcel)
    {
label0:
        {
            synchronized (zzoW)
            {
                if (!zzpb)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Mobile ads is initialized already.");
            }
            return;
        }
        if (mContext != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to initialize mobile ads because context is null.");
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
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to initialize mobile ads because ApplicationCode is empty.");
        obj;
        JVM INSTR monitorexit ;
        return;
        zzpb = true;
        zzb(s, mobileadssettingsparcel);
        obj;
        JVM INSTR monitorexit ;
    }

    void zzb(String s, MobileAdsSettingsParcel mobileadssettingsparcel)
    {
label0:
        {
            if (mobileadssettingsparcel != null && mobileadssettingsparcel.zztf)
            {
                if (zzo.zzbv().zza(mContext.getPackageManager(), mContext.getPackageName(), "android.permission.INTERNET"))
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzaz("Missing permission android.permission.INTERNET");
            }
            return;
        }
        if (!zzo.zzbv().zza(mContext.getPackageManager(), mContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaz("Missing permission android.permission.ACCESS_NETWORK_STATE");
            return;
        }
        if (!Pattern.matches("ca-app-[a-z0-9_-]+~[a-z0-9_-]+", s))
        {
            throw new IllegalArgumentException("Please provide a valid application code");
        }
        zzpc = true;
        zzoZ = s;
        zzpa = mobileadssettingsparcel.zztg;
        s = zzpw.zzaK(mContext);
        mobileadssettingsparcel = new com.google.android.gms.internal.zzpv.zza(zzoZ);
        if (!TextUtils.isEmpty(zzpa))
        {
            mobileadssettingsparcel.zzeS(zzpa);
        }
        s.zza(mobileadssettingsparcel.zzzW());
        s.zza(this);
        zznw.zzaC(mContext).zza(this);
        s.start();
    }

    public boolean zzbl()
    {
        boolean flag;
        synchronized (zzoW)
        {
            flag = zzpc;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbm()
    {
        zzoY = zzpw.zzaK(mContext).zzzX();
    }

    public int zzbn()
    {
label0:
        {
            synchronized (zzoW)
            {
                if (zzpc)
                {
                    break label0;
                }
            }
            return -1;
        }
        zzod zzod1 = zznw.zzaC(mContext).zzwe();
        if (zzod1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        int i = zzod1.zzbn();
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
