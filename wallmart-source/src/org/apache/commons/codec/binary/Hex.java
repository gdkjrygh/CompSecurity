// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Hex
    implements BinaryDecoder, BinaryEncoder
{

    private static final char DIGITS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    public Hex()
    {
    }

    public static byte[] decodeHex(char ac[])
        throws DecoderException
    {
        int k = ac.length;
        if ((k & 1) != 0)
        {
            throw new DecoderException("Odd number of characters.");
        }
        byte abyte0[] = new byte[k >> 1];
        int i = 0;
        for (int j = 0; j < k;)
        {
            int l = toDigit(ac[j], j);
            j++;
            int i1 = toDigit(ac[j], j);
            j++;
            abyte0[i] = (byte)((l << 4 | i1) & 0xff);
            i++;
        }

        return abyte0;
    }

    public static char[] encodeHex(byte abyte0[])
    {
        int k = abyte0.length;
        char ac[] = new char[k << 1];
        int i = 0;
        int j = 0;
        for (; i < k; i++)
        {
            int l = j + 1;
            ac[j] = DIGITS[(abyte0[i] & 0xf0) >>> 4];
            j = l + 1;
            ac[l] = DIGITS[abyte0[i] & 0xf];
        }

        return ac;
    }

    protected static int toDigit(char c, int i)
        throws DecoderException
    {
        int j = Character.digit(c, 16);
        if (j == -1)
        {
            throw new DecoderException("Illegal hexadecimal charcter " + c + " at index " + i);
        } else
        {
            return j;
        }
    }

    public Object decode(Object obj)
        throws DecoderException
    {
        try
        {
            if (obj instanceof String)
            {
                obj = ((String)obj).toCharArray();
            } else
            {
                obj = (char[])obj;
            }
            return decodeHex(((char []) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new DecoderException(((ClassCastException) (obj)).getMessage());
        }
    }

    public byte[] decode(byte abyte0[])
        throws DecoderException
    {
        return decodeHex((new String(abyte0)).toCharArray());
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        try
        {
            if (obj instanceof String)
            {
                obj = ((String)obj).getBytes();
            } else
            {
                obj = (byte[])obj;
            }
            return encodeHex(((byte []) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new EncoderException(((ClassCastException) (obj)).getMessage());
        }
    }

    public byte[] encode(byte abyte0[])
    {
        return (new String(encodeHex(abyte0))).getBytes();
    }

}
