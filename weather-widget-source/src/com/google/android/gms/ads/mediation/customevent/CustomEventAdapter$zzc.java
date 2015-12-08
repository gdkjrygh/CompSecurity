// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.NativeAdMapper;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventNativeListener, CustomEventAdapter

static class zzaS
    implements CustomEventNativeListener
{

    private final CustomEventAdapter zzJJ;
    private final com.google.android.gms.ads.mediation.zzb zzaS;

    public void onAdClicked()
    {
        zzb.zzaC("Custom event adapter called onAdClicked.");
        zzaS.zzd(zzJJ);
    }

    public void onAdClosed()
    {
        zzb.zzaC("Custom event adapter called onAdClosed.");
        zzaS.zzb(zzJJ);
    }

    public void onAdFailedToLoad(int i)
    {
        zzb.zzaC("Custom event adapter called onAdFailedToLoad.");
        zzaS.zza(zzJJ, i);
    }

    public void onAdLeftApplication()
    {
        zzb.zzaC("Custom event adapter called onAdLeftApplication.");
        zzaS.zzc(zzJJ);
    }

    public void onAdLoaded(NativeAdMapper nativeadmapper)
    {
        zzb.zzaC("Custom event adapter called onAdLoaded.");
        zzaS.zza(zzJJ, nativeadmapper);
    }

    public void onAdOpened()
    {
        zzb.zzaC("Custom event adapter called onAdOpened.");
        zzaS.zza(zzJJ);
    }

    public er(CustomEventAdapter customeventadapter, com.google.android.gms.ads.mediation.zzb zzb1)
    {
        zzJJ = customeventadapter;
        zzaS = zzb1;
    }
}
