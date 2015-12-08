// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


class ContainerHelpers
{

    static final int EMPTY_INTS[] = new int[0];
    static final long EMPTY_LONGS[] = new long[0];
    static final Object EMPTY_OBJECTS[] = new Object[0];

    ContainerHelpers()
    {
    }

    static int binarySearch(int ai[], int i, int j)
    {
        int k;
        k = 0;
        int l = i - 1;
        i = k;
        k = l;
_L6:
        if (i <= k) goto _L2; else goto _L1
_L1:
        k = ~i;
_L4:
        return k;
_L2:
        int i1;
        int j1;
        i1 = i + k >>> 1;
        j1 = ai[i1];
        if (j1 < j)
        {
            i = i1 + 1;
            continue; /* Loop/switch isn't completed */
        }
        k = i1;
        if (j1 <= j) goto _L4; else goto _L3
_L3:
        k = i1 - 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static int binarySearch(long al[], int i, long l)
    {
        int j;
        j = 0;
        int k = i - 1;
        i = j;
        j = k;
_L6:
        if (i <= j) goto _L2; else goto _L1
_L1:
        j = ~i;
_L4:
        return j;
_L2:
        int i1;
        long l1;
        i1 = i + j >>> 1;
        l1 = al[i1];
        if (l1 < l)
        {
            i = i1 + 1;
            continue; /* Loop/switch isn't completed */
        }
        j = i1;
        if (l1 <= l) goto _L4; else goto _L3
_L3:
        j = i1 - 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static int idealByteArraySize(int i)
    {
        int j = 4;
        do
        {
            if (j >= 32)
            {
                return i;
            }
            if (i <= (1 << j) - 12)
            {
                return (1 << j) - 12;
            }
            j++;
        } while (true);
    }

    public static int idealIntArraySize(int i)
    {
        return idealByteArraySize(i * 4) / 4;
    }

    public static int idealLongArraySize(int i)
    {
        return idealByteArraySize(i * 8) / 8;
    }

}
