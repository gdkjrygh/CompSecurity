// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bk, bp, YouTubeTvScreen

final class bm
    implements Runnable
{

    final YouTubeTvScreen a;
    final String b;
    final long c;
    final String d;
    final int e;
    final bk f;

    bm(bk bk1, YouTubeTvScreen youtubetvscreen, String s, long l, String s1, int i)
    {
        f = bk1;
        a = youtubetvscreen;
        b = s;
        c = l;
        d = s1;
        e = i;
        super();
    }

    public final void run()
    {
        Object obj;
        if (bk.r(f))
        {
            obj = bk.a(f);
        } else
        {
            obj = null;
        }
        obj = new bp(a, b, c, d, e, true, ((String) (obj)), (byte)0);
        bk.s(f).sendMessage(Message.obtain(bk.s(f), 3, obj));
    }
}
