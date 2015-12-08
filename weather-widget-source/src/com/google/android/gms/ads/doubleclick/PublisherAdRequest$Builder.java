// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.internal.zzx;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.ads.internal.client. zznO = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. zza( )
    {
        return .zznO;
    }

    public zznO addCategoryExclusion(String s)
    {
        zznO.(s);
        return this;
    }

    public zznO addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        zznO.(class1, bundle);
        return this;
    }

    public zznO addCustomTargeting(String s, String s1)
    {
        zznO.(s, s1);
        return this;
    }

    public zznO addCustomTargeting(String s, List list)
    {
        if (list != null)
        {
            zznO.(s, zzv.zzcr(",").zza(list));
        }
        return this;
    }

    public zznO addKeyword(String s)
    {
        zznO.(s);
        return this;
    }

    public zznO addNetworkExtras(NetworkExtras networkextras)
    {
        zznO.(networkextras);
        return this;
    }

    public zznO addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zznO.(class1, bundle);
        return this;
    }

    public zznO addTestDevice(String s)
    {
        zznO.(s);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public zznO setBirthday(Date date)
    {
        zznO.(date);
        return this;
    }

    public zznO setContentUrl(String s)
    {
        zzx.zzb(s, "Content URL must be non-null.");
        zzx.zzh(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        zznO.(s);
        return this;
    }

    public zznO setGender(int i)
    {
        zznO.(i);
        return this;
    }

    public zznO setLocation(Location location)
    {
        zznO.(location);
        return this;
    }

    public zznO setManualImpressionsEnabled(boolean flag)
    {
        zznO.sEnabled(flag);
        return this;
    }

    public sionsEnabled setPublisherProvidedId(String s)
    {
        zznO.(s);
        return this;
    }

    public zznO setRequestAgent(String s)
    {
        zznO.(s);
        return this;
    }

    public zznO tagForChildDirectedTreatment(boolean flag)
    {
        zznO.(flag);
        return this;
    }

    public ()
    {
    }
}
