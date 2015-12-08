// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            bu, y

public abstract class bz extends bu
{

    protected final int a[] = new int[4];
    protected final int b[] = new int[8];
    protected final float c[] = new float[4];
    protected final float d[] = new float[4];
    protected final int e[];
    protected final int f[];

    protected bz()
    {
        e = new int[b.length / 2];
        f = new int[b.length / 2];
    }

    protected static int a(int ai[])
    {
        int i = 0;
        int j = 0;
        for (; i < ai.length; i++)
        {
            j += ai[i];
        }

        return j;
    }

    protected static int a(int ai[], int ai1[][])
        throws y
    {
        for (int i = 0; i < ai1.length; i++)
        {
            if (a(ai, ai1[i], 102) < 51)
            {
                return i;
            }
        }

        throw y.a();
    }

    protected static void a(int ai[], float af[])
    {
        int j = 0;
        float f1 = af[0];
        for (int i = 1; i < ai.length;)
        {
            float f2 = f1;
            if (af[i] > f1)
            {
                f2 = af[i];
                j = i;
            }
            i++;
            f1 = f2;
        }

        ai[j] = ai[j] + 1;
    }

    protected static void b(int ai[], float af[])
    {
        int j = 0;
        float f1 = af[0];
        for (int i = 1; i < ai.length;)
        {
            float f2 = f1;
            if (af[i] < f1)
            {
                f2 = af[i];
                j = i;
            }
            i++;
            f1 = f2;
        }

        ai[j] = ai[j] - 1;
    }

    protected static boolean b(int ai[])
    {
        boolean flag1 = false;
        int i = ai[0] + ai[1];
        int k = ai[2];
        int i1 = ai[3];
        float f1 = (float)i / (float)(k + i + i1);
        boolean flag = flag1;
        if (f1 >= 0.7916667F)
        {
            flag = flag1;
            if (f1 <= 0.8928571F)
            {
                int j = 0x7fffffff;
                int k1 = 0x80000000;
                for (int l = 0; l < ai.length;)
                {
                    int l1 = ai[l];
                    int j1 = k1;
                    if (l1 > k1)
                    {
                        j1 = l1;
                    }
                    int i2 = j;
                    if (l1 < j)
                    {
                        i2 = l1;
                    }
                    l++;
                    k1 = j1;
                    j = i2;
                }

                flag = flag1;
                if (k1 < j * 10)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
