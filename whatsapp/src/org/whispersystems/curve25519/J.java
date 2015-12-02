// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            n, R, U, aX, 
//            h, N, M, F, 
//            T, E, aO, l, 
//            B, ah

public class J
{

    public static int a = 256;

    public static int a(ah ah, byte abyte0[], byte abyte1[], byte abyte2[], long l1)
    {
        int ai[] = new int[10];
        int ai1[] = new int[10];
        int ai2[] = new int[10];
        int ai3[] = new int[10];
        int ai4[] = new int[10];
        int ai5[] = new int[10];
        byte abyte3[] = new byte[32];
        byte abyte4[] = new byte[a + 64];
        byte abyte5[] = new byte[a + 64];
        if (l1 > (long)a)
        {
            return -1;
        } else
        {
            n.a(ai, abyte1);
            R.a(ai4);
            U.a(ai1, ai, ai4);
            aX.a(ai2, ai, ai4);
            h.a(ai3, ai2);
            N.a(ai5, ai1, ai3);
            M.a(abyte3, ai5);
            abyte3[31] = (byte)(abyte3[31] & 0x7f);
            abyte3[31] = (byte)(abyte3[31] | abyte0[63] & 0x80);
            System.arraycopy(abyte0, 0, abyte4, 0, 64);
            abyte4[63] = (byte)(abyte4[63] & 0x7f);
            System.arraycopy(abyte2, 0, abyte4, 64, (int)l1);
            return F.a(ah, abyte5, 0L, abyte4, 64L + l1, abyte3);
        }
    }

    public static int a(ah ah, byte abyte0[], byte abyte1[], byte abyte2[], long l1, byte abyte3[])
    {
        T t = new T();
        byte abyte4[] = new byte[32];
        byte abyte5[] = new byte[a + 128];
        if (l1 > (long)a)
        {
            E.a(abyte0, (byte)0);
            return -1;
        } else
        {
            aO.a(t, abyte1);
            l.a(abyte4, t);
            byte byte0 = (byte)(abyte4[31] & 0x80);
            B.a(ah, abyte5, abyte2, l1, abyte1, abyte4, abyte3);
            System.arraycopy(abyte5, 0, abyte0, 0, 64);
            abyte0[63] = (byte)(abyte0[63] & 0x7f);
            abyte0[63] = (byte)(byte0 | abyte0[63]);
            return 0;
        }
    }

    public static void a(byte abyte0[], byte abyte1[])
    {
        T t = new T();
        int ai[] = new int[10];
        ai = new int[10];
        int ai1[] = new int[10];
        int ai2[] = new int[10];
        int ai3[] = new int[10];
        aO.a(t, abyte1);
        aX.a(ai, t.e, t.c);
        U.a(ai1, t.c, t.e);
        h.a(ai2, ai1);
        N.a(ai3, ai, ai2);
        M.a(abyte0, ai3);
    }

}
