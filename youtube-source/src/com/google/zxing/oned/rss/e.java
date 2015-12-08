// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;
import com.google.zxing.f;
import com.google.zxing.g;
import com.google.zxing.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned.rss:
//            a, c, f, b, 
//            d

public final class e extends com.google.zxing.oned.rss.a
{

    private static final int a[] = {
        1, 10, 34, 70, 126
    };
    private static final int b[] = {
        4, 20, 48, 81
    };
    private static final int c[] = {
        0, 161, 961, 2015, 2715
    };
    private static final int d[] = {
        0, 336, 1036, 1516
    };
    private static final int e[] = {
        8, 6, 4, 3, 1
    };
    private static final int f[] = {
        2, 4, 6, 8
    };
    private static final int g[][];
    private final List h = new ArrayList();
    private final List i = new ArrayList();

    public e()
    {
    }

    private b a(a a1, c c1, boolean flag)
    {
        int k;
        boolean flag1;
        int j1;
        int l1;
        int i2;
        int l2;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        int i3;
        int j3;
        int k3;
        int ai[] = c();
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        ai[4] = 0;
        ai[5] = 0;
        ai[6] = 0;
        ai[7] = 0;
        float f1;
        float af[];
        float af1[];
        int l;
        if (flag)
        {
            b(a1, c1.b()[0], ai);
        } else
        {
            a(a1, c1.b()[1] + 1, ai);
            l = 0;
            j = ai.length - 1;
            while (l < j) 
            {
                j1 = ai[l];
                ai[l] = ai[j];
                ai[j] = j1;
                l++;
                j--;
            }
        }
        if (flag)
        {
            l = 16;
        } else
        {
            l = 15;
        }
        f1 = (float)a(ai) / (float)l;
        a1 = f();
        c1 = g();
        af = d();
        af1 = e();
        j1 = 0;
        while (j1 < ai.length) 
        {
            float f2 = (float)ai[j1] / f1;
            int k1 = (int)(0.5F + f2);
            int j;
            if (k1 <= 0)
            {
                j = 1;
            } else
            {
                j = k1;
                if (k1 > 8)
                {
                    j = 8;
                }
            }
            k1 = j1 >> 1;
            if ((j1 & 1) == 0)
            {
                a1[k1] = j;
                af[k1] = f2 - (float)j;
            } else
            {
                c1[k1] = j;
                af1[k1] = f2 - (float)j;
            }
            j1++;
        }
        i3 = a(f());
        j3 = a(g());
        k3 = (i3 + j3) - l;
        if (flag)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if ((i3 & 1) == k)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if ((j3 & 1) == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        l1 = 0;
        l2 = 0;
        j1 = 0;
        k = 0;
        flag1 = false;
        flag4 = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (i3 <= 12) goto _L4; else goto _L3
_L3:
        i2 = 1;
_L9:
        if (j3 > 12)
        {
            k = 1;
            j1 = l2;
            l1 = i2;
        } else
        {
            k = ((flag4) ? 1 : 0);
            l1 = i2;
            j1 = l2;
            if (j3 < 4)
            {
                flag1 = true;
                k = ((flag4) ? 1 : 0);
                l1 = i2;
                j1 = l2;
            }
        }
_L6:
        if (k3 == 1)
        {
            if (flag3)
            {
                if (flag2)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                l1 = 1;
            } else
            {
                if (!flag2)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                k = 1;
            }
        } else
        if (k3 == -1)
        {
            if (flag3)
            {
                if (flag2)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                j1 = 1;
            } else
            {
                if (!flag2)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag1 = true;
            }
        } else
        if (k3 == 0)
        {
            if (!flag3)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!flag2)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i3 < j3)
            {
                j1 = 1;
                k = 1;
            } else
            {
                l1 = 1;
                flag1 = true;
            }
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
          goto _L5
_L4:
        i2 = k;
        if (i3 < 4)
        {
            l2 = 1;
            i2 = k;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i3 > 11)
        {
            i2 = 1;
            l2 = l1;
        } else
        {
            i2 = j1;
            l2 = l1;
            if (i3 < 5)
            {
                l2 = 1;
                i2 = j1;
            }
        }
        if (j3 > 10)
        {
            k = 1;
            l1 = i2;
            j1 = l2;
        } else
        {
            k = ((flag4) ? 1 : 0);
            l1 = i2;
            j1 = l2;
            if (j3 < 4)
            {
                flag1 = true;
                k = ((flag4) ? 1 : 0);
                l1 = i2;
                j1 = l2;
            }
        }
          goto _L6
        if (!flag2) goto _L5; else goto _L7
_L7:
        throw NotFoundException.getNotFoundInstance();
_L5:
        if (j1 != 0)
        {
            if (l1 != 0)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            a(f(), d());
        }
        if (l1 != 0)
        {
            b(f(), d());
        }
        if (flag1)
        {
            if (k != 0)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            a(g(), d());
        }
        if (k != 0)
        {
            b(g(), e());
        }
        j1 = a1.length - 1;
        int i1 = 0;
        for (k = 0; j1 >= 0; k = l1 + k)
        {
            int j2 = a1[j1];
            l1 = a1[j1];
            j1--;
            i1 = i1 * 9 + j2;
        }

        int k2 = 0;
        l1 = 0;
        for (j1 = c1.length - 1; j1 >= 0; j1--)
        {
            k2 = k2 * 9 + c1[j1];
            l1 += c1[j1];
        }

        i1 = k2 * 3 + i1;
        if (flag)
        {
            if ((k & 1) != 0 || k > 12 || k < 4)
            {
                throw NotFoundException.getNotFoundInstance();
            } else
            {
                k = (12 - k) / 2;
                l1 = e[k];
                j1 = com.google.zxing.oned.rss.f.a(a1, l1, false);
                l1 = com.google.zxing.oned.rss.f.a(c1, 9 - l1, true);
                return new b(j1 * a[k] + l1 + c[k], i1);
            }
        }
        if ((l1 & 1) != 0 || l1 > 10 || l1 < 4)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        k = (10 - l1) / 2;
        j1 = f[k];
        return new b(com.google.zxing.oned.rss.f.a(a1, j1, true) + com.google.zxing.oned.rss.f.a(c1, 9 - j1, false) * b[k] + d[k], i1);
        if (true) goto _L9; else goto _L8
_L8:
    }

    private d a(a a1, boolean flag, int j, Map map)
    {
        int k = 0;
        float f1;
        float f2;
        Object obj;
        int ai[];
        int l;
        int i1;
        int j1;
        int k1;
        boolean flag1;
        boolean flag2;
        try
        {
            obj = b();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            return null;
        }
        obj[0] = 0;
        obj[1] = 0;
        obj[2] = 0;
        obj[3] = 0;
        k1 = a1.a();
        flag1 = false;
_L19:
        flag2 = flag1;
        if (k >= k1) goto _L2; else goto _L1
_L20:
        if (i1 >= k1) goto _L4; else goto _L3
_L3:
        if (!(a1.a(i1) ^ flag1)) goto _L6; else goto _L5
_L5:
        obj[l] = obj[l] + 1;
          goto _L7
_L6:
        if (l != 3)
        {
            break MISSING_BLOCK_LABEL_567;
        }
        if (!b(((int []) (obj)))) goto _L9; else goto _L8
_L8:
        ai = new int[2];
        ai[0] = k;
        ai[1] = i1;
        flag1 = a1.a(ai[0]);
        k = ai[0] - 1;
_L11:
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(a1.a(k) ^ flag1))
        {
            break; /* Loop/switch isn't completed */
        }
        k--;
        if (true) goto _L11; else goto _L10
_L4:
        throw NotFoundException.getNotFoundInstance();
_L10:
        i1 = k + 1;
        k = ai[0];
        obj = b();
        System.arraycopy(obj, 0, obj, 1, obj.length - 1);
        obj[0] = k - i1;
        j1 = a(((int []) (obj)), g);
        l = ai[1];
        if (!flag) goto _L13; else goto _L12
_L12:
        k = a1.a() - 1 - i1;
        l = a1.a() - 1 - l;
_L17:
        obj = new c(j1, new int[] {
            i1, ai[1]
        }, k, l, j);
        if (map != null) goto _L15; else goto _L14
_L14:
        map = null;
_L16:
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        f2 = (float)(ai[0] + ai[1]) / 2.0F;
        f1 = f2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        f1 = (float)(a1.a() - 1) - f2;
        map.a(new g(f1, j));
        map = a(a1, ((c) (obj)), true);
        a1 = a(a1, ((c) (obj)), false);
        return new d(map.a() * 1597 + a1.a(), map.b() + a1.b() * 4, ((c) (obj)));
_L15:
        map = (h)map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        if (true) goto _L16; else goto _L13
_L13:
        k = i1;
          goto _L17
_L1:
        if (!a1.a(k))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag1;
        if (flag == flag1) goto _L2; else goto _L18
_L18:
        k++;
          goto _L19
_L2:
        i1 = k;
        flag1 = flag2;
        l = 0;
          goto _L20
_L7:
        i1++;
          goto _L20
_L9:
        k = obj[0] + obj[1] + k;
        obj[0] = obj[2];
        obj[1] = obj[3];
        obj[2] = 0;
        obj[3] = 0;
        j1 = l - 1;
        l = k;
        k = j1;
_L21:
        obj[k] = 1;
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j1 = l;
        l = k;
        k = j1;
          goto _L7
        j1 = k;
        k = l + 1;
        l = j1;
          goto _L21
    }

    private static void a(Collection collection, d d1)
    {
        if (d1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        Iterator iterator = collection.iterator();
        d d2;
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            d2 = (d)iterator.next();
        } while (d2.a() != d1.a());
        d2.e();
        flag = true;
_L4:
        if (!flag)
        {
            collection.add(d1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final f a(int j, a a1, Map map)
    {
        d d1 = a(a1, false, j, map);
        a(((Collection) (h)), d1);
        a1.d();
        map = a(a1, true, j, map);
        a(((Collection) (i)), ((d) (map)));
        a1.d();
        int k1 = h.size();
        for (int k = 0; k < k1; k++)
        {
            Object obj = (d)h.get(k);
            if (((d) (obj)).d() <= 1)
            {
                continue;
            }
            int l1 = i.size();
            for (int l = 0; l < l1; l++)
            {
                map = (d)i.get(l);
                if (map.d() <= 1)
                {
                    continue;
                }
                int i2 = ((d) (obj)).b();
                int j2 = map.b();
                int i1 = ((d) (obj)).c().a() * 9 + map.c().a();
                j = i1;
                if (i1 > 72)
                {
                    j = i1 - 1;
                }
                i1 = j;
                if (j > 8)
                {
                    i1 = j - 1;
                }
                Object obj1;
                if ((i2 + j2 * 16) % 79 == i1)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (j == 0)
                {
                    continue;
                }
                obj1 = String.valueOf(0x453af5L * (long)((d) (obj)).a() + (long)map.a());
                a1 = new StringBuilder(14);
                for (j = 13 - ((String) (obj1)).length(); j > 0; j--)
                {
                    a1.append('0');
                }

                a1.append(((String) (obj1)));
                j = 0;
                for (k = 0; k < 13;)
                {
                    int j1 = a1.charAt(k) - 48;
                    l = j1;
                    if ((k & 1) == 0)
                    {
                        l = j1 * 3;
                    }
                    k++;
                    j = l + j;
                }

                k = 10 - j % 10;
                j = k;
                if (k == 10)
                {
                    j = 0;
                }
                a1.append(j);
                g ag1[] = ((d) (obj)).c().c();
                g ag[] = map.c().c();
                a1 = String.valueOf(a1.toString());
                map = ag1[0];
                ag1 = ag1[1];
                g g1 = ag[0];
                ag = ag[1];
                BarcodeFormat barcodeformat = BarcodeFormat.RSS_14;
                return new f(a1, null, new g[] {
                    map, ag1, g1, ag
                }, barcodeformat);
            }

        }

        throw NotFoundException.getNotFoundInstance();
    }

    public final void a()
    {
        h.clear();
        i.clear();
    }

    static 
    {
        int ai[] = {
            3, 8, 2, 1
        };
        int ai1[] = {
            3, 3, 7, 1
        };
        int ai2[] = {
            3, 1, 9, 1
        };
        int ai3[] = {
            2, 7, 4, 1
        };
        int ai4[] = {
            2, 3, 8, 1
        };
        int ai5[] = {
            1, 5, 7, 1
        };
        g = (new int[][] {
            ai, new int[] {
                3, 5, 5, 1
            }, ai1, ai2, ai3, new int[] {
                2, 5, 6, 1
            }, ai4, ai5, new int[] {
                1, 3, 9, 1
            }
        });
    }
}
