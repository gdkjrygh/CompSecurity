// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public abstract class Pack
{

    public static boolean a;

    public Pack()
    {
    }

    public static int bigEndianToInt(byte abyte0[], int i)
    {
        boolean flag = a;
        byte byte0 = abyte0[i];
        int j = i + 1;
        i = abyte0[j];
        int k = j + 1;
        j = abyte0[k];
        k = abyte0[k + 1];
        if (BaseKeyGenerator.a)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            a = flag;
        }
        return byte0 << 24 | (i & 0xff) << 16 | (j & 0xff) << 8 | k & 0xff;
    }

    public static void bigEndianToInt(byte abyte0[], int i, int ai[])
    {
        boolean flag1 = a;
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= ai.length)
            {
                break;
            }
            ai[i] = bigEndianToInt(abyte0, j);
            j += 4;
            i++;
        } while (!flag1);
    }

    public static long bigEndianToLong(byte abyte0[], int i)
    {
        int j = bigEndianToInt(abyte0, i);
        i = bigEndianToInt(abyte0, i + 4);
        long l = j;
        return (long)i & 0xffffffffL | (l & 0xffffffffL) << 32;
    }

    public static void bigEndianToLong(byte abyte0[], int i, long al[])
    {
        boolean flag1 = a;
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= al.length)
            {
                break;
            }
            al[i] = bigEndianToLong(abyte0, j);
            j += 8;
            i++;
        } while (!flag1);
    }

    public static void intToBigEndian(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)(i >>> 24);
        j++;
        abyte0[j] = (byte)(i >>> 16);
        j++;
        abyte0[j] = (byte)(i >>> 8);
        abyte0[j + 1] = (byte)i;
    }

    public static void intToBigEndian(int ai[], byte abyte0[], int i)
    {
        boolean flag1 = a;
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= ai.length)
            {
                break;
            }
            intToBigEndian(ai[i], abyte0, j);
            j += 4;
            i++;
        } while (!flag1);
    }

    public static void intToLittleEndian(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)i;
        j++;
        abyte0[j] = (byte)(i >>> 8);
        j++;
        abyte0[j] = (byte)(i >>> 16);
        abyte0[j + 1] = (byte)(i >>> 24);
    }

    public static int littleEndianToInt(byte abyte0[], int i)
    {
        boolean flag = a;
        byte byte0 = abyte0[i];
        int j = i + 1;
        i = abyte0[j];
        int k = j + 1;
        j = abyte0[k];
        k = abyte0[k + 1];
        if (flag)
        {
            boolean flag1;
            if (BaseKeyGenerator.a)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            BaseKeyGenerator.a = flag1;
        }
        return byte0 & 0xff | (i & 0xff) << 8 | (j & 0xff) << 16 | k << 24;
    }

    public static void longToBigEndian(long l, byte abyte0[], int i)
    {
        intToBigEndian((int)(l >>> 32), abyte0, i);
        intToBigEndian((int)(0xffffffffL & l), abyte0, i + 4);
    }

    public static void longToBigEndian(long al[], byte abyte0[], int i)
    {
        boolean flag1 = a;
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= al.length)
            {
                break;
            }
            longToBigEndian(al[i], abyte0, j);
            j += 8;
            i++;
        } while (!flag1);
    }
}
