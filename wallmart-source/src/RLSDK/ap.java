// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Vector;

public final class ap
{

    private final byte a[];
    private final String b;
    private final Vector c;
    private final String d;

    public ap(byte abyte0[], String s, Vector vector, String s1)
    {
        if (abyte0 == null && s == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            a = abyte0;
            b = s;
            c = vector;
            d = s1;
            return;
        }
    }

    public final byte[] a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final Vector c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }
}
