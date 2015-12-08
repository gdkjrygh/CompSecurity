// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.zzb;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class zzaS extends AdListener
    implements com.google.android.gms.ads.formats.stallAdLoadedListener, com.google.android.gms.ads.formats.dLoadedListener, zza
{

    final AbstractAdViewAdapter zzaP;
    final zzb zzaS;

    public void onAdClicked()
    {
        zzaS.zzd(zzaP);
    }

    public void onAdClosed()
    {
        zzaS.zzb(zzaP);
    }

    public void onAdFailedToLoad(int i)
    {
        zzaS.zza(zzaP, i);
    }

    public void onAdLeftApplication()
    {
        zzaS.zzc(zzaP);
    }

    public void onAdLoaded()
    {
    }

    public void onAdOpened()
    {
        zzaS.zza(zzaP);
    }

    public void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
    {
        zzaS.zza(zzaP, new <init>(nativeappinstallad));
    }

    public void onContentAdLoaded(NativeContentAd nativecontentad)
    {
        zzaS.zza(zzaP, new <init>(nativecontentad));
    }

    public Ad(AbstractAdViewAdapter abstractadviewadapter, zzb zzb1)
    {
        zzaP = abstractadviewadapter;
        zzaS = zzb1;
    }
}
