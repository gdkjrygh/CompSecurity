// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            gu, g1, aR, bm, 
//            gA, fw, gh, gd, 
//            cp

final class g4 extends gu
{

    private static final String z;
    private final boolean c;

    g4(gA ga, boolean flag)
    {
        super(ga);
        c = flag;
    }

    private void a(aR aar[], bm bm1)
    {
        int i;
        int l;
        l = g1.a;
        i = 0;
_L9:
        aR ar;
        if (i >= aar.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ar = aar[i];
        if (aar[i] == null && l == 0) goto _L2; else goto _L1
_L1:
        int k;
        int i1;
        i1 = ar.e() % 30;
        k = ar.f();
        if (k <= bm1.e()) goto _L4; else goto _L3
_L3:
        aar[i] = null;
        if (l == 0) goto _L2; else goto _L4
_L4:
        int j;
        j = k;
        if (!c)
        {
            j = k + 2;
        }
        j % 3;
        JVM INSTR tableswitch 0 2: default 112
    //                   0 124
    //                   1 147
    //                   2 179;
           goto _L2 _L5 _L6 _L7
_L2:
        i++;
        if (l == 0) goto _L9; else goto _L8
_L8:
        return;
_L5:
        if (i1 * 3 + 1 == bm1.c()) goto _L2; else goto _L10
_L10:
        aar[i] = null;
        if (l == 0) goto _L2; else goto _L6
_L6:
        if (i1 / 3 == bm1.b() && i1 % 3 == bm1.a()) goto _L2; else goto _L11
_L11:
        aar[i] = null;
        if (l == 0) goto _L2; else goto _L7
_L7:
        if (i1 + 1 != bm1.d())
        {
            aar[i] = null;
        }
          goto _L2
    }

    int a(bm bm1)
    {
        int i;
        int j1;
        int l1 = g1.a;
        Object obj1 = b();
        float f;
        Object obj;
        int j;
        int k;
        int l;
        int i1;
        int k1;
        int i2;
        int j2;
        if (c)
        {
            obj = ((gA) (obj1)).g();
        } else
        {
            obj = ((gA) (obj1)).e();
        }
        if (c)
        {
            obj1 = ((gA) (obj1)).i();
        } else
        {
            obj1 = ((gA) (obj1)).f();
        }
        k1 = a((int)((fw) (obj)).b());
        i2 = a((int)((fw) (obj1)).b());
        f = (float)(i2 - k1) / (float)bm1.e();
        obj = a();
        l = -1;
        i1 = 0;
        k = 1;
label0:
        {
            if (k1 >= i2)
            {
                break; /* Loop/switch isn't completed */
            }
            if (obj[k1] == null)
            {
                i = i1;
                j1 = k;
                j = l;
                if (l1 == 0)
                {
                    break label0;
                }
            }
            obj1 = obj[k1];
            ((aR) (obj1)).h();
            j2 = ((aR) (obj1)).f() - l;
            i = i1;
            if (j2 == 0)
            {
                i1++;
                i = i1;
                j1 = k;
                j = l;
                if (l1 == 0)
                {
                    break label0;
                }
                i = i1;
            }
            j1 = i;
            i1 = k;
            j = l;
            if (j2 == 1)
            {
                i = Math.max(k, i);
                j = ((aR) (obj1)).f();
                if (l1 == 0)
                {
                    break MISSING_BLOCK_LABEL_333;
                }
                j1 = 1;
                i1 = i;
            }
            if (((aR) (obj1)).f() >= bm1.e())
            {
                obj[k1] = null;
                i = j1;
                j1 = i1;
                if (l1 == 0)
                {
                    break label0;
                }
            }
            j = ((aR) (obj1)).f();
            i = 1;
            j1 = i1;
        }
_L4:
        k1++;
        i1 = i;
        k = j1;
        l = j;
        if (l1 == 0) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_88;
_L1:
        i = (int)((double)f + 0.5D);
        if (gh.a != 0)
        {
            g1.a = l1 + 1;
        }
        return i;
        j1 = i;
        i = 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean a()
    {
        return c;
    }

    int b(bm bm1)
    {
        int l;
        int i1;
        int j1;
        int k1;
        int i2 = g1.a;
        aR aar[] = a();
        c();
        a(aar, bm1);
        Object obj1 = b();
        float f;
        Object obj;
        int j2;
        if (c)
        {
            obj = ((gA) (obj1)).g();
        } else
        {
            obj = ((gA) (obj1)).e();
        }
        if (c)
        {
            obj1 = ((gA) (obj1)).i();
        } else
        {
            obj1 = ((gA) (obj1)).f();
        }
        k1 = a((int)((fw) (obj)).b());
        j2 = a((int)((fw) (obj1)).b());
        f = (float)(j2 - k1) / (float)bm1.e();
        l = 0;
        i1 = 1;
        j1 = -1;
_L4:
        if (k1 >= j2) goto _L2; else goto _L1
_L1:
label0:
        {
            int i;
            int j;
            int k;
            if (aar[k1] == null)
            {
                i = l;
                j = i1;
                k = j1;
                if (i2 == 0)
                {
                    break label0;
                }
                gh.a++;
            }
            obj = aar[k1];
            int l1 = ((aR) (obj)).f() - j1;
            j = l;
            if (l1 == 0)
            {
                l++;
                i = l;
                j = i1;
                k = j1;
                if (i2 == 0)
                {
                    break label0;
                }
                j = l;
            }
            l = j;
            i = i1;
            k = j1;
            if (l1 == 1)
            {
                l = Math.max(i1, j);
                i = 1;
                j1 = 1;
                i1 = ((aR) (obj)).f();
                j = l;
                k = i1;
                if (i2 == 0)
                {
                    break label0;
                }
                k = i1;
                i = l;
                l = j1;
            }
            if (l1 < 0 || ((aR) (obj)).f() >= bm1.e() || l1 > k1)
            {
                aar[k1] = null;
                if (i2 == 0)
                {
                    break MISSING_BLOCK_LABEL_464;
                }
            }
            if (i <= 2 || i2 != 0)
            {
                j1 = l1;
            } else
            {
                j1 = (i - 2) * l1;
            }
            if (j1 >= k1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            l1 = 1;
            do
            {
                j = i1;
                if (l1 > j1)
                {
                    break;
                }
                j = i1;
                if (i1 != 0)
                {
                    break;
                }
                if (aar[k1 - l1] != null)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                l1++;
                i1 = j;
            } while (i2 == 0);
            if (j != 0)
            {
                aar[k1] = null;
                if (i2 == 0)
                {
                    break MISSING_BLOCK_LABEL_464;
                }
            }
            k = ((aR) (obj)).f();
            l = 1;
            j = i;
            i = l;
        }
_L5:
        if (i2 == 0) goto _L3; else goto _L2
_L2:
        return (int)((double)f + 0.5D);
_L3:
        k1++;
        l = i;
        i1 = j;
        j1 = k;
          goto _L4
        j = i;
        i = l;
          goto _L5
    }

    int[] b()
    {
        Object obj;
        int j;
        j = g1.a;
        obj = d();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((int []) (obj));
_L2:
        a(((bm) (obj)));
        int ai[] = new int[((bm) (obj)).e()];
        aR aar[] = a();
        int k = aar.length;
        int i = 0;
        do
        {
            obj = ai;
            if (i >= k)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = aar[i];
            if (obj != null)
            {
                int l = ((aR) (obj)).f();
                if (l >= ai.length)
                {
                    throw gd.a();
                }
                ai[l] = ai[l] + 1;
            }
            i++;
            if (j != 0)
            {
                return ai;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    void c()
    {
        int j = g1.a;
        aR aar[] = a();
        int k = aar.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            aR ar = aar[i];
            if (ar != null)
            {
                ar.h();
            }
            i++;
        } while (j == 0);
    }

    bm d()
    {
        aR aar[];
        Object obj;
        cp cp1;
        cp cp2;
        cp cp3;
        int i;
        int l;
        int i1;
        l = g1.a;
        aar = a();
        obj = new cp();
        cp1 = new cp();
        cp2 = new cp();
        cp3 = new cp();
        i1 = aar.length;
        i = 0;
_L10:
        if (i >= i1) goto _L2; else goto _L1
_L1:
        aR ar = aar[i];
        if (ar == null && l == 0) goto _L4; else goto _L3
_L3:
        int j;
        int j1;
        ar.h();
        j1 = ar.e() % 30;
        int k = ar.f();
        j = k;
        if (!c)
        {
            j = k + 2;
        }
        j % 3;
        JVM INSTR tableswitch 0 2: default 144
    //                   0 232
    //                   1 247
    //                   2 270;
           goto _L4 _L5 _L6 _L7
_L4:
        if (l == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        if (((cp) (obj)).a().length == 0 || cp1.a().length == 0 || cp2.a().length == 0 || cp3.a().length == 0 || ((cp) (obj)).a()[0] < 1 || cp1.a()[0] + cp2.a()[0] < 3 || cp1.a()[0] + cp2.a()[0] > 90)
        {
            return null;
        } else
        {
            obj = new bm(((cp) (obj)).a()[0], cp1.a()[0], cp2.a()[0], cp3.a()[0]);
            a(aar, ((bm) (obj)));
            return ((bm) (obj));
        }
_L5:
        cp1.a(j1 * 3 + 1);
        if (l == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        cp3.a(j1 / 3);
        cp2.a(j1 % 3);
        if (l == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        ((cp) (obj)).a(j1 + 1);
        if (true) goto _L4; else goto _L8
_L8:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public String toString()
    {
        return (new StringBuilder()).append(z).append(c).append('\n').append(super.toString()).toString();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\030c2\004\006%*^".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 96;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 81;
          goto _L8
_L3:
        byte0 = 16;
          goto _L8
_L4:
        byte0 = 126;
          goto _L8
        byte0 = 97;
          goto _L8
    }
}
