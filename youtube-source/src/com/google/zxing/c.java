// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;


public abstract class c
{

    private final int a;
    private final int b;

    protected c(int i, int j)
    {
        a = i;
        b = j;
    }

    public abstract byte[] a();

    public abstract byte[] a(int i, byte abyte0[]);

    public final int b()
    {
        return a;
    }

    public final int c()
    {
        return b;
    }

    public final String toString()
    {
        byte abyte0[] = new byte[a];
        StringBuilder stringbuilder = new StringBuilder(b * (a + 1));
        for (int i = 0; i < b; i++)
        {
            abyte0 = a(i, abyte0);
            int j = 0;
            while (j < a) 
            {
                int k = abyte0[j] & 0xff;
                char c1;
                if (k < 64)
                {
                    c1 = '#';
                } else
                if (k < 128)
                {
                    c1 = '+';
                } else
                if (k < 192)
                {
                    c1 = '.';
                } else
                {
                    c1 = ' ';
                }
                stringbuilder.append(c1);
                j++;
            }
            stringbuilder.append('\n');
        }

        return stringbuilder.toString();
    }
}
