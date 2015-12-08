// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class BinaryCodec
    implements BinaryDecoder, BinaryEncoder
{

    private static final int BITS[] = {
        1, 2, 4, 8, 16, 32, 64, 128
    };
    private static final int BIT_0 = 1;
    private static final int BIT_1 = 2;
    private static final int BIT_2 = 4;
    private static final int BIT_3 = 8;
    private static final int BIT_4 = 16;
    private static final int BIT_5 = 32;
    private static final int BIT_6 = 64;
    private static final int BIT_7 = 128;
    private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    private static final char EMPTY_CHAR_ARRAY[] = new char[0];

    public BinaryCodec()
    {
    }

    public static byte[] fromAscii(byte abyte0[])
    {
        if (abyte0 != null && abyte0.length != 0) goto _L2; else goto _L1
_L1:
        byte abyte1[] = EMPTY_BYTE_ARRAY;
_L4:
        return abyte1;
_L2:
        byte abyte2[] = new byte[abyte0.length >> 3];
        int j = 0;
        int i = abyte0.length - 1;
        do
        {
            abyte1 = abyte2;
            if (j >= abyte2.length)
            {
                continue;
            }
            for (int k = 0; k < BITS.length; k++)
            {
                if (abyte0[i - k] == 49)
                {
                    abyte2[j] = (byte)(abyte2[j] | BITS[k]);
                }
            }

            j++;
            i -= 8;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] fromAscii(char ac[])
    {
        if (ac != null && ac.length != 0) goto _L2; else goto _L1
_L1:
        byte abyte0[] = EMPTY_BYTE_ARRAY;
_L4:
        return abyte0;
_L2:
        byte abyte1[] = new byte[ac.length >> 3];
        int j = 0;
        int i = ac.length - 1;
        do
        {
            abyte0 = abyte1;
            if (j >= abyte1.length)
            {
                continue;
            }
            for (int k = 0; k < BITS.length; k++)
            {
                if (ac[i - k] == '1')
                {
                    abyte1[j] = (byte)(abyte1[j] | BITS[k]);
                }
            }

            j++;
            i -= 8;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] toAsciiBytes(byte abyte0[])
    {
        if (abyte0 != null && abyte0.length != 0) goto _L2; else goto _L1
_L1:
        byte abyte1[] = EMPTY_BYTE_ARRAY;
_L4:
        return abyte1;
_L2:
        byte abyte2[] = new byte[abyte0.length << 3];
        int j = 0;
        int i = abyte2.length - 1;
        do
        {
            abyte1 = abyte2;
            if (j >= abyte0.length)
            {
                continue;
            }
            int k = 0;
            while (k < BITS.length) 
            {
                if ((abyte0[j] & BITS[k]) == 0)
                {
                    abyte2[i - k] = 48;
                } else
                {
                    abyte2[i - k] = 49;
                }
                k++;
            }
            j++;
            i -= 8;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static char[] toAsciiChars(byte abyte0[])
    {
        if (abyte0 != null && abyte0.length != 0) goto _L2; else goto _L1
_L1:
        char ac[] = EMPTY_CHAR_ARRAY;
_L4:
        return ac;
_L2:
        char ac1[] = new char[abyte0.length << 3];
        int j = 0;
        int i = ac1.length - 1;
        do
        {
            ac = ac1;
            if (j >= abyte0.length)
            {
                continue;
            }
            int k = 0;
            while (k < BITS.length) 
            {
                if ((abyte0[j] & BITS[k]) == 0)
                {
                    ac1[i - k] = '0';
                } else
                {
                    ac1[i - k] = '1';
                }
                k++;
            }
            j++;
            i -= 8;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String toAsciiString(byte abyte0[])
    {
        return new String(toAsciiChars(abyte0));
    }

    public Object decode(Object obj)
        throws DecoderException
    {
        if (obj == null)
        {
            return EMPTY_BYTE_ARRAY;
        }
        if (obj instanceof byte[])
        {
            return fromAscii((byte[])obj);
        }
        if (obj instanceof char[])
        {
            return fromAscii((char[])obj);
        }
        if (obj instanceof String)
        {
            return fromAscii(((String)obj).toCharArray());
        } else
        {
            throw new DecoderException("argument not a byte array");
        }
    }

    public byte[] decode(byte abyte0[])
    {
        return fromAscii(abyte0);
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof byte[]))
        {
            throw new EncoderException("argument not a byte array");
        } else
        {
            return toAsciiChars((byte[])obj);
        }
    }

    public byte[] encode(byte abyte0[])
    {
        return toAsciiBytes(abyte0);
    }

    public byte[] toByteArray(String s)
    {
        if (s == null)
        {
            return EMPTY_BYTE_ARRAY;
        } else
        {
            return fromAscii(s.toCharArray());
        }
    }

}
