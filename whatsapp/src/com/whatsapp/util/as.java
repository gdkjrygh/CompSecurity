// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.Closeable;
import java.io.InputStream;

// Referenced classes of package com.whatsapp.util:
//            Log, ao, b9

public final class as
    implements Closeable
{

    final ao a;
    private final long b;
    private final String c;
    private final InputStream d[];

    private as(ao ao1, String s, long l, InputStream ainputstream[])
    {
        a = ao1;
        super();
        c = s;
        b = l;
        d = ainputstream;
    }

    as(ao ao1, String s, long l, InputStream ainputstream[], b9 b9)
    {
        this(ao1, s, l, ainputstream);
    }

    public InputStream a(int i)
    {
        return d[i];
    }

    public void close()
    {
        boolean flag = Log.f;
        InputStream ainputstream[] = d;
        int j = ainputstream.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            ao.a(ainputstream[i]);
            i++;
        } while (!flag);
    }
}
