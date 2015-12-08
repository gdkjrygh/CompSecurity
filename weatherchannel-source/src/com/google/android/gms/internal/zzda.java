// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzcr, zzcq

public class zzda extends zzcv.zza
{

    private final com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener zzvR;

    public zzda(com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
    {
        zzvR = oncontentadloadedlistener;
    }

    public void zza(zzcq zzcq)
    {
        zzvR.onContentAdLoaded(zzb(zzcq));
    }

    zzcr zzb(zzcq zzcq)
    {
        return new zzcr(zzcq);
    }
}
