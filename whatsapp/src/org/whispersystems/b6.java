// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import java.math.BigInteger;
import java.util.Arrays;

// Referenced classes of package org.whispersystems:
//            a0, aa

public class b6
    implements a0
{

    private final byte a[];

    b6(byte abyte0[])
    {
        a = abyte0;
    }

    public int a(a0 a0_1)
    {
        return (new BigInteger(a)).compareTo(new BigInteger(((b6)a0_1).a));
    }

    public byte[] a()
    {
        byte abyte0[] = a;
        return aa.a(new byte[][] {
            new byte[] {
                5
            }, abyte0
        });
    }

    public int b()
    {
        return 5;
    }

    public byte[] b()
    {
        return a;
    }

    public int compareTo(Object obj)
    {
        return a((a0)obj);
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof b6)) 
        {
            return false;
        }
        obj = (b6)obj;
        return Arrays.equals(a, ((b6) (obj)).a);
    }

    public int hashCode()
    {
        return Arrays.hashCode(a);
    }
}
