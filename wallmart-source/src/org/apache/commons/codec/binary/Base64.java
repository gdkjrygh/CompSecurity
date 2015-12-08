// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Base64
    implements BinaryDecoder, BinaryEncoder
{

    static final int BASELENGTH = 255;
    static final byte CHUNK_SEPARATOR[] = "\r\n".getBytes();
    static final int CHUNK_SIZE = 76;
    static final int EIGHTBIT = 8;
    static final int FOURBYTE = 4;
    static final int LOOKUPLENGTH = 64;
    static final byte PAD = 61;
    static final int SIGN = -128;
    static final int SIXTEENBIT = 16;
    static final int TWENTYFOURBITGROUP = 24;
    private static byte base64Alphabet[];
    private static byte lookUpBase64Alphabet[];

    public Base64()
    {
    }

    public static byte[] decodeBase64(byte abyte0[])
    {
        byte abyte2[] = discardNonBase64(abyte0);
        if (abyte2.length != 0) goto _L2; else goto _L1
_L1:
        abyte0 = new byte[0];
_L4:
        return abyte0;
_L2:
        int l = abyte2.length / 4;
        int j = 0;
        int i;
        for (i = abyte2.length; abyte2[i - 1] == 61;)
        {
            int k = i - 1;
            i = k;
            if (k == 0)
            {
                return new byte[0];
            }
        }

        byte abyte1[] = new byte[i - l];
        i = 0;
        do
        {
            abyte0 = abyte1;
            if (i >= l)
            {
                continue;
            }
            int i1 = i * 4;
            byte byte3 = abyte2[i1 + 2];
            byte byte1 = abyte2[i1 + 3];
            byte byte0 = base64Alphabet[abyte2[i1]];
            i1 = base64Alphabet[abyte2[i1 + 1]];
            if (byte3 != 61 && byte1 != 61)
            {
                byte3 = base64Alphabet[byte3];
                byte1 = base64Alphabet[byte1];
                abyte1[j] = (byte)(byte0 << 2 | i1 >> 4);
                abyte1[j + 1] = (byte)((i1 & 0xf) << 4 | byte3 >> 2 & 0xf);
                abyte1[j + 2] = (byte)(byte3 << 6 | byte1);
            } else
            if (byte3 == 61)
            {
                abyte1[j] = (byte)(byte0 << 2 | i1 >> 4);
            } else
            if (byte1 == 61)
            {
                byte byte2 = base64Alphabet[byte3];
                abyte1[j] = (byte)(byte0 << 2 | i1 >> 4);
                abyte1[j + 1] = (byte)((i1 & 0xf) << 4 | byte2 >> 2 & 0xf);
            }
            j += 3;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static byte[] discardNonBase64(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        int j = 0;
        for (int i = 0; i < abyte0.length;)
        {
            int k = j;
            if (isBase64(abyte0[i]))
            {
                abyte1[j] = abyte0[i];
                k = j + 1;
            }
            i++;
            j = k;
        }

        abyte0 = new byte[j];
        System.arraycopy(abyte1, 0, abyte0, 0, j);
        return abyte0;
    }

    static byte[] discardWhitespace(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        int j = 0;
        for (int i = 0; i < abyte0.length;)
        {
            int k = j;
            switch (abyte0[i])
            {
            default:
                abyte1[j] = abyte0[i];
                k = j + 1;
                // fall through

            case 9: // '\t'
            case 10: // '\n'
            case 13: // '\r'
            case 32: // ' '
                i++;
                break;
            }
            j = k;
        }

        abyte0 = new byte[j];
        System.arraycopy(abyte1, 0, abyte0, 0, j);
        return abyte0;
    }

    public static byte[] encodeBase64(byte abyte0[])
    {
        return encodeBase64(abyte0, false);
    }

    public static byte[] encodeBase64(byte abyte0[], boolean flag)
    {
        byte abyte1[];
        int i;
        int j;
        int k;
        int l;
        byte byte2;
        int j2;
        i = abyte0.length * 8;
        j2 = i % 24;
        int k2 = i / 24;
        k = 0;
        int i1;
        if (j2 != 0)
        {
            i = (k2 + 1) * 4;
        } else
        {
            i = k2 * 4;
        }
        j = i;
        if (flag)
        {
            int j1;
            int l1;
            byte byte7;
            byte byte8;
            if (CHUNK_SEPARATOR.length == 0)
            {
                j = 0;
            } else
            {
                j = (int)Math.ceil((float)i / 76F);
            }
            i += CHUNK_SEPARATOR.length * j;
            k = j;
            j = i;
        }
        abyte1 = new byte[j];
        i = 0;
        j1 = 76;
        l = 0;
        i1 = 0;
        while (i1 < k2) 
        {
            l1 = i1 * 3;
            byte byte3 = abyte0[l1];
            int k1 = abyte0[l1 + 1];
            byte byte6 = abyte0[l1 + 2];
            byte7 = (byte)(k1 & 0xf);
            byte8 = (byte)(byte3 & 3);
            int i2;
            if ((byte3 & 0xffffff80) == 0)
            {
                byte3 >>= 2;
            } else
            {
                byte3 = (byte)(byte3 >> 2 ^ 0xc0);
            }
            if ((k1 & 0xffffff80) == 0)
            {
                k1 = (byte)(k1 >> 4);
            } else
            {
                k1 = (byte)(k1 >> 4 ^ 0xf0);
            }
            if ((byte6 & 0xffffff80) == 0)
            {
                i2 = (byte)(byte6 >> 6);
            } else
            {
                i2 = (byte)(byte6 >> 6 ^ 0xfc);
            }
            abyte1[i] = lookUpBase64Alphabet[byte3];
            abyte1[i + 1] = lookUpBase64Alphabet[byte8 << 4 | k1];
            abyte1[i + 2] = lookUpBase64Alphabet[byte7 << 2 | i2];
            abyte1[i + 3] = lookUpBase64Alphabet[byte6 & 0x3f];
            i2 = i + 4;
            k1 = l;
            i = i2;
            byte3 = j1;
            if (flag)
            {
                k1 = l;
                i = i2;
                byte3 = j1;
                if (i2 == j1)
                {
                    System.arraycopy(CHUNK_SEPARATOR, 0, abyte1, i2, CHUNK_SEPARATOR.length);
                    k1 = l + 1;
                    byte3 = (k1 + 1) * 76 + CHUNK_SEPARATOR.length * k1;
                    i = i2 + CHUNK_SEPARATOR.length;
                }
            }
            i1++;
            l = k1;
            j1 = byte3;
        }
        byte2 = i1 * 3;
        if (j2 != 8) goto _L2; else goto _L1
_L1:
        byte byte0 = abyte0[byte2];
        byte2 = (byte)(byte0 & 3);
        if ((byte0 & 0xffffff80) == 0)
        {
            byte0 >>= 2;
        } else
        {
            byte0 = (byte)(byte0 >> 2 ^ 0xc0);
        }
        abyte1[i] = lookUpBase64Alphabet[byte0];
        abyte1[i + 1] = lookUpBase64Alphabet[byte2 << 4];
        abyte1[i + 2] = 61;
        abyte1[i + 3] = 61;
_L4:
        if (flag && l < k)
        {
            System.arraycopy(CHUNK_SEPARATOR, 0, abyte1, j - CHUNK_SEPARATOR.length, CHUNK_SEPARATOR.length);
        }
        return abyte1;
_L2:
        if (j2 == 16)
        {
            byte byte1 = abyte0[byte2];
            byte2 = abyte0[byte2 + 1];
            byte byte4 = (byte)(byte2 & 0xf);
            byte byte5 = (byte)(byte1 & 3);
            if ((byte1 & 0xffffff80) == 0)
            {
                byte1 >>= 2;
            } else
            {
                byte1 = (byte)(byte1 >> 2 ^ 0xc0);
            }
            if ((byte2 & 0xffffff80) == 0)
            {
                byte2 >>= 4;
            } else
            {
                byte2 = (byte)(byte2 >> 4 ^ 0xf0);
            }
            abyte1[i] = lookUpBase64Alphabet[byte1];
            abyte1[i + 1] = lookUpBase64Alphabet[byte5 << 4 | byte2];
            abyte1[i + 2] = lookUpBase64Alphabet[byte4 << 2];
            abyte1[i + 3] = 61;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] encodeBase64Chunked(byte abyte0[])
    {
        return encodeBase64(abyte0, true);
    }

    public static boolean isArrayByteBase64(byte abyte0[])
    {
        abyte0 = discardWhitespace(abyte0);
        int j = abyte0.length;
        if (j != 0)
        {
            int i = 0;
            while (i < j) 
            {
                if (!isBase64(abyte0[i]))
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    private static boolean isBase64(byte byte0)
    {
        while (byte0 == 61 || base64Alphabet[byte0] != -1) 
        {
            return true;
        }
        return false;
    }

    public Object decode(Object obj)
        throws DecoderException
    {
        if (!(obj instanceof byte[]))
        {
            throw new DecoderException("Parameter supplied to Base64 decode is not a byte[]");
        } else
        {
            return decode((byte[])obj);
        }
    }

    public byte[] decode(byte abyte0[])
    {
        return decodeBase64(abyte0);
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof byte[]))
        {
            throw new EncoderException("Parameter supplied to Base64 encode is not a byte[]");
        } else
        {
            return encode((byte[])obj);
        }
    }

    public byte[] encode(byte abyte0[])
    {
        return encodeBase64(abyte0, false);
    }

    static 
    {
        base64Alphabet = new byte[255];
        lookUpBase64Alphabet = new byte[64];
        for (int i = 0; i < 255; i++)
        {
            base64Alphabet[i] = -1;
        }

        for (int j = 90; j >= 65; j--)
        {
            base64Alphabet[j] = (byte)(j - 65);
        }

        for (int k = 122; k >= 97; k--)
        {
            base64Alphabet[k] = (byte)((k - 97) + 26);
        }

        for (int l = 57; l >= 48; l--)
        {
            base64Alphabet[l] = (byte)((l - 48) + 52);
        }

        base64Alphabet[43] = 62;
        base64Alphabet[47] = 63;
        for (int i1 = 0; i1 <= 25; i1++)
        {
            lookUpBase64Alphabet[i1] = (byte)(i1 + 65);
        }

        int l1 = 26;
        for (int j1 = 0; l1 <= 51; j1++)
        {
            lookUpBase64Alphabet[l1] = (byte)(j1 + 97);
            l1++;
        }

        l1 = 52;
        for (int k1 = 0; l1 <= 61; k1++)
        {
            lookUpBase64Alphabet[l1] = (byte)(k1 + 48);
            l1++;
        }

        lookUpBase64Alphabet[62] = 43;
        lookUpBase64Alphabet[63] = 47;
    }
}
