// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            lj

public final class jr
{

    private final byte a[];
    private int b;
    private int c;
    private int d;
    private final InputStream e = null;
    private int f;
    private int g;
    private int h;
    private int i;

    private jr(byte abyte0[], int j, int k)
    {
        g = 0x7fffffff;
        h = 64;
        i = 0x4000000;
        a = abyte0;
        b = j + k;
        d = j;
    }

    public static jr a(byte abyte0[], int j, int k)
    {
        return new jr(abyte0, 0, k);
    }

    private boolean a(boolean flag)
    {
        if (d < b)
        {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        if (f + b == g)
        {
            if (flag)
            {
                throw lj.gE();
            } else
            {
                return false;
            }
        }
        f = f + b;
        d = 0;
        int j;
        if (e == null)
        {
            j = -1;
        } else
        {
            j = e.read(a);
        }
        b = j;
        if (b == 0 || b < -1)
        {
            throw new IllegalStateException((new StringBuilder("InputStream#read(byte[]) returned invalid result: ")).append(b).append("\nThe InputStream implementation is buggy.").toString());
        }
        if (b == -1)
        {
            b = 0;
            if (flag)
            {
                throw lj.gE();
            } else
            {
                return false;
            }
        }
        b = b + c;
        j = f + b;
        if (j > g)
        {
            c = j - g;
            b = b - c;
        } else
        {
            c = 0;
        }
        j = f + b + c;
        if (j > i || j < 0)
        {
            throw lj.gG();
        } else
        {
            return true;
        }
    }

    private byte c()
    {
        if (d == b)
        {
            a(true);
        }
        byte abyte0[] = a;
        int j = d;
        d = j + 1;
        return abyte0[j];
    }

    public final int a()
    {
        int j = c();
        if (j < 0) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        j &= 0x7f;
        byte byte0 = c();
        if (byte0 >= 0)
        {
            return j | byte0 << 7;
        }
        j |= (byte0 & 0x7f) << 7;
        byte0 = c();
        if (byte0 >= 0)
        {
            return j | byte0 << 14;
        }
        j |= (byte0 & 0x7f) << 14;
        int l = c();
        if (l >= 0)
        {
            return j | l << 21;
        }
        byte0 = c();
        l = j | (l & 0x7f) << 21 | byte0 << 28;
        j = l;
        if (byte0 < 0)
        {
            int k = 0;
label0:
            do
            {
label1:
                {
                    if (k >= 5)
                    {
                        break label1;
                    }
                    j = l;
                    if (c() >= 0)
                    {
                        break label0;
                    }
                    k++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw lj.gF();
    }

    public final boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (d == b)
        {
            flag = flag1;
            if (!a(false))
            {
                flag = true;
            }
        }
        return flag;
    }
}
