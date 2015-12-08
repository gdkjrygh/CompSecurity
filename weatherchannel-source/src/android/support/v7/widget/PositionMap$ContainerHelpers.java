// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            PositionMap

static class 
{

    static final boolean EMPTY_BOOLEANS[] = new boolean[0];
    static final int EMPTY_INTS[] = new int[0];
    static final long EMPTY_LONGS[] = new long[0];
    static final Object EMPTY_OBJECTS[] = new Object[0];

    static int binarySearch(int ai[], int i, int j)
    {
        int k;
label0:
        {
            k = 0;
            int l = i - 1;
            i = k;
            for (k = l; i <= k;)
            {
                int i1 = i + k >>> 1;
                int j1 = ai[i1];
                if (j1 < j)
                {
                    i = i1 + 1;
                } else
                {
                    k = i1;
                    if (j1 <= j)
                    {
                        break label0;
                    }
                    k = i1 - 1;
                }
            }

            k = ~i;
        }
        return k;
    }


    ()
    {
    }
}
