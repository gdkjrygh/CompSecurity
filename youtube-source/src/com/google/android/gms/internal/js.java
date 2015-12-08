// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            lm, jw

public final class js
{

    private final byte a[];
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    private js(byte abyte0[], int i, int j)
    {
        f = 0x7fffffff;
        g = 64;
        h = 0x4000000;
        a = abyte0;
        b = i;
        c = i + j;
        d = i;
    }

    public static js a(byte abyte0[], int i, int j)
    {
        return new js(abyte0, i, j);
    }

    private void c(int i)
    {
        if (i < 0)
        {
            throw lm.gR();
        }
        if (d + i > f)
        {
            c(f - d);
            throw lm.gQ();
        }
        if (i <= c - d)
        {
            d = d + i;
            return;
        } else
        {
            throw lm.gQ();
        }
    }

    private int e()
    {
        int i = f();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = f();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = f();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = f();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = f();
        k = i | (k & 0x7f) << 21 | byte0 << 28;
        i = k;
        if (byte0 < 0)
        {
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= 5)
                    {
                        break label1;
                    }
                    i = k;
                    if (f() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw lm.gS();
    }

    private byte f()
    {
        if (d == c)
        {
            throw lm.gQ();
        } else
        {
            byte abyte0[] = a;
            int i = d;
            d = i + 1;
            return abyte0[i];
        }
    }

    public final int a()
    {
        boolean flag;
        if (d == c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e = 0;
            return 0;
        }
        e = e();
        if (e == 0)
        {
            throw lm.gT();
        } else
        {
            return e;
        }
    }

    public final void a(int i)
    {
        if (e != i)
        {
            throw lm.gU();
        } else
        {
            return;
        }
    }

    public final int b()
    {
        return e();
    }

    public final boolean b(int i)
    {
        switch (jw.a(i))
        {
        default:
            throw lm.gV();

        case 0: // '\0'
            e();
            return true;

        case 1: // '\001'
            i = f();
            int j = f();
            int l = f();
            int i1 = f();
            int j1 = f();
            int k1 = f();
            int l1 = f();
            int i2 = f();
            long l2 = i;
            l2 = j;
            l2 = l;
            l2 = i1;
            l2 = j1;
            l2 = k1;
            l2 = l1;
            l2 = i2;
            return true;

        case 2: // '\002'
            c(e());
            return true;

        case 3: // '\003'
            int k;
            do
            {
                k = a();
            } while (k != 0 && b(k));
            a(jw.a(jw.b(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            f();
            f();
            f();
            f();
            return true;
        }
    }

    public final String c()
    {
        int i = e();
        if (i <= c - d && i > 0)
        {
            String s = new String(a, d, i, "UTF-8");
            d = i + d;
            return s;
        }
        if (i < 0)
        {
            throw lm.gR();
        }
        if (d + i > f)
        {
            c(f - d);
            throw lm.gQ();
        }
        if (i <= c - d)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(a, d, abyte0, 0, i);
            d = i + d;
            return new String(abyte0, "UTF-8");
        } else
        {
            throw lm.gQ();
        }
    }

    public final long d()
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = f();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return -(l & 1L) ^ l >>> 1;
            }
        }

        throw lm.gS();
    }
}
