// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.AdPair;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            AdsClient, f, g

public final class e
{

    private final AdsClient a;
    private final Executor b;

    public e(AdsClient adsclient, Executor executor)
    {
        a = (AdsClient)c.a(adsclient);
        b = (Executor)c.a(executor);
    }

    static AdsClient a(e e1)
    {
        return e1.a;
    }

    protected final AdPair a(List list, String s, Map map)
    {
        list = VmapAdBreak.firstPrerollAdBreak(list);
        if (list == null)
        {
            return null;
        } else
        {
            return new AdPair(list, a.a(list, s, map));
        }
    }

    public final void a(int i)
    {
        a.a(i);
    }

    public final void a(PlayerResponse playerresponse, String s, b b1)
    {
        b.execute(new f(this, playerresponse, s, b1));
    }

    public final void a(VastAd vastad)
    {
        a.a(vastad);
    }

    public final void b(PlayerResponse playerresponse, String s, b b1)
    {
        b.execute(new g(this, playerresponse, s, b1));
    }
}
