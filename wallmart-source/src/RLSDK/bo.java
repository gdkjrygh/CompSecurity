// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            bx, y, aj, q

public final class bo extends bx
{

    static final int a[] = {
        0, 11, 13, 14, 19, 25, 28, 21, 22, 26
    };
    private final int f[] = new int[4];

    public bo()
    {
    }

    protected final int a(aj aj1, int ai[], StringBuffer stringbuffer)
        throws y
    {
        int ai1[];
        int i;
        int j;
        int k;
        int i1;
        ai1 = f;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        i1 = aj1.b;
        j = ai[1];
        k = 0;
        i = 0;
        for (; k < 6 && j < i1; k++)
        {
            int j1 = a(aj1, ai1, j, e);
            stringbuffer.append((char)(j1 % 10 + 48));
            for (int l = 0; l < ai1.length; l++)
            {
                j += ai1[l];
            }

            if (j1 >= 10)
            {
                i = 1 << 5 - k | i;
            }
        }

        k = 0;
_L8:
        if (k >= 10) goto _L2; else goto _L1
_L1:
        if (i != a[k]) goto _L4; else goto _L3
_L3:
        stringbuffer.insert(0, (char)(k + 48));
        i = a(aj1, j, true, c)[1];
        j = 0;
_L6:
        if (j >= 6 || i >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append((char)(a(aj1, ai1, i, d) + 48));
        for (k = 0; k < ai1.length; k++)
        {
            i += ai1[k];
        }

        j++;
        continue; /* Loop/switch isn't completed */
_L4:
        k++;
        continue; /* Loop/switch isn't completed */
_L2:
        throw y.a();
        if (true) goto _L6; else goto _L5
_L5:
        return i;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final q b()
    {
        return q.h;
    }

}
