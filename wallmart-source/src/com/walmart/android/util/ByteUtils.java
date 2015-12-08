// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;


public class ByteUtils
{

    public ByteUtils()
    {
    }

    public static final int bytesToInt(byte abyte0[], int i)
    {
        return (abyte0[i + 0] << 24) + ((abyte0[i + 1] & 0xff) << 16) + ((abyte0[i + 2] & 0xff) << 8) + (abyte0[i + 3] & 0xff);
    }

    public static final short bytesToShort(byte abyte0[], int i)
    {
        return (short)(((abyte0[i + 0] & 0xff) << 8) + (abyte0[i + 1] & 0xff));
    }

    public static transient void copyIntoArray(int i, byte abyte0[], byte abyte1[][])
    {
        int l = abyte1.length;
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < l; i++)
        {
            byte abyte2[] = abyte1[i];
            for (int k = 0; k < abyte2.length; k++)
            {
                abyte0[j] = abyte2[k];
                j++;
            }

        }

    }

    public static final byte[] intToByteArray(int i)
    {
        return (new byte[] {
            (byte)(i >>> 24), (byte)(i >>> 16), (byte)(i >>> 8), (byte)i
        });
    }

    public static final byte[] shortToByteArray(short word0)
    {
        return (new byte[] {
            (byte)(word0 >>> 8), (byte)word0
        });
    }
}
