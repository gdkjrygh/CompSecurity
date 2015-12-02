// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.OutputStream;

final class bl extends OutputStream
{

    final OutputStream b;
    final OutputStream c;

    public bl(OutputStream outputstream, OutputStream outputstream1)
    {
        b = outputstream;
        c = outputstream1;
    }

    public void close()
    {
        b.close();
        c.close();
    }

    public void flush()
    {
        b.flush();
        c.flush();
    }

    public void write(int i)
    {
        b.write(i);
        c.write(i);
    }

    public void write(byte abyte0[])
    {
        b.write(abyte0);
        c.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
    {
        b.write(abyte0, i, j);
        c.write(abyte0, i, j);
    }
}
