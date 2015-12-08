// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;


// Referenced classes of package org.bouncycastle.util.encoders:
//            Translator

public class HexTranslator
    implements Translator
{

    private static final byte hexTable[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };

    public HexTranslator()
    {
    }

    public int decode(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int l = j / 2;
        j = 0;
        while (j < l) 
        {
            byte byte0 = abyte0[j * 2 + i];
            byte byte1 = abyte0[j * 2 + i + 1];
            if (byte0 < 97)
            {
                abyte1[k] = (byte)(byte0 - 48 << 4);
            } else
            {
                abyte1[k] = (byte)((byte0 - 97) + 10 << 4);
            }
            if (byte1 < 97)
            {
                abyte1[k] = (byte)(abyte1[k] + (byte)(byte1 - 48));
            } else
            {
                abyte1[k] = (byte)(abyte1[k] + (byte)((byte1 - 97) + 10));
            }
            k++;
            j++;
        }
        return l;
    }

    public int encode(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        boolean flag = false;
        int l = 0;
        int i1 = i;
        for (i = ((flag) ? 1 : 0); l < j; i += 2)
        {
            abyte1[k + i] = hexTable[abyte0[i1] >> 4 & 0xf];
            abyte1[k + i + 1] = hexTable[abyte0[i1] & 0xf];
            i1++;
            l++;
        }

        return j * 2;
    }

    public int getDecodedBlockSize()
    {
        return 1;
    }

    public int getEncodedBlockSize()
    {
        return 2;
    }

}
