// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.util.Arrays;

public final class e
{

    final int a;
    final byte b[];

    e(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof e))
            {
                return false;
            }
            obj = (e)obj;
            if (a != ((e) (obj)).a || !Arrays.equals(b, ((e) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = a + 527;
        for (int i = 0; i < b.length; i++)
        {
            j = j * 31 + b[i];
        }

        return j;
    }
}
