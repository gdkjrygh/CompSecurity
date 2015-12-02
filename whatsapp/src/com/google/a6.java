// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            am

public final class a6
{

    public static final a6 b;
    public static final a6 c;
    public static final a6 e;
    public static final a6 f;
    public static final a6 g;
    public static final a6 j;
    public static final a6 l;
    public static int n;
    public static final a6 o;
    private static final String z;
    private final int a;
    private final int d;
    private final am h = new am(this, new int[] {
        0
    });
    private final int i;
    private final am k = new am(this, new int[] {
        1
    });
    private final int m[];
    private final int p[];

    public a6(int i1, int j1, int k1)
    {
        i = i1;
        d = j1;
        a = k1;
        p = new int[j1];
        m = new int[j1];
        int l1 = 0;
        k1 = 1;
        for (; l1 < j1; l1++)
        {
            p[l1] = k1;
            int i2 = k1 * 2;
            k1 = i2;
            if (i2 >= j1)
            {
                k1 = (i2 ^ i1) & j1 - 1;
            }
        }

        i1 = 0;
        while (i1 < j1 - 1) 
        {
            try
            {
                m[p[i1]] = i1;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            i1++;
        }
    }

    static int b(int i1, int j1)
    {
        return i1 ^ j1;
    }

    public int a()
    {
        return a;
    }

    int a(int i1)
    {
        return p[i1];
    }

    am a(int i1, int j1)
    {
        if (i1 < 0)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        if (j1 == 0)
        {
            am am1;
            try
            {
                am1 = h;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            return am1;
        } else
        {
            int ai[] = new int[i1 + 1];
            ai[0] = j1;
            return new am(this, ai);
        }
    }

    int b(int i1)
    {
        if (i1 == 0)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            return m[i1];
        }
    }

    am b()
    {
        return k;
    }

    public int c()
    {
        return d;
    }

    int c(int i1)
    {
        if (i1 == 0)
        {
            try
            {
                throw new ArithmeticException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            return p[d - m[i1] - 1];
        }
    }

    int c(int i1, int j1)
    {
        if (i1 == 0 || j1 == 0)
        {
            return 0;
        } else
        {
            return p[(m[i1] + m[j1]) % (d - 1)];
        }
    }

    am d()
    {
        return h;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z).append(Integer.toHexString(i)).append(',').append(d).append(')').toString();
    }

    static 
    {
        char ac[];
        int i1;
        int j1;
        ac = "uP\n\031\006".toCharArray();
        j1 = ac.length;
        i1 = 0;
_L7:
        char c1;
        if (j1 <= i1)
        {
            z = (new String(ac)).intern();
            l = new a6(4201, 4096, 1);
            j = new a6(1033, 1024, 1);
            f = new a6(67, 64, 1);
            b = new a6(19, 16, 1);
            g = new a6(285, 256, 0);
            e = new a6(301, 256, 1);
            c = e;
            o = f;
            return;
        }
        c1 = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 180
    //                   0 198
    //                   1 204
    //                   2 210
    //                   3 216;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_216;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 126;
_L8:
        ac[i1] = (char)(byte0 ^ c1);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 50;
          goto _L8
_L3:
        byte0 = 22;
          goto _L8
_L4:
        byte0 = 34;
          goto _L8
        byte0 = 41;
          goto _L8
    }
}
