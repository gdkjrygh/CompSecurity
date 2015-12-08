// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package RLSDK:
//            ak, ds, ae, y, 
//            u, an, ad, du, 
//            ao

public final class dt
{
    private static final class a
        implements ao
    {

        private final float a;

        public final int a(Object obj, Object obj1)
        {
            if (((ds)obj1).d() == ((ds)obj).d())
            {
                float f = Math.abs(((ds)obj1).c() - a);
                float f1 = Math.abs(((ds)obj).c() - a);
                if (f < f1)
                {
                    return 1;
                }
                return f != f1 ? -1 : 0;
            } else
            {
                return ((ds)obj1).d() - ((ds)obj).d();
            }
        }

        private a(float f)
        {
            a = f;
        }

        a(float f, byte byte0)
        {
            this(f);
        }
    }

    private static final class b
        implements ao
    {

        private final float a;

        public final int a(Object obj, Object obj1)
        {
            float f = Math.abs(((ds)obj1).c() - a);
            float f1 = Math.abs(((ds)obj).c() - a);
            if (f < f1)
            {
                return -1;
            }
            return f != f1 ? 1 : 0;
        }

        private b(float f)
        {
            a = f;
        }

        b(float f, byte byte0)
        {
            this(f);
        }
    }


    private final ak a;
    private final Vector b = new Vector();
    private boolean c;
    private final int d[] = new int[5];
    private final ae e;

    public dt(ak ak1, ae ae1)
    {
        a = ak1;
        e = ae1;
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
        float f;
        int ai1[];
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        i1 = ai[0] + ai[1] + ai[2] + ai[3] + ai[4];
        l = (int)a(ai, j);
        j1 = ai[2];
        ai1 = a;
        k1 = ((ak) (ai1)).b;
        int ai2[] = a();
        for (j = i; j >= 0 && ai1.a(l, j); j--)
        {
            ai2[2] = ai2[2] + 1;
        }

        k = j;
        if (j < 0)
        {
            f = (0.0F / 0.0F);
        } else
        {
            for (; k >= 0 && !ai1.a(l, k) && ai2[1] <= j1; k--)
            {
                ai2[1] = ai2[1] + 1;
            }

            if (k < 0 || ai2[1] > j1)
            {
                f = (0.0F / 0.0F);
            } else
            {
                for (; k >= 0 && ai1.a(l, k) && ai2[0] <= j1; k--)
                {
                    ai2[0] = ai2[0] + 1;
                }

                if (ai2[0] > j1)
                {
                    f = (0.0F / 0.0F);
                } else
                {
                    for (i++; i < k1 && ai1.a(l, i); i++)
                    {
                        ai2[2] = ai2[2] + 1;
                    }

                    j = i;
                    if (i == k1)
                    {
                        f = (0.0F / 0.0F);
                    } else
                    {
                        for (; j < k1 && !ai1.a(l, j) && ai2[3] < j1; j++)
                        {
                            ai2[3] = ai2[3] + 1;
                        }

                        if (j == k1 || ai2[3] >= j1)
                        {
                            f = (0.0F / 0.0F);
                        } else
                        {
                            for (; j < k1 && ai1.a(l, j) && ai2[4] < j1; j++)
                            {
                                ai2[4] = ai2[4] + 1;
                            }

                            if (ai2[4] >= j1)
                            {
                                f = (0.0F / 0.0F);
                            } else
                            if (Math.abs((ai2[0] + ai2[1] + ai2[2] + ai2[3] + ai2[4]) - i1) * 5 >= i1 * 2)
                            {
                                f = (0.0F / 0.0F);
                            } else
                            if (a(ai2))
                            {
                                f = a(ai2, j);
                            } else
                            {
                                f = (0.0F / 0.0F);
                            }
                        }
                    }
                }
            }
        }
        if (Float.isNaN(f)) goto _L2; else goto _L1
_L1:
        k = (int)f;
        j1 = ai[2];
        ai = a;
        k1 = ((ak) (ai)).a;
        ai1 = a();
        for (i = l; i >= 0 && ai.a(i, k); i--)
        {
            ai1[2] = ai1[2] + 1;
        }

        j = i;
        float f1;
        float f2;
        if (i < 0)
        {
            f1 = (0.0F / 0.0F);
        } else
        {
            for (; j >= 0 && !ai.a(j, k) && ai1[1] <= j1; j--)
            {
                ai1[1] = ai1[1] + 1;
            }

            if (j < 0 || ai1[1] > j1)
            {
                f1 = (0.0F / 0.0F);
            } else
            {
                for (; j >= 0 && ai.a(j, k) && ai1[0] <= j1; j--)
                {
                    ai1[0] = ai1[0] + 1;
                }

                if (ai1[0] > j1)
                {
                    f1 = (0.0F / 0.0F);
                } else
                {
                    for (i = l + 1; i < k1 && ai.a(i, k); i++)
                    {
                        ai1[2] = ai1[2] + 1;
                    }

                    j = i;
                    if (i == k1)
                    {
                        f1 = (0.0F / 0.0F);
                    } else
                    {
                        for (; j < k1 && !ai.a(j, k) && ai1[3] < j1; j++)
                        {
                            ai1[3] = ai1[3] + 1;
                        }

                        if (j == k1 || ai1[3] >= j1)
                        {
                            f1 = (0.0F / 0.0F);
                        } else
                        {
                            for (; j < k1 && ai.a(j, k) && ai1[4] < j1; j++)
                            {
                                ai1[4] = ai1[4] + 1;
                            }

                            if (ai1[4] >= j1)
                            {
                                f1 = (0.0F / 0.0F);
                            } else
                            if (Math.abs((ai1[0] + ai1[1] + ai1[2] + ai1[3] + ai1[4]) - i1) * 5 >= i1)
                            {
                                f1 = (0.0F / 0.0F);
                            } else
                            if (a(ai1))
                            {
                                f1 = a(ai1, j);
                            } else
                            {
                                f1 = (0.0F / 0.0F);
                            }
                        }
                    }
                }
            }
        }
        if (Float.isNaN(f1)) goto _L2; else goto _L3
_L3:
        f2 = (float)i1 / 7F;
        j = b.size();
        i = 0;
_L6:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_1030;
        }
        ai = (ds)b.elementAt(i);
        if (!ai.a(f2, f, f1)) goto _L5; else goto _L4
_L4:
        ai.e();
        i = 1;
_L7:
        if (i == 0)
        {
            ai = new ds(f1, f, f2);
            b.addElement(ai);
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
        int l = b.size();
        int k = 0;
        float f = 0.0F;
        int i = 0;
        for (; k < l; k++)
        {
            ds ds1 = (ds)b.elementAt(k);
            if (ds1.d() >= 2)
            {
                f = ds1.c() + f;
                i++;
            }
        }

        if (i < 3)
        {
            return false;
        }
        float f2 = f / (float)l;
        float f1 = 0.0F;
        for (int j = 0; j < l;)
        {
            float f3 = Math.abs(((ds)b.elementAt(j)).c() - f2);
            j++;
            f1 = f3 + f1;
        }

        return f1 <= 0.05F * f;
    }

    final du a(Hashtable hashtable)
        throws y
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
        if (hashtable != null && hashtable.containsKey(u.d))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j1 = a.b;
        k1 = a.a;
        j = (j1 * 3) / 228;
        float f;
        float f1;
        float f2;
        ds ds1;
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
            break MISSING_BLOCK_LABEL_532;
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
            break MISSING_BLOCK_LABEL_517;
        }
        if (i != 4)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        if (!a(ai))
        {
            break MISSING_BLOCK_LABEL_456;
        }
        if (!a(ai, k, j))
        {
            break MISSING_BLOCK_LABEL_416;
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
        l = b.size();
        if (l <= 1)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        hashtable = null;
        i = 0;
        do
        {
            if (i >= l)
            {
                break MISSING_BLOCK_LABEL_410;
            }
            ds1 = (ds)b.elementAt(i);
            if (ds1.d() >= 2)
            {
                if (hashtable != null)
                {
                    break;
                }
                hashtable = ds1;
            }
            i++;
        } while (true);
        c = true;
        i = (int)(Math.abs(hashtable.a() - ds1.a()) - Math.abs(hashtable.b() - ds1.b())) / 2;
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
        break MISSING_BLOCK_LABEL_77;
_L2:
        j = b.size();
        if (j < 3)
        {
            throw y.a();
        }
        if (j > 3)
        {
            f1 = 0.0F;
            f = 0.0F;
            for (i = 0; i < j; i++)
            {
                f2 = ((ds)b.elementAt(i)).c();
                f1 += f2;
                f += f2 * f2;
            }

            f1 /= j;
            f = (float)Math.sqrt(f / (float)j - f1 * f1);
            an.a(b, new b(f1, (byte)0));
            f = Math.max(0.2F * f1, f);
            for (i = 0; i < b.size() && b.size() > 3; i = j + 1)
            {
                j = i;
                if (Math.abs(((ds)b.elementAt(i)).c() - f1) > f)
                {
                    b.removeElementAt(i);
                    j = i - 1;
                }
            }

        }
        if (b.size() > 3)
        {
            f = 0.0F;
            for (i = 0; i < b.size(); i++)
            {
                f += ((ds)b.elementAt(i)).c();
            }

            f /= b.size();
            an.a(b, new a(f, (byte)0));
            b.setSize(3);
        }
        hashtable = new ds[3];
        hashtable[0] = (ds)b.elementAt(0);
        hashtable[1] = (ds)b.elementAt(1);
        hashtable[2] = (ds)b.elementAt(2);
        ad.a(hashtable);
        return new du(hashtable);
    }
}
