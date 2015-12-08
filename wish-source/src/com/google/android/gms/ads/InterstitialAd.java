// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzv;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final zzv zzme;

    public InterstitialAd(Context context)
    {
        zzme = new zzv(context);
    }

    public void loadAd(AdRequest adrequest)
    {
        zzme.zza(adrequest.zzac());
    }

    public void setAdListener(AdListener adlistener)
    {
        zzme.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zza))
        {
            zzme.zza((zza)adlistener);
        } else
        if (adlistener == null)
        {
            zzme.zza(null);
            return;
        }
    }

    public void setAdUnitId(String s)
    {
        zzme.setAdUnitId(s);
    }

    public void show()
    {
        zzme.show();
    }
}
