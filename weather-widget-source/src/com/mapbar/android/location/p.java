// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;


// Referenced classes of package com.mapbar.android.location:
//            m, q

public class p
{

    public final q a;
    public final Object b[];

    public p()
    {
    }

    public transient p(q q, Object aobj[])
    {
        a = q;
        b = aobj;
    }

    public static String a(String s)
    {
        m m1 = new m(0x7585c50L);
        byte abyte0[] = s.getBytes();
        s = "";
        for (int i = 0; i < abyte0.length / 16; i++)
        {
            byte abyte1[] = new byte[8];
            for (int j = 0; j <= 7; j++)
            {
                abyte1[j] = (byte)(((byte)(abyte0[i * 16 + j * 2] - 65) << 4) + (byte)(abyte0[i * 16 + j * 2 + 1] - 97));
            }

            long l = m.a(abyte1);
            abyte1 = new byte[8];
            m.a(m1.a(l), abyte1);
            s = (new StringBuilder()).append(s).append(new String(abyte1)).toString();
        }

        return s.trim();
    }

    public static String b(String s)
    {
        m m1 = new m(0x7585c50L);
        s = s.getBytes();
        int k = s.length;
        int j1 = k + (8 - k % 8) % 8;
        byte abyte0[] = new byte[j1];
        int i = 0;
        while (i < j1) 
        {
            if (i <= k - 1)
            {
                abyte0[i] = s[i];
            } else
            {
                abyte0[i] = 32;
            }
            i++;
        }
        s = "";
        for (int j = 0; j < j1 / 8; j++)
        {
            byte abyte1[] = new byte[8];
            for (int l = 0; l <= 7; l++)
            {
                abyte1[l] = abyte0[j * 8 + l];
            }

            long l1 = m.a(abyte1);
            abyte1 = new byte[8];
            m.a(m1.b(l1), abyte1);
            byte abyte2[] = new byte[16];
            for (int i1 = 0; i1 < 8; i1++)
            {
                abyte2[i1 * 2] = (byte)((((char)abyte1[i1] & 0xf0) >> 4) + 65);
                abyte2[i1 * 2 + 1] = (byte)(((char)abyte1[i1] & 0xf) + 97);
            }

            s = (new StringBuilder()).append(s).append(new String(abyte2)).toString();
        }

        return s;
    }
}
