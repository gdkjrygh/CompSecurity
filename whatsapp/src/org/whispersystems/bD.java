// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.a3;

// Referenced classes of package org.whispersystems:
//            az, bO, i, a0, 
//            b8, b9, bs

public class bD
{

    private az a;

    public bD(int j, long l, i k, byte abyte0[])
    {
        a = az.i().a(j).c(a3.a(k.a().a())).b(a3.a(k.b().a())).a(a3.a(abyte0)).a(l).e();
    }

    public bD(byte abyte0[])
    {
        a = az.a(abyte0);
    }

    public byte[] a()
    {
        return a.g().f();
    }

    public i b()
    {
        i j;
        try
        {
            j = new i(bs.a(a.h().f(), 0), bs.a(a.p().f()));
        }
        catch (b9 b9_1)
        {
            throw new AssertionError(b9_1);
        }
        return j;
    }

    public int c()
    {
        return a.d();
    }

    public byte[] d()
    {
        return a.e();
    }
}
