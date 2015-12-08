// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.io.iobuffer;

import java.io.InputStream;

// Referenced classes of package com.google.android.apps.ytremote.fork.io.iobuffer:
//            b

public final class c extends InputStream
{

    private b a;

    public c(b b1)
    {
        a = b1;
    }

    public final int available()
    {
        return a.d();
    }

    public final void close()
    {
    }

    public final void mark(int i)
    {
    }

    public final boolean markSupported()
    {
        return false;
    }

    public final int read()
    {
        return a.c();
    }

    public final int read(byte abyte0[])
    {
        return a.a(abyte0);
    }

    public final int read(byte abyte0[], int i, int j)
    {
        return a.a(abyte0, i, j);
    }

    public final void reset()
    {
        throw new UnsupportedOperationException();
    }

    public final long skip(long l)
    {
        return a.a(l);
    }
}
