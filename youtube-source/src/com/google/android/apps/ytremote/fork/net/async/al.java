// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.io.InputStream;

final class al extends InputStream
{

    private InputStream a;

    al()
    {
        a = null;
    }

    public final void a(InputStream inputstream)
    {
        a = inputstream;
    }

    public final int available()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.available();
        }
    }

    public final int read()
    {
        if (a == null)
        {
            return -1;
        } else
        {
            return a.read();
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (a == null)
        {
            return -1;
        } else
        {
            return a.read(abyte0, i, j);
        }
    }

    public final long skip(long l)
    {
        if (a == null)
        {
            return 0L;
        } else
        {
            return a.skip(l);
        }
    }
}
