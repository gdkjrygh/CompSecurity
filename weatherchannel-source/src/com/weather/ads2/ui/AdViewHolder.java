// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;

import android.view.View;
import com.google.android.gms.ads.AdSize;

public interface AdViewHolder
{

    public abstract View getAdViewHolder();

    public abstract void onAdFail();

    public abstract void onAdLoaded(AdSize adsize);
}
