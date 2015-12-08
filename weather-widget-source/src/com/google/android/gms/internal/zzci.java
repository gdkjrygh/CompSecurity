// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzcf, zzcg

public final class zzci extends zzch.zza
{

    private final OnCustomRenderedAdLoadedListener zztr;

    public zzci(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zztr = oncustomrenderedadloadedlistener;
    }

    public void zza(zzcg zzcg)
    {
        zztr.onCustomRenderedAdLoaded(new zzcf(zzcg));
    }
}
