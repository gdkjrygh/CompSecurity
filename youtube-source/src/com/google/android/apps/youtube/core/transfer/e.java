// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            d

final class e extends InputStream
{

    private final InputStream a;
    private final d b;

    public e(InputStream inputstream, d d1)
    {
        a = inputstream;
        b = d1;
    }

    public final void close()
    {
        a.close();
    }

    public final int read()
    {
        return d.a(b, a);
    }

    public final int read(byte abyte0[])
    {
        return d.a(b, a, abyte0, 0, abyte0.length);
    }

    public final int read(byte abyte0[], int i, int j)
    {
        return d.a(b, a, abyte0, i, j);
    }

    public final long skip(long l)
    {
        throw new IOException("skip not supported");
    }
}
