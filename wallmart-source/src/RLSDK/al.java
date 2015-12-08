// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


public final class al
{

    private final byte a[];
    private int b;
    private int c;

    public al(byte abyte0[])
    {
        a = abyte0;
    }

    public final int a()
    {
        return (a.length - b) * 8 - c;
    }

    public final int a(int i)
    {
        if (i <= 0 || i > 32)
        {
            throw new IllegalArgumentException();
        }
        int j;
        int k;
        if (c > 0)
        {
            k = 8 - c;
            int l;
            if (i < k)
            {
                j = i;
            } else
            {
                j = k;
            }
            k -= j;
            l = a[b];
            c = j + c;
            if (c == 8)
            {
                c = 0;
                b = b + 1;
            }
            l = ((255 >> 8 - j) << k & l) >> k;
            k = i - j;
            i = l;
        } else
        {
            boolean flag = false;
            k = i;
            i = ((flag) ? 1 : 0);
        }
        j = i;
        if (k > 0)
        {
            for (; k >= 8; k -= 8)
            {
                i = i << 8 | a[b] & 0xff;
                b = b + 1;
            }

            j = i;
            if (k > 0)
            {
                j = 8 - k;
                j = i << k | ((255 >> j) << j & a[b]) >> j;
                c = k + c;
            }
        }
        return j;
    }
}
