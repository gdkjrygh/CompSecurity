// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.entity;

import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.entity:
//            HttpEntityWrapper

public class BufferedHttpEntity extends HttpEntityWrapper
{

    private final byte buffer[];

    public BufferedHttpEntity(HttpEntity httpentity)
        throws IOException
    {
        super(httpentity);
        if (!httpentity.isRepeatable() || httpentity.getContentLength() < 0L)
        {
            buffer = EntityUtils.toByteArray(httpentity);
            return;
        } else
        {
            buffer = null;
            return;
        }
    }

    public InputStream getContent()
        throws IOException
    {
        if (buffer != null)
        {
            return new ByteArrayInputStream(buffer);
        } else
        {
            return wrappedEntity.getContent();
        }
    }

    public long getContentLength()
    {
        if (buffer != null)
        {
            return (long)buffer.length;
        } else
        {
            return wrappedEntity.getContentLength();
        }
    }

    public boolean isChunked()
    {
        return buffer == null && wrappedEntity.isChunked();
    }

    public boolean isRepeatable()
    {
        return true;
    }

    public boolean isStreaming()
    {
        return buffer == null && wrappedEntity.isStreaming();
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        if (buffer != null)
        {
            outputstream.write(buffer);
            return;
        } else
        {
            wrappedEntity.writeTo(outputstream);
            return;
        }
    }
}
