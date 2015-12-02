// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            p, X, c, s, 
//            d, t, P, ap, 
//            H, a0, Y, C, 
//            O, m, Q, j, 
//            e, T

public class aO
{

    static int a(byte byte0)
    {
        return (int)((long)byte0 >>> 63);
    }

    static int a(byte byte0, byte byte1)
    {
        return (byte0 ^ byte1) - 1 >>> 31;
    }

    public static void a(T t1, byte abyte0[])
    {
        boolean flag = p.d;
        byte abyte1[] = new byte[64];
        X x = new X();
        c c1 = new c();
        p p1 = new p();
        int i = 0;
        do
        {
            if (i >= 32)
            {
                break;
            }
            abyte1[i * 2 + 0] = (byte)(abyte0[i] >>> 0 & 0xf);
            abyte1[i * 2 + 1] = (byte)(abyte0[i] >>> 4 & 0xf);
            i++;
        } while (!flag);
        int k = 0;
        i = 0;
        int l;
        do
        {
            l = i;
            if (k >= 63)
            {
                break;
            }
            abyte1[k] = (byte)(i + abyte1[k]);
            l = (byte)((byte)(abyte1[k] + 8) >> 4);
            abyte1[k] = (byte)(abyte1[k] - (l << 4));
            k++;
            i = l;
        } while (!flag);
        abyte1[63] = (byte)(l + abyte1[63]);
        s.a(t1);
        i = 1;
        do
        {
            if (i >= 64)
            {
                break;
            }
            a(p1, i / 2, abyte1[i]);
            d.a(x, t1, p1);
            t.a(t1, x);
            i += 2;
        } while (!flag);
        P.a(x, t1);
        ap.a(c1, x);
        H.a(x, c1);
        ap.a(c1, x);
        H.a(x, c1);
        ap.a(c1, x);
        H.a(x, c1);
        t.a(t1, x);
        i = 0;
        do
        {
            if (i >= 64)
            {
                break;
            }
            a(p1, i / 2, abyte1[i]);
            d.a(x, t1, p1);
            t.a(t1, x);
            i += 2;
        } while (!flag);
    }

    static void a(p p1, int i, byte byte0)
    {
        p ap1[][];
        p p2;
        int k;
        int l;
        if (i <= 7)
        {
            ap1 = a0.a;
        } else
        if (i <= 15)
        {
            ap1 = m.a;
        } else
        if (i <= 23)
        {
            ap1 = Q.a;
        } else
        {
            ap1 = j.a;
        }
        p2 = new p();
        k = a(byte0);
        l = byte0 - ((-k & byte0) << 1);
        Y.a(p1);
        a(p1, ap1[i][0], a((byte)l, (byte)1));
        a(p1, ap1[i][1], a((byte)l, (byte)2));
        a(p1, ap1[i][2], a((byte)l, (byte)3));
        a(p1, ap1[i][3], a((byte)l, (byte)4));
        a(p1, ap1[i][4], a((byte)l, (byte)5));
        a(p1, ap1[i][5], a((byte)l, (byte)6));
        a(p1, ap1[i][6], a((byte)l, (byte)7));
        a(p1, ap1[i][7], a((byte)l, (byte)8));
        C.a(p2.a, p1.b);
        C.a(p2.b, p1.a);
        O.a(p2.c, p1.c);
        a(p1, p2, k);
    }

    static void a(p p1, p p2, int i)
    {
        e.a(p1.a, p2.a, i);
        e.a(p1.b, p2.b, i);
        e.a(p1.c, p2.c, i);
    }
}
