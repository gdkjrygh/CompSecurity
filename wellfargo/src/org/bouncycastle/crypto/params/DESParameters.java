// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;


// Referenced classes of package org.bouncycastle.crypto.params:
//            KeyParameter

public class DESParameters extends KeyParameter
{

    public static final int DES_KEY_LENGTH = 8;
    private static byte DES_weak_keys[] = {
        1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 
        31, 31, 14, 14, 14, 14, -32, -32, -32, -32, 
        -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, 
        -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 
        31, -32, 31, -32, 14, -15, 14, -15, 1, -32, 
        1, -32, 1, -15, 1, -15, 31, -2, 31, -2, 
        14, -2, 14, -2, 1, 31, 1, 31, 1, 14, 
        1, 14, -32, -2, -32, -2, -15, -2, -15, -2, 
        -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, 
        -32, 31, -15, 14, -15, 14, -32, 1, -32, 1, 
        -15, 1, -15, 1, -2, 31, -2, 31, -2, 14, 
        -2, 14, 31, 1, 31, 1, 14, 1, 14, 1, 
        -2, -32, -2, -32, -2, -15, -2, -15
    };
    private static final int N_DES_WEAK_KEYS = 16;

    public DESParameters(byte abyte0[])
    {
        super(abyte0);
        if (isWeakKey(abyte0, 0))
        {
            throw new IllegalArgumentException("attempt to create weak DES key");
        } else
        {
            return;
        }
    }

    public static boolean isWeakKey(byte abyte0[], int i)
    {
        boolean flag1 = false;
        if (abyte0.length - i < 8)
        {
            throw new IllegalArgumentException("key material too short.");
        }
        int j = 0;
label0:
        do
        {
            boolean flag = flag1;
            if (j < 16)
            {
                int k = 0;
                do
                {
                    if (k >= 8)
                    {
                        break;
                    }
                    if (abyte0[k + i] != DES_weak_keys[j * 8 + k])
                    {
                        j++;
                        continue label0;
                    }
                    k++;
                } while (true);
                flag = true;
            }
            return flag;
        } while (true);
    }

    public static void setOddParity(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            byte byte0 = abyte0[i];
            abyte0[i] = (byte)((byte0 >> 7 ^ (byte0 >> 1 ^ byte0 >> 2 ^ byte0 >> 3 ^ byte0 >> 4 ^ byte0 >> 5 ^ byte0 >> 6) ^ 1) & 1 | byte0 & 0xfe);
        }

    }

}
