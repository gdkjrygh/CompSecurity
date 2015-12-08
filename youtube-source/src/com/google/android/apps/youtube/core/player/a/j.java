// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;

public final class j extends InputStream
{

    private final RandomAccessFile a;
    private long b;

    public j(File file, long l, long l1)
    {
        c.a(file);
        boolean flag;
        if (l <= l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "begin must be less than or equal to end");
        b = (l1 - l) + 1L;
        a = new RandomAccessFile(file, "r");
        a.seek(l);
    }

    public final void close()
    {
        L.e(String.format("Stream closed with %d bytes left unread", new Object[] {
            Long.valueOf(b)
        }));
        a.close();
    }

    public final int read()
    {
        if (b > 0L)
        {
            int i = a.read();
            if (i != -1)
            {
                b = b - 1L;
                return i;
            }
        }
        return -1;
    }

    public final int read(byte abyte0[], int i, int k)
    {
        if (b > 0L)
        {
            i = a.read(abyte0, 0, (int)Math.min(k, b));
            if (i > 0)
            {
                b = b - (long)i;
            }
            return i;
        } else
        {
            return -1;
        }
    }
}
