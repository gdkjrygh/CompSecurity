// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

public class QuotedPrintableCodec
    implements BinaryDecoder, BinaryEncoder, StringDecoder, StringEncoder
{

    private static byte ESCAPE_CHAR = 61;
    private static final BitSet PRINTABLE_CHARS;
    private static byte SPACE;
    private static byte TAB;
    private String charset;

    public QuotedPrintableCodec()
    {
        charset = "UTF-8";
    }

    public QuotedPrintableCodec(String s)
    {
        charset = "UTF-8";
        charset = s;
    }

    public static final byte[] decodeQuotedPrintable(byte abyte0[])
        throws DecoderException
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int i;
        if (abyte0 == null)
        {
            return null;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        i = 0;
_L7:
        if (i >= abyte0.length) goto _L2; else goto _L1
_L1:
        char c = abyte0[i];
        if (c != ESCAPE_CHAR) goto _L4; else goto _L3
_L3:
        int j;
        i++;
        try
        {
            c = Character.digit((char)abyte0[i], 16);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new DecoderException("Invalid quoted-printable encoding");
        }
        i++;
        j = Character.digit((char)abyte0[i], 16);
        if (c != -1 && j != -1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        throw new DecoderException("Invalid quoted-printable encoding");
        c = (char)((c << 4) + j);
        bytearrayoutputstream.write(c);
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        bytearrayoutputstream.write(c);
        if (true) goto _L5; else goto _L2
_L2:
        return bytearrayoutputstream.toByteArray();
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static final void encodeQuotedPrintable(int i, ByteArrayOutputStream bytearrayoutputstream)
    {
        bytearrayoutputstream.write(ESCAPE_CHAR);
        char c = Character.toUpperCase(Character.forDigit(i >> 4 & 0xf, 16));
        i = Character.toUpperCase(Character.forDigit(i & 0xf, 16));
        bytearrayoutputstream.write(c);
        bytearrayoutputstream.write(i);
    }

    public static final byte[] encodeQuotedPrintable(BitSet bitset, byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        BitSet bitset1 = bitset;
        if (bitset == null)
        {
            bitset1 = PRINTABLE_CHARS;
        }
        bitset = new ByteArrayOutputStream();
        int i = 0;
        while (i < abyte0.length) 
        {
            byte byte0 = abyte0[i];
            int j = byte0;
            if (byte0 < 0)
            {
                j = byte0 + 256;
            }
            if (bitset1.get(j))
            {
                bitset.write(j);
            } else
            {
                encodeQuotedPrintable(j, ((ByteArrayOutputStream) (bitset)));
            }
            i++;
        }
        return bitset.toByteArray();
    }

    public Object decode(Object obj)
        throws DecoderException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof byte[])
        {
            return decode((byte[])obj);
        }
        if (obj instanceof String)
        {
            return decode((String)obj);
        } else
        {
            throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable decoded");
        }
    }

    public String decode(String s)
        throws DecoderException
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = decode(s, getDefaultCharset());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DecoderException(s.getMessage());
        }
        return s;
    }

    public String decode(String s, String s1)
        throws DecoderException, UnsupportedEncodingException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return new String(decode(s.getBytes("US-ASCII")), s1);
        }
    }

    public byte[] decode(byte abyte0[])
        throws DecoderException
    {
        return decodeQuotedPrintable(abyte0);
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof byte[])
        {
            return encode((byte[])obj);
        }
        if (obj instanceof String)
        {
            return encode((String)obj);
        } else
        {
            throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable encoded");
        }
    }

    public String encode(String s)
        throws EncoderException
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = encode(s, getDefaultCharset());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncoderException(s.getMessage());
        }
        return s;
    }

    public String encode(String s, String s1)
        throws UnsupportedEncodingException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return new String(encode(s.getBytes(s1)), "US-ASCII");
        }
    }

    public byte[] encode(byte abyte0[])
    {
        return encodeQuotedPrintable(PRINTABLE_CHARS, abyte0);
    }

    public String getDefaultCharset()
    {
        return charset;
    }

    static 
    {
        PRINTABLE_CHARS = new BitSet(256);
        TAB = 9;
        SPACE = 32;
        for (int i = 33; i <= 60; i++)
        {
            PRINTABLE_CHARS.set(i);
        }

        for (int j = 62; j <= 126; j++)
        {
            PRINTABLE_CHARS.set(j);
        }

        PRINTABLE_CHARS.set(TAB);
        PRINTABLE_CHARS.set(SPACE);
    }
}
