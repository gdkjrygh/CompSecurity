// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            bu, y, aj, v, 
//            u, ad, q, ab

public final class br extends bu
{

    static final int a[][];
    private static final int b[] = {
        6, 8, 10, 12, 14, 16, 20, 24, 44
    };
    private static final int d[] = {
        1, 1, 1, 1
    };
    private static final int e[] = {
        1, 1, 3
    };
    private int c;

    public br()
    {
        c = -1;
    }

    private static int a(aj aj1)
        throws y
    {
        int j = aj1.b;
        int i;
        for (i = 0; i < j && !aj1.a(i); i++) { }
        if (i == j)
        {
            throw y.a();
        } else
        {
            return i;
        }
    }

    private static int a(int ai[])
        throws y
    {
        int j = 107;
        int k = -1;
        int i1 = a.length;
        for (int i = 0; i < i1; i++)
        {
            int l = a(ai, a[i], 204);
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

    private void a(aj aj1, int i)
        throws y
    {
        int j = c * 10;
        for (i--; j > 0 && i >= 0 && !aj1.a(i); i--)
        {
            j--;
        }

        if (j != 0)
        {
            throw y.a();
        } else
        {
            return;
        }
    }

    private static void a(aj aj1, int i, int j, StringBuffer stringbuffer)
        throws y
    {
        int ai[] = new int[10];
        int ai1[] = new int[5];
        int ai2[] = new int[5];
        while (i < j) 
        {
            a(aj1, i, ai);
            for (int k = 0; k < 5; k++)
            {
                int i1 = k << 1;
                ai1[k] = ai[i1];
                ai2[k] = ai[i1 + 1];
            }

            stringbuffer.append((char)(a(ai1) + 48));
            stringbuffer.append((char)(a(ai2) + 48));
            int l = 0;
            while (l < ai.length) 
            {
                i += ai[l];
                l++;
            }
        }
    }

    private int[] b(aj aj1)
        throws y
    {
        aj1.a();
        int ai[];
        ai = c(aj1, a(aj1), e);
        a(aj1, ai[0]);
        int i = ai[0];
        ai[0] = aj1.b - ai[1];
        ai[1] = aj1.b - i;
        aj1.a();
        return ai;
        Exception exception;
        exception;
        aj1.a();
        throw exception;
    }

    private static int[] c(aj aj1, int i, int ai[])
        throws y
    {
        int k1 = ai.length;
        int ai1[] = new int[k1];
        int l1 = aj1.b;
        int j = i;
        int j1 = 0;
        int i1 = 0;
        int l = i;
        i = j;
        while (l < l1) 
        {
            int k;
            if ((aj1.a(l) ^ i1) != 0)
            {
                ai1[j1] = ai1[j1] + 1;
                k = i1;
                i1 = i;
            } else
            {
                if (j1 == k1 - 1)
                {
                    if (a(ai1, ai, 204) < 107)
                    {
                        return (new int[] {
                            i, l
                        });
                    }
                    k = i + (ai1[0] + ai1[1]);
                    for (i = 2; i < k1; i++)
                    {
                        ai1[i - 2] = ai1[i];
                    }

                    ai1[k1 - 2] = 0;
                    ai1[k1 - 1] = 0;
                    i = j1 - 1;
                } else
                {
                    j1++;
                    k = i;
                    i = j1;
                }
                ai1[i] = 1;
                if (i1 == 0)
                {
                    boolean flag = true;
                    i1 = k;
                    j1 = i;
                    k = ((flag) ? 1 : 0);
                } else
                {
                    boolean flag1 = false;
                    i1 = k;
                    j1 = i;
                    k = ((flag1) ? 1 : 0);
                }
            }
            l++;
            i = i1;
            i1 = k;
        }
        throw y.a();
    }

    public final ab a(int i, aj aj1, Hashtable hashtable)
        throws v, y
    {
        int ai1[] = c(aj1, a(aj1), d);
        c = ai1[1] - ai1[0] >> 2;
        a(aj1, ai1[0]);
        int ai[] = b(aj1);
        Object obj = new StringBuffer(20);
        a(aj1, ai1[1], ai[0], ((StringBuffer) (obj)));
        obj = ((StringBuffer) (obj)).toString();
        q q1;
        int j;
        int k;
        if (hashtable != null)
        {
            aj1 = (int[])hashtable.get(u.f);
        } else
        {
            aj1 = null;
        }
        hashtable = aj1;
        if (aj1 == null)
        {
            hashtable = b;
        }
        k = ((String) (obj)).length();
        j = 0;
        if (j >= hashtable.length)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (k != hashtable[j]) goto _L2; else goto _L1
_L1:
        j = 1;
_L4:
        if (j == 0)
        {
            throw v.a();
        } else
        {
            aj1 = new ad(ai1[1], i);
            hashtable = new ad(ai[0], i);
            q1 = q.i;
            return new ab(((String) (obj)), null, new ad[] {
                aj1, hashtable
            }, q1);
        }
_L2:
        j++;
        break MISSING_BLOCK_LABEL_111;
        j = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        int ai[] = {
            3, 3, 1, 1, 1
        };
        int ai1[] = {
            1, 3, 1, 3, 1
        };
        a = (new int[][] {
            new int[] {
                1, 1, 3, 3, 1
            }, new int[] {
                3, 1, 1, 1, 3
            }, new int[] {
                1, 3, 1, 1, 3
            }, ai, new int[] {
                1, 1, 3, 1, 3
            }, new int[] {
                3, 1, 3, 1, 1
            }, new int[] {
                1, 3, 3, 1, 1
            }, new int[] {
                1, 1, 1, 3, 3
            }, new int[] {
                3, 1, 1, 3, 1
            }, ai1
        });
    }
}
