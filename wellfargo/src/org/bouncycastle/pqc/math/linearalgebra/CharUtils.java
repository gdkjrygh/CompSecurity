// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


public final class CharUtils
{

    private CharUtils()
    {
    }

    public static char[] clone(char ac[])
    {
        char ac1[] = new char[ac.length];
        System.arraycopy(ac, 0, ac1, 0, ac.length);
        return ac1;
    }

    public static boolean equals(char ac[], char ac1[])
    {
        if (ac.length != ac1.length)
        {
            return false;
        }
        int i = ac.length - 1;
        boolean flag1 = true;
        while (i >= 0) 
        {
            boolean flag;
            if (ac[i] == ac1[i])
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

    public static byte[] toByteArray(char ac[])
    {
        byte abyte0[] = new byte[ac.length];
        for (int i = ac.length - 1; i >= 0; i--)
        {
            abyte0[i] = (byte)ac[i];
        }

        return abyte0;
    }

    public static byte[] toByteArrayForPBE(char ac[])
    {
        byte abyte0[] = new byte[ac.length];
        for (int i = 0; i < ac.length; i++)
        {
            abyte0[i] = (byte)ac[i];
        }

        int k = abyte0.length * 2;
        ac = new byte[k + 2];
        for (int j = 0; j < abyte0.length; j++)
        {
            int l = j * 2;
            ac[l] = '\0';
            ac[l + 1] = abyte0[j];
        }

        ac[k] = '\0';
        ac[k + 1] = '\0';
        return ac;
    }
}
