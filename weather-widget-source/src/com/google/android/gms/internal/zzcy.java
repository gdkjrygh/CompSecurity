// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzco, zzcn

public class zzcy extends zzct.zza
{

    private final com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener zzwD;

    public zzcy(com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
    {
        zzwD = onappinstalladloadedlistener;
    }

    public void zza(zzcn zzcn)
    {
        zzwD.onAppInstallAdLoaded(zzb(zzcn));
    }

    zzco zzb(zzcn zzcn)
    {
        return new zzco(zzcn);
    }
}
