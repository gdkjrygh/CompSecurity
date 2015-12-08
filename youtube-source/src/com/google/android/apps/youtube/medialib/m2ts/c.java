// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.m2ts;

import com.google.android.apps.youtube.common.e.a;
import com.google.android.exoplayer.ag;
import com.google.android.exoplayer.ah;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.youtube.medialib.m2ts:
//            d, a

final class c
{

    private final d a;
    private final ag b;
    private byte c;

    public c(d d1, ag ag)
    {
        a = d1;
        b = ag;
        c = 0;
        a.a(a("474000100000b00d0001c100000001f0002ab104b2"));
        a.a(a("475000100002b0180001c10000e100f0000fe100f0060a04756e6400152c6928"));
    }

    private static byte[] a(String s)
    {
        boolean flag1 = true;
        byte abyte0[];
        int j;
        boolean flag;
        if (s.length() % 2 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        j = s.length();
        abyte0 = new byte[j * 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        if (abyte0.length <= 188)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        return com.google.android.apps.youtube.common.e.a.a(abyte0, 188, (byte)-1);
    }

    private byte[] a(byte abyte0[], long l, boolean flag)
    {
        byte abyte1[] = new byte[2];
        byte[] _tmp = abyte1;
        abyte1[0] = 1;
        abyte1[1] = 0;
        if (flag)
        {
            abyte1[0] = (byte)(abyte1[0] | 0x40);
        }
        byte byte0 = (byte)(c | 0x30);
        c = (byte)(c + 1 & 0xf);
        byte byte1 = abyte1[0];
        byte byte2 = abyte1[1];
        int j = abyte0.length;
        byte abyte2[];
        int i;
        if (l != -1L)
        {
            abyte1 = new byte[7];
            abyte1[0] = 80;
            abyte1[1] = (byte)(int)(l >> 25 & 255L);
            abyte1[2] = (byte)(int)(l >> 17 & 255L);
            abyte1[3] = (byte)(int)(l >> 9 & 255L);
            abyte1[4] = (byte)(int)(l >> 1 & 255L);
            abyte1[5] = (byte)(int)(l << 7 & 128L);
            abyte1[6] = 0;
        } else
        {
            abyte1 = new byte[1];
            abyte1[0] = 0;
        }
        i = abyte1.length + 1;
        j = 184 - i - j;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        abyte2 = new byte[j];
        Arrays.fill(abyte2, (byte)-1);
        abyte1 = com.google.android.apps.youtube.common.e.a.a(new byte[][] {
            new byte[] {
                (byte)((i + j) - 1)
            }, abyte1, abyte2
        });
        abyte0 = com.google.android.apps.youtube.common.e.a.a(new byte[][] {
            new byte[] {
                71, byte1, byte2, byte0
            }, abyte1, abyte0
        });
        if (abyte0.length == 188)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        return abyte0;
    }

    public final void a(ah aah[], int i)
    {
        Object obj = new byte[i][];
        for (int j = 0; j < i; j++)
        {
            obj[j] = com.google.android.apps.youtube.medialib.m2ts.a.a(aah[j], b);
        }

        obj = com.google.android.apps.youtube.common.e.a.a(((byte [][]) (obj)));
        long l = (aah[0].f * 9L) / 100L;
        i = obj.length + 8;
        aah = com.google.android.apps.youtube.common.e.a.a(new byte[][] {
            new byte[] {
                0, 0, 1, -64, (byte)(i >> 8), (byte)(i & 0xff), -128, -128, 5, (byte)(int)(33L | l >> 30), 
                (byte)(int)(l >> 22 & 255L), (byte)(int)(1L | l >> 14 & 254L), (byte)(int)(l >> 7 & 255L), (byte)(int)(l << 1 & 254L | 1L)
            }, obj
        });
        a.a(a(com.google.android.apps.youtube.common.e.a.a(aah, 0, 176), l, true));
        for (i = 176; i < aah.length; i += 182)
        {
            int k = Math.min(182, aah.length - i);
            a.a(a(com.google.android.apps.youtube.common.e.a.a(aah, i, k), -1L, false));
        }

    }
}
