// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            bx, y, aj, q

public final class bp extends bx
{

    private final int a[] = new int[4];

    public bp()
    {
    }

    protected final int a(aj aj1, int ai[], StringBuffer stringbuffer)
        throws y
    {
        int ai1[] = a;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int j1 = aj1.b;
        int i = ai[1];
        for (int j = 0; j < 4 && i < j1; j++)
        {
            stringbuffer.append((char)(a(aj1, ai1, i, d) + 48));
            for (int l = 0; l < ai1.length; l++)
            {
                i += ai1[l];
            }

        }

        i = a(aj1, i, true, c)[1];
        for (int k = 0; k < 4 && i < j1; k++)
        {
            stringbuffer.append((char)(a(aj1, ai1, i, d) + 48));
            for (int i1 = 0; i1 < ai1.length; i1++)
            {
                i += ai1[i1];
            }

        }

        return i;
    }

    final q b()
    {
        return q.g;
    }
}
