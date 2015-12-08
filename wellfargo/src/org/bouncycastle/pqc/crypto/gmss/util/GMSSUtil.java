// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss.util;

import java.io.PrintStream;

public class GMSSUtil
{

    public GMSSUtil()
    {
    }

    public int bytesToIntLittleEndian(byte abyte0[])
    {
        return abyte0[0] & 0xff | (abyte0[1] & 0xff) << 8 | (abyte0[2] & 0xff) << 16 | (abyte0[3] & 0xff) << 24;
    }

    public int bytesToIntLittleEndian(byte abyte0[], int i)
    {
        int j = i + 1;
        i = abyte0[i];
        int k = j + 1;
        return (abyte0[j] & 0xff) << 8 | i & 0xff | (abyte0[k] & 0xff) << 16 | (abyte0[k + 1] & 0xff) << 24;
    }

    public byte[] concatenateArray(byte abyte0[][])
    {
        byte abyte1[] = new byte[abyte0.length * abyte0[0].length];
        int i = 0;
        int j = 0;
        for (; i < abyte0.length; i++)
        {
            System.arraycopy(abyte0[i], 0, abyte1, j, abyte0[i].length);
            j += abyte0[i].length;
        }

        return abyte1;
    }

    public int getLog(int i)
    {
        int j = 1;
        for (int k = 2; k < i;)
        {
            k <<= 1;
            j++;
        }

        return j;
    }

    public byte[] intToBytesLittleEndian(int i)
    {
        return (new byte[] {
            (byte)(i & 0xff), (byte)(i >> 8 & 0xff), (byte)(i >> 16 & 0xff), (byte)(i >> 24 & 0xff)
        });
    }

    public void printArray(String s, byte abyte0[])
    {
        int i = 0;
        System.out.println(s);
        int j = 0;
        for (; i < abyte0.length; i++)
        {
            System.out.println((new StringBuilder()).append(j).append("; ").append(abyte0[i]).toString());
            j++;
        }

    }

    public void printArray(String s, byte abyte0[][])
    {
        System.out.println(s);
        int i = 0;
        int j = 0;
        for (; i < abyte0.length; i++)
        {
            for (int k = 0; k < abyte0[0].length;)
            {
                System.out.println((new StringBuilder()).append(j).append("; ").append(abyte0[i][k]).toString());
                k++;
                j++;
            }

        }

    }

    public boolean testPowerOfTwo(int i)
    {
        int j;
        for (j = 1; j < i; j <<= 1) { }
        return i == j;
    }
}
