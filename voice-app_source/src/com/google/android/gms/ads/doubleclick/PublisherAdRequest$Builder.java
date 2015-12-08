// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.internal.zzu;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.ads.internal.client. zznL = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. zza( )
    {
        return .zznL;
    }

    public zznL addCategoryExclusion(String s)
    {
        zznL.(s);
        return this;
    }

    public zznL addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        zznL.(class1, bundle);
        return this;
    }

    public zznL addCustomTargeting(String s, String s1)
    {
        zznL.(s, s1);
        return this;
    }

    public zznL addCustomTargeting(String s, List list)
    {
        if (list != null)
        {
            zznL.(s, zzs.zzci(",").zza(list));
        }
        return this;
    }

    public zznL addKeyword(String s)
    {
        zznL.(s);
        return this;
    }

    public zznL addNetworkExtras(NetworkExtras networkextras)
    {
        zznL.(networkextras);
        return this;
    }

    public zznL addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zznL.(class1, bundle);
        return this;
    }

    public zznL addTestDevice(String s)
    {
        zznL.(s);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public zznL setBirthday(Date date)
    {
        zznL.(date);
        return this;
    }

    public zznL setContentUrl(String s)
    {
        zzu.zzb(s, "Content URL must be non-null.");
        zzu.zzh(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        zznL.(s);
        return this;
    }

    public zznL setGender(int i)
    {
        zznL.(i);
        return this;
    }

    public zznL setLocation(Location location)
    {
        zznL.(location);
        return this;
    }

    public zznL setManualImpressionsEnabled(boolean flag)
    {
        zznL.(flag);
        return this;
    }

    public zznL setPublisherProvidedId(String s)
    {
        zznL.(s);
        return this;
    }

    public zznL setRequestAgent(String s)
    {
        zznL.(s);
        return this;
    }

    public zznL tagForChildDirectedTreatment(boolean flag)
    {
        zznL.(flag);
        return this;
    }

    public ()
    {
    }
}
