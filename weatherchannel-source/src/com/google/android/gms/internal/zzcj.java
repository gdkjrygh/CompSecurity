// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzcg, zzch

public final class zzcj extends zzci.zza
{

    private final OnCustomRenderedAdLoadedListener zzsY;

    public zzcj(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zzsY = oncustomrenderedadloadedlistener;
    }

    public void zza(zzch zzch)
    {
        zzsY.onCustomRenderedAdLoaded(new zzcg(zzch));
    }
}
