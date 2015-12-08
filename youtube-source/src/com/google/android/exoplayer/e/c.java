// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.e;

import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
import java.io.InputStream;

// Referenced classes of package com.google.android.exoplayer.e:
//            a

public final class c extends InputStream
{

    private final i a;
    private final j b;
    private final byte c[] = new byte[1];
    private boolean d;
    private boolean e;

    public c(i j, j j1)
    {
        d = false;
        e = false;
        a = j;
        b = j1;
    }

    private void a()
    {
        if (!d)
        {
            a.a(b);
            d = true;
        }
    }

    public final void close()
    {
        if (!e)
        {
            a.a();
            e = true;
        }
    }

    public final int read()
    {
        read(c);
        return c[0];
    }

    public final int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public final int read(byte abyte0[], int j, int k)
    {
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        a();
        return a.a(abyte0, j, k);
    }

    public final long skip(long l)
    {
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        a();
        return super.skip(l);
    }
}
