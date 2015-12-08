// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.b;
import com.google.zxing.g;
import com.google.zxing.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.qrcode.detector:
//            d, f

public class FinderPatternFinder
{

    private final b a;
    private final List b = new ArrayList();
    private boolean c;
    private final int d[] = new int[5];
    private final h e;

    public FinderPatternFinder(b b1, h h1)
    {
        a = b1;
        e = h1;
    }

    private static float a(int ai[], int i)
    {
        return (float)(i - ai[4] - ai[3]) - (float)ai[2] / 2.0F;
    }

    private static boolean a(int ai[])
    {
        int i;
        int j;
        i = 0;
        j = 0;
_L8:
        if (i >= 5) goto _L2; else goto _L1
_L1:
        int k = ai[i];
        if (k != 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        j += k;
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (j < 7) goto _L3; else goto _L5
_L5:
        i = (j << 8) / 7;
        j = i / 2;
        if (Math.abs(i - (ai[0] << 8)) >= j || Math.abs(i - (ai[1] << 8)) >= j || Math.abs(i * 3 - (ai[2] << 8)) >= j * 3 || Math.abs(i - (ai[3] << 8)) >= j || Math.abs(i - (ai[4] << 8)) >= j) goto _L3; else goto _L6
_L6:
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean a(int ai[], int i, int j)
    {
        float f1;
        int ai1[];
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        l = ai[0] + ai[1] + ai[2] + ai[3] + ai[4];
        float f2 = a(ai, j);
        i1 = (int)f2;
        j1 = ai[2];
        ai1 = a;
        k1 = ai1.e();
        int ai2[] = a();
        for (j = i; j >= 0 && ai1.a(i1, j); j--)
        {
            ai2[2] = ai2[2] + 1;
        }

        k = j;
        if (j < 0)
        {
            f1 = (0.0F / 0.0F);
        } else
        {
            for (; k >= 0 && !ai1.a(i1, k) && ai2[1] <= j1; k--)
            {
                ai2[1] = ai2[1] + 1;
            }

            if (k < 0 || ai2[1] > j1)
            {
                f1 = (0.0F / 0.0F);
            } else
            {
                for (; k >= 0 && ai1.a(i1, k) && ai2[0] <= j1; k--)
                {
                    ai2[0] = ai2[0] + 1;
                }

                if (ai2[0] > j1)
                {
                    f1 = (0.0F / 0.0F);
                } else
                {
                    for (i++; i < k1 && ai1.a(i1, i); i++)
                    {
                        ai2[2] = ai2[2] + 1;
                    }

                    j = i;
                    if (i == k1)
                    {
                        f1 = (0.0F / 0.0F);
                    } else
                    {
                        for (; j < k1 && !ai1.a(i1, j) && ai2[3] < j1; j++)
                        {
                            ai2[3] = ai2[3] + 1;
                        }

                        if (j == k1 || ai2[3] >= j1)
                        {
                            f1 = (0.0F / 0.0F);
                        } else
                        {
                            for (; j < k1 && ai1.a(i1, j) && ai2[4] < j1; j++)
                            {
                                ai2[4] = ai2[4] + 1;
                            }

                            if (ai2[4] >= j1)
                            {
                                f1 = (0.0F / 0.0F);
                            } else
                            if (Math.abs((ai2[0] + ai2[1] + ai2[2] + ai2[3] + ai2[4]) - l) * 5 >= l * 2)
                            {
                                f1 = (0.0F / 0.0F);
                            } else
                            if (a(ai2))
                            {
                                f1 = a(ai2, j);
                            } else
                            {
                                f1 = (0.0F / 0.0F);
                            }
                        }
                    }
                }
            }
        }
        if (Float.isNaN(f1)) goto _L2; else goto _L1
_L1:
        k = (int)f2;
        i1 = (int)f1;
        j1 = ai[2];
        ai = a;
        k1 = ai.d();
        ai1 = a();
        for (i = k; i >= 0 && ai.a(i, i1); i--)
        {
            ai1[2] = ai1[2] + 1;
        }

        j = i;
        float f3;
        float f4;
        if (i < 0)
        {
            f3 = (0.0F / 0.0F);
        } else
        {
            for (; j >= 0 && !ai.a(j, i1) && ai1[1] <= j1; j--)
            {
                ai1[1] = ai1[1] + 1;
            }

            if (j < 0 || ai1[1] > j1)
            {
                f3 = (0.0F / 0.0F);
            } else
            {
                for (; j >= 0 && ai.a(j, i1) && ai1[0] <= j1; j--)
                {
                    ai1[0] = ai1[0] + 1;
                }

                if (ai1[0] > j1)
                {
                    f3 = (0.0F / 0.0F);
                } else
                {
                    for (i = k + 1; i < k1 && ai.a(i, i1); i++)
                    {
                        ai1[2] = ai1[2] + 1;
                    }

                    j = i;
                    if (i == k1)
                    {
                        f3 = (0.0F / 0.0F);
                    } else
                    {
                        for (; j < k1 && !ai.a(j, i1) && ai1[3] < j1; j++)
                        {
                            ai1[3] = ai1[3] + 1;
                        }

                        if (j == k1 || ai1[3] >= j1)
                        {
                            f3 = (0.0F / 0.0F);
                        } else
                        {
                            for (; j < k1 && ai.a(j, i1) && ai1[4] < j1; j++)
                            {
                                ai1[4] = ai1[4] + 1;
                            }

                            if (ai1[4] >= j1)
                            {
                                f3 = (0.0F / 0.0F);
                            } else
                            if (Math.abs((ai1[0] + ai1[1] + ai1[2] + ai1[3] + ai1[4]) - l) * 5 >= l)
                            {
                                f3 = (0.0F / 0.0F);
                            } else
                            if (a(ai1))
                            {
                                f3 = a(ai1, j);
                            } else
                            {
                                f3 = (0.0F / 0.0F);
                            }
                        }
                    }
                }
            }
        }
        if (Float.isNaN(f3)) goto _L2; else goto _L3
_L3:
        f4 = (float)l / 7F;
        i = 0;
_L6:
        if (i >= b.size())
        {
            break MISSING_BLOCK_LABEL_1061;
        }
        ai = (d)b.get(i);
        if (!ai.a(f4, f1, f3)) goto _L5; else goto _L4
_L4:
        b.set(i, ai.b(f1, f3, f4));
        i = 1;
_L7:
        if (i == 0)
        {
            ai = new d(f3, f1, f4);
            b.add(ai);
            if (e != null)
            {
                e.a(ai);
            }
        }
        return true;
_L5:
        i++;
          goto _L6
_L2:
        return false;
        i = 0;
          goto _L7
    }

    private int[] a()
    {
        d[0] = 0;
        d[1] = 0;
        d[2] = 0;
        d[3] = 0;
        d[4] = 0;
        return d;
    }

    private boolean b()
    {
        float f2 = 0.0F;
        int j = b.size();
        Iterator iterator = b.iterator();
        float f1 = 0.0F;
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            d d1 = (d)iterator.next();
            if (d1.d() >= 2)
            {
                f1 = d1.c() + f1;
                i++;
            }
        } while (true);
        if (i >= 3)
        {
            float f3 = f1 / (float)j;
            for (Iterator iterator1 = b.iterator(); iterator1.hasNext();)
            {
                f2 += Math.abs(((d)iterator1.next()).c() - f3);
            }

            if (f2 <= 0.05F * f1)
            {
                return true;
            }
        }
        return false;
    }

    final f a(Map map)
    {
        int ai[];
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        boolean flag;
        if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j1 = a.e();
        k1 = a.d();
        j = (j1 * 3) / 228;
        float f1;
        float f2;
        float f3;
        d d1;
        Iterator iterator;
        boolean flag1;
        if (j < 3 || i != 0)
        {
            i = 3;
        } else
        {
            i = j;
        }
        flag = false;
        ai = new int[5];
        k = i - 1;
        l = i;
        if (k >= j1 || flag) goto _L2; else goto _L1
_L1:
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        ai[4] = 0;
        i = 0;
        j = 0;
_L4:
        if (j >= k1)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        if (!a.a(j, k))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = i;
        if ((i & 1) == 1)
        {
            i1 = i + 1;
        }
        ai[i1] = ai[i1] + 1;
        i = i1;
_L7:
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        if ((i & 1) != 0)
        {
            break MISSING_BLOCK_LABEL_520;
        }
        if (i != 4)
        {
            break MISSING_BLOCK_LABEL_499;
        }
        if (!a(ai))
        {
            break MISSING_BLOCK_LABEL_459;
        }
        if (!a(ai, k, j))
        {
            break MISSING_BLOCK_LABEL_419;
        }
        if (!c) goto _L6; else goto _L5
_L5:
        flag = b();
_L8:
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        ai[4] = 0;
        i = 0;
        l = 2;
          goto _L7
_L6:
        if (b.size() <= 1)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        iterator = b.iterator();
        map = null;
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_413;
                }
                d1 = (d)iterator.next();
            } while (d1.d() < 2);
            if (map != null)
            {
                break;
            }
            map = d1;
        } while (true);
        c = true;
        i = (int)(Math.abs(map.a() - d1.a()) - Math.abs(map.b() - d1.b())) / 2;
_L9:
        if (i > ai[2])
        {
            i = k + (i - ai[2] - 2);
            j = k1 - 1;
        } else
        {
            i = k;
        }
        k = i;
          goto _L8
        i = 0;
          goto _L9
        ai[0] = ai[2];
        ai[1] = ai[3];
        ai[2] = ai[4];
        ai[3] = 1;
        ai[4] = 0;
        i = 3;
          goto _L7
        ai[0] = ai[2];
        ai[1] = ai[3];
        ai[2] = ai[4];
        ai[3] = 1;
        ai[4] = 0;
        i = 3;
          goto _L7
        i++;
        ai[i] = ai[i] + 1;
          goto _L7
        ai[i] = ai[i] + 1;
          goto _L7
        i = l;
        flag1 = flag;
        if (a(ai))
        {
            i = l;
            flag1 = flag;
            if (a(ai, k, k1))
            {
                j = ai[0];
                i = j;
                flag1 = flag;
                if (c)
                {
                    flag1 = b();
                    i = j;
                }
            }
        }
        k += i;
        l = i;
        flag = flag1;
        break MISSING_BLOCK_LABEL_79;
_L2:
        i = b.size();
        if (i < 3)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (i > 3)
        {
            map = b.iterator();
            f2 = 0.0F;
            for (f1 = 0.0F; map.hasNext(); f1 = f3 * f3 + f1)
            {
                f3 = ((d)map.next()).c();
                f2 += f3;
            }

            f2 /= i;
            f1 = (float)Math.sqrt(f1 / (float)i - f2 * f2);
            Collections.sort(b, new FurthestFromAverageComparator(f2, null));
            f1 = Math.max(0.2F * f2, f1);
            for (i = 0; i < b.size() && b.size() > 3; i++)
            {
                if (Math.abs(((d)b.get(i)).c() - f2) > f1)
                {
                    b.remove(i);
                    i--;
                }
            }

        }
        if (b.size() > 3)
        {
            map = b.iterator();
            for (f1 = 0.0F; map.hasNext(); f1 = ((d)map.next()).c() + f1) { }
            f1 /= b.size();
            Collections.sort(b, new CenterComparator(f1, null));
            b.subList(3, b.size()).clear();
        }
        map = new d[3];
        map[0] = (d)b.get(0);
        map[1] = (d)b.get(1);
        map[2] = (d)b.get(2);
        g.a(map);
        return new f(map);
    }

    private class FurthestFromAverageComparator
        implements Serializable, Comparator
    {

        private final float average;

        public final int compare(d d1, d d2)
        {
            float f1 = Math.abs(d2.c() - average);
            float f2 = Math.abs(d1.c() - average);
            if (f1 < f2)
            {
                return -1;
            }
            return f1 != f2 ? 1 : 0;
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((d)obj, (d)obj1);
        }

        private FurthestFromAverageComparator(float f1)
        {
            average = f1;
        }

        FurthestFromAverageComparator(float f1, e e1)
        {
            this(f1);
        }
    }


    private class CenterComparator
        implements Serializable, Comparator
    {

        private final float average;

        public final int compare(d d1, d d2)
        {
            if (d2.d() == d1.d())
            {
                float f1 = Math.abs(d2.c() - average);
                float f2 = Math.abs(d1.c() - average);
                if (f1 < f2)
                {
                    return 1;
                }
                return f1 != f2 ? -1 : 0;
            } else
            {
                return d2.d() - d1.d();
            }
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((d)obj, (d)obj1);
        }

        private CenterComparator(float f1)
        {
            average = f1;
        }

        CenterComparator(float f1, e e1)
        {
            this(f1);
        }
    }

}
