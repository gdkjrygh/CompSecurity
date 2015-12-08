// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.micro;


public final class a
{

    public static final a a = new a(new byte[0]);
    private final byte b[];
    private volatile int c;

    private a(byte abyte0[])
    {
        c = 0;
        b = abyte0;
    }

    public static a a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static a a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return new a(abyte1);
    }

    public final int a()
    {
        return b.length;
    }

    public final byte[] b()
    {
        int i = b.length;
        byte abyte0[] = new byte[i];
        System.arraycopy(b, 0, abyte0, 0, i);
        return abyte0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            a a1 = (a)obj;
            int j = b.length;
            if (j != a1.b.length)
            {
                return false;
            }
            obj = b;
            byte abyte0[] = a1.b;
            int i = 0;
            while (i < j) 
            {
                if (obj[i] != abyte0[i])
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i = c;
        int k = i;
        if (i == 0)
        {
            byte abyte0[] = b;
            int l = b.length;
            k = 0;
            int j;
            byte byte0;
            for (j = l; k < l; j = byte0 + j * 31)
            {
                byte0 = abyte0[k];
                k++;
            }

            k = j;
            if (j == 0)
            {
                k = 1;
            }
            c = k;
        }
        return k;
    }

}
