// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzu;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class D_EMULATOR
{

    private final com.google.android.gms.ads.internal.client. zznL = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. zza(D_EMULATOR d_emulator)
    {
        return d_emulator.zznL;
    }

    public zznL addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        zznL.(class1, bundle);
        return this;
    }

    public x.zza.zzb addKeyword(String s)
    {
        zznL.(s);
        return this;
    }

    public xtras addNetworkExtras(NetworkExtras networkextras)
    {
        zznL.(networkextras);
        return this;
    }

    public xtras addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zznL.(class1, bundle);
        if (class1.equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
        {
            zznL.(AdRequest.DEVICE_ID_EMULATOR);
        }
        return this;
    }

    public D_EMULATOR addTestDevice(String s)
    {
        zznL.(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public x.zza.zzF setBirthday(Date date)
    {
        zznL.(date);
        return this;
    }

    public x.zza.zza setContentUrl(String s)
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

    public x.zza.zzH setGender(int i)
    {
        zznL.(i);
        return this;
    }

    public x.zza.zzm setLocation(Location location)
    {
        zznL.(location);
        return this;
    }

    public x.zza.zza setRequestAgent(String s)
    {
        zznL.(s);
        return this;
    }

    public x.zza.zzJ tagForChildDirectedTreatment(boolean flag)
    {
        zznL.(flag);
        return this;
    }

    public xtras()
    {
        zznL.(AdRequest.DEVICE_ID_EMULATOR);
    }
}
