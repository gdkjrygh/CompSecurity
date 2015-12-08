// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Vector;

// Referenced classes of package RLSDK:
//            ak, dp, ae, y

final class dq
{

    private final ak a;
    private final Vector b = new Vector(5);
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final int h[] = new int[3];
    private final ae i;

    dq(ak ak1, int j, int k, int l, int i1, float f1, ae ae1)
    {
        a = ak1;
        c = j;
        d = k;
        e = l;
        f = i1;
        g = f1;
        i = ae1;
    }

    private static float a(int ai[], int j)
    {
        return (float)(j - ai[2]) - (float)ai[1] / 2.0F;
    }

    private dp a(int ai[], int j, int k)
    {
        int l = ai[0];
        int i1 = ai[1];
        l = ai[2] + (l + i1);
        float f2 = a(ai, k);
        i1 = (int)f2;
        int j1 = ai[1] * 2;
        ak ak1 = a;
        int k1 = ak1.b;
        int ai1[] = h;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        for (k = j; k >= 0 && ak1.a(i1, k) && ai1[1] <= j1; k--)
        {
            ai1[1] = ai1[1] + 1;
        }

        float f1;
        if (k < 0 || ai1[1] > j1)
        {
            f1 = (0.0F / 0.0F);
        } else
        {
            for (; k >= 0 && !ak1.a(i1, k) && ai1[0] <= j1; k--)
            {
                ai1[0] = ai1[0] + 1;
            }

            if (ai1[0] > j1)
            {
                f1 = (0.0F / 0.0F);
            } else
            {
                for (j++; j < k1 && ak1.a(i1, j) && ai1[1] <= j1; j++)
                {
                    ai1[1] = ai1[1] + 1;
                }

                if (j == k1 || ai1[1] > j1)
                {
                    f1 = (0.0F / 0.0F);
                } else
                {
                    for (; j < k1 && !ak1.a(i1, j) && ai1[2] <= j1; j++)
                    {
                        ai1[2] = ai1[2] + 1;
                    }

                    if (ai1[2] > j1)
                    {
                        f1 = (0.0F / 0.0F);
                    } else
                    if (Math.abs((ai1[0] + ai1[1] + ai1[2]) - l) * 5 >= l * 2)
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
        do
        {
            if (!Float.isNaN(f1))
            {
                float f3 = (float)(ai[0] + ai[1] + ai[2]) / 3F;
                k = b.size();
                for (j = 0; j < k; j++)
                {
                    if (((dp)b.elementAt(j)).a(f3, f1, f2))
                    {
                        return new dp(f2, f1, f3);
                    }
                }

                ai = new dp(f2, f1, f3);
                b.addElement(ai);
                if (i != null)
                {
                    i.a(ai);
                }
            }
            return null;
        } while (true);
    }

    private boolean a(int ai[])
    {
        float f1 = g;
        float f2 = f1 / 2.0F;
        for (int j = 0; j < 3; j++)
        {
            if (Math.abs(f1 - (float)ai[j]) >= f2)
            {
                return false;
            }
        }

        return true;
    }

    final dp a()
        throws y
    {
        int ai[];
        int l;
        int j1;
        int k1;
        int l1;
        int i2;
        j1 = c;
        k1 = f;
        l1 = j1 + e;
        i2 = d;
        ai = new int[3];
        l = 0;
_L17:
        if (l >= k1) goto _L2; else goto _L1
_L1:
        int j;
        int i1;
        int j2;
        if ((l & 1) == 0)
        {
            j = l + 1 >> 1;
        } else
        {
            j = -(l + 1 >> 1);
        }
        j2 = i2 + (k1 >> 1) + j;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        for (j = j1; j < l1 && !a.a(j, j2); j++) { }
        boolean flag = false;
        i1 = j;
        j = ((flag) ? 1 : 0);
_L14:
        if (i1 >= l1) goto _L4; else goto _L3
_L3:
        if (!a.a(i1, j2)) goto _L6; else goto _L5
_L5:
        int k = j;
        if (j == 1) goto _L8; else goto _L7
_L7:
        if (j != 2) goto _L10; else goto _L9
_L9:
        if (!a(ai)) goto _L12; else goto _L11
_L11:
        dp dp1 = a(ai, j2, i1);
        if (dp1 == null) goto _L12; else goto _L13
_L13:
        return dp1;
_L12:
        ai[0] = ai[2];
        ai[1] = 1;
        ai[2] = 0;
        j = 1;
_L15:
        i1++;
          goto _L14
_L10:
        j++;
        ai[j] = ai[j] + 1;
          goto _L15
_L6:
        k = j;
        if (j == 1)
        {
            k = j + 1;
        }
_L8:
        ai[k] = ai[k] + 1;
        j = k;
          goto _L15
_L4:
        dp dp2;
        if (!a(ai))
        {
            continue; /* Loop/switch isn't completed */
        }
        dp2 = a(ai, j2, l1);
        dp1 = dp2;
        if (dp2 != null) goto _L13; else goto _L16
_L16:
        l++;
          goto _L17
_L2:
        if (!b.isEmpty())
        {
            return (dp)b.elementAt(0);
        } else
        {
            throw y.a();
        }
    }
}
