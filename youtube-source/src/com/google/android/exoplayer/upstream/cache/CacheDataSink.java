// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.cache;

import com.google.android.exoplayer.e.a;
import com.google.android.exoplayer.upstream.h;
import com.google.android.exoplayer.upstream.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//            a

public final class CacheDataSink
    implements h
{

    private final com.google.android.exoplayer.upstream.cache.a a;
    private final long b = 0x500000L;
    private j c;
    private File d;
    private FileOutputStream e;
    private long f;
    private long g;

    public CacheDataSink(com.google.android.exoplayer.upstream.cache.a a1, long l)
    {
        a = (com.google.android.exoplayer.upstream.cache.a)com.google.android.exoplayer.e.a.a(a1);
    }

    private void b()
    {
        d = a.a(c.f, c.c + g, Math.min(c.e - g, b));
        e = new FileOutputStream(d);
        f = 0L;
    }

    private void c()
    {
        if (e != null)
        {
            e.flush();
            e.close();
            e = null;
            a.a(d);
            d = null;
        }
    }

    public final h a(j j1)
    {
        try
        {
            c = j1;
            g = 0L;
            b();
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new CacheDataSinkException(j1);
        }
        return this;
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
            throw new CacheDataSinkException(ioexception);
        }
    }

    public final void a(byte abyte0[], int i, int k)
    {
        int l = 0;
_L2:
        if (l >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1;
        try
        {
            if (f == b)
            {
                c();
                b();
            }
            i1 = (int)Math.min(k - l, b - f);
            e.write(abyte0, i + l, i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CacheDataSinkException(abyte0);
        }
        l += i1;
        f = f + (long)i1;
        g = g + (long)i1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private class CacheDataSinkException extends IOException
    {

        public CacheDataSinkException(IOException ioexception)
        {
            super(ioexception);
        }
    }

}
