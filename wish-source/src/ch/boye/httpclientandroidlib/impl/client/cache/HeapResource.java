// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.client.cache.Resource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class HeapResource
    implements Resource
{

    private static final long serialVersionUID = 0xe32754661354f0deL;
    private final byte b[];

    public HeapResource(byte abyte0[])
    {
        b = abyte0;
    }

    public void dispose()
    {
    }

    byte[] getByteArray()
    {
        return b;
    }

    public InputStream getInputStream()
    {
        return new ByteArrayInputStream(b);
    }

    public long length()
    {
        return (long)b.length;
    }
}
