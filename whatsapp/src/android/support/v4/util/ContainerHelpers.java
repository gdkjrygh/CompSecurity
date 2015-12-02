// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//            LruCache

class ContainerHelpers
{

    static final int EMPTY_INTS[] = new int[0];
    static final long EMPTY_LONGS[] = new long[0];
    static final Object EMPTY_OBJECTS[] = new Object[0];

    static int binarySearch(int ai[], int i, int j)
    {
        int l;
label0:
        {
            boolean flag = LruCache.a;
            l = 0;
            int k = i - 1;
            i = l;
            do
            {
                l = i;
                if (i > k)
                {
                    break label0;
                }
                l = i + k >>> 1;
                int i1 = ai[l];
                if (i1 < j)
                {
                    i = l + 1;
                    if (!flag)
                    {
                        continue;
                    }
                }
                if (i1 <= j || flag)
                {
                    return l;
                }
                k = l - 1;
            } while (!flag);
            l = i;
        }
        return ~l;
    }

    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static int idealByteArraySize(int i)
    {
        boolean flag = LruCache.a;
        int j = 4;
        do
        {
label0:
            {
                int k = i;
                if (j < 32)
                {
                    if (i > (1 << j) - 12)
                    {
                        break label0;
                    }
                    k = (1 << j) - 12;
                }
                return k;
            }
            j++;
            if (flag)
            {
                return i;
            }
        } while (true);
    }

    public static int idealIntArraySize(int i)
    {
        return idealByteArraySize(i * 4) / 4;
    }

}
