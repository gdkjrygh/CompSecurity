// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            bx, y, aj, v, 
//            t, q

public final class by extends bx
{

    private static final int a[] = {
        1, 1, 1, 1, 1, 1
    };
    private static final int f[][] = {
        {
            56, 52, 50, 49, 44, 38, 35, 42, 41, 37
        }, {
            7, 11, 13, 14, 19, 25, 28, 21, 22, 26
        }
    };
    private final int g[] = new int[4];

    public by()
    {
    }

    protected final int a(aj aj1, int ai[], StringBuffer stringbuffer)
        throws y
    {
        int ai1[] = g;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int k1 = aj1.b;
        int j = ai[1];
        int k = 0;
        int i = 0;
        for (; k < 6 && j < k1; k++)
        {
            int l1 = a(aj1, ai1, j, e);
            stringbuffer.append((char)(l1 % 10 + 48));
            for (int i1 = 0; i1 < ai1.length; i1++)
            {
                j += ai1[i1];
            }

            if (l1 >= 10)
            {
                i = 1 << 5 - k | i;
            }
        }

        for (int l = 0; l <= 1; l++)
        {
            for (int j1 = 0; j1 < 10; j1++)
            {
                if (i == f[l][j1])
                {
                    stringbuffer.insert(0, (char)(l + 48));
                    stringbuffer.append((char)(j1 + 48));
                    return j;
                }
            }

        }

        throw y.a();
    }

    protected final boolean a(String s)
        throws v, t
    {
        char c;
        char ac[];
        StringBuffer stringbuffer;
        ac = new char[6];
        s.getChars(1, 7, ac, 0);
        stringbuffer = new StringBuffer(12);
        stringbuffer.append(s.charAt(0));
        c = ac[5];
        c;
        JVM INSTR tableswitch 48 52: default 76
    //                   48 122
    //                   49 122
    //                   50 122
    //                   51 158
    //                   52 187;
           goto _L1 _L2 _L2 _L2 _L3 _L4
_L1:
        stringbuffer.append(ac, 0, 5);
        stringbuffer.append("0000");
        stringbuffer.append(c);
_L6:
        stringbuffer.append(s.charAt(7));
        return super.a(stringbuffer.toString());
_L2:
        stringbuffer.append(ac, 0, 2);
        stringbuffer.append(c);
        stringbuffer.append("0000");
        stringbuffer.append(ac, 2, 3);
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append(ac, 0, 3);
        stringbuffer.append("00000");
        stringbuffer.append(ac, 3, 2);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append(ac, 0, 4);
        stringbuffer.append("00000");
        stringbuffer.append(ac[4]);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final int[] a(aj aj1, int i)
        throws y
    {
        return a(aj1, i, true, a);
    }

    final q b()
    {
        return q.o;
    }

}
