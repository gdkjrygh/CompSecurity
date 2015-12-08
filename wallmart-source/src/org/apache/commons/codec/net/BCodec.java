// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.Base64;

// Referenced classes of package org.apache.commons.codec.net:
//            RFC1522Codec

public class BCodec extends RFC1522Codec
    implements StringDecoder, StringEncoder
{

    private String charset;

    public BCodec()
    {
        charset = "UTF-8";
    }

    public BCodec(String s)
    {
        charset = "UTF-8";
        charset = s;
    }

    public Object decode(Object obj)
        throws DecoderException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof String)
        {
            return decode((String)obj);
        } else
        {
            throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be decoded using BCodec");
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
            s = decodeText(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DecoderException(s.getMessage());
        }
        return s;
    }

    protected byte[] doDecoding(byte abyte0[])
        throws DecoderException
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return Base64.decodeBase64(abyte0);
        }
    }

    protected byte[] doEncoding(byte abyte0[])
        throws EncoderException
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return Base64.encodeBase64(abyte0);
        }
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof String)
        {
            return encode((String)obj);
        } else
        {
            throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be encoded using BCodec");
        }
    }

    public String encode(String s)
        throws EncoderException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return encode(s, getDefaultCharset());
        }
    }

    public String encode(String s, String s1)
        throws EncoderException
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = encodeText(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new EncoderException(s.getMessage());
        }
        return s;
    }

    public String getDefaultCharset()
    {
        return charset;
    }

    protected String getEncoding()
    {
        return "B";
    }
}
