// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import android.os.CountDownTimer;

public abstract class RefreshTimer extends CountDownTimer
{

    public RefreshTimer(long l)
    {
        super(l, l);
    }

    public void onFinish()
    {
        onRefresh();
    }

    public abstract void onRefresh();

    public void onTick(long l)
    {
    }
}
