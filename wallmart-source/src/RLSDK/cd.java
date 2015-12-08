// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package RLSDK:
//            bz, y, cb, ce, 
//            ca, aj, ad, ae, 
//            cc, u, q, ab

public final class cd extends bz
{

    private static final int g[] = {
        1, 10, 34, 70, 126
    };
    private static final int h[] = {
        4, 20, 48, 81
    };
    private static final int i[] = {
        0, 161, 961, 2015, 2715
    };
    private static final int j[] = {
        0, 336, 1036, 1516
    };
    private static final int k[] = {
        8, 6, 4, 3, 1
    };
    private static final int l[] = {
        2, 4, 6, 8
    };
    private static final int m[][];
    private final Vector n = new Vector();
    private final Vector o = new Vector();

    public cd()
    {
    }

    private ca a(aj aj1, cb cb1, boolean flag)
        throws y
    {
        int j1;
        boolean flag1;
        int i2;
        int k2;
        int l2;
        int k3;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        int l3;
        int i4;
        int j4;
        int ai[] = b;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        ai[4] = 0;
        ai[5] = 0;
        ai[6] = 0;
        ai[7] = 0;
        float f;
        float af[];
        float af1[];
        int k1;
        if (flag)
        {
            b(aj1, cb1.b()[0], ai);
        } else
        {
            a(aj1, cb1.b()[1] + 1, ai);
            k1 = 0;
            i1 = ai.length - 1;
            while (k1 < i1) 
            {
                i2 = ai[k1];
                ai[k1] = ai[i1];
                ai[i1] = i2;
                k1++;
                i1--;
            }
        }
        if (flag)
        {
            k1 = 16;
        } else
        {
            k1 = 15;
        }
        f = (float)a(ai) / (float)k1;
        aj1 = e;
        cb1 = this.f;
        af = c;
        af1 = d;
        i2 = 0;
        while (i2 < ai.length) 
        {
            float f1 = (float)ai[i2] / f;
            int j2 = (int)(0.5F + f1);
            int i1;
            if (j2 <= 0)
            {
                i1 = 1;
            } else
            {
                i1 = j2;
                if (j2 > 8)
                {
                    i1 = 8;
                }
            }
            j2 = i2 >> 1;
            if ((i2 & 1) == 0)
            {
                aj1[j2] = i1;
                af[j2] = f1 - (float)i1;
            } else
            {
                cb1[j2] = i1;
                af1[j2] = f1 - (float)i1;
            }
            i2++;
        }
        l3 = a(e);
        i4 = a(this.f);
        j4 = (l3 + i4) - k1;
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if ((l3 & 1) == j1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if ((i4 & 1) == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        k2 = 0;
        k3 = 0;
        i2 = 0;
        j1 = 0;
        flag1 = false;
        flag4 = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (l3 <= 12) goto _L4; else goto _L3
_L3:
        l2 = 1;
_L9:
        if (i4 > 12)
        {
            j1 = 1;
            i2 = k3;
            k2 = l2;
        } else
        {
            j1 = ((flag4) ? 1 : 0);
            k2 = l2;
            i2 = k3;
            if (i4 < 4)
            {
                flag1 = true;
                j1 = ((flag4) ? 1 : 0);
                k2 = l2;
                i2 = k3;
            }
        }
_L6:
        if (j4 == 1)
        {
            if (flag3)
            {
                if (flag2)
                {
                    throw y.a();
                }
                k2 = 1;
            } else
            {
                if (!flag2)
                {
                    throw y.a();
                }
                j1 = 1;
            }
        } else
        if (j4 == -1)
        {
            if (flag3)
            {
                if (flag2)
                {
                    throw y.a();
                }
                i2 = 1;
            } else
            {
                if (!flag2)
                {
                    throw y.a();
                }
                flag1 = true;
            }
        } else
        if (j4 == 0)
        {
            if (!flag3)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!flag2)
            {
                throw y.a();
            }
            if (l3 < i4)
            {
                i2 = 1;
                j1 = 1;
            } else
            {
                k2 = 1;
                flag1 = true;
            }
        } else
        {
            throw y.a();
        }
          goto _L5
_L4:
        l2 = j1;
        if (l3 < 4)
        {
            k3 = 1;
            l2 = j1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (l3 > 11)
        {
            l2 = 1;
            k3 = k2;
        } else
        {
            l2 = i2;
            k3 = k2;
            if (l3 < 5)
            {
                k3 = 1;
                l2 = i2;
            }
        }
        if (i4 > 10)
        {
            j1 = 1;
            k2 = l2;
            i2 = k3;
        } else
        {
            j1 = ((flag4) ? 1 : 0);
            k2 = l2;
            i2 = k3;
            if (i4 < 4)
            {
                flag1 = true;
                j1 = ((flag4) ? 1 : 0);
                k2 = l2;
                i2 = k3;
            }
        }
          goto _L6
        if (!flag2) goto _L5; else goto _L7
_L7:
        throw y.a();
_L5:
        if (i2 != 0)
        {
            if (k2 != 0)
            {
                throw y.a();
            }
            a(e, c);
        }
        if (k2 != 0)
        {
            b(e, c);
        }
        if (flag1)
        {
            if (j1 != 0)
            {
                throw y.a();
            }
            a(this.f, c);
        }
        if (j1 != 0)
        {
            b(this.f, d);
        }
        i2 = aj1.length - 1;
        int l1 = 0;
        for (j1 = 0; i2 >= 0; j1 = k2 + j1)
        {
            int i3 = aj1[i2];
            k2 = aj1[i2];
            i2--;
            l1 = l1 * 9 + i3;
        }

        int j3 = 0;
        k2 = 0;
        for (i2 = cb1.length - 1; i2 >= 0; i2--)
        {
            j3 = j3 * 9 + cb1[i2];
            k2 += cb1[i2];
        }

        l1 = j3 * 3 + l1;
        if (flag)
        {
            if ((j1 & 1) != 0 || j1 > 12 || j1 < 4)
            {
                throw y.a();
            } else
            {
                j1 = (12 - j1) / 2;
                k2 = k[j1];
                i2 = ce.a(aj1, k2, false);
                k2 = ce.a(cb1, 9 - k2, true);
                return new ca(i2 * g[j1] + k2 + i[j1], l1);
            }
        }
        if ((k2 & 1) != 0 || k2 > 10 || k2 < 4)
        {
            throw y.a();
        }
        j1 = (10 - k2) / 2;
        i2 = l[j1];
        return new ca(ce.a(aj1, i2, true) + ce.a(cb1, 9 - i2, false) * h[j1] + j[j1], l1);
        if (true) goto _L9; else goto _L8
_L8:
    }

    private cc a(aj aj1, boolean flag, int i1, Hashtable hashtable)
    {
        Object obj;
        int j1;
        j1 = 0;
        float f;
        float f1;
        int ai[];
        int k1;
        int l1;
        int i2;
        int j2;
        boolean flag1;
        boolean flag2;
        try
        {
            obj = a;
        }
        // Misplaced declaration of an exception variable
        catch (aj aj1)
        {
            return null;
        }
        obj[0] = 0;
        obj[1] = 0;
        obj[2] = 0;
        obj[3] = 0;
        j2 = aj1.b;
        flag1 = false;
_L19:
        flag2 = flag1;
        if (j1 >= j2) goto _L2; else goto _L1
_L20:
        if (l1 >= j2) goto _L4; else goto _L3
_L3:
        if (!(aj1.a(l1) ^ flag1)) goto _L6; else goto _L5
_L5:
        obj[k1] = obj[k1] + 1;
          goto _L7
_L6:
        if (k1 != 3)
        {
            break MISSING_BLOCK_LABEL_561;
        }
        if (!b(((int []) (obj)))) goto _L9; else goto _L8
_L8:
        ai = new int[2];
        ai[0] = j1;
        ai[1] = l1;
        flag1 = aj1.a(ai[0]);
        j1 = ai[0] - 1;
_L11:
        if (j1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(aj1.a(j1) ^ flag1))
        {
            break; /* Loop/switch isn't completed */
        }
        j1--;
        if (true) goto _L11; else goto _L10
_L4:
        throw y.a();
_L10:
        l1 = j1 + 1;
        k1 = ai[0];
        obj = a;
        j1 = obj.length - 1;
        break MISSING_BLOCK_LABEL_587;
        while (j1 > 0) 
        {
            obj[j1] = obj[j1 - 1];
            j1--;
        }
        obj[0] = k1 - l1;
        i2 = a(((int []) (obj)), m);
        k1 = ai[1];
        if (!flag) goto _L13; else goto _L12
_L12:
        j1 = aj1.b - 1 - l1;
        k1 = aj1.b - 1 - k1;
_L17:
        obj = new cb(i2, new int[] {
            l1, ai[1]
        }, j1, k1, i1);
        if (hashtable != null) goto _L15; else goto _L14
_L14:
        hashtable = null;
_L16:
        if (hashtable == null)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        f1 = (float)(ai[0] + ai[1]) / 2.0F;
        f = f1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        f = (float)(aj1.b - 1) - f1;
        hashtable.a(new ad(f, i1));
        hashtable = a(aj1, ((cb) (obj)), true);
        aj1 = a(aj1, ((cb) (obj)), false);
        return new cc(hashtable.a() * 1597 + aj1.a(), hashtable.b() + aj1.b() * 4, ((cb) (obj)));
_L15:
        hashtable = (ae)hashtable.get(u.h);
        if (true) goto _L16; else goto _L13
_L13:
        j1 = l1;
          goto _L17
_L1:
        if (!aj1.a(j1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag1;
        if (flag == flag1) goto _L2; else goto _L18
_L18:
        j1++;
          goto _L19
_L2:
        l1 = j1;
        flag1 = flag2;
        k1 = 0;
          goto _L20
_L7:
        l1++;
          goto _L20
_L9:
        j1 = obj[0] + obj[1] + j1;
        obj[0] = obj[2];
        obj[1] = obj[3];
        obj[2] = 0;
        obj[3] = 0;
        i2 = k1 - 1;
        k1 = j1;
        j1 = i2;
_L21:
        obj[j1] = 1;
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i2 = k1;
        k1 = j1;
        j1 = i2;
          goto _L7
        i2 = j1;
        j1 = k1 + 1;
        k1 = i2;
          goto _L21
    }

    private static void a(Vector vector, cc cc1)
    {
        if (cc1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        Enumeration enumeration = vector.elements();
        cc cc2;
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break; /* Loop/switch isn't completed */
            }
            cc2 = (cc)enumeration.nextElement();
        } while (cc2.a() != cc1.a());
        cc2.e();
        flag = true;
_L4:
        if (!flag)
        {
            vector.addElement(cc1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final ab a(int i1, aj aj1, Hashtable hashtable)
        throws y
    {
        cc cc1 = a(aj1, false, i1, hashtable);
        a(n, cc1);
        aj1.a();
        hashtable = a(aj1, true, i1, hashtable);
        a(o, ((cc) (hashtable)));
        aj1.a();
        int j2 = n.size();
        int k2 = o.size();
        for (int j1 = 0; j1 < j2; j1++)
        {
            Object obj = (cc)n.elementAt(j1);
            if (((cc) (obj)).d() <= 1)
            {
                continue;
            }
            for (int k1 = 0; k1 < k2; k1++)
            {
                hashtable = (cc)o.elementAt(k1);
                if (hashtable.d() <= 1)
                {
                    continue;
                }
                ((cc) (obj)).c().a();
                hashtable.c().a();
                int l2 = ((cc) (obj)).b();
                int i3 = hashtable.b();
                int l1 = ((cc) (obj)).c().a() * 9 + hashtable.c().a();
                i1 = l1;
                if (l1 > 72)
                {
                    i1 = l1 - 1;
                }
                l1 = i1;
                if (i1 > 8)
                {
                    l1 = i1 - 1;
                }
                Object obj1;
                if ((l2 + i3 * 16) % 79 == l1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 == 0)
                {
                    continue;
                }
                obj1 = String.valueOf(0x453af5L * (long)((cc) (obj)).a() + (long)hashtable.a());
                aj1 = new StringBuffer(14);
                for (i1 = 13 - ((String) (obj1)).length(); i1 > 0; i1--)
                {
                    aj1.append('0');
                }

                aj1.append(((String) (obj1)));
                i1 = 0;
                j1 = 0;
                for (; i1 < 13; i1++)
                {
                    int i2 = aj1.charAt(i1) - 48;
                    k1 = i2;
                    if ((i1 & 1) == 0)
                    {
                        k1 = i2 * 3;
                    }
                    j1 += k1;
                }

                j1 = 10 - j1 % 10;
                i1 = j1;
                if (j1 == 10)
                {
                    i1 = 0;
                }
                aj1.append(i1);
                ad aad1[] = ((cc) (obj)).c().c();
                ad aad[] = hashtable.c().c();
                aj1 = String.valueOf(aj1.toString());
                hashtable = aad1[0];
                aad1 = aad1[1];
                ad ad1 = aad[0];
                aad = aad[1];
                q q1 = q.l;
                return new ab(aj1, null, new ad[] {
                    hashtable, aad1, ad1, aad
                }, q1);
            }

        }

        throw y.a();
    }

    public final void a()
    {
        n.setSize(0);
        o.setSize(0);
    }

    static 
    {
        int ai[] = {
            2, 3, 8, 1
        };
        m = (new int[][] {
            new int[] {
                3, 8, 2, 1
            }, new int[] {
                3, 5, 5, 1
            }, new int[] {
                3, 3, 7, 1
            }, new int[] {
                3, 1, 9, 1
            }, new int[] {
                2, 7, 4, 1
            }, new int[] {
                2, 5, 6, 1
            }, ai, new int[] {
                1, 5, 7, 1
            }, new int[] {
                1, 3, 9, 1
            }
        });
    }
}
