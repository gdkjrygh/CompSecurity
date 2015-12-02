// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            T, n, R, q, 
//            N, U, aX, o, 
//            I, at, O

public class f
{

    static int a[] = {
        0xff5978b6, 0xd37285, 0xff156ebd, 0x6a0a0f, 0x1c029, 0xff79e898, 0xffa03cbc, 0xffce7199, 0xfee2b700, 0xff480db4
    };
    static int b[] = {
        0xfe0ea0b0, 0xff86c9d3, 0x8f189e, 0x35697f, 0xbd0c60, 0xfffbd7a7, 0xfe804c9f, 0xffe1656a, 0x4fc1e, 0xae0c92
    };

    static int a(T t, byte abyte0[])
    {
        int ai[] = new int[10];
        int ai1[] = new int[10];
        int ai2[] = new int[10];
        int ai3[] = new int[10];
        int ai4[] = new int[10];
        n.a(t.e, abyte0);
        R.a(t.c);
        q.a(ai, t.e);
        N.a(ai1, ai, a);
        U.a(ai, ai, t.c);
        aX.a(ai1, ai1, t.c);
        q.a(ai2, ai1);
        N.a(ai2, ai2, ai1);
        q.a(t.a, ai2);
        N.a(t.a, t.a, ai1);
        N.a(t.a, t.a, ai);
        o.a(t.a, t.a);
        N.a(t.a, t.a, ai2);
        N.a(t.a, t.a, ai);
        q.a(ai3, t.a);
        N.a(ai3, ai3, ai1);
        U.a(ai4, ai3, ai);
        if (I.a(ai4) != 0)
        {
            aX.a(ai4, ai3, ai);
            if (I.a(ai4) != 0)
            {
                return -1;
            }
            N.a(t.a, t.a, b);
        }
        if (at.a(t.a) == (abyte0[31] >>> 7 & 1))
        {
            O.a(t.a, t.a);
        }
        N.a(t.d, t.a, t.e);
        return 0;
    }

}
