// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzt, SearchAdRequestParcel, AdRequestParcel

public class zzf
{

    public static final zzf zzpW = new zzf();

    protected zzf()
    {
    }

    public static zzf zzbG()
    {
        return zzpW;
    }

    public AdRequestParcel zza(Context context, zzt zzt1)
    {
        Object obj = zzt1.getBirthday();
        String s;
        android.location.Location location;
        android.os.Bundle bundle;
        String s1;
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
        s = zzt1.getContentUrl();
        i = zzt1.getGender();
        obj = zzt1.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = zzt1.isTestDevice(context);
        j = zzt1.zzbR();
        location = zzt1.getLocation();
        bundle = zzt1.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        flag1 = zzt1.getManualImpressionsEnabled();
        s1 = zzt1.getPublisherProvidedId();
        context = zzt1.zzbO();
        if (context != null)
        {
            context = new SearchAdRequestParcel(context);
        } else
        {
            context = null;
        }
        return new AdRequestParcel(5, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, context, location, s, zzt1.zzbQ(), zzt1.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzt1.zzbS())), zzt1.zzbN());
    }

}
