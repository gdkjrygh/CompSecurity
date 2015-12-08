// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzcq, zzcp

public class zzcz extends zzcu.zza
{

    private final com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener zzwE;

    public zzcz(com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
    {
        zzwE = oncontentadloadedlistener;
    }

    public void zza(zzcp zzcp)
    {
        zzwE.onContentAdLoaded(zzb(zzcp));
    }

    zzcq zzb(zzcp zzcp)
    {
        return new zzcq(zzcp);
    }
}
