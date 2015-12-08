// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.ag;
import com.google.android.apps.youtube.datalib.innertube.ak;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;

public final class a
    implements ag
{

    private final VastAd a;

    public a(VastAd vastad)
    {
        a = (VastAd)c.a(vastad);
        c.a(vastad.getBillingPartner());
        c.a(vastad.getOriginalVideoId());
    }

    public final void a(ak ak1)
    {
        int i = 1;
        ak1.d(true);
        ak1.e(Integer.valueOf(a.getBillingPartner().partnerId).intValue());
        ak1.f(2);
        if (!a.isSkippable())
        {
            i = 0;
        }
        ak1.g(i);
        ak1.f(a.getOriginalVideoId());
    }
}
