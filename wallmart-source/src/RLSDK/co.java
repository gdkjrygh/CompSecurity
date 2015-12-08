// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            cq, cz, aj

abstract class co extends cq
{

    co(aj aj)
    {
        super(aj);
    }

    protected final void a(StringBuffer stringbuffer, int i, int j)
    {
        for (int k = 0; k < 4; k++)
        {
            int i1 = b.a(k * 10 + i, 10);
            if (i1 / 100 == 0)
            {
                stringbuffer.append('0');
            }
            if (i1 / 10 == 0)
            {
                stringbuffer.append('0');
            }
            stringbuffer.append(i1);
        }

        i = 0;
        int l = 0;
        for (; i < 13; i++)
        {
            int k1 = stringbuffer.charAt(i + j) - 48;
            int j1 = k1;
            if ((i & 1) == 0)
            {
                j1 = k1 * 3;
            }
            l += j1;
        }

        j = 10 - l % 10;
        i = j;
        if (j == 10)
        {
            i = 0;
        }
        stringbuffer.append(i);
    }

    protected final void b(StringBuffer stringbuffer, int i)
    {
        stringbuffer.append("(01)");
        int j = stringbuffer.length();
        stringbuffer.append('9');
        a(stringbuffer, i, j);
    }
}
