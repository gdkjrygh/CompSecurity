// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.e;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.medialib.m2ts.b;
import com.google.android.apps.youtube.medialib.player.ab;
import com.google.android.apps.youtube.medialib.player.ae;
import com.google.android.apps.youtube.medialib.player.af;
import com.google.android.apps.youtube.medialib.player.f;
import com.google.android.apps.youtube.medialib.player.g;
import com.google.android.apps.youtube.medialib.player.i;
import com.google.android.apps.youtube.medialib.player.p;
import com.google.android.apps.youtube.medialib.player.t;
import com.google.android.apps.youtube.medialib.player.x;
import com.google.android.exoplayer.upstream.c;

// Referenced classes of package com.google.android.apps.youtube.medialib:
//            b

public final class a
{

    private final com.google.android.apps.youtube.medialib.a.a a = new com.google.android.apps.youtube.medialib.a.a();
    private final c b;
    private final String c;
    private final h d;
    private final ae e;
    private final e f;

    public a(Handler handler, String s, h h1, boolean flag, boolean flag1, boolean flag2, e e1)
    {
        f = e1;
        b = new c((Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler), a);
        c = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        d = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        e = new f(h1, flag, flag1, flag2);
    }

    static String a(a a1)
    {
        return a1.c;
    }

    static c b(a a1)
    {
        return a1.b;
    }

    static e c(a a1)
    {
        return a1.f;
    }

    public final com.google.android.apps.youtube.medialib.a.a a()
    {
        return a;
    }

    public final x a(Context context)
    {
        return new p(context, d, e, c);
    }

    public final x a(Context context, t t, e e1, boolean flag, com.google.android.apps.youtube.medialib.player.h h1)
    {
        Object obj = new p(context, d, e, c, t);
        t = ((t) (obj));
        if (flag)
        {
            t = new af(((x) (obj)), new b(e1));
        }
        obj = t;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            obj = new g(new i(e1, b, e, h1), t, context, h1);
        }
        return new ab(((x) (obj)));
    }

    public final ae b()
    {
        return e;
    }

    public final e c()
    {
        return new com.google.android.apps.youtube.medialib.b(this);
    }
}
