// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.l;

// Referenced classes of package com.google.android.apps.youtube.core:
//            Analytics

public final class av
    implements Analytics
{

    private final l a;
    private final h b;
    private String c;

    public av(l l1, h h1)
    {
        a = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1, "analyticsClient cannot be null");
        b = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1, "networkStatus cannot be null");
    }

    public final void a(int i, String s, String s1, int j)
    {
        a.a(i, s, s1, 2);
    }

    public final void a(Analytics.VideoCategory videocategory, int i)
    {
        a("PlaySelected", videocategory.toString(), i);
    }

    public final void a(String s)
    {
        l l1 = a;
        StringBuilder stringbuilder = (new StringBuilder()).append(s).append(" < ");
        String s1;
        if (c == null)
        {
            s1 = "Entry";
        } else
        {
            s1 = c;
        }
        l1.a("PageView", stringbuilder.append(s1).toString(), -1);
        c = s;
    }

    public final void a(String s, int i)
    {
        a(s, i, -1);
    }

    public final void a(String s, int i, int j)
    {
        String s1;
        if (i <= 0)
        {
            s1 = "?";
        } else
        {
            s1 = (new StringBuilder("STREAM_")).append(i).append("P").toString();
        }
        a(s, (new StringBuilder()).append(s1).append(",").append(b.f()).toString(), j);
    }

    public final void a(String s, String s1)
    {
        a(s, s1, -1);
    }

    public final void a(String s, String s1, int i)
    {
        a.a(s, s1, i);
    }

    public final void b(String s)
    {
        a(s, ((String) (null)), -1);
    }
}
