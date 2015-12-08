// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.zzhu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzx, SearchAdRequestParcel, AdRequestParcel

public class zzg
{

    public static final zzg zzsF = new zzg();

    protected zzg()
    {
    }

    public static zzg zzcA()
    {
        return zzsF;
    }

    public AdRequestParcel zza(Context context, zzx zzx1)
    {
        Object obj = zzx1.getBirthday();
        Object obj1;
        Object obj2;
        String s;
        android.location.Location location;
        android.os.Bundle bundle;
        String s1;
        Context context1;
        int i;
        int j;
        long l;
        boolean flag;
        boolean flag1;
        if (obj != null)
        {
            l = ((Date) (obj)).getTime();
        } else
        {
            l = -1L;
        }
        s = zzx1.getContentUrl();
        i = zzx1.getGender();
        obj = zzx1.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = zzx1.isTestDevice(context);
        j = zzx1.zzcP();
        location = zzx1.getLocation();
        bundle = zzx1.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        flag1 = zzx1.getManualImpressionsEnabled();
        s1 = zzx1.getPublisherProvidedId();
        obj1 = zzx1.zzcM();
        if (obj1 != null)
        {
            obj1 = new SearchAdRequestParcel(((com.google.android.gms.ads.search.SearchAdRequest) (obj1)));
        } else
        {
            obj1 = null;
        }
        obj2 = null;
        context1 = context.getApplicationContext();
        context = obj2;
        if (context1 != null)
        {
            context = context1.getPackageName();
            context = zzp.zzbx().zza(Thread.currentThread().getStackTrace(), context);
        }
        return new AdRequestParcel(6, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, ((SearchAdRequestParcel) (obj1)), location, s, zzx1.zzcO(), zzx1.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzx1.zzcQ())), zzx1.zzcL(), context);
    }

    public RewardedVideoAdRequestParcel zza(Context context, zzx zzx1, String s)
    {
        return new RewardedVideoAdRequestParcel(zza(context, zzx1), s);
    }

}
