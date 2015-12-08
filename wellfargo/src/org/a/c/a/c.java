// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.a;

import java.io.OutputStream;

public class c extends OutputStream
{

    protected boolean a;
    private int b;
    private final OutputStream c;
    private int d;

    public c(OutputStream outputstream, int i)
    {
        a = false;
        b = 0;
        d = 77;
        d = i;
        c = outputstream;
    }

    private final void a(int i, int j)
    {
        byte abyte0[];
        int k;
        k = 0;
        boolean flag = false;
        abyte0 = new byte[j];
        if (d != 77)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        k = ((flag) ? 1 : 0);
_L3:
        if (k < j) goto _L2; else goto _L1
_L1:
        write(abyte0);
        return;
_L2:
        abyte0[k] = (byte)(i >> (j - k - 1) * 8 & 0xff);
        k++;
          goto _L3
        for (; k < j; k++)
        {
            abyte0[k] = (byte)(i >> k * 8 & 0xff);
        }

          goto _L1
    }

    public final void a(int i)
    {
        a(i, 4);
    }

    public final void a(byte abyte0[])
    {
        c.write(abyte0, 0, abyte0.length);
        b = b + abyte0.length;
    }

    public final void b(int i)
    {
        a(i, 2);
    }

    public void write(int i)
    {
        c.write(i);
        b = b + 1;
    }
}
