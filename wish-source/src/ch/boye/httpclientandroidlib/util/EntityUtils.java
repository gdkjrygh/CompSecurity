// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.util;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.NameValuePair;
import ch.boye.httpclientandroidlib.ParseException;
import ch.boye.httpclientandroidlib.entity.ContentType;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

// Referenced classes of package ch.boye.httpclientandroidlib.util:
//            ByteArrayBuffer, CharArrayBuffer

public final class EntityUtils
{

    private EntityUtils()
    {
    }

    public static void consume(HttpEntity httpentity)
        throws IOException
    {
        if (httpentity != null && httpentity.isStreaming())
        {
            httpentity = httpentity.getContent();
            if (httpentity != null)
            {
                httpentity.close();
                return;
            }
        }
    }

    public static void consumeQuietly(HttpEntity httpentity)
    {
        try
        {
            consume(httpentity);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            return;
        }
    }

    public static String getContentCharSet(HttpEntity httpentity)
        throws ParseException
    {
        if (httpentity == null)
        {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        Object obj = null;
        String s = obj;
        if (httpentity.getContentType() != null)
        {
            httpentity = httpentity.getContentType().getElements();
            s = obj;
            if (httpentity.length > 0)
            {
                httpentity = httpentity[0].getParameterByName("charset");
                s = obj;
                if (httpentity != null)
                {
                    s = httpentity.getValue();
                }
            }
        }
        return s;
    }

    public static String getContentMimeType(HttpEntity httpentity)
        throws ParseException
    {
        if (httpentity == null)
        {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        Object obj = null;
        String s = obj;
        if (httpentity.getContentType() != null)
        {
            httpentity = httpentity.getContentType().getElements();
            s = obj;
            if (httpentity.length > 0)
            {
                s = httpentity[0].getName();
            }
        }
        return s;
    }

    public static byte[] toByteArray(HttpEntity httpentity)
        throws IOException
    {
        InputStream inputstream;
        if (httpentity == null)
        {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        inputstream = httpentity.getContent();
        if (inputstream == null)
        {
            return null;
        }
        if (httpentity.getContentLength() > 0x7fffffffL)
        {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        break MISSING_BLOCK_LABEL_57;
        httpentity;
        inputstream.close();
        throw httpentity;
        int j = (int)httpentity.getContentLength();
        int i;
        i = j;
        if (j < 0)
        {
            i = 4096;
        }
        byte abyte0[];
        httpentity = new ByteArrayBuffer(i);
        abyte0 = new byte[4096];
_L1:
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        httpentity.append(abyte0, 0, i);
          goto _L1
        if (httpentity.length() != httpentity.capacity())
        {
            break MISSING_BLOCK_LABEL_136;
        }
        httpentity = httpentity.buffer();
        inputstream.close();
        return httpentity;
        httpentity = httpentity.toByteArray();
        inputstream.close();
        return httpentity;
    }

    public static String toString(HttpEntity httpentity)
        throws IOException, ParseException
    {
        return toString(httpentity, (Charset)null);
    }

    public static String toString(HttpEntity httpentity, String s)
        throws IOException, ParseException
    {
        return toString(httpentity, Charset.forName(s));
    }

    public static String toString(HttpEntity httpentity, Charset charset)
        throws IOException, ParseException
    {
        InputStream inputstream;
        if (httpentity == null)
        {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        inputstream = httpentity.getContent();
        if (inputstream == null)
        {
            return null;
        }
        if (httpentity.getContentLength() > 0x7fffffffL)
        {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        break MISSING_BLOCK_LABEL_57;
        httpentity;
        inputstream.close();
        throw httpentity;
        int j = (int)httpentity.getContentLength();
        int i;
        i = j;
        if (j < 0)
        {
            i = 4096;
        }
        Charset charset1 = ContentType.getOrDefault(httpentity).getCharset();
        httpentity = charset1;
        if (charset1 == null)
        {
            httpentity = charset;
        }
        charset = httpentity;
        if (httpentity != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        charset = HTTP.DEF_CONTENT_CHARSET;
        char ac[];
        httpentity = new InputStreamReader(inputstream, charset);
        charset = new CharArrayBuffer(i);
        ac = new char[1024];
_L1:
        i = httpentity.read(ac);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        charset.append(ac, 0, i);
          goto _L1
        httpentity = charset.toString();
        inputstream.close();
        return httpentity;
    }
}
