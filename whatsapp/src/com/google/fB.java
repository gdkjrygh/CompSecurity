// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Map;

// Referenced classes of package com.google:
//            gg, a6, c2, fZ, 
//            fJ, dj, dp, fA, 
//            gY, gd, V, fG, 
//            d6

public final class fB
{

    private final gg a;

    public fB()
    {
        a = new gg(a6.g);
    }

    private fG a(fZ fz, Map map)
    {
        c2 c2_1;
        dQ dq;
        byte abyte0[];
        int i;
        int j;
        int k1;
        boolean flag;
        flag = c2.g;
        c2_1 = fz.e();
        dq = fz.d().a();
        fz = dj.a(fz.b(), c2_1, dq);
        int i1 = fz.length;
        i = 0;
        j = 0;
        int k;
        do
        {
            k = i;
            if (j >= i1)
            {
                break;
            }
            k = i + fz[j].a();
            j++;
            i = k;
        } while (!flag);
        abyte0 = new byte[k];
        i = 0;
        k1 = fz.length;
        j = 0;
_L4:
        if (j >= k1) goto _L2; else goto _L1
_L1:
        byte abyte1[];
        int l;
        int l1;
        dj dj1 = fz[j];
        abyte1 = dj1.b();
        l1 = dj1.a();
        a(abyte1, l1);
        l = 0;
_L5:
        int j1;
        if (l < l1)
        {
            j1 = i + 1;
            abyte0[i] = abyte1[l];
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_188;
            }
            i = j1;
        }
        if (!flag) goto _L3; else goto _L2
_L2:
        return dp.a(abyte0, c2_1, dq, map);
_L3:
        j++;
          goto _L4
        l++;
        i = j1;
          goto _L5
    }

    private void a(byte abyte0[], int i)
    {
        boolean flag = false;
        boolean flag1 = c2.g;
        int k = abyte0.length;
        int ai[] = new int[k];
        int j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            ai[j] = abyte0[j] & 0xff;
            j++;
        } while (!flag1);
        j = abyte0.length;
        try
        {
            a.a(ai, j - i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw gY.a();
        }
        j = ((flag) ? 1 : 0);
        do
        {
            if (j >= i)
            {
                break;
            }
            abyte0[j] = (byte)ai[j];
            j++;
        } while (!flag1);
    }

    public fG a(d6 d6, Map map)
    {
        fZ fz = new fZ(d6);
        d6 = a(fz, map);
        return d6;
        gd gd1;
        gd1;
        d6 = null;
_L1:
        fz.a();
        fz.a(true);
        fz.e();
        fz.d();
        fz.c();
        map = a(fz, map);
        map.a(new V(true));
        return map;
        map;
_L2:
        if (gd1 != null)
        {
            try
            {
                throw gd1;
            }
            // Misplaced declaration of an exception variable
            catch (d6 d6)
            {
                throw d6;
            }
        }
        break MISSING_BLOCK_LABEL_89;
        d6;
        gd1 = null;
          goto _L1
        if (d6 != null)
        {
            try
            {
                throw d6;
            }
            // Misplaced declaration of an exception variable
            catch (d6 d6)
            {
                throw d6;
            }
        } else
        {
            throw map;
        }
        map;
          goto _L2
    }
}
