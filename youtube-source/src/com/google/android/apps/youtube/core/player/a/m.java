// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.exoplayer.upstream.cache.a;
import com.google.android.exoplayer.upstream.cache.d;
import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
import java.io.FileNotFoundException;

public final class m
    implements i
{

    private final a a;
    private final a b;
    private final i c;
    private i d;
    private String e;
    private long f;
    private long g;
    private d h;

    public m(a a1, a a2, i k)
    {
        a = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        b = a2;
        c = (i)com.google.android.apps.youtube.common.fromguava.c.a(k);
    }

    private void b()
    {
        Object obj;
        Object obj1;
        long l;
        long l1;
        try
        {
            obj1 = a.a(e, f);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException(interruptedexception);
        }
        obj = obj1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = obj1;
        if (!((d) (obj1)).d)
        {
            obj = b.a(e, f);
        }
        if (((d) (obj)).d)
        {
            obj1 = Uri.fromFile(((d) (obj)).e);
            l = f - ((d) (obj)).b;
            l1 = Math.min(((d) (obj)).c - l, g);
            obj = new j(((Uri) (obj1)), f, l1, e, l);
            d = c;
            d.a(((j) (obj)));
            return;
        }
        a.a(((d) (obj)));
        throw new FileNotFoundException((new StringBuilder("Chunk not found: ")).append(((d) (obj)).b).append(" - ").append(((d) (obj)).b).append(((d) (obj)).c).toString());
    }

    private void c()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        d.a();
        d = null;
        if (h == null) goto _L1; else goto _L3
_L3:
        a.a(h);
        h = null;
        return;
        Exception exception;
        exception;
        if (h != null)
        {
            a.a(h);
            h = null;
        }
        throw exception;
    }

    public final int a(byte abyte0[], int k, int l)
    {
_L6:
        int i1 = d.a(abyte0, k, l);
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        f = f + (long)i1;
        g = g - (long)i1;
_L4:
        return i1;
_L2:
        c();
        if (g <= 0L) goto _L4; else goto _L3
_L3:
        b();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final long a(j j1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b(j1.b);
        boolean flag;
        if (j1.e != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        e = j1.f;
        f = j1.d;
        g = j1.e;
        b();
        return j1.e;
    }

    public final void a()
    {
        c();
    }
}
