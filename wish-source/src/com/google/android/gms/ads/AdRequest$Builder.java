// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class D_EMULATOR
{

    private final com.google.android.gms.ads.internal.client. zzlZ = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. zza(D_EMULATOR d_emulator)
    {
        return d_emulator.zzlZ;
    }

    public zzlZ addKeyword(String s)
    {
        zzlZ.(s);
        return this;
    }

    public t.zza.zzt addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zzlZ.(class1, bundle);
        if (class1.equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
        {
            zzlZ.(AdRequest.DEVICE_ID_EMULATOR);
        }
        return this;
    }

    public D_EMULATOR addTestDevice(String s)
    {
        zzlZ.(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public t.zza.zzu setBirthday(Date date)
    {
        zzlZ.(date);
        return this;
    }

    public t.zza.zza setGender(int i)
    {
        zzlZ.(i);
        return this;
    }

    public t.zza.zzi setLocation(Location location)
    {
        zzlZ.(location);
        return this;
    }

    public t.zza.zza tagForChildDirectedTreatment(boolean flag)
    {
        zzlZ.(flag);
        return this;
    }

    public t.zza()
    {
        zzlZ.(AdRequest.DEVICE_ID_EMULATOR);
    }
}
