// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import com.google.android.apps.youtube.common.fromguava.c;
import java.nio.ByteBuffer;

public final class a
{

    public static byte[] a(byte abyte0[], int i)
    {
        boolean flag1 = true;
        int j;
        boolean flag;
        if (abyte0 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (i > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c.a(flag);
        j = abyte0.length % i;
        if (j == 0)
        {
            return (byte[])abyte0.clone();
        } else
        {
            return b(abyte0, (i - j) + abyte0.length);
        }
    }

    public static byte[] a(byte abyte0[], int i, byte byte0)
    {
        byte abyte1[] = a(abyte0, 188);
        for (i = abyte0.length; i < abyte1.length; i++)
        {
            abyte1[i] = -1;
        }

        return abyte1;
    }

    public static byte[] a(byte abyte0[], int i, int j)
    {
        boolean flag1 = true;
        byte abyte1[];
        boolean flag;
        if (abyte0 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (j >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c.a(flag);
        abyte1 = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return abyte1;
    }

    public static transient byte[] a(byte abyte0[][])
    {
        boolean flag = false;
        int l = abyte0.length;
        int i = 0;
        int k = 0;
        for (; i < l; i++)
        {
            k += abyte0[i].length;
        }

        ByteBuffer bytebuffer = ByteBuffer.allocate(k);
        k = abyte0.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            bytebuffer.put(abyte0[j]);
        }

        return bytebuffer.array();
    }

    public static byte[] b(byte abyte0[], int i)
    {
        boolean flag1 = true;
        byte abyte1[];
        boolean flag;
        if (abyte0 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (i >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c.a(flag);
        abyte1 = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, Math.min(i, abyte0.length));
        return abyte1;
    }
}
