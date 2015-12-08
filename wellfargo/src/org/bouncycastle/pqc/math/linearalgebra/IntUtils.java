// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            BigEndianConversions, ByteUtils

public final class IntUtils
{

    private IntUtils()
    {
    }

    public static int[] clone(int ai[])
    {
        int ai1[] = new int[ai.length];
        System.arraycopy(ai, 0, ai1, 0, ai.length);
        return ai1;
    }

    public static boolean equals(int ai[], int ai1[])
    {
        if (ai.length != ai1.length)
        {
            return false;
        }
        int i = ai.length - 1;
        boolean flag1 = true;
        while (i >= 0) 
        {
            boolean flag;
            if (ai[i] == ai1[i])
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 &= flag;
            i--;
        }
        return flag1;
    }

    public static void fill(int ai[], int i)
    {
        for (int j = ai.length - 1; j >= 0; j--)
        {
            ai[j] = i;
        }

    }

    private static int partition(int ai[], int i, int j, int k)
    {
        int i1 = ai[k];
        ai[k] = ai[j];
        ai[j] = i1;
        int l = i;
        k = i;
        for (i = l; k < j; i = l)
        {
            l = i;
            if (ai[k] <= i1)
            {
                l = ai[i];
                ai[i] = ai[k];
                ai[k] = l;
                l = i + 1;
            }
            k++;
        }

        k = ai[i];
        ai[i] = ai[j];
        ai[j] = k;
        return i;
    }

    public static void quicksort(int ai[])
    {
        quicksort(ai, 0, ai.length - 1);
    }

    public static void quicksort(int ai[], int i, int j)
    {
        if (j > i)
        {
            int k = partition(ai, i, j, j);
            quicksort(ai, i, k - 1);
            quicksort(ai, k + 1, j);
        }
    }

    public static int[] subArray(int ai[], int i, int j)
    {
        int ai1[] = new int[j - i];
        System.arraycopy(ai, i, ai1, 0, j - i);
        return ai1;
    }

    public static BigInteger[] toFlexiBigIntArray(int ai[])
    {
        BigInteger abiginteger[] = new BigInteger[ai.length];
        for (int i = 0; i < ai.length; i++)
        {
            abiginteger[i] = BigInteger.valueOf(ai[i]);
        }

        return abiginteger;
    }

    public static String toHexString(int ai[])
    {
        return ByteUtils.toHexString(BigEndianConversions.toByteArray(ai));
    }

    public static String toString(int ai[])
    {
        String s = "";
        for (int i = 0; i < ai.length; i++)
        {
            s = (new StringBuilder()).append(s).append(ai[i]).append(" ").toString();
        }

        return s;
    }
}
