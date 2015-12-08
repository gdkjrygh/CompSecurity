// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzcp, zzco

public class zzcz extends zzcu.zza
{

    private final com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener zzvQ;

    public zzcz(com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
    {
        zzvQ = onappinstalladloadedlistener;
    }

    public void zza(zzco zzco)
    {
        zzvQ.onAppInstallAdLoaded(zzb(zzco));
    }

    zzcp zzb(zzco zzco)
    {
        return new zzcp(zzco);
    }
}
