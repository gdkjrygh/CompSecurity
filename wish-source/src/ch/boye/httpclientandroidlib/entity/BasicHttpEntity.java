// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.entity:
//            AbstractHttpEntity

public class BasicHttpEntity extends AbstractHttpEntity
{

    private InputStream content;
    private long length;

    public BasicHttpEntity()
    {
        length = -1L;
    }

    public void consumeContent()
        throws IOException
    {
        if (content != null)
        {
            content.close();
        }
    }

    public InputStream getContent()
        throws IllegalStateException
    {
        if (content == null)
        {
            throw new IllegalStateException("Content has not been provided");
        } else
        {
            return content;
        }
    }

    public long getContentLength()
    {
        return length;
    }

    public boolean isRepeatable()
    {
        return false;
    }

    public boolean isStreaming()
    {
        return content != null;
    }

    public void setContent(InputStream inputstream)
    {
        content = inputstream;
    }

    public void setContentLength(long l)
    {
        length = l;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        InputStream inputstream;
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        inputstream = getContent();
        byte abyte0[] = new byte[2048];
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        outputstream;
        inputstream.close();
        throw outputstream;
        inputstream.close();
        return;
    }
}
