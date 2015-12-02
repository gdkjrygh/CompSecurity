// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            T, h, N, M, 
//            at

public class l
{

    public static void a(byte abyte0[], T t)
    {
        int ai[] = new int[10];
        int ai1[] = new int[10];
        int ai2[] = new int[10];
        h.a(ai, t.c);
        N.a(ai1, t.a, ai);
        N.a(ai2, t.e, ai);
        M.a(abyte0, ai2);
        byte byte0 = abyte0[31];
        abyte0[31] = (byte)(at.a(ai1) << 7 ^ byte0);
    }
}
