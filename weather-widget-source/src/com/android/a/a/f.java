// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import java.io.FilterInputStream;
import java.io.InputStream;

class f extends FilterInputStream
{

    private int a;

    private f(InputStream inputstream)
    {
        super(inputstream);
        a = 0;
    }

    f(InputStream inputstream, f f1)
    {
        this(inputstream);
    }

    static int a(f f1)
    {
        return f1.a;
    }

    public int read()
    {
        int i = super.read();
        if (i != -1)
        {
            a = a + 1;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = super.read(abyte0, i, j);
        if (i != -1)
        {
            a = a + i;
        }
        return i;
    }
}
