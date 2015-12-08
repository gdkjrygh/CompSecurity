// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.UnsupportedEncodingException;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

public static class 
{

    private static final byte EQUALS_SIGN = 61;
    private static final String PREFERRED_ENCODING = "US-ASCII";
    private static final byte _STANDARD_ALPHABET[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };

    public static String encode(String s)
    {
        byte abyte0[] = s.getBytes("US-ASCII");
        s = abyte0;
_L2:
        return encodeBytes(s);
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        s = s.getBytes();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static byte[] encode3to4(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int j1 = 0;
        byte abyte2[] = _STANDARD_ALPHABET;
        int l;
        int i1;
        if (j > 0)
        {
            l = (abyte0[i] << 24) >>> 8;
        } else
        {
            l = 0;
        }
        if (j > 1)
        {
            i1 = (abyte0[i + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (j > 2)
        {
            j1 = (abyte0[i + 2] << 24) >>> 24;
        }
        i = i1 | l | j1;
        switch (j)
        {
        default:
            return abyte1;

        case 3: // '\003'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = abyte2[i & 0x3f];
            return abyte1;

        case 2: // '\002'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = 61;
            return abyte1;

        case 1: // '\001'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = 61;
            abyte1[k + 3] = 61;
            return abyte1;
        }
    }

    public static String encodeBytes(byte abyte0[])
    {
        return encodeBytes(abyte0, 0, abyte0.length);
    }

    public static String encodeBytes(byte abyte0[], int i, int j)
    {
        abyte0 = encodeBytesToBytes(abyte0, i, j);
        String s;
        try
        {
            s = new String(abyte0, "US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return new String(abyte0);
        }
        return s;
    }

    public static byte[] encodeBytesToBytes(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot have negative offset: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot have length offset: ").append(j).toString());
        }
        if (i + j > abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(abyte0.length)
            }));
        }
        int l = j / 3;
        byte abyte1[];
        int k;
        if (j % 3 > 0)
        {
            k = 4;
        } else
        {
            k = 0;
        }
        abyte1 = new byte[l * 4 + k];
        l = 0;
        for (k = 0; l < j - 2; k += 4)
        {
            encode3to4(abyte0, l + i, 3, abyte1, k);
            l += 3;
        }

        int i1 = k;
        if (l < j)
        {
            encode3to4(abyte0, l + i, j - l, abyte1, k);
            i1 = k + 4;
        }
        if (i1 <= abyte1.length - 1)
        {
            abyte0 = new byte[i1];
            System.arraycopy(abyte1, 0, abyte0, 0, i1);
            return abyte0;
        } else
        {
            return abyte1;
        }
    }


    private ()
    {
    }
}
