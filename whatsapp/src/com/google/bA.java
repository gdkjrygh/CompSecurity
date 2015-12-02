// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Map;

// Referenced classes of package com.google:
//            gg, a6, fA, gY, 
//            bB, gd, gh, b6, 
//            d6, fG

public final class bA
{

    public static int a;
    private final gg b;

    public bA()
    {
        b = new gg(a6.o);
    }

    private void a(byte abyte0[], int i, int j, int k, int l)
    {
        boolean flag = false;
        int k1 = a;
        int l1 = j + k;
        int ai[];
        int i1;
        int j1;
        if (l == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        ai = new int[l1 / i1];
        j1 = 0;
        do
        {
            if (j1 >= l1)
            {
                break;
            }
            if (l == 0 || j1 % 2 == l - 1)
            {
                try
                {
                    ai[j1 / i1] = abyte0[j1 + i] & 0xff;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
            }
            j1++;
        } while (k1 == 0);
        try
        {
            b.a(ai, k / i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw gY.a();
        }
        k = ((flag) ? 1 : 0);
        do
        {
            if (k >= j)
            {
                break;
            }
            if (l == 0 || k % 2 == l - 1)
            {
                try
                {
                    abyte0[k + i] = (byte)ai[k / i1];
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
            }
            k++;
        } while (k1 == 0);
    }

    public fG a(d6 d6, Map map)
    {
        int i;
        int j;
        i = a;
        map = (new bB(d6)).a();
        a(((byte []) (map)), 0, 10, 10, 0);
        j = map[0] & 0xf;
        j;
        JVM INSTR tableswitch 2 5: default 68
    //                   2 72
    //                   3 72
    //                   4 72
    //                   5 113;
           goto _L1 _L2 _L2 _L2 _L3
_L1:
        throw gd.a();
_L2:
        a(((byte []) (map)), 20, 84, 40, 1);
        a(((byte []) (map)), 20, 84, 40, 2);
        d6 = new byte[94];
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        gh.a++;
_L3:
        a(((byte []) (map)), 20, 68, 56, 1);
        a(((byte []) (map)), 20, 68, 56, 2);
        d6 = new byte[78];
        if (i != 0) goto _L1; else goto _L4
_L4:
        System.arraycopy(map, 0, d6, 0, 10);
        System.arraycopy(map, 20, d6, 10, d6.length - 10);
        return b6.a(d6, j);
    }
}
