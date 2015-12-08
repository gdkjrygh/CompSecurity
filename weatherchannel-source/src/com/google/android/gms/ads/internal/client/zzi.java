// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class zzi extends zzt.zza
{

    private final AppEventListener zzsq;

    public zzi(AppEventListener appeventlistener)
    {
        zzsq = appeventlistener;
    }

    public void onAppEvent(String s, String s1)
    {
        zzsq.onAppEvent(s, s1);
    }
}
