// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;

public class RainbowUtil
{

    public RainbowUtil()
    {
    }

    public static byte[] convertArray(short aword0[])
    {
        byte abyte0[] = new byte[aword0.length];
        for (int i = 0; i < aword0.length; i++)
        {
            abyte0[i] = (byte)aword0[i];
        }

        return abyte0;
    }

    public static short[] convertArray(byte abyte0[])
    {
        short aword0[] = new short[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            aword0[i] = (short)(abyte0[i] & 0xff);
        }

        return aword0;
    }

    public static byte[][] convertArray(short aword0[][])
    {
        int i = aword0.length;
        int k = aword0[0].length;
        byte abyte0[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            i, k
        });
        for (int j = 0; j < aword0.length; j++)
        {
            for (int l = 0; l < aword0[0].length; l++)
            {
                abyte0[j][l] = (byte)aword0[j][l];
            }

        }

        return abyte0;
    }

    public static short[][] convertArray(byte abyte0[][])
    {
        int i = abyte0.length;
        int k = abyte0[0].length;
        short aword0[][] = (short[][])Array.newInstance(Short.TYPE, new int[] {
            i, k
        });
        for (int j = 0; j < abyte0.length; j++)
        {
            for (int l = 0; l < abyte0[0].length; l++)
            {
                aword0[j][l] = (short)(abyte0[j][l] & 0xff);
            }

        }

        return aword0;
    }

    public static byte[][][] convertArray(short aword0[][][])
    {
        int i = aword0.length;
        int k = aword0[0].length;
        int i1 = aword0[0][0].length;
        byte abyte0[][][] = (byte[][][])Array.newInstance(Byte.TYPE, new int[] {
            i, k, i1
        });
        for (int j = 0; j < aword0.length; j++)
        {
            for (int l = 0; l < aword0[0].length; l++)
            {
                for (int j1 = 0; j1 < aword0[0][0].length; j1++)
                {
                    abyte0[j][l][j1] = (byte)aword0[j][l][j1];
                }

            }

        }

        return abyte0;
    }

    public static short[][][] convertArray(byte abyte0[][][])
    {
        int i = abyte0.length;
        int k = abyte0[0].length;
        int i1 = abyte0[0][0].length;
        short aword0[][][] = (short[][][])Array.newInstance(Short.TYPE, new int[] {
            i, k, i1
        });
        for (int j = 0; j < abyte0.length; j++)
        {
            for (int l = 0; l < abyte0[0].length; l++)
            {
                for (int j1 = 0; j1 < abyte0[0][0].length; j1++)
                {
                    aword0[j][l][j1] = (short)(abyte0[j][l][j1] & 0xff);
                }

            }

        }

        return aword0;
    }

    public static int[] convertArraytoInt(byte abyte0[])
    {
        int ai[] = new int[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            ai[i] = abyte0[i] & 0xff;
        }

        return ai;
    }

    public static byte[] convertIntArray(int ai[])
    {
        byte abyte0[] = new byte[ai.length];
        for (int i = 0; i < ai.length; i++)
        {
            abyte0[i] = (byte)ai[i];
        }

        return abyte0;
    }

    public static boolean equals(short aword0[], short aword1[])
    {
        if (aword0.length != aword1.length)
        {
            return false;
        }
        int i = aword0.length - 1;
        boolean flag1 = true;
        while (i >= 0) 
        {
            boolean flag;
            if (aword0[i] == aword1[i])
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

    public static boolean equals(short aword0[][], short aword1[][])
    {
        if (aword0.length == aword1.length) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        int i = aword0.length;
        boolean flag = true;
        i--;
        do
        {
            flag1 = flag;
            if (i < 0)
            {
                continue;
            }
            flag1 = equals(aword0[i], aword1[i]);
            i--;
            flag = flag1 & flag;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean equals(short aword0[][][], short aword1[][][])
    {
        if (aword0.length == aword1.length) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        int i = aword0.length;
        boolean flag = true;
        i--;
        do
        {
            flag1 = flag;
            if (i < 0)
            {
                continue;
            }
            flag1 = equals(aword0[i], aword1[i]);
            i--;
            flag = flag1 & flag;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
