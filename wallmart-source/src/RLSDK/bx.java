// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            bu, bw, bq, y, 
//            aj, t, v, aa, 
//            ad, ae, u, ab, 
//            q, ac

public abstract class bx extends bu
{

    static final int b[] = {
        1, 1, 1
    };
    static final int c[] = {
        1, 1, 1, 1, 1
    };
    static final int d[][];
    static final int e[][];
    private final StringBuffer a = new StringBuffer(20);
    private final bw f = new bw();
    private final bq g = new bq();

    protected bx()
    {
    }

    static int a(aj aj1, int ai[], int i, int ai1[][])
        throws y
    {
        a(aj1, i, ai);
        int j = 107;
        int k = -1;
        int i1 = ai1.length;
        for (i = 0; i < i1; i++)
        {
            int l = a(ai, ai1[i], 179);
            if (l < j)
            {
                k = i;
                j = l;
            }
        }

        if (k >= 0)
        {
            return k;
        } else
        {
            throw y.a();
        }
    }

    static int[] a(aj aj1)
        throws y
    {
        int i = 0;
        int ai[] = null;
        boolean flag = false;
        do
        {
            if (flag)
            {
                break;
            }
            int ai1[] = a(aj1, i, false, b);
            int k = ai1[0];
            int j = ai1[1];
            int l = k - (j - k);
            i = j;
            ai = ai1;
            if (l >= 0)
            {
                flag = aj1.a(l, k);
                i = j;
                ai = ai1;
            }
        } while (true);
        return ai;
    }

    static int[] a(aj aj1, int i, boolean flag, int ai[])
        throws y
    {
        int i1 = ai.length;
        int ai1[] = new int[i1];
        int j1 = aj1.b;
        boolean flag1 = false;
        boolean flag2;
        do
        {
            flag2 = flag1;
            if (i >= j1)
            {
                break;
            }
            if (!aj1.a(i))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag2 = flag1;
            if (flag == flag1)
            {
                break;
            }
            i++;
        } while (true);
        int k = i;
        int j = 0;
        flag = flag2;
        while (k < j1) 
        {
            int l;
            if (aj1.a(k) ^ flag)
            {
                ai1[j] = ai1[j] + 1;
                l = j;
                j = i;
            } else
            {
                if (j == i1 - 1)
                {
                    if (a(ai1, ai, 179) < 107)
                    {
                        return (new int[] {
                            i, k
                        });
                    }
                    l = i + (ai1[0] + ai1[1]);
                    for (i = 2; i < i1; i++)
                    {
                        ai1[i - 2] = ai1[i];
                    }

                    ai1[i1 - 2] = 0;
                    ai1[i1 - 1] = 0;
                    i = j - 1;
                    j = l;
                } else
                {
                    l = j + 1;
                    j = i;
                    i = l;
                }
                ai1[i] = 1;
                if (!flag)
                {
                    flag = true;
                    l = i;
                } else
                {
                    flag = false;
                    l = i;
                }
            }
            k++;
            i = j;
            j = l;
        }
        throw y.a();
    }

    protected abstract int a(aj aj1, int ai[], StringBuffer stringbuffer)
        throws y;

    public ab a(int i, aj aj1, Hashtable hashtable)
        throws y, t, v
    {
        return a(i, aj1, a(aj1), hashtable);
    }

    public ab a(int i, aj aj1, int ai[], Hashtable hashtable)
        throws y, t, v
    {
        int ai1[];
        Object obj;
        int j;
        int k;
        if (hashtable == null)
        {
            hashtable = null;
        } else
        {
            hashtable = (ae)hashtable.get(u.h);
        }
        if (hashtable != null)
        {
            hashtable.a(new ad((float)(ai[0] + ai[1]) / 2.0F, i));
        }
        obj = a;
        ((StringBuffer) (obj)).setLength(0);
        j = a(aj1, ai, ((StringBuffer) (obj)));
        if (hashtable != null)
        {
            hashtable.a(new ad(j, i));
        }
        ai1 = a(aj1, j);
        if (hashtable != null)
        {
            hashtable.a(new ad((float)(ai1[0] + ai1[1]) / 2.0F, i));
        }
        j = ai1[1];
        k = (j - ai1[0]) + j;
        if (k >= aj1.b || !aj1.a(j, k))
        {
            throw y.a();
        }
        hashtable = ((StringBuffer) (obj)).toString();
        if (!a(((String) (hashtable))))
        {
            throw t.a();
        }
        float f1 = (float)(ai[1] + ai[0]) / 2.0F;
        float f2 = (float)(ai1[1] + ai1[0]) / 2.0F;
        obj = b();
        ai = new ab(hashtable, null, new ad[] {
            new ad(f1, i), new ad(f2, i)
        }, ((q) (obj)));
        try
        {
            aj1 = f.a(i, aj1, ai1[1]);
            ai.a(aj1.d());
            ai.a(aj1.b());
        }
        // Misplaced declaration of an exception variable
        catch (aj aj1) { }
        if (q.h.equals(obj) || q.n.equals(obj))
        {
            aj1 = g.a(hashtable);
            if (aj1 != null)
            {
                ai.a(ac.g, aj1);
            }
        }
        return ai;
    }

    boolean a(String s)
        throws t, v
    {
        boolean flag1 = false;
        int l = s.length();
        boolean flag = flag1;
        if (l != 0)
        {
            int i = l - 2;
            int k = 0;
            for (; i >= 0; i -= 2)
            {
                int j1 = s.charAt(i) - 48;
                if (j1 < 0 || j1 > 9)
                {
                    throw v.a();
                }
                k += j1;
            }

            k *= 3;
            for (int j = l - 1; j >= 0; j -= 2)
            {
                int i1 = s.charAt(j) - 48;
                if (i1 < 0 || i1 > 9)
                {
                    throw v.a();
                }
                k += i1;
            }

            flag = flag1;
            if (k % 10 == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    int[] a(aj aj1, int i)
        throws y
    {
        return a(aj1, i, false, b);
    }

    abstract q b();

    static 
    {
        int ai[] = {
            2, 1, 2, 2
        };
        int ai2[] = {
            1, 4, 1, 1
        };
        int ai4[] = {
            1, 1, 3, 2
        };
        int ai5[] = {
            1, 3, 1, 2
        };
        int ai6[] = {
            1, 2, 1, 3
        };
        d = (new int[][] {
            new int[] {
                3, 2, 1, 1
            }, new int[] {
                2, 2, 2, 1
            }, ai, ai2, ai4, new int[] {
                1, 2, 3, 1
            }, new int[] {
                1, 1, 1, 4
            }, ai5, ai6, new int[] {
                3, 1, 1, 2
            }
        });
        e = new int[20][];
        for (int i = 0; i < 10; i++)
        {
            e[i] = d[i];
        }

        for (int j = 10; j < 20; j++)
        {
            int ai1[] = d[j - 10];
            int ai3[] = new int[ai1.length];
            for (int k = 0; k < ai1.length; k++)
            {
                ai3[k] = ai1[ai1.length - k - 1];
            }

            e[j] = ai3;
        }

    }
}
