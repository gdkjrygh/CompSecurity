// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.entity:
//            AbstractHttpEntity, ContentType

public class ByteArrayEntity extends AbstractHttpEntity
    implements Cloneable
{

    private final byte b[];
    protected final byte content[];
    private final int len;
    private final int off;

    public ByteArrayEntity(byte abyte0[])
    {
        this(abyte0, null);
    }

    public ByteArrayEntity(byte abyte0[], int i, int j)
    {
        this(abyte0, i, j, null);
    }

    public ByteArrayEntity(byte abyte0[], int i, int j, ContentType contenttype)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Source byte array may not be null");
        }
        if (i < 0 || i > abyte0.length || j < 0 || i + j < 0 || i + j > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("off: ").append(i).append(" len: ").append(j).append(" b.length: ").append(abyte0.length).toString());
        }
        content = abyte0;
        b = abyte0;
        off = i;
        len = j;
        if (contenttype != null)
        {
            setContentType(contenttype.toString());
        }
    }

    public ByteArrayEntity(byte abyte0[], ContentType contenttype)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Source byte array may not be null");
        }
        content = abyte0;
        b = abyte0;
        off = 0;
        len = b.length;
        if (contenttype != null)
        {
            setContentType(contenttype.toString());
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public InputStream getContent()
    {
        return new ByteArrayInputStream(b, off, len);
    }

    public long getContentLength()
    {
        return (long)len;
    }

    public boolean isRepeatable()
    {
        return true;
    }

    public boolean isStreaming()
    {
        return false;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        } else
        {
            outputstream.write(b, off, len);
            outputstream.flush();
            return;
        }
    }
}
