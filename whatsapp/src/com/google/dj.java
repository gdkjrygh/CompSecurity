// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            c2, dV, bG, gh, 
//            dQ

final class dj
{

    private final int a;
    private final byte b[];

    private dj(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    static dj[] a(byte abyte0[], c2 c2_1, dQ dq)
    {
        bG abg[];
        int i;
        int j1;
        int k1;
        boolean flag;
        flag = c2.g;
        try
        {
            if (abyte0.length != c2_1.e())
            {
                throw new IllegalArgumentException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        dq = c2_1.a(dq);
        abg = dq.a();
        j1 = abg.length;
        i = 0;
        int j = 0;
        int l;
        do
        {
            l = i;
            if (j >= j1)
            {
                break;
            }
            l = i + abg[j].b();
            j++;
            i = l;
            if (!flag)
            {
                continue;
            }
            gh.a++;
            break;
        } while (true);
        c2_1 = new dj[l];
        i = 0;
        k1 = abg.length;
        j1 = 0;
_L15:
        int i1 = i;
        if (j1 >= k1) goto _L2; else goto _L1
_L1:
        bG bg;
        int k;
        bg = abg[j1];
        i1 = 0;
        k = i;
_L16:
        i = k;
        if (i1 < bg.b())
        {
            int l1 = bg.a();
            int k2 = dq.b();
            i = k + 1;
            c2_1[k] = new dj(l1, new byte[k2 + l1]);
            i1++;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_573;
            }
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        i1 = i;
_L2:
        int i2;
        int l2;
        j1 = ((dj) (c2_1[0])).b.length;
        i = c2_1.length - 1;
        do
        {
            k = i;
            if (i < 0)
            {
                break;
            }
            if (((dj) (c2_1[i])).b.length == j1)
            {
                k = i;
                if (!flag)
                {
                    break;
                }
            }
            k = i - 1;
            i = k;
        } while (!flag);
        l2 = k + 1;
        i2 = j1 - dq.b();
        j1 = 0;
        i = 0;
_L13:
        k = i;
        if (j1 >= i2) goto _L6; else goto _L5
_L5:
        k = 0;
_L14:
        if (k < i1)
        {
            dq = ((dj) (c2_1[k])).b;
            k1 = i + 1;
            dq[j1] = abyte0[i];
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_548;
            }
            i = k1;
        }
        if (!flag) goto _L8; else goto _L7
_L7:
        k = i;
_L6:
        i = l2;
        j1 = k;
        k = i;
        i = j1;
_L12:
        int i3;
        if (k < i1)
        {
            dq = ((dj) (c2_1[k])).b;
            j1 = i + 1;
            dq[i2] = abyte0[i];
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_523;
            }
            i = j1;
        }
        i3 = ((dj) (c2_1[0])).b.length;
        j1 = i2;
        k = i;
        i = j1;
_L10:
        if (i >= i3)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = 0;
_L11:
        if (j1 < i1)
        {
            int j2;
            if (j1 < l2)
            {
                j2 = i;
            } else
            {
                j2 = i + 1;
            }
            dq = ((dj) (c2_1[j1])).b;
            k1 = k + 1;
            dq[j2] = abyte0[k];
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_507;
            }
            k = k1;
        }
        i++;
        if (!flag) goto _L10; else goto _L9
_L9:
        return c2_1;
        j1++;
        k = k1;
          goto _L11
        k++;
        i = j1;
        if (true) goto _L12; else goto _L8
_L8:
        j1++;
          goto _L13
        k++;
        i = k1;
          goto _L14
_L4:
        j1++;
          goto _L15
        k = i;
          goto _L16
    }

    int a()
    {
        return a;
    }

    byte[] b()
    {
        return b;
    }
}
