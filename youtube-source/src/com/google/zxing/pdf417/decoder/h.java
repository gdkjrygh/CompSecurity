// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.g;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            g, d, a, c, 
//            b

final class h extends com.google.zxing.pdf417.decoder.g
{

    private final boolean a;

    h(c c1, boolean flag)
    {
        super(c1);
        a = flag;
    }

    private void a(d ad[], a a1)
    {
        int i = 0;
_L7:
        if (i >= ad.length) goto _L2; else goto _L1
_L1:
        d d1 = ad[i];
        if (ad[i] == null) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        l = d1.g() % 30;
        k = d1.h();
        if (k <= a1.c()) goto _L6; else goto _L5
_L5:
        ad[i] = null;
_L4:
        i++;
          goto _L7
_L6:
        int j = k;
        if (!a)
        {
            j = k + 2;
        }
        switch (j % 3)
        {
        case 0: // '\0'
            if (l * 3 + 1 != a1.d())
            {
                ad[i] = null;
            }
            break;

        case 1: // '\001'
            if (l / 3 != a1.b() || l % 3 != a1.e())
            {
                ad[i] = null;
            }
            break;

        case 2: // '\002'
            if (l + 1 != a1.a())
            {
                ad[i] = null;
            }
            break;
        }
        if (true) goto _L4; else goto _L2
_L2:
    }

    final int a(a a1)
    {
        d ad1[] = b();
        d ad[] = b();
        int k = ad.length;
        for (int i = 0; i < k; i++)
        {
            d d1 = ad[i];
            if (d1 != null)
            {
                d1.b();
            }
        }

        a(ad1, a1);
        Object obj1 = a();
        float f;
        Object obj;
        int j;
        int l;
        int l2;
        int i4;
        if (a)
        {
            obj = ((c) (obj1)).e();
        } else
        {
            obj = ((c) (obj1)).f();
        }
        if (a)
        {
            obj1 = ((c) (obj1)).g();
        } else
        {
            obj1 = ((c) (obj1)).h();
        }
        l2 = b((int)((g) (obj)).b());
        i4 = b((int)((g) (obj1)).b());
        f = (float)(i4 - l2) / (float)a1.c();
        k = -1;
        l = 0;
        j = 1;
        while (l2 < i4) 
        {
            if (ad1[l2] != null)
            {
                obj = ad1[l2];
                int i3 = ((d) (obj)).h() - k;
                int j1;
                if (i3 == 0)
                {
                    int i1 = l + 1;
                    l = k;
                    k = j;
                    j = i1;
                } else
                if (i3 == 1)
                {
                    k = Math.max(j, l);
                    l = ((d) (obj)).h();
                    j = 1;
                } else
                if (i3 < 0)
                {
                    ad1[l2] = null;
                    int k1 = j;
                    i3 = k;
                    j = l;
                    k = k1;
                    l = i3;
                } else
                if (((d) (obj)).h() >= a1.c())
                {
                    ad1[l2] = null;
                    int l1 = j;
                    i3 = k;
                    j = l;
                    k = l1;
                    l = i3;
                } else
                if (i3 > l2)
                {
                    ad1[l2] = null;
                    int i2 = j;
                    i3 = k;
                    j = l;
                    k = i2;
                    l = i3;
                } else
                {
                    if (j > 2)
                    {
                        i3 *= j - 2;
                    }
                    boolean flag;
                    int l3;
                    if (i3 >= l2)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    l3 = 1;
                    while (l3 <= i3 && !flag) 
                    {
                        if (ad1[l2 - l3] != null)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        l3++;
                    }
                    if (flag)
                    {
                        ad1[l2] = null;
                        int j2 = j;
                        int j3 = k;
                        j = l;
                        k = j2;
                        l = j3;
                    } else
                    {
                        l = ((d) (obj)).h();
                        k = j;
                        j = 1;
                    }
                }
            } else
            {
                int k2 = j;
                int k3 = k;
                j = l;
                k = k2;
                l = k3;
            }
            l2++;
            j1 = l;
            l = j;
            j = k;
            k = j1;
        }
        return (int)((double)f + 0.5D);
    }

    final int[] c()
    {
        a a1 = d();
        if (a1 != null) goto _L2; else goto _L1
_L1:
        int ai[] = null;
_L4:
        return ai;
_L2:
        Object obj = a();
        float f;
        int i1;
        int k1;
        byte byte0;
        int i2;
        int j2;
        if (a)
        {
            ai = ((c) (obj)).e();
        } else
        {
            ai = ((c) (obj)).f();
        }
        if (a)
        {
            obj = ((c) (obj)).g();
        } else
        {
            obj = ((c) (obj)).h();
        }
        i1 = b((int)ai.b());
        j2 = b((int)((g) (obj)).b());
        f = (float)(j2 - i1) / (float)a1.c();
        ai = b();
        byte0 = -1;
        k1 = 1;
        i2 = 0;
        while (i1 < j2) 
        {
            int i = i2;
            int l1 = k1;
            int k = byte0;
            if (ai[i1] != null)
            {
                obj = ai[i1];
                ((d) (obj)).b();
                i = ((d) (obj)).h() - byte0;
                if (i == 0)
                {
                    i = i2 + 1;
                    k = byte0;
                    l1 = k1;
                } else
                if (i == 1)
                {
                    l1 = Math.max(k1, i2);
                    k = ((d) (obj)).h();
                    i = 1;
                } else
                if (((d) (obj)).h() >= a1.c())
                {
                    ai[i1] = null;
                    i = i2;
                    l1 = k1;
                    k = byte0;
                } else
                {
                    k = ((d) (obj)).h();
                    i = 1;
                    l1 = k1;
                }
            }
            i1++;
            i2 = i;
            k1 = l1;
            byte0 = k;
        }
        int j = (int)((double)f + 0.5D);
        int ai1[] = new int[a1.c()];
        d ad[] = b();
        int l = ad.length;
        j = 0;
        do
        {
            ai = ai1;
            if (j >= l)
            {
                continue;
            }
            d d1 = ad[j];
            if (d1 != null)
            {
                int j1 = d1.h();
                ai1[j1] = ai1[j1] + 1;
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final a d()
    {
        d ad[];
        Object obj;
        b b1;
        b b2;
        b b3;
        int i;
        int l;
        ad = b();
        obj = new b();
        b1 = new b();
        b2 = new b();
        b3 = new b();
        l = ad.length;
        i = 0;
_L8:
        d d1;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        d1 = ad[i];
        if (d1 == null) goto _L2; else goto _L1
_L1:
        int j;
        int i1;
        d1.b();
        i1 = d1.g() % 30;
        int k = d1.h();
        j = k;
        if (!a)
        {
            j = k + 2;
        }
        j % 3;
        JVM INSTR tableswitch 0 2: default 132
    //                   0 141
    //                   1 154
    //                   2 175;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_175;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L2:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        b1.a(i1 * 3 + 1);
          goto _L2
_L5:
        b3.a(i1 / 3);
        b2.a(i1 % 3);
          goto _L2
        ((b) (obj)).a(i1 + 1);
          goto _L2
        if (((b) (obj)).a().length == 0 || b1.a().length == 0 || b2.a().length == 0 || b3.a().length == 0 || ((b) (obj)).a()[0] <= 0 || b1.a()[0] + b2.a()[0] < 3 || b1.a()[0] + b2.a()[0] > 90)
        {
            return null;
        } else
        {
            obj = new a(((b) (obj)).a()[0], b1.a()[0], b2.a()[0], b3.a()[0]);
            a(ad, ((a) (obj)));
            return ((a) (obj));
        }
    }

    final boolean e()
    {
        return a;
    }

    public final String toString()
    {
        return (new StringBuilder("IsLeft: ")).append(a).append('\n').append(super.toString()).toString();
    }
}
