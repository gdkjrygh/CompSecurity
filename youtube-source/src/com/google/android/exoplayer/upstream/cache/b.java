// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer.e.a;
import com.google.android.exoplayer.upstream.h;
import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
import com.google.android.exoplayer.upstream.q;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//            a, d

public final class b
    implements i
{

    private final com.google.android.exoplayer.upstream.cache.a a;
    private final i b;
    private final i c;
    private final i d;
    private final boolean e = false;
    private final boolean f = true;
    private i g;
    private Uri h;
    private String i;
    private long j;
    private long k;
    private d l;
    private boolean m;

    public b(com.google.android.exoplayer.upstream.cache.a a1, i i1, i j1, h h1, boolean flag, boolean flag1)
    {
        a = a1;
        b = j1;
        d = i1;
        if (h1 != null)
        {
            c = new q(i1, h1);
            return;
        } else
        {
            c = null;
            return;
        }
    }

    private void a(IOException ioexception)
    {
        if (f && (g == b || (ioexception instanceof CacheDataSink.CacheDataSinkException)))
        {
            m = true;
        }
    }

    private void b()
    {
        if (!m) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L5:
        if (obj != null) goto _L4; else goto _L3
_L3:
        g = d;
        obj = new j(h, j, k, i);
_L8:
        g.a(((j) (obj)));
        return;
_L2:
label0:
        {
            if (!e)
            {
                break label0;
            }
            obj = a.a(i, j);
        }
          goto _L5
        Object obj1;
        try
        {
            obj = a.b(i, j);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
          goto _L5
_L4:
        if (!((d) (obj)).d) goto _L7; else goto _L6
_L6:
        obj1 = Uri.fromFile(((d) (obj)).e);
        long l1 = j - ((d) (obj)).b;
        long l3 = Math.min(((d) (obj)).c - l1, k);
        obj = new j(((Uri) (obj1)), j, l3, i, l1);
        obj1 = b;
_L9:
        g = ((i) (obj1));
          goto _L8
_L7:
        long l2;
        l = ((d) (obj));
        if (!((d) (obj)).a())
        {
            break MISSING_BLOCK_LABEL_242;
        }
        l2 = k;
_L10:
        obj = new j(h, j, l2, i);
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj1 = c;
          goto _L9
        l2 = Math.min(((d) (obj)).c, k);
          goto _L10
        obj1 = d;
          goto _L9
    }

    private void c()
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        g.a();
        g = null;
        if (l == null) goto _L1; else goto _L3
_L3:
        a.a(l);
        l = null;
        return;
        Exception exception;
        exception;
        if (l != null)
        {
            a.a(l);
            l = null;
        }
        throw exception;
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        int k1;
        try
        {
            k1 = g.a(abyte0, i1, j1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a(((IOException) (abyte0)));
            throw abyte0;
        }
        if (k1 < 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        j = j + (long)k1;
        k = k - (long)k1;
        return k1;
        c();
        if (k <= 0L)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        b();
        i1 = a(abyte0, i1, j1);
        return i1;
        return k1;
    }

    public final long a(j j1)
    {
        com.google.android.exoplayer.e.a.b(j1.b);
        long l1;
        boolean flag;
        if (j1.e != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        try
        {
            h = j1.a;
            i = j1.f;
            j = j1.d;
            k = j1.e;
            b();
            l1 = j1.e;
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            a(((IOException) (j1)));
            throw j1;
        }
        return l1;
    }

    public final void a()
    {
        try
        {
            c();
            return;
        }
        catch (IOException ioexception)
        {
            a(ioexception);
            throw ioexception;
        }
    }
}
