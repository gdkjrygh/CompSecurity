// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

public final class zzc extends zzn.zza
{

    private final AdListener zzso;

    public zzc(AdListener adlistener)
    {
        zzso = adlistener;
    }

    public void onAdClosed()
    {
        zzso.onAdClosed();
    }

    public void onAdFailedToLoad(int i)
    {
        zzso.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication()
    {
        zzso.onAdLeftApplication();
    }

    public void onAdLoaded()
    {
        zzso.onAdLoaded();
    }

    public void onAdOpened()
    {
        zzso.onAdOpened();
    }
}
