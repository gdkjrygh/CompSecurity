// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google:
//            d6, f2, fw, gV, 
//            di, aT, T, f9, 
//            gh, f

public class fS
{

    public static boolean a;
    private final List b = new ArrayList();
    private boolean c;
    private final f d;
    private final d6 e;
    private final int f[] = new int[5];

    public fS(d6 d6_1, f f1)
    {
        e = d6_1;
        d = f1;
    }

    private float a(int i, int j, int k, int l)
    {
        d6 d6_1;
        int ai[];
        int l1;
        boolean flag;
label0:
        {
            flag = a;
            d6_1 = e;
            l1 = d6_1.c();
            ai = c();
            int i1 = i;
            int k1;
            do
            {
                k1 = i1;
                if (i1 < 0)
                {
                    break;
                }
                k1 = i1;
                if (!d6_1.b(j, i1))
                {
                    break;
                }
                ai[2] = ai[2] + 1;
                k1 = i1 - 1;
                i1 = k1;
            } while (!flag);
            i1 = k1;
            if (k1 < 0)
            {
                return (0.0F / 0.0F);
            }
            do
            {
                k1 = i1;
                if (i1 < 0)
                {
                    break;
                }
                k1 = i1;
                if (d6_1.b(j, i1))
                {
                    break;
                }
                k1 = i1;
                if (ai[1] > k)
                {
                    break;
                }
                ai[1] = ai[1] + 1;
                k1 = i1 - 1;
                i1 = k1;
            } while (!flag);
            if (k1 < 0 || ai[1] > k)
            {
                return (0.0F / 0.0F);
            }
            do
            {
                if (k1 < 0 || !d6_1.b(j, k1) || ai[0] > k)
                {
                    break;
                }
                ai[0] = ai[0] + 1;
                k1--;
            } while (!flag);
            if (ai[0] > k)
            {
                return (0.0F / 0.0F);
            }
            i++;
            do
            {
                i1 = i;
                if (i >= l1)
                {
                    break;
                }
                i1 = i;
                if (!d6_1.b(j, i))
                {
                    break;
                }
                ai[2] = ai[2] + 1;
                i1 = i + 1;
                i = i1;
            } while (!flag);
            i = i1;
            if (i1 == l1)
            {
                return (0.0F / 0.0F);
            }
            do
            {
                i1 = i;
                if (i >= l1)
                {
                    break;
                }
                i1 = i;
                if (d6_1.b(j, i))
                {
                    break;
                }
                i1 = i;
                if (ai[3] >= k)
                {
                    break;
                }
                ai[3] = ai[3] + 1;
                i1 = i + 1;
                i = i1;
            } while (!flag);
            if (i1 != l1)
            {
                i = i1;
                if (ai[3] < k)
                {
                    break label0;
                }
            }
            return (0.0F / 0.0F);
        }
        int j1;
        do
        {
            j1 = i;
            if (i >= l1)
            {
                break;
            }
            j1 = i;
            if (!d6_1.b(j, i))
            {
                break;
            }
            j1 = i;
            if (ai[4] >= k)
            {
                break;
            }
            ai[4] = ai[4] + 1;
            j1 = i + 1;
            i = j1;
        } while (!flag);
        if (ai[4] >= k)
        {
            return (0.0F / 0.0F);
        }
        if (Math.abs((ai[0] + ai[1] + ai[2] + ai[3] + ai[4]) - l) * 5 >= l * 2)
        {
            return (0.0F / 0.0F);
        }
        if (a(ai))
        {
            return a(ai, j1);
        } else
        {
            return (0.0F / 0.0F);
        }
    }

    private static float a(int ai[], int i)
    {
        return (float)(i - ai[4] - ai[3]) - (float)ai[2] / 2.0F;
    }

    private boolean a()
    {
        float f5 = 0.0F;
        boolean flag = a;
        int k = b.size();
        Iterator iterator = b.iterator();
        float f1 = 0.0F;
        int i = 0;
        float f4;
        int j;
        do
        {
            f4 = f1;
            j = i;
            if (!iterator.hasNext())
            {
                break;
            }
            f2 f2_1 = (f2)iterator.next();
            if (f2_1.d() >= 2)
            {
                f1 = f2_1.c() + f1;
                i++;
            }
            if (!flag)
            {
                continue;
            }
            j = i;
            f4 = f1;
            break;
        } while (true);
        if (j >= 3)
        {
            float f6 = f4 / (float)k;
            Iterator iterator1 = b.iterator();
            float f3 = f5;
            do
            {
                f5 = f3;
                if (!iterator1.hasNext())
                {
                    break;
                }
                f5 = f3 + Math.abs(((f2)iterator1.next()).c() - f6);
                f3 = f5;
            } while (!flag);
            if (f5 <= 0.05F * f4)
            {
                return true;
            }
        }
        return false;
    }

    protected static boolean a(int ai[])
    {
        int i;
        int j;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = a;
        j = 0;
        i = 0;
_L4:
        int k;
        k = i;
        if (j >= 5)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ai[j];
        if (k != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        k = i + k;
        j++;
        i = k;
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (k < 7) goto _L1; else goto _L5
_L5:
        float f1 = (float)k / 7F;
        float f3 = f1 / 2.0F;
        if (Math.abs(f1 - (float)ai[0]) >= f3 || Math.abs(f1 - (float)ai[1]) >= f3 || Math.abs(3F * f1 - (float)ai[2]) >= 3F * f3 || Math.abs(f1 - (float)ai[3]) >= f3 || Math.abs(f1 - (float)ai[4]) >= f3)
        {
            flag = false;
        }
        return flag;
    }

    private float b(int i, int j, int k, int l)
    {
        d6 d6_1;
        int ai[];
        int l1;
        boolean flag;
label0:
        {
            flag = a;
            d6_1 = e;
            l1 = d6_1.b();
            ai = c();
            int i1 = i;
            int k1;
            do
            {
                k1 = i1;
                if (i1 < 0)
                {
                    break;
                }
                k1 = i1;
                if (!d6_1.b(i1, j))
                {
                    break;
                }
                ai[2] = ai[2] + 1;
                k1 = i1 - 1;
                i1 = k1;
            } while (!flag);
            i1 = k1;
            if (k1 < 0)
            {
                return (0.0F / 0.0F);
            }
            do
            {
                k1 = i1;
                if (i1 < 0)
                {
                    break;
                }
                k1 = i1;
                if (d6_1.b(i1, j))
                {
                    break;
                }
                k1 = i1;
                if (ai[1] > k)
                {
                    break;
                }
                ai[1] = ai[1] + 1;
                k1 = i1 - 1;
                i1 = k1;
            } while (!flag);
            if (k1 < 0 || ai[1] > k)
            {
                return (0.0F / 0.0F);
            }
            do
            {
                if (k1 < 0 || !d6_1.b(k1, j) || ai[0] > k)
                {
                    break;
                }
                ai[0] = ai[0] + 1;
                k1--;
            } while (!flag);
            if (ai[0] > k)
            {
                return (0.0F / 0.0F);
            }
            i++;
            do
            {
                i1 = i;
                if (i >= l1)
                {
                    break;
                }
                i1 = i;
                if (!d6_1.b(i, j))
                {
                    break;
                }
                ai[2] = ai[2] + 1;
                i1 = i + 1;
                i = i1;
            } while (!flag);
            i = i1;
            if (i1 == l1)
            {
                return (0.0F / 0.0F);
            }
            do
            {
                i1 = i;
                if (i >= l1)
                {
                    break;
                }
                i1 = i;
                if (d6_1.b(i, j))
                {
                    break;
                }
                i1 = i;
                if (ai[3] >= k)
                {
                    break;
                }
                ai[3] = ai[3] + 1;
                i1 = i + 1;
                i = i1;
            } while (!flag);
            if (i1 != l1)
            {
                i = i1;
                if (ai[3] < k)
                {
                    break label0;
                }
            }
            return (0.0F / 0.0F);
        }
        int j1;
        do
        {
            j1 = i;
            if (i >= l1)
            {
                break;
            }
            j1 = i;
            if (!d6_1.b(i, j))
            {
                break;
            }
            j1 = i;
            if (ai[4] >= k)
            {
                break;
            }
            ai[4] = ai[4] + 1;
            j1 = i + 1;
            i = j1;
        } while (!flag);
        if (ai[4] >= k)
        {
            return (0.0F / 0.0F);
        }
        if (Math.abs((ai[0] + ai[1] + ai[2] + ai[3] + ai[4]) - l) * 5 >= l)
        {
            return (0.0F / 0.0F);
        }
        if (a(ai))
        {
            return a(ai, j1);
        } else
        {
            return (0.0F / 0.0F);
        }
    }

    private int b()
    {
        boolean flag = a;
        if (b.size() <= 1)
        {
            return 0;
        }
        f2 f2_1 = null;
        Iterator iterator = b.iterator();
label0:
        do
        {
            f2 f2_3;
label1:
            {
                f2 f2_2;
label2:
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    f2_2 = (f2)iterator.next();
                    f2_3 = f2_1;
                    if (f2_2.d() < 2)
                    {
                        break label1;
                    }
                    f2_3 = f2_1;
                    if (f2_1 == null)
                    {
                        if (!flag)
                        {
                            break label2;
                        }
                        f2_3 = f2_2;
                    }
                    c = true;
                    return (int)(Math.abs(f2_3.a() - f2_2.a()) - Math.abs(f2_3.b() - f2_2.b())) / 2;
                }
                f2_3 = f2_2;
            }
            f2_1 = f2_3;
        } while (!flag);
        return 0;
    }

    private boolean c(int i, int j, int k, int l)
    {
        int ai[];
        int i1;
        boolean flag;
label0:
        {
            flag = a;
            ai = c();
            i1 = 0;
            int j1;
            do
            {
                j1 = i1;
                if (i < i1)
                {
                    break;
                }
                j1 = i1;
                if (j < i1)
                {
                    break;
                }
                j1 = i1;
                if (!e.b(j - i1, i - i1))
                {
                    break;
                }
                ai[2] = ai[2] + 1;
                j1 = i1 + 1;
                i1 = j1;
            } while (!flag);
            if (i >= j1)
            {
                i1 = j1;
                if (j >= j1)
                {
                    break label0;
                }
            }
            return false;
        }
        int i2;
        int j2;
label1:
        {
            int k1;
            do
            {
                k1 = i1;
                if (i < i1)
                {
                    break;
                }
                k1 = i1;
                if (j < i1)
                {
                    break;
                }
                k1 = i1;
                if (e.b(j - i1, i - i1))
                {
                    break;
                }
                k1 = i1;
                if (ai[1] > k)
                {
                    break;
                }
                ai[1] = ai[1] + 1;
                k1 = i1 + 1;
                i1 = k1;
            } while (!flag);
            if (i < k1 || j < k1 || ai[1] > k)
            {
                return false;
            }
            do
            {
                if (i < k1 || j < k1 || !e.b(j - k1, i - k1) || ai[0] > k)
                {
                    break;
                }
                ai[0] = ai[0] + 1;
                k1++;
            } while (!flag);
            if (ai[0] > k)
            {
                return false;
            }
            i2 = e.c();
            j2 = e.b();
            i1 = 1;
            do
            {
                k1 = i1;
                if (i + i1 >= i2)
                {
                    break;
                }
                k1 = i1;
                if (j + i1 >= j2)
                {
                    break;
                }
                k1 = i1;
                if (!e.b(j + i1, i + i1))
                {
                    break;
                }
                ai[2] = ai[2] + 1;
                k1 = i1 + 1;
                i1 = k1;
            } while (!flag);
            if (i + k1 < i2)
            {
                i1 = k1;
                if (j + k1 < j2)
                {
                    break label1;
                }
            }
            return false;
        }
        int l1;
        do
        {
            l1 = i1;
            if (i + i1 >= i2)
            {
                break;
            }
            l1 = i1;
            if (j + i1 >= j2)
            {
                break;
            }
            l1 = i1;
            if (e.b(j + i1, i + i1))
            {
                break;
            }
            l1 = i1;
            if (ai[3] >= k)
            {
                break;
            }
            ai[3] = ai[3] + 1;
            l1 = i1 + 1;
            i1 = l1;
        } while (!flag);
        if (i + l1 >= i2 || j + l1 >= j2 || ai[3] >= k)
        {
            return false;
        }
        do
        {
            if (i + l1 >= i2 || j + l1 >= j2 || !e.b(j + l1, i + l1) || ai[4] >= k)
            {
                break;
            }
            ai[4] = ai[4] + 1;
            l1++;
        } while (!flag);
        if (ai[4] >= k)
        {
            return false;
        }
        return Math.abs((ai[0] + ai[1] + ai[2] + ai[3] + ai[4]) - l) < l * 2 && a(ai);
    }

    private int[] c()
    {
        f[0] = 0;
        f[1] = 0;
        f[2] = 0;
        f[3] = 0;
        f[4] = 0;
        return f;
    }

    private f2[] d()
    {
        float f6;
        int i;
        boolean flag;
        f6 = 0.0F;
        flag = a;
        i = b.size();
        if (i < 3)
        {
            throw gV.a();
        }
        if (i <= 3) goto _L2; else goto _L1
_L1:
        float f1;
        float f4;
        Iterator iterator = b.iterator();
        f4 = 0.0F;
        f1 = 0.0F;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            float f7 = ((f2)iterator.next()).c();
            f1 += f7;
            f4 = f7 * f7 + f4;
        } while (!flag);
        f1 /= i;
        f4 = (float)Math.sqrt(f4 / (float)i - f1 * f1);
        Collections.sort(b, new di(f1, null));
        f4 = Math.max(0.2F * f1, f4);
        i = 0;
_L6:
        if (i >= b.size() || b.size() <= 3) goto _L2; else goto _L3
_L3:
        int j;
        j = i;
        if (Math.abs(((f2)b.get(i)).c() - f1) > f4)
        {
            b.remove(i);
            j = i - 1;
        }
        if (!flag) goto _L4; else goto _L2
_L2:
        if (b.size() > 3)
        {
            Iterator iterator1 = b.iterator();
            float f3 = f6;
            float f5;
            do
            {
                f5 = f3;
                if (!iterator1.hasNext())
                {
                    break;
                }
                f5 = f3 + ((f2)iterator1.next()).c();
                f3 = f5;
            } while (!flag);
            f3 = f5 / (float)b.size();
            Collections.sort(b, new aT(f3, null));
            b.subList(3, b.size()).clear();
        }
        return (new f2[] {
            (f2)b.get(0), (f2)b.get(1), (f2)b.get(2)
        });
_L4:
        i = j + 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    final f9 a(Map map)
    {
        int i;
        int j;
        int k;
        int l;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        boolean flag;
        boolean flag1;
        boolean flag4 = a;
        int k2;
        int l2;
        int i3;
        boolean flag2;
        boolean flag3;
        if (map != null && map.containsKey(T.TRY_HARDER))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (map != null && map.containsKey(T.PURE_BARCODE))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        l2 = e.c();
        i3 = e.b();
        i = (l2 * 3) / 228;
        if (i < 3 || j != 0)
        {
            i = 3;
        }
        flag = false;
        map = new int[5];
        k = i - 1;
        j = i;
        i = k;
        if (i >= l2 || flag)
        {
            break; /* Loop/switch isn't completed */
        }
        map[0] = 0;
        map[1] = 0;
        map[2] = 0;
        map[3] = 0;
        map[4] = 0;
        l1 = 0;
        l = 0;
        k = j;
        j = l;
_L24:
        flag1 = flag;
        j1 = i;
        k1 = k;
        if (j >= i3)
        {
            break; /* Loop/switch isn't completed */
        }
        l = l1;
        if (!e.b(j, i)) goto _L2; else goto _L1
_L1:
        i2 = l1;
        if ((l1 & 1) == 1)
        {
            i2 = l1 + 1;
        }
        map[i2] = map[i2] + 1;
        l = i2;
        flag1 = flag;
        l1 = j;
        j1 = i;
        k1 = k;
        if (!flag4) goto _L4; else goto _L3
_L3:
        l = i2;
_L2:
        i2 = l;
        flag1 = flag;
        l1 = j;
        j1 = i;
        k1 = k;
        if ((l & 1) != 0) goto _L6; else goto _L5
_L5:
        j1 = l;
        flag2 = flag;
        i2 = j;
        j2 = i;
        k2 = k;
        if (l != 4) goto _L8; else goto _L7
_L7:
        if (!a(((int []) (map))))
        {
            break MISSING_BLOCK_LABEL_823;
        }
        if (!a(((int []) (map)), i, j, flag3)) goto _L10; else goto _L9
_L9:
        k1 = 2;
        if (!c) goto _L12; else goto _L11
_L11:
        flag1 = a();
        flag = flag1;
        k = j;
        l = i;
        j1 = k1;
        if (!flag4) goto _L14; else goto _L13
_L13:
        flag = flag1;
_L12:
        k = b();
        if (k > map[2])
        {
            j = i + (k - map[2] - 2);
            i = i3 - 1;
        } else
        {
            k = i;
            i = j;
            j = k;
        }
        if (!flag4) goto _L16; else goto _L15
_L15:
        k = 2;
_L27:
        map[0] = map[2];
        map[1] = map[3];
        map[2] = map[4];
        map[3] = 1;
        map[4] = 0;
        if (!flag4) goto _L18; else goto _L17
_L17:
        j1 = k;
        l = j;
        k = i;
_L14:
        j2 = 0;
        map[0] = 0;
        map[1] = 0;
        map[2] = 0;
        map[3] = 0;
        map[4] = 0;
        flag1 = flag;
        l1 = k;
        i2 = l;
        k1 = j1;
        if (!flag4) goto _L20; else goto _L19
_L19:
        i = l;
        j = k;
_L28:
        map[0] = map[2];
        map[1] = map[3];
        map[2] = map[4];
        map[3] = 1;
        map[4] = 0;
        j2 = 3;
        flag1 = flag;
        l1 = j;
        i2 = i;
        k1 = j1;
        if (!flag4) goto _L20; else goto _L21
_L21:
        k = 3;
        k2 = j1;
        j2 = i;
        i2 = j;
        flag2 = flag;
        j1 = k;
_L8:
        i = j1 + 1;
        map[i] = map[i] + 1;
        l = i;
        flag1 = flag2;
        l1 = i2;
        j1 = j2;
        k1 = k2;
        if (!flag4) goto _L4; else goto _L22
_L22:
        k1 = k2;
        j1 = j2;
        l1 = i2;
        flag1 = flag2;
        i2 = i;
_L6:
        map[i2] = map[i2] + 1;
        l = i2;
_L4:
        j = l1 + 1;
        l1 = l;
        flag = flag1;
        i = j1;
        k = k1;
        if (!flag4) goto _L24; else goto _L23
_L23:
        flag = flag1;
        j = k1;
        if (a(((int []) (map))))
        {
            flag = flag1;
            j = k1;
            if (a(((int []) (map)), j1, i3, flag3))
            {
                i = map[0];
                flag = flag1;
                j = i;
                if (c)
                {
                    flag = a();
                    j = i;
                }
            }
        }
        i = j1 + j;
        if (!flag4) goto _L26; else goto _L25
_L26:
        break MISSING_BLOCK_LABEL_97;
_L25:
        map = d();
        fw.a(map);
        map = new f9(map);
        if (gh.a != 0)
        {
            if (flag4)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            a = flag;
        }
        return map;
_L20:
        l = j2;
        j1 = i2;
          goto _L4
_L18:
        l = 3;
        flag1 = flag;
        l1 = i;
        j1 = j;
        k1 = k;
          goto _L4
_L16:
        k = i;
        l = j;
        j1 = k1;
          goto _L14
_L10:
        int i1 = i;
        i = j;
        j = i1;
          goto _L27
        j1 = k;
          goto _L28
    }

    protected final boolean a(int ai[], int i, int j, boolean flag)
    {
        float f1;
        float f3;
        int k;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag3 = a;
        k = ai[0] + ai[1] + ai[2] + ai[3] + ai[4];
        f3 = a(ai, j);
        f1 = a(i, (int)f3, ai[2], k);
        flag1 = flag2;
        if (Float.isNaN(f1)) goto _L2; else goto _L1
_L1:
        f3 = b((int)f3, (int)f1, ai[2], k);
        flag1 = flag2;
        if (Float.isNaN(f3)) goto _L2; else goto _L3
_L3:
        if (!flag) goto _L5; else goto _L4
_L4:
        flag1 = flag2;
        if (!c((int)f1, (int)f3, ai[2], k)) goto _L2; else goto _L5
_L5:
        float f4;
        f4 = (float)k / 7F;
        k = 0;
        i = 0;
_L10:
        j = i;
        if (k >= b.size()) goto _L7; else goto _L6
_L6:
        ai = (f2)b.get(k);
        if (ai.a(f4, f1, f3))
        {
            b.set(k, ai.b(f1, f3, f4));
            if (!flag3)
            {
                break MISSING_BLOCK_LABEL_273;
            }
            i = 1;
        }
        if (!flag3) goto _L9; else goto _L8
_L8:
        j = i;
_L7:
        if (j == 0)
        {
            ai = new f2(f3, f1, f4);
            b.add(ai);
            if (d != null)
            {
                d.a(ai);
            }
        }
        flag1 = true;
_L2:
        return flag1;
_L9:
        k++;
          goto _L10
        j = 1;
          goto _L7
    }
}
