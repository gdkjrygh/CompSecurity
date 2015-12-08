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

public class URLCodec
    implements BinaryDecoder, BinaryEncoder, StringDecoder, StringEncoder
{

    protected static byte ESCAPE_CHAR = 37;
    protected static final BitSet WWW_FORM_URL;
    protected String charset;

    public URLCodec()
    {
        charset = "UTF-8";
    }

    public URLCodec(String s)
    {
        charset = "UTF-8";
        charset = s;
    }

    public static final byte[] decodeUrl(byte abyte0[])
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
_L2:
        char c;
        if (i >= abyte0.length)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        c = abyte0[i];
        if (c != '+')
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(32);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        int j;
        if (c != '%')
        {
            break MISSING_BLOCK_LABEL_128;
        }
        i++;
        try
        {
            c = Character.digit((char)abyte0[i], 16);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new DecoderException("Invalid URL encoding");
        }
        i++;
        j = Character.digit((char)abyte0[i], 16);
        if (c != -1 && j != -1)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        throw new DecoderException("Invalid URL encoding");
        c = (char)((c << 4) + j);
        bytearrayoutputstream.write(c);
          goto _L3
        bytearrayoutputstream.write(c);
          goto _L3
        return bytearrayoutputstream.toByteArray();
    }

    public static final byte[] encodeUrl(BitSet bitset, byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        BitSet bitset1 = bitset;
        if (bitset == null)
        {
            bitset1 = WWW_FORM_URL;
        }
        bitset = new ByteArrayOutputStream();
        int j = 0;
        while (j < abyte0.length) 
        {
            byte byte0 = abyte0[j];
            int i = byte0;
            if (byte0 < 0)
            {
                i = byte0 + 256;
            }
            if (bitset1.get(i))
            {
                int k = i;
                if (i == 32)
                {
                    k = 43;
                }
                bitset.write(k);
            } else
            {
                bitset.write(37);
                char c = Character.toUpperCase(Character.forDigit(i >> 4 & 0xf, 16));
                i = Character.toUpperCase(Character.forDigit(i & 0xf, 16));
                bitset.write(c);
                bitset.write(i);
            }
            j++;
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
            throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be URL decoded");
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
        return decodeUrl(abyte0);
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
            throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be URL encoded");
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
        return encodeUrl(WWW_FORM_URL, abyte0);
    }

    public String getDefaultCharset()
    {
        return charset;
    }

    public String getEncoding()
    {
        return charset;
    }

    static 
    {
        WWW_FORM_URL = new BitSet(256);
        for (int i = 97; i <= 122; i++)
        {
            WWW_FORM_URL.set(i);
        }

        for (int j = 65; j <= 90; j++)
        {
            WWW_FORM_URL.set(j);
        }

        for (int k = 48; k <= 57; k++)
        {
            WWW_FORM_URL.set(k);
        }

        WWW_FORM_URL.set(45);
        WWW_FORM_URL.set(95);
        WWW_FORM_URL.set(46);
        WWW_FORM_URL.set(42);
        WWW_FORM_URL.set(32);
    }
}
